package com.github.relativobr.supreme.machine.tech;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.generic.machine.SimpleItemContainerMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.MobTech;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import io.github.thebusybiscuit.slimefun4.libraries.dough.data.persistent.PersistentDataAPI;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.springframework.scheduling.annotation.Async;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Async
public class TechGenerator extends SimpleItemContainerMachine implements Radioactive {

  public static final SlimefunItemStack TECH_GENERATOR = new SupremeItemStack(
      "SUPREME_TECH_GENERATOR", Material.LOOM,
      "&bTech Generator", "", "&fUsing power and bees/golem/zombie, ", "&fslowly generates "
      + "materials.", "",
      LoreBuilder.radioactive(Radioactivity.LOW), "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
      UtilEnergy.energyPowerPerTick(2000), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_TECH_GENERATOR = {SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.REINFORCED_ALLOY_INGOT,
      new ItemStack(Material.LOOM), SlimefunItems.REINFORCED_ALLOY_INGOT,
      SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.HEATING_COIL, SupremeComponents.CARRIAGE_MACHINE};

  public static final List<AbstractItemRecipe> receitasParaProduzir = new ArrayList<>();
  private Map<Block, ItemStack> processing = new HashMap<>();
  private Map<Block, Integer> progressTime = new HashMap<>();
  private int speed = 1;

  public TechGenerator(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.MACHINES_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public static void addRecipesToProcess(ItemStack input, ItemStack output) {
    receitasParaProduzir.add(new AbstractItemRecipe(input, output));
  }

  public static void preSetup(Supreme plugin, SlimefunItemStack item, Material input,
      Material output) {
    preSetup(plugin, 1, item, new ItemStack(input), new ItemStack(output));
  }

  public static void preSetup(Supreme plugin, SlimefunItemStack item, ItemStack input,
      ItemStack output) {
    preSetup(plugin, 1, item, input, output);
  }

  public static void preSetup(Supreme plugin, int tierCard, SlimefunItemStack item, ItemStack input,
      ItemStack output) {
    preSetup(plugin, tierCard, item, input, input, output);
  }

  public static void preSetup(Supreme plugin, int tierCard, SlimefunItemStack item,
      ItemStack input1, ItemStack input2,
      ItemStack output) {
    new UnplaceableBlock(ItemGroups.CARDS_CATEGORY, item, RecipeType.ENHANCED_CRAFTING_TABLE,
        new ItemStack[]{new ItemStack(input1), new ItemStack(input2), new ItemStack(input1),
            new ItemStack(input2),
            getCardTier(tierCard), new ItemStack(input2), new ItemStack(input1),
            new ItemStack(input2),
            new ItemStack(input1)}).register(plugin);
    TechGenerator.addRecipesToProcess(item, output);
  }

  @Nonnull
  private static ItemStack getCardTier(int tierCard) {
    if (tierCard >= 3) {
      return SupremeComponents.CENTER_CARD_ULTIMATE;
    } else if (tierCard == 2) {
      return SupremeComponents.CENTER_CARD_ADVANCED;
    } else {
      return SupremeComponents.CENTER_CARD_SIMPLE;
    }
  }

  private static void invalidStatus(BlockMenu menu, String txt) {
    for (int i : InventoryRecipe.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, txt));
    }
  }

  private static void invalidStatus(BlockMenu menu, Material material, String txt) {
    for (int i : InventoryRecipe.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      menu.replaceExistingItem(i, new CustomItemStack(material, txt));
    }
  }

  public List<AbstractItemRecipe> getRecipeShow() {

    return receitasParaProduzir.stream().filter(o -> o.getInput() != null)
        .sorted((o1, o2) -> Integer.compare(o1.getInput().length, o2.getInput().length))
        .collect(Collectors.toList());
  }

  public List<AbstractItemRecipe> getRecipeProcess() {

    return receitasParaProduzir.stream().filter(o -> o.getInput() != null)
        .sorted((o1, o2) -> Integer.compare(o2.getInput().length, o1.getInput().length))
        .collect(Collectors.toList());
  }

  @Override
  public int[] getInputSlots() {
    return InventoryRecipe.TECH_GENERATOR_INPUT_SLOTS;
  }

  @Override
  public int[] getOutputSlots() {
    return InventoryRecipe.TECH_GENERATOR_OUTPUT_SLOTS;
  }

  @Override
  protected void constructMenu(BlockMenuPreset preset) {

    for (int i : InventoryRecipe.TECH_GENERATOR_BORDER) {
      preset.addItem(i, new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_GENERATOR_BORDER_IN) {
      preset.addItem(i, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_GENERATOR_BORDER_OUT) {
      preset.addItem(i, new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
      preset.addItem(i, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " ", new String[0]),
          ChestMenuUtils.getEmptyClickHandler());
    }

    for (int i : InventoryRecipe.TECH_GENERATOR_OUTPUT_SLOTS) {
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
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        TechGenerator.this.tick(b);
      }

      public boolean isSynchronized() {
        return false;
      }
    });
  }

  public void tick(Block b) {

    BlockMenu inv = BlockStorage.getInventory(b);

    // Unlikely but blockmenus can be null
    if (inv == null) {
      return;
    }

    final ItemStack itemProduction = processing.get(b);
    if (itemProduction == null) {
      final ItemStack validRecipeItem = validRecipeItem(inv);

      if (validRecipeItem != null) {

        invalidStatus(inv, validRecipeItem.getType(), " ");

        processing.put(b, validRecipeItem);
        progressTime.put(b, (getTimeProcess() * 2));

      } else {

        invalidStatus(inv, "&cCards unidentified");

      }

    } else {

      if (this.getProgressTime(b) <= 0) {

        checkCloneOutput(inv, itemProduction.clone());

        processing.put(b, null);
        progressTime.put(b, 0);
        invalidStatus(inv, Material.BLACK_STAINED_GLASS_PANE, " ");

      } else {
        final ItemStack validRecipeItem = validRecipeItem(inv);

        if (SlimefunUtils.isItemSimilar(validRecipeItem, itemProduction, false, false)) {

          this.processTicks(b, inv, itemProduction);

        } else {

          processing.put(b, null);
          progressTime.put(b, 0);
          invalidStatus(inv, Material.BLACK_STAINED_GLASS_PANE, " ");
        }
      }
    }
  }

  private void checkCloneOutput(BlockMenu inv, ItemStack itemStack) {
    itemStack.setAmount(Supreme.getSupremeOptions().getMaxAmountTechGenerator());
    inv.pushItem(itemStack, this.getOutputSlots());
    buildSlotProcess(inv.getItemInSlot(getInputSlots()[1]), itemStack, inv);
    buildSlotProcess(inv.getItemInSlot(getInputSlots()[2]), itemStack, inv);
    buildSlotProcess(inv.getItemInSlot(getInputSlots()[3]), itemStack, inv);
    buildSlotProcess(inv.getItemInSlot(getInputSlots()[4]), itemStack, inv);
  }

  private void buildSlotProcess(ItemStack input, ItemStack itemStack, BlockMenu inv) {
    if (input != null && itemStack != null) {
      SlimefunItem slimefunItem = SlimefunItem.getByItem(input);
      if (slimefunItem instanceof MobTech) {
        final MobTech mobTech = (MobTech) slimefunItem;
        if (mobTech.getMobTechType() == MobTechType.ROBOTIC_CLONING
            || mobTech.getMobTechType() == MobTechType.MUTATION_LUCK) {
          int amount = Math.min(input.getAmount() * mobTech.getMobTechTier(),
              Supreme.getSupremeOptions().getMaxAmountTechGenerator());
          itemStack.setAmount(amount);
          inv.pushItem(itemStack, this.getOutputSlots());
          if (mobTech.getMobTechTier() >= 4) {
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if (mobTech.getMobTechTier() >= 6) {
            inv.pushItem(itemStack, this.getOutputSlots());
          }
          if (mobTech.getMobTechTier() >= 9) {
            inv.pushItem(itemStack, this.getOutputSlots());
          }
        }
      }
    }
  }

  public int getProgressTime(Block b) {
    return progressTime.get(b) != null ? progressTime.get(b) : (getTimeProcess() * 2);
  }

  private void processTicks(Block b, BlockMenu inv, ItemStack result) {
    int ticksLeft = this.getProgressTime(b);
    if (ticksLeft > 0) {

      if (takeCharge(b.getLocation(), inv)) {

        int time = checkUpTime(ticksLeft, inv);

        if (time < 0) {
          time = 0;
        }
        progressTime.put(b, time);

        int ticksTotal = getTimeProcess() * 2;

        for (int i : InventoryRecipe.TECH_GENERATOR_PROGRESS_BAR_SLOT) {
          ChestMenuUtils.updateProgressbar(inv, i, Math.round(ticksLeft / this.getSpeed()),
              Math.round(ticksTotal / this.getSpeed()), result);
        }
      } else {
        final int downConsumption = checkDownConsumption(this.getEnergyConsumption(), inv);
        invalidStatus(inv, "&cNo power on the machine (" + downConsumption + " J/tick)");
      }
    } else {
      invalidStatus(inv, "&cMachine time failure");
    }
  }

  private int checkUpTime(int time, BlockMenu inv) {

    // tempo padrão
    time = time - this.getSpeed();

    time = checkTimeSlot(inv.getItemInSlot(getInputSlots()[1]), time);
    time = checkTimeSlot(inv.getItemInSlot(getInputSlots()[2]), time);
    time = checkTimeSlot(inv.getItemInSlot(getInputSlots()[3]), time);
    time = checkTimeSlot(inv.getItemInSlot(getInputSlots()[4]), time);

    return time;
  }

  private int checkTimeSlot(ItemStack input, int time) {
    if (input != null) {
      SlimefunItem slimefunItem = SlimefunItem.getByItem(input);
      if (slimefunItem instanceof MobTech) {
        int roundTimeAmount = Math.round(input.getAmount() * 0.015625F);
        final MobTech mobTech = (MobTech) slimefunItem;
        if (mobTech.getMobTechType() == MobTechType.ROBOTIC_ACCELERATION
            || mobTech.getMobTechType() == MobTechType.MUTATION_BERSERK) {
          time = time - (mobTech.getMobTechTier() + 1) * roundTimeAmount;
        } else {
          time = time - roundTimeAmount;
        }
      }
    }
    return time;
  }

  protected boolean takeCharge(@Nonnull Location l, BlockMenu inv) {
    Validate.notNull(l, "Can't attempt to take charge from a null location!");
    if (this.isChargeable()) {
      int charge = this.getCharge(l);
      int consumption = checkDownConsumption(this.getEnergyConsumption(), inv);
      if (charge < consumption) {
        return false;
      } else {
        this.setCharge(l, charge - consumption);
        return true;
      }
    } else {
      return true;
    }
  }

  private int checkDownConsumption(int consumption, BlockMenu inv) {
    consumption = checkConsumptionSlot(inv.getItemInSlot(getInputSlots()[1]), consumption);
    consumption = checkConsumptionSlot(inv.getItemInSlot(getInputSlots()[2]), consumption);
    consumption = checkConsumptionSlot(inv.getItemInSlot(getInputSlots()[3]), consumption);
    consumption = checkConsumptionSlot(inv.getItemInSlot(getInputSlots()[4]), consumption);
    return Math.max(consumption, 1);
  }

  private int checkConsumptionSlot(ItemStack input, int consumption) {
    if (input != null && !input.getType().isAir() && input.getItemMeta() != null) {
      NamespacedKey tier = new NamespacedKey(Supreme.inst(), "mob_tech_tier");
      NamespacedKey type = new NamespacedKey(Supreme.inst(), "mob_tech_type");
      ItemMeta itemMeta = input.getItemMeta();
      if (PersistentDataAPI.hasInt(itemMeta, tier) && PersistentDataAPI.hasString(itemMeta, type)) {
        MobTechType mobTechType = MobTechType.valueOf(PersistentDataAPI.getString(itemMeta, type));
        int mobTechTier = PersistentDataAPI.getInt(itemMeta, tier);
        float perceptual = (mobTechTier + 1) * input.getAmount() * 0.15625F;
        if (mobTechType == MobTechType.ROBOTIC_EFFICIENCY || mobTechType == MobTechType.MUTATION_INTELLIGENCE) {
          int adjustEnergy = Math.round(consumption / 100F * perceptual);
          consumption = consumption - adjustEnergy;
        }
        if (mobTechType == MobTechType.ROBOTIC_ACCELERATION || mobTechType == MobTechType.MUTATION_BERSERK) {
          int adjustEnergy = Math.round(consumption / 100F * perceptual);
          consumption = consumption + adjustEnergy;
        }
      } else {
          SlimefunItem slimefunItem = SlimefunItem.getByItem(input);
          if (slimefunItem instanceof MobTech) {
            PersistentDataAPI.setInt(itemMeta, tier, ((MobTech) slimefunItem).getMobTechTier());
            PersistentDataAPI.setString(itemMeta, type, ((MobTech) slimefunItem).getMobTechType().name());
            input.setItemMeta(itemMeta);
          }
      }
    }
    return consumption;
  }

  @Nullable
  private ItemStack validRecipeItem(BlockMenu inv) {

    for (AbstractItemRecipe produce : this.getRecipeProcess()) {
      if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[0]),
          produce.getFirstItemInput(), false, true)) {
        return produce.getFirstItemOutput();
      }

    }
    return null;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    for (AbstractItemRecipe recipe : this.getRecipeShow()) {
      if (recipe != null) {
        ItemStack itemStack = recipe.getFirstItemOutput().clone();
        itemStack.setAmount(Supreme.getSupremeOptions().getMaxAmountTechGenerator());
        displayRecipes.add(recipe.getFirstItemInput());
        displayRecipes.add(itemStack);
      }
    }
    return displayRecipes;
  }

  public int getSpeed() {
    return speed;
  }

  public TechGenerator setSpeed(int speed) {
    this.speed = speed;
    return this;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    return Radioactivity.LOW;
  }
}