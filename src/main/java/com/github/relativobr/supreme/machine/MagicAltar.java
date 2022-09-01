package com.github.relativobr.supreme.machine;

import com.github.relativobr.machine.MediumContainerMachine;
import com.github.relativobr.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class MagicAltar extends MediumContainerMachine {

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SupremeItemStack("SUPREME_MAGIC_ALTAR_I",
      Material.SMOKER, "&bMagic Altar", "", "&fCraft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{SlimefunItems.ANCIENT_PEDESTAL,
      SupremeComponents.SYNTHETIC_RUBY, SlimefunItems.ANCIENT_PEDESTAL, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.ANCIENT_ALTAR, SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.ANCIENT_PEDESTAL,
      SupremeComponents.INDUCTOR_MACHINE, SlimefunItems.ANCIENT_PEDESTAL};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SupremeItemStack("SUPREME_MAGIC_ALTAR_II",
      Material.SMOKER, "&bMagic Altar II", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_II = new ItemStack[]{SupremeComponents.THORNERITE,
      SupremeCetrus.CETRUS_AQUA, SupremeComponents.THORNERITE, SupremeCetrus.CETRUS_VENTUS,
      MagicAltar.MAGIC_ALTAR_MACHINE, SupremeCetrus.CETRUS_LUX, SupremeComponents.THORNERITE,
      SupremeCetrus.CETRUS_IGNIS, SupremeComponents.THORNERITE};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SupremeItemStack("SUPREME_MAGIC_ALTAR_III",
      Material.SMOKER, "&bMagic Altar III", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE,
      SupremeAttribute.getMagic(), SupremeComponents.THORNERITE, SupremeComponents.SUPREME,
      MagicAltar.MAGIC_ALTAR_MACHINE_II, SupremeComponents.SUPREME, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};

  public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.FEATHER), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.FEATHER), new ItemStack(Material.GHAST_TEAR), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.FEATHER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.FEATHER)},
      new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4));
  public static final AbstractItemRecipe RECIPE_RUNE_EARTH = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.DIRT), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE), new ItemStack(Material.OBSIDIAN), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.OBSIDIAN), new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.DIRT)}, new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 4));
  public static final AbstractItemRecipe RECIPE_RUNE_FIRE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.FIRE_CHARGE), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.FIRE_CHARGE), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.EARTH_RUNE), new ItemStack(Material.FLINT_AND_STEEL),
          new ItemStack(Material.FIRE_CHARGE), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.FIRE_CHARGE)}, new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 4));
  public static final AbstractItemRecipe RECIPE_RUNE_WATER = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.SALMON), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.SAND), new ItemStack(SlimefunItems.BLANK_RUNE),
          new ItemStack(Material.SAND), new ItemStack(Material.WATER_BUCKET), new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.COD)}, new SlimefunItemStack(SlimefunItems.WATER_RUNE, 4));
  public static final AbstractItemRecipe RECIPE_RUNE_ENDER = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.ENDER_PEARL), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.ENDER_EYE),
          new ItemStack(SlimefunItems.BLANK_RUNE), new ItemStack(Material.ENDER_EYE),
          new ItemStack(Material.ENDER_PEARL), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(Material.ENDER_PEARL)}, new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 6));
  public static final AbstractItemRecipe RECIPE_RUNE_LIGHTNING = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.IRON_INGOT), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.IRON_INGOT), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(SlimefunItems.WATER_RUNE),
          new ItemStack(Material.IRON_INGOT), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.IRON_INGOT)}, new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 4));
  public static final AbstractItemRecipe RECIPE_RUNE_RAINBOW = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.RED_DYE), new ItemStack(SlimefunItems.MAGIC_LUMP_3),
          new ItemStack(Material.CYAN_DYE), new ItemStack(Material.WHITE_WOOL), new ItemStack(SlimefunItems.ENDER_RUNE),
          new ItemStack(Material.WHITE_WOOL), new ItemStack(Material.YELLOW_DYE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(Material.MAGENTA_DYE)},
      new SlimefunItemStack(SlimefunItems.RAINBOW_RUNE, 1));
  public static final AbstractItemRecipe RECIPE_RUNE_SOULBOUND = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(SlimefunItems.ENDER_RUNE), new ItemStack(SlimefunItems.ENDER_LUMP_3),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)}, new SlimefunItemStack(SlimefunItems.SOULBOUND_RUNE, 1));
  public static final AbstractItemRecipe RECIPE_RUNE_ENCHANTMENT = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.LIGHTNING_RUNE), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)}, new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 1));
  public static final AbstractItemRecipe RECIPE_RUNE_VILLAGERS = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_3), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(Material.CRYING_OBSIDIAN), new ItemStack(SlimefunItems.STRANGE_NETHER_GOO),
          new ItemStack(SlimefunItems.FIRE_RUNE), new ItemStack(SlimefunItems.STRANGE_NETHER_GOO),
          new ItemStack(Material.CRYING_OBSIDIAN), new ItemStack(SlimefunItems.MAGICAL_GLASS),
          new ItemStack(SlimefunItems.MAGIC_LUMP_3)}, new SlimefunItemStack(SlimefunItems.VILLAGER_RUNE, 3));
  public static final AbstractItemRecipe RECIPE_BLANK_RUNE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1),
          new ItemStack(Material.STONE), new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.OBSIDIAN),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.STONE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.STONE)},
      new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1));
  public static final AbstractItemRecipe RECIPE_ESSENCE_OF_AFTERLIFE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.EARTH_RUNE),
          new ItemStack(SlimefunItems.NECROTIC_SKULL), new ItemStack(SlimefunItems.FIRE_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.WATER_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3)}, new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1));
  public static final AbstractItemRecipe RECIPE_LAVA_CRYSTAL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.FIRE_RUNE), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1), new ItemStack(Material.BLAZE_POWDER),
          new ItemStack(SlimefunItems.MAGIC_LUMP_1)}, new SlimefunItemStack(SlimefunItems.LAVA_CRYSTAL, 1));
  public static final AbstractItemRecipe RECIPE_MAGICAL_GLASS = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_DUST),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(Material.EXPERIENCE_BOTTLE),
          new ItemStack(Material.GLASS_PANE), new ItemStack(Material.EXPERIENCE_BOTTLE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(Material.EXPERIENCE_BOTTLE),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2)}, new SlimefunItemStack(SlimefunItems.MAGICAL_GLASS, 1));
  public static final AbstractItemRecipe RECIPE_COMMON_TALISMAN = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_8K),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), null, new ItemStack(Material.EMERALD), null,
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), new ItemStack(SlimefunItems.GOLD_8K),
          new ItemStack(SlimefunItems.MAGIC_LUMP_2)}, new SlimefunItemStack(SlimefunItems.COMMON_TALISMAN, 1));
  public static final AbstractItemRecipe RECIPE_MAGICAL_BOOK_COVER = new AbstractItemRecipe(
      new ItemStack[]{null, new ItemStack(SlimefunItems.MAGIC_LUMP_2), null, new ItemStack(SlimefunItems.MAGIC_LUMP_2),
          new ItemStack(Material.BOOK), new ItemStack(SlimefunItems.MAGIC_LUMP_2), null,
          new ItemStack(SlimefunItems.MAGIC_LUMP_2), null}, new SlimefunItemStack(SlimefunItems.MAGICAL_BOOK_COVER, 1));
  public static final AbstractItemRecipe RECIPE_POWER_CRYSTAL = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(Material.REDSTONE), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(SlimefunItems.SYNTHETIC_DIAMOND), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE), new ItemStack(SlimefunItems.SYNTHETIC_SAPPHIRE),
          new ItemStack(Material.REDSTONE)}, new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL, 1));
  public static final AbstractItemRecipe RECIPE_ELYTRA_SCALE = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(Material.PHANTOM_MEMBRANE),
          new ItemStack(Material.FEATHER), new ItemStack(Material.PHANTOM_MEMBRANE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ENDER_LUMP_3)}, new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE, 1));
  public static final AbstractItemRecipe RECIPE_ELITROS = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE), new ItemStack(SlimefunItems.AIR_RUNE),
          new ItemStack(SlimefunItems.ELYTRA_SCALE)}, new ItemStack(Material.ELYTRA, 1));
  public static final AbstractItemRecipe RECIPE_INFUSED_ELYTRA = new AbstractItemRecipe(
      new ItemStack[]{new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE), new ItemStack(SlimefunItems.ELYTRA_SCALE),
          new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE), new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE),
          new ItemStack(Material.ELYTRA), new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE),
          new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE), new ItemStack(SlimefunItems.ELYTRA_SCALE),
          new ItemStack(SlimefunItems.FILLED_FLASK_OF_KNOWLEDGE)}, new SlimefunItemStack(SlimefunItems.INFUSED_ELYTRA, 1));

  public MagicAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_RUNE_AIR);
    list.add(RECIPE_RUNE_EARTH);
    list.add(RECIPE_RUNE_FIRE);
    list.add(RECIPE_RUNE_WATER);
    list.add(RECIPE_RUNE_ENDER);
    list.add(RECIPE_RUNE_LIGHTNING);
    list.add(RECIPE_RUNE_RAINBOW);
    list.add(RECIPE_RUNE_SOULBOUND);
    list.add(RECIPE_RUNE_ENCHANTMENT);
    list.add(RECIPE_RUNE_VILLAGERS);
    list.add(RECIPE_BLANK_RUNE);
    list.add(RECIPE_ESSENCE_OF_AFTERLIFE);
    list.add(RECIPE_LAVA_CRYSTAL);
    list.add(RECIPE_MAGICAL_GLASS);
    list.add(RECIPE_COMMON_TALISMAN);
    list.add(RECIPE_MAGICAL_BOOK_COVER);
    list.add(RECIPE_POWER_CRYSTAL);
    list.add(RECIPE_ELYTRA_SCALE);
    list.add(RECIPE_ELITROS);
    list.add(RECIPE_INFUSED_ELYTRA);
    return list;
  }

}
