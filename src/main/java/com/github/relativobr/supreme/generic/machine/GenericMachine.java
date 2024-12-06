package com.github.relativobr.supreme.generic.machine;

import static java.util.Objects.nonNull;

import com.github.relativobr.supreme.Supreme;
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
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

  private final Map<Block, MachineRecipe> processing = new HashMap<>();
  private final Map<Block, Integer> progressTime = new HashMap<>();
  private final Map<Block, Map<ItemStack, Integer>> consumedItemsMap = new HashMap<>();
  private final Map<Block, Integer> attemptCount = new HashMap<>();
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
          revertConsumedItem(b, inv);
          inv.dropItems(b.getLocation(), getInputSlots());
          inv.dropItems(b.getLocation(), getOutputSlots());
        }
        removeMapBlock(b);
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

  protected void updateStatusLoadMaterial(BlockMenu menu, ItemStack itemStack, int attempts, int progressCount, int totalProgress) {
    var infoDetail = new CustomItemStack(itemStack,
        "&cLoad more material to start", "",
        "&7Attempts: &e" + attempts + " &7/ &e" + Supreme.getSupremeOptions().getMachineMaxAttemptConsumed(),
        "&7Progress: &e" + progressCount + " &7/ &e" + totalProgress, "");
    menu.replaceExistingItem(getStatusSlot(), infoDetail);
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

  protected Map<ItemStack, Integer> getConsumedItems(Block b) {
    return consumedItemsMap.get(b);
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
      consumedItemsMap.put(b, new HashMap<>());
      attemptCount.put(b, 0);
    } else {
      if (getInputSlots().length <= 5) {
        updateStatusReset(inv);
      } else {
        updateStatusInvalidInput(inv);
      }
    }
  }

  private void removeMapBlock(Block b) {
    progressTime.remove(b);
    processing.remove(b);
    attemptCount.remove(b);
    consumedItemsMap.remove(b);
  }

  private void doProcessing(Block b, BlockMenu inv) {
    var result = getProcessing(b).getOutput();

    if (result == null || result.length == 0) {
      removeMapBlock(b);
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

    int attempts = attemptCount.getOrDefault(b, 0) + 1;
    if (consumptionRecipe(b, inv)) {
      progressTime.put(b, Math.max(ticksRemaining - this.getSpeed(), 0));
      attemptCount.put(b, 0);
      consumedItemsMap.put(b, new HashMap<>());
    } else {
      if (attempts >= Supreme.getSupremeOptions().getMachineMaxAttemptConsumed()) {
        revertConsumedItem(b, inv);
        removeMapBlock(b);
        updateStatusInvalidInput(inv);
      } else {
        attemptCount.put(b, attempts);
        var progressCount = getConsumedItems(b).values().stream().mapToInt(Integer::intValue).sum();
        var totalProgress = Arrays.stream(getProcessing(b).getInput()).mapToInt(ItemStack::getAmount).sum();
        updateStatusLoadMaterial(inv, getProcessing(b).getOutput()[0], attempts, progressCount, totalProgress);
      }
    }
  }

  private void revertConsumedItem(Block b, BlockMenu inv) {
    for (Map.Entry<ItemStack, Integer> consumedEntry : getConsumedItems(b).entrySet()) {
      ItemStack consumedItem = consumedEntry.getKey();
      int amount = consumedEntry.getValue();
      if (consumedItem != null && consumedItem.getType() != Material.AIR) {
        int maxStackSize = consumedItem.getMaxStackSize();
        while (amount > 0) {
          int stackSize = Math.min(maxStackSize, amount);
          ItemStack returnItem = consumedItem.clone();
          returnItem.setAmount(stackSize);
          inv.pushItem(returnItem, getInputSlots());
          amount -= stackSize;
        }
      }
    }
    getConsumedItems(b).clear();
  }

  private void endProcessTicks(Block b, BlockMenu inv, ItemStack[] result) {
    if (notHasSpaceOutput(inv, result)) {
      updateStatusOutputFull(inv);
      return;
    }
    for (ItemStack itemStack : result) {
      inv.pushItem(itemStack.clone(), getOutputSlots());
    }
    removeMapBlock(b);
    updateStatusReset(inv);
  }

  private void doProcessTicks(Block b, BlockMenu inv, int ticks, int ticksRemaining, ItemStack result) {
    progressTime.put(b, Math.max(ticksRemaining - this.getSpeed(), 0));
    ChestMenuUtils.updateProgressbar(inv, getStatusSlot(), ticksRemaining, ticks, result);
  }

  private boolean consumptionRecipe(Block b, BlockMenu inv) {
    Map<ItemStack, Integer> requiredItems = new HashMap<>();
    for (ItemStack item : getProcessing(b).getInput()) {
      requiredItems.merge(item.clone(), item.getAmount(), Integer::sum);
    }

    boolean consumeFailure = false;
    for (Map.Entry<ItemStack, Integer> entry : requiredItems.entrySet()) {
      ItemStack requiredItem = entry.getKey();
      int requiredAmount = entry.getValue();
      int foundAmount = 0;

      for (Map.Entry<ItemStack, Integer> consumedEntry : getConsumedItems(b).entrySet()) {
        if (SlimefunUtils.isItemSimilar(consumedEntry.getKey(), requiredItem, false, false)) {
          foundAmount += consumedEntry.getValue();
        }
      }

      for (int slot : this.getInputSlots()) {
        if (inv.getItemInSlot(slot) == null) {
          continue;
        }
        ItemStack inputItem = inv.getItemInSlot(slot).clone();
        if (SlimefunUtils.isItemSimilar(inputItem, requiredItem, false, false)) {
          int amountToConsume = Math.min(inputItem.getAmount(), requiredAmount - foundAmount);
          if (amountToConsume > 0) {
            inv.consumeItem(slot, amountToConsume);
            getConsumedItems(b).merge(inputItem, amountToConsume, Integer::sum);
          }
          foundAmount += amountToConsume;
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

    return !consumeFailure;
  }

  private boolean matchingRecipe(ItemStack[] recipe, BlockMenu inv) {
    Set<ItemStack> uniqueItems = new HashSet<>(Arrays.asList(recipe));
    return uniqueItems.stream().allMatch(item -> isItemPresentInSlots(item, inv));
  }

  private boolean isItemPresentInSlots(ItemStack item, BlockMenu inv) {
    for (int slot : this.getInputSlots()) {
      ItemStack itemInSlot = inv.getItemInSlot(slot);
      if (itemInSlot != null && SlimefunUtils.isItemSimilar(itemInSlot, item, false, false)) {
        return true;
      }
    }
    return false;
  }

  private ItemStack getDisplayOrInfo(ItemStack itemStack, String name) {
    return new CustomItemStack(itemStack != null ? itemStack : new ItemStack(Material.BLACK_STAINED_GLASS_PANE), name);
  }

  private ItemStack getDisplayOrWarn(ItemStack itemStack, String name) {
    return new CustomItemStack(itemStack != null ? itemStack : new ItemStack(Material.RED_STAINED_GLASS_PANE), name);
  }
}