package com.github.relativobr.supreme.generic.machine;

import static java.util.Objects.nonNull;

import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotHopperable;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GenericMachine extends AContainer implements NotHopperable, RecipeDisplayItem {

  private final Map<Block, MachineRecipe> processing = new HashMap<Block, MachineRecipe>();
  private final Map<Block, Integer> progressTime = new HashMap<Block, Integer>();
  public List<AbstractItemRecipe> machineRecipes = new ArrayList<>();
  private Integer timeProcess;
  private String machineIdentifier = "MediumContainerMachine";

  @ParametersAreNonnullByDefault
  public GenericMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);

    addItemHandler(onBlockBreak());

    new BlockMenuPreset(getId(), getItemName()) {

      @Override
      public void init() {
        constructMenu(this);
      }

      @Override
      public boolean canOpen(Block b, Player p) {
        return p.hasPermission("slimefun.inventory.bypass") || Slimefun.getProtectionManager()
            .hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK);
      }

      @Override
      public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
        if (flow == ItemTransportFlow.WITHDRAW) {
          return getOutputSlots();
        }
        return new int[0];
      }

      @Override
      public int[] getSlotsAccessedByItemTransport(DirtyChestMenu menu, ItemTransportFlow flow,
          ItemStack item) {
        if (flow == ItemTransportFlow.WITHDRAW) {
          return getOutputSlots();
        }

        int fullSlots = 0;
        List<Integer> slots = new LinkedList<>();

        for (int slot : getInputSlots()) {
          ItemStack stack = menu.getItemInSlot(slot);
          if (stack != null && SlimefunUtils.isItemSimilar(stack, item, false, true)) {
            if (stack.getAmount() >= stack.getMaxStackSize()) {
              fullSlots++;
            }

            slots.add(slot);
          }
        }

        if (slots.isEmpty()) {
          return getInputSlots();
        } else if (fullSlots == slots.size()) {
          // All slots with that item are already full
          return new int[0];
        } else {
          slots.sort(compareSlots(menu));
          int[] array = new int[slots.size()];

          for (int i = 0; i < slots.size(); i++) {
            array[i] = slots.get(i);
          }

          return array;
        }
      }
    };
  }

  @Nonnull
  @Override
  protected BlockBreakHandler onBlockBreak() {
    return new SimpleBlockBreakHandler() {
      public void onBlockBreak(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        if (inv != null) {
          inv.dropItems(b.getLocation(), getInputSlots());
          inv.dropItems(b.getLocation(), getOutputSlots());
        }
        progressTime.remove(b);
        processing.remove(b);
      }
    };
  }

  protected void updateStatusReset(BlockMenu menu) {
    menu.replaceExistingItem(getStatusSlot(), getDisplayOrInfo(null, " "));
  }

  protected void updateStatusInvalidInput(BlockMenu menu) {
    menu.replaceExistingItem(getStatusSlot(),getDisplayOrWarn(null,"&cInput a valid material to start"));
  }

  protected void updateStatusOutputFull(BlockMenu menu) {
    menu.replaceExistingItem(getStatusSlot(), getDisplayOrWarn(null,"&cOutput is full"));
  }

  protected void updateStatusConnectEnergy(BlockMenu menu, ItemStack itemStack) {
    menu.replaceExistingItem(getStatusSlot(), getDisplayOrWarn(itemStack, "&cConnect energy to continue"));
  }

  public GenericMachine setMachineRecipes(@Nonnull List<AbstractItemRecipe> machineRecipes) {
    this.machineRecipes = machineRecipes;
    return this;
  }

  public GenericMachine setTimeProcess(int timeProcess) {
    this.timeProcess = timeProcess;
    return this;
  }

  public int getTimeProcess() {
    if(timeProcess == null){
      timeProcess = 15;
    }
    return this.timeProcess;
  }

  @Nonnull
  private Comparator<Integer> compareSlots(@Nonnull DirtyChestMenu menu) {
    return Comparator.comparingInt(slot -> menu.getItemInSlot(slot).getAmount());
  }

  @Override
  protected void constructMenu(BlockMenuPreset preset) {
    for (int i : getBorderSlots()) {
      preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : getInputBorderSlots()) {
      preset.addItem(i, new CustomItemStack(Material.CYAN_STAINED_GLASS_PANE, " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : getOutputBorderSlots()) {
      preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, " "),
          ChestMenuUtils.getEmptyClickHandler());
    }

    preset.addItem(getStatusSlot(),
        new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "),
        ChestMenuUtils.getEmptyClickHandler());

    for (int i : getOutputSlots()) {
      preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

        @Override
        public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
          return false;
        }

        @Override
        public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor,
            ClickAction action) {
          if (cursor == null) {
            return true;
          }
          return cursor.getType() == Material.AIR;
        }
      });
    }
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.PISTON);
  }

  @Override
  public int[] getInputSlots() {
    return InventoryRecipe.MEDIUM_INPUT;
  }

  @Override
  public int[] getOutputSlots() {
    return InventoryRecipe.MEDIUM_OUTPUT;
  }

  public int getStatusSlot(){
    return InventoryRecipe.MEDIUM_STATUS_SLOT;
  }

  public int[] getBorderSlots(){
    return InventoryRecipe.MEDIUM_BORDER;
  }

  public int[] getInputBorderSlots(){
    return InventoryRecipe.MEDIUM_INPUT_BORDER;
  }

  public int[] getOutputBorderSlots(){
    return InventoryRecipe.MEDIUM_OUTPUT_BORDER;
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return nonNull(this.machineIdentifier) ? this.machineIdentifier : "MachineIdentifier";
  }

  public GenericMachine setMachineIdentifier(@Nonnull String machineIdentifier) {
    this.machineIdentifier = machineIdentifier;
    return this;
  }

  @Override
  protected void tick(Block b) {
    BlockMenu inv = BlockStorage.getInventory(b);
    if (inv == null) {
      return;
    }

    if (this.isProcessing(b)) {
      doProcessing(b, inv);
    } else {
      nextProcessing(b, inv);
    }
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    machineRecipes.forEach(recipe -> {
      displayRecipes.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
      displayRecipes.add(recipe.getFirstItemOutput());
    });
    return displayRecipes;
  }

  @Override
  protected MachineRecipe findNextRecipe(BlockMenu inv) {
    for (AbstractItemRecipe recipe : machineRecipes) {
      if (matchingRecipe(recipe.getInputNotNull(), inv)) {
        return new MachineRecipe(getTimeProcess(), recipe.getInputNotNull(), recipe.getOutputNotNull());
      }
    }
    return null;
  }

  protected int getProgressTime(Block b) {
    return progressTime.get(b) != null ? progressTime.get(b) : getTimeProcess();
  }

  protected MachineRecipe getProcessing(Block b) {
    return processing.get(b);
  }

  protected boolean isProcessing(Block b) {
    return getProcessing(b) != null;
  }

  protected boolean notHasSpaceOutput(BlockMenu inv, ItemStack[] result) {
    int requiredSpace = result.length;
    int availableSpace = 0;
    for (int slot : getOutputSlots()) {
      ItemStack itemInSlot = inv.getItemInSlot(slot);
      if (itemInSlot == null) {
        availableSpace++;
      } else {
        for (ItemStack stack : result) {
          if (SlimefunUtils.isItemSimilar(itemInSlot, stack, false, false)
              && itemInSlot.getAmount() < itemInSlot.getMaxStackSize()) {
            availableSpace++;
            break;
          }
        }
      }
      if (availableSpace >= requiredSpace) {
        return false;
      }
    }
    return true;
  }

  private void nextProcessing(Block b, BlockMenu inv) {
    MachineRecipe next = this.findNextRecipe(inv);
    if (next != null) {
      processing.put(b, next);
      progressTime.put(b, next.getTicks());
    } else {
      if (getInputSlots().length <= 5) {
        updateStatusReset(inv);
      } else {
        updateStatusInvalidInput(inv);
      }
    }
  }

  private void doProcessing(Block b, BlockMenu inv) {

    var result = processing.get(b).getOutput();

    if (result == null || result.length == 0) {
      progressTime.remove(b);
      processing.remove(b);
      updateStatusReset(inv);
      return;
    }

    if (getCharge(b.getLocation()) < getEnergyConsumption()) {
      updateStatusConnectEnergy(inv, null);
      return;
    }
    removeCharge(b.getLocation(), getEnergyConsumption());

    final int ticks = getProcessing(b).getTicks();
    int ticksRemaining = getProgressTime(b);
    if (ticks == ticksRemaining) {
      startProcessTicks(b, inv, ticksRemaining);
    } else if (ticksRemaining == 0) {
      endProcessTicks(b, inv, result);
    } else {
      doProcessTicks(b, inv, ticks, ticksRemaining, result[0]);
    }
  }

  private void startProcessTicks(Block b, BlockMenu inv, int ticksRemaining) {
    if (consumptionRecipe(inv, processing.get(b).getInput())) {
      progressTime.put(b, Math.max(ticksRemaining - this.getSpeed(), 0));
    } else {
      progressTime.remove(b);
      processing.remove(b);
      updateStatusInvalidInput(inv);
    }
  }

  private void endProcessTicks(Block b, BlockMenu inv, ItemStack[] result) {
    if (notHasSpaceOutput(inv, result)) {
      updateStatusOutputFull(inv);
      return;
    }
    for (ItemStack itemStack : result) {
      inv.pushItem(itemStack.clone(), getOutputSlots());
    }
    progressTime.remove(b);
    processing.remove(b);
    updateStatusReset(inv);
  }

  private void doProcessTicks(Block b, BlockMenu inv, int ticks, int ticksRemaining, ItemStack result) {
    progressTime.put(b, Math.max(ticksRemaining - this.getSpeed(), 0));
    ChestMenuUtils.updateProgressbar(inv, getStatusSlot(), ticksRemaining, ticks, result);
  }

  private boolean consumptionRecipe(BlockMenu inv, ItemStack[] input) {

    // Count the required amount of each item in the input
    Map<ItemStack, Integer> requiredItems = new HashMap<>();
    for (ItemStack item : input) {
      requiredItems.merge(item, item.getAmount(), Integer::sum);
    }

    // Try to consume the required items from the input slots
    boolean consumeFailure = false;
    List<ItemStack> consumedItems = new ArrayList<>();

    for (Map.Entry<ItemStack, Integer> entry : requiredItems.entrySet()) {
      ItemStack requiredItem = entry.getKey();
      int requiredAmount = entry.getValue();
      int foundAmount = 0;

      for (int slot : this.getInputSlots()) {
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        if (itemInSlot != null && SlimefunUtils.isItemSimilar(itemInSlot, requiredItem, false, false)) {
          int amountToConsume = Math.min(itemInSlot.getAmount(), requiredAmount - foundAmount);
          inv.consumeItem(slot, amountToConsume);
          foundAmount += amountToConsume;
          consumedItems.add(new ItemStack(itemInSlot.getType(), amountToConsume));
          if (foundAmount >= requiredAmount) {
            break;
          }
        }
      }
      if (foundAmount < requiredAmount) {
        consumeFailure = true;
        break;
      }
    }

    // Revert consumption if not all required items are found
    if (consumeFailure) {
      for (ItemStack consumedItem : consumedItems) {
        inv.pushItem(consumedItem, getInputSlots());
      }
      return false;
    }
    return true;
  }

  private boolean matchingRecipe(ItemStack[] recipe, BlockMenu inv) {

    // Count the required amount of each item in the recipe
    Map<ItemStack, Integer> requiredItems = new HashMap<>();
    for (ItemStack recipeItem : recipe) {
      requiredItems.merge(recipeItem, recipeItem.getAmount(), Integer::sum);
    }

    // Check if all required items are present in the input slots
    Map<ItemStack, Integer> foundItems = new HashMap<>();
    for (int slot : this.getInputSlots()) {
      ItemStack itemInSlot = inv.getItemInSlot(slot);
      if (itemInSlot != null) {
        for (Map.Entry<ItemStack, Integer> entry : requiredItems.entrySet()) {
          ItemStack requiredItem = entry.getKey();
          if (SlimefunUtils.isItemSimilar(itemInSlot, requiredItem, false, false)) {
            foundItems.merge(requiredItem, itemInSlot.getAmount(), Integer::sum);
          }
        }
      }
    }

    // Verify if the found amount of each item is sufficient
    for (Map.Entry<ItemStack, Integer> entry : requiredItems.entrySet()) {
      ItemStack requiredItem = entry.getKey();
      int requiredAmount = entry.getValue();
      int foundAmount = foundItems.getOrDefault(requiredItem, 0);
      if (foundAmount < requiredAmount) {
        return false;
      }
    }
    return true;
  }

  private ItemStack getDisplayOrInfo(ItemStack itemStack, String name) {
    return new CustomItemStack(itemStack != null ? itemStack : new ItemStack(Material.BLACK_STAINED_GLASS_PANE), name);
  }

  private ItemStack getDisplayOrWarn(ItemStack itemStack, String name) {
    return new CustomItemStack(itemStack != null ? itemStack : new ItemStack(Material.RED_STAINED_GLASS_PANE), name);
  }
}