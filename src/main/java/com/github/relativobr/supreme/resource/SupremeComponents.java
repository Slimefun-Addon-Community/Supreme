package com.github.relativobr.supreme.resource;

import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeComponents {

  public static final SlimefunItemStack SUPREME_NUGGET = new SupremeItemStack("SUPREME_SUPREME_NUGGET",
      "cffc977cc7e10e564a09638a53bbc4c54c9c8dac7450ba3dfa3c9099d94f5", "&aNugget Supreme", "",
      "&7From the Quarry Nugget Supreme", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME_NUGGET = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack SUPREME = new SupremeItemStack("SUPREME_SUPREME",
      "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d", "&aSupreme", "", "&7The Supreme", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_SUPREME = {SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET, SupremeComponents.SUPREME_NUGGET,
      SupremeComponents.SUPREME_NUGGET};

  public static final SlimefunItemStack THORNIUM_BIT = new SupremeItemStack("SUPREME_THORNIUM_BIT",
      Material.IRON_NUGGET, "&aThornium Bit", "", "&7From the Quarry Thornium", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT = {null, null, null, null, null, null, null, null, null};

  public static final SlimefunItemStack THORNIUM_DUST = new SupremeItemStack("SUPREME_THORNIUM_DUST",
      Material.GUNPOWDER, "&aThornium Dust", "", "&7From the Thornium Bit", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST = {SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT,
      SupremeComponents.THORNIUM_BIT, SupremeComponents.THORNIUM_BIT};

  public static final SlimefunItemStack THORNIUM_INGOT = new SupremeItemStack("SUPREME_THORNIUM_INGOT",
      Material.IRON_INGOT, "&aThornium Ingot", "", "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT = {SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST,
      SupremeComponents.THORNIUM_DUST, SupremeComponents.THORNIUM_DUST};

  public static final SlimefunItemStack THORNIUM_BIT_SYNTHETIC = new SupremeItemStack("SUPREME_THORNIUM_BIT_SYNTHETIC",
      Material.GOLD_NUGGET, "&aThornium Bit Synthetic", "", "&7From the Thornium Bit", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_BIT_SYNTHETIC = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SupremeComponents.THORNIUM_BIT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final SlimefunItemStack THORNIUM_DUST_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_DUST_SYNTHETIC", Material.GLOWSTONE_DUST, "&aThornium Dust Synthetic", "",
      "&7From the Thornium Dust", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_DUST_SYNTHETIC = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.THORNIUM_DUST, SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.HARDENED_METAL_INGOT, SlimefunItems.SYNTHETIC_EMERALD};

  public static final SlimefunItemStack THORNIUM_INGOT_SYNTHETIC = new SupremeItemStack(
      "SUPREME_THORNIUM_INGOT_SYNTHETIC", Material.GOLD_INGOT, "&aThornium Ingot Synthetic", "",
      "&7From the Thornium Ingot", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_INGOT_SYNTHETIC = {SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.STEEL_PLATE,
      SupremeComponents.THORNIUM_INGOT, SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND,
      SlimefunItems.STEEL_PLATE, SlimefunItems.SYNTHETIC_DIAMOND};

  public static final SlimefunItemStack THORNIUM_CARBONADO = new SupremeItemStack("SUPREME_THORNIUM_CARBONADO",
      Material.NETHERITE_INGOT, "&aThornium Carbonado", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_CARBONADO = {SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE,
      SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SupremeComponents.THORNIUM_INGOT,
      SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO, SlimefunItems.REINFORCED_PLATE, SlimefunItems.CARBONADO};

  public static final SlimefunItemStack THORNIUM_ENERGIZED = new SupremeItemStack("SUPREME_THORNIUM_ENERGIZED",
      Material.NETHERITE_INGOT, "&aThornium Energized", "", "&7From the Thornium Ingot", "",
      "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNIUM_ENERGIZED = {SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.THORNIUM_CARBONADO, SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3,
      SlimefunItems.REDSTONE_ALLOY, SlimefunItems.BLISTERING_INGOT_3};

  public static final SlimefunItemStack ALLOY_ZIRCONIUM = new SupremeItemStack("SUPREME_ALLOY_ZIRCONIUM",
      Material.IRON_INGOT, "&aAlloy Zirconium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ZIRCONIUM = {SlimefunItems.ZINC_DUST, SlimefunItems.SOLDER_INGOT,
      SlimefunItems.ZINC_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack ZIRCONIUM_PLATE = new SupremeItemStack("SUPREME_ZIRCONIUM_PLATE",
      Material.IRON_BLOCK, "&aZirconium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ZIRCONIUM_PLATE = {SupremeComponents.ALLOY_ZIRCONIUM,
      SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.ALLOY_ZIRCONIUM, SupremeCoreBlock.RESOURCE_CORE_DIORITE,
      SupremeCoreBlock.RESOURCE_CORE_DIORITE, SupremeCoreBlock.RESOURCE_CORE_DIORITE, SupremeComponents.ALLOY_ZIRCONIUM,
      SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.ALLOY_ZIRCONIUM};

  public static final SlimefunItemStack ALLOY_TITANIUM = new SupremeItemStack("SUPREME_ALLOY_TITANIUM",
      Material.IRON_INGOT, "&aAlloy Titanium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_TITANIUM = {SlimefunItems.TIN_DUST, SlimefunItems.DAMASCUS_STEEL_INGOT,
      SlimefunItems.TIN_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack TITANIUM_PLATE = new SupremeItemStack("SUPREME_TITANIUM_PLATE",
      Material.IRON_BLOCK, "&aTitanium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_TITANIUM_PLATE = {SupremeComponents.ALLOY_TITANIUM,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM, SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
      SupremeCoreBlock.RESOURCE_CORE_ANDESITE, SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_TITANIUM};

  public static final SlimefunItemStack ALLOY_IRIDIUM = new SupremeItemStack("SUPREME_ALLOY_IRIDIUM",
      Material.IRON_INGOT, "&aAlloy Iridium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_IRIDIUM = {SlimefunItems.SILVER_DUST, SlimefunItems.BILLON_INGOT,
      SlimefunItems.SILVER_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack IRIDIUM_PLATE = new SupremeItemStack("SUPREME_IRIDIUM_PLATE",
      Material.IRON_BLOCK, "&aIridium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_IRIDIUM_PLATE = {SupremeComponents.ALLOY_IRIDIUM,
      SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_IRIDIUM, SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
      SupremeCoreBlock.RESOURCE_CORE_GRAVEL, SupremeCoreBlock.RESOURCE_CORE_GRAVEL, SupremeComponents.ALLOY_IRIDIUM,
      SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_IRIDIUM};

  public static final SlimefunItemStack ALLOY_AURUM = new SupremeItemStack("SUPREME_ALLOY_AURUM", Material.GOLD_INGOT,
      "&aAlloy Aurum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_AURUM = {SlimefunItems.GOLD_DUST, SlimefunItems.COBALT_INGOT,
      SlimefunItems.GOLD_24K, null, null, null, null, null, null};

  public static final SlimefunItemStack AURUM_PLATE = new SupremeItemStack("SUPREME_AURUM_PLATE", Material.GOLD_BLOCK,
      "&aAurum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_AURUM_PLATE = {SupremeComponents.ALLOY_AURUM, SupremeComponents.ALLOY_AURUM,
      SupremeComponents.ALLOY_AURUM, SupremeCoreBlock.RESOURCE_CORE_SAND, SupremeCoreBlock.RESOURCE_CORE_SAND,
      SupremeCoreBlock.RESOURCE_CORE_SAND, SupremeComponents.ALLOY_AURUM, SupremeComponents.ALLOY_AURUM,
      SupremeComponents.ALLOY_AURUM};

  public static final SlimefunItemStack ALLOY_MANGANESE = new SupremeItemStack("SUPREME_ALLOY_MANGANESE",
      Material.GOLD_INGOT, "&aAlloy Manganese", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_MANGANESE = {SlimefunItems.MAGNESIUM_DUST, SlimefunItems.DURALUMIN_INGOT,
      SlimefunItems.MAGNESIUM_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack MANGANESE_PLATE = new SupremeItemStack("SUPREME_MANGANESE_PLATE",
      Material.GOLD_BLOCK, "&aManganese Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_MANGANESE_PLATE = {SupremeComponents.ALLOY_MANGANESE,
      SupremeComponents.ALLOY_MANGANESE, SupremeComponents.ALLOY_MANGANESE, SupremeCoreBlock.RESOURCE_CORE_GRANITE,
      SupremeCoreBlock.RESOURCE_CORE_GRANITE, SupremeCoreBlock.RESOURCE_CORE_GRANITE, SupremeComponents.ALLOY_MANGANESE,
      SupremeComponents.ALLOY_MANGANESE, SupremeComponents.ALLOY_MANGANESE};

  public static final SlimefunItemStack ALLOY_PLATINUM = new SupremeItemStack("SUPREME_ALLOY_PLATINUM",
      Material.GOLD_INGOT, "&aAlloy Platinum", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_PLATINUM = {SlimefunItems.LEAD_DUST, SlimefunItems.BRASS_INGOT,
      SlimefunItems.LEAD_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack PLATINUM_PLATE = new SupremeItemStack("SUPREME_PLATINUM_PLATE",
      Material.GOLD_BLOCK, "&aPlatinum Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_PLATINUM_PLATE = {SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_PLATINUM, SupremeComponents.ALLOY_PLATINUM, SupremeCoreBlock.RESOURCE_CORE_CLAY,
      SupremeCoreBlock.RESOURCE_CORE_CLAY, SupremeCoreBlock.RESOURCE_CORE_CLAY, SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_PLATINUM, SupremeComponents.ALLOY_PLATINUM};

  public static final SlimefunItemStack ALLOY_ADAMANTIUM = new SupremeItemStack("SUPREME_ALLOY_ADAMANTIUM",
      Material.NETHERITE_INGOT, "&aAlloy Adamantium", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ALLOY_ADAMANTIUM = {SlimefunItems.ALUMINUM_DUST,
      SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.ALUMINUM_INGOT, null, null, null, null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_PLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_PLATE",
      Material.NETHERITE_BLOCK, "&aAdamantium Plate", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_ADAMANTIUM_PLATE = {SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_ADAMANTIUM, SupremeCoreBlock.RESOURCE_CORE_STONE,
      SupremeCoreBlock.RESOURCE_CORE_STONE, SupremeCoreBlock.RESOURCE_CORE_STONE, SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_ADAMANTIUM};

  public static final SlimefunItemStack SYNTHETIC_AMETHYST = new SupremeItemStack("SUPREME_SYNTHETIC_AMETHYST",
      Material.PURPLE_DYE, "&aSynthetic Amethyst", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_AMETHYST = {SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.MAGIC_LUMP_3,
      new ItemStack(Material.AMETHYST_SHARD), SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE,
      SlimefunItems.MAGIC_LUMP_3, SlimefunItems.SYNTHETIC_SAPPHIRE};

  public static final SlimefunItemStack SYNTHETIC_RUBY = new SupremeItemStack("SUPREME_SYNTHETIC_RUBY",
      Material.PINK_DYE, "&aSynthetic Ruby", "", "&3Supreme Components");
  public static final ItemStack[] RECIPE_SYNTHETIC_RUBY = {SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_DIAMOND,
      SupremeComponents.SYNTHETIC_AMETHYST, SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD,
      SlimefunItems.SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_EMERALD};

  public static final SlimefunItemStack THORNERITE = new SupremeItemStack("SUPREME_THORNERITE",
      Material.NETHERITE_INGOT, "&aThornerite", "", "&3Supreme End-Game Components");
  public static final ItemStack[] RECIPE_THORNERITE = {SupremeComponents.THORNIUM_INGOT,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.ALLOY_PLATINUM,
      SupremeComponents.ALLOY_TITANIUM, SupremeComponents.ALLOY_ZIRCONIUM, null, null, null};

  public static final SlimefunItemStack INDUCTIVE_MACHINE = new SupremeItemStack("SUPREME_INDUCTIVE_MACHINE",
      Material.DEAD_FIRE_CORAL_BLOCK, "&aInductive Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTIVE_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY, SupremeComponents.ALLOY_IRIDIUM,
      SlimefunItems.ELECTRO_MAGNET, SupremeComponents.ALLOY_IRIDIUM, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.ALLOY_PLATINUM, SlimefunItems.REDSTONE_ALLOY};

  public static final SlimefunItemStack INDUCTOR_MACHINE = new SupremeItemStack("SUPREME_INDUCTOR_MACHINE",
      Material.FIRE_CORAL_BLOCK, "&aInductor Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_INDUCTOR_MACHINE = {SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY, SupremeComponents.IRIDIUM_PLATE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.IRIDIUM_PLATE, SlimefunItems.REDSTONE_ALLOY,
      SupremeComponents.PLATINUM_PLATE, SlimefunItems.REDSTONE_ALLOY};

  public static final SlimefunItemStack RUSTLESS_MACHINE = new SupremeItemStack("SUPREME_RUSTLESS_MACHINE",
      Material.DEAD_BRAIN_CORAL_BLOCK, "&aRustless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_RUSTLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.ALLOY_MANGANESE,
      SlimefunItems.ELECTRO_MAGNET, SupremeComponents.ALLOY_MANGANESE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ALLOY_ZIRCONIUM, SlimefunItems.HARDENED_METAL_INGOT};

  public static final SlimefunItemStack STAINLESS_MACHINE = new SupremeItemStack("SUPREME_STAINLESS_MACHINE",
      Material.BRAIN_CORAL_BLOCK, "&aStainless Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_STAINLESS_MACHINE = {SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.MANGANESE_PLATE,
      SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.MANGANESE_PLATE, SlimefunItems.HARDENED_METAL_INGOT,
      SupremeComponents.ZIRCONIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT};

  public static final SlimefunItemStack CARRIAGE_MACHINE = new SupremeItemStack("SUPREME_CARRIAGE_MACHINE",
      Material.DEAD_HORN_CORAL_BLOCK, "&aCarriage Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CARRIAGE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_TITANIUM, SlimefunItems.ELECTRO_MAGNET,
      SupremeComponents.ALLOY_TITANIUM, SlimefunItems.GILDED_IRON, SupremeComponents.ALLOY_AURUM,
      SlimefunItems.GILDED_IRON};

  public static final SlimefunItemStack CONVEYANCE_MACHINE = new SupremeItemStack("SUPREME_CONVEYANCE_MACHINE",
      Material.HORN_CORAL_BLOCK, "&aConveyance Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CONVEYANCE_MACHINE = {SlimefunItems.GILDED_IRON, SupremeComponents.AURUM_PLATE,
      SlimefunItems.GILDED_IRON, SupremeComponents.TITANIUM_PLATE, SupremeComponents.CARRIAGE_MACHINE,
      SupremeComponents.TITANIUM_PLATE, SlimefunItems.GILDED_IRON, SupremeComponents.AURUM_PLATE,
      SlimefunItems.GILDED_IRON};

  public static final SlimefunItemStack PETRIFIER_MACHINE = new SupremeItemStack("SUPREME_PETRIFIER_MACHINE",
      Material.DEAD_TUBE_CORAL_BLOCK, "&aPetrifier Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_PETRIFIER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_COAL,
      SupremeComponents.RUSTLESS_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_COAL, SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeComponents.CARRIAGE_MACHINE, SupremeComponents.ALLOY_ADAMANTIUM, SupremeCoreBlock.RESOURCE_CORE_STONE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeCoreBlock.RESOURCE_CORE_STONE};

  public static final SlimefunItemStack CRYSTALLIZER_MACHINE = new SupremeItemStack("SUPREME_CRYSTALLIZER_MACHINE",
      Material.TUBE_CORAL_BLOCK, "&aCrystallizer Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_CRYSTALLIZER_MACHINE = {SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
      STAINLESS_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.SYNTHETIC_RUBY,
      SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.SYNTHETIC_RUBY, SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
      SupremeComponents.INDUCTOR_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_EMERALD};

  public static final SlimefunItemStack BLEND_MACHINE = new SupremeItemStack("SUPREME_BLEND_MACHINE",
      Material.BUBBLE_CORAL_BLOCK, "&aBlend Machine", "", "&3Supreme Advanced Components");
  public static final ItemStack[] RECIPE_BLEND_MACHINE = {SupremeComponents.INDUCTOR_MACHINE,
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack CENTER_CARD_SIMPLE = new SupremeItemStack("SUPREME_CENTER_CARD_SIMPLE",
      Material.MUSIC_DISC_11, "&aBasic Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_SIMPLE = new ItemStack[]{SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeComponents.SYNTHETIC_AMETHYST, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD,
      SlimefunItems.ELECTRO_MAGNET, SlimefunItems.BASIC_CIRCUIT_BOARD};

  public static final SlimefunItemStack CENTER_CARD_ADVANCED = new SupremeItemStack("SUPREME_CENTER_CARD_ADVANCED",
      Material.MUSIC_DISC_PIGSTEP, "&aAdvanced Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ADVANCED = new ItemStack[]{SlimefunItems.ADVANCED_CIRCUIT_BOARD,
      SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SupremeComponents.CENTER_CARD_SIMPLE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL,
      SupremeComponents.CENTER_CARD_SIMPLE, SlimefunItems.HEATING_COIL};

  public static final SlimefunItemStack CENTER_CARD_ULTIMATE = new SupremeItemStack("SUPREME_CENTER_CARD_ULTIMATE",
      Material.MUSIC_DISC_MALL, "&aUltimate Component for Card", "", "&fComponent for Machine to produce items", "",
      "&3Supreme Component");
  public static final ItemStack[] RECIPE_CENTER_CARD_ULTIMATE = new ItemStack[]{SupremeComponents.SYNTHETIC_RUBY,
      SupremeComponents.CENTER_CARD_ADVANCED, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.CENTER_CARD_ADVANCED,
      SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE,
      SupremeComponents.CENTER_CARD_ADVANCED, SlimefunItems.REINFORCED_PLATE};

  public static final SlimefunItemStack DUST_NETHERITE = new SupremeItemStack("SUPREME_DUST_NETHERITE",
      Material.MELON_SEEDS, "&aNetherite Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_NETHERITE = new ItemStack[]{new ItemStack(Material.NETHERITE_INGOT), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_GLOW_INK = new SupremeItemStack("SUPREME_DUST_GLOW_INK",
      Material.PUMPKIN_SEEDS, "&aGlow Ink Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_GLOW_INK = new ItemStack[]{new ItemStack(Material.GLOW_INK_SAC), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack DUST_AMETHYST = new SupremeItemStack("SUPREME_DUST_AMETHYST",
      Material.BEETROOT_SEEDS, "&aAmethyst Dust", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_DUST_AMETHYST = new ItemStack[]{new ItemStack(Material.AMETHYST_SHARD), null,
      null, null, null, null, null, null, null};

  public static final SlimefunItemStack EMPTY_MOBTECH = new SupremeItemStack("SUPREME_EMPTY_MOBTECH",
      Material.FIRE_CHARGE, "&aEmpty MobTech", "", "&3Supreme Component");
  public static final ItemStack[] RECIPE_EMPTY_MOBTECH = new ItemStack[]{SlimefunItems.MAGIC_LUMP_2,
      SlimefunItems.STONE_CHUNK, SlimefunItems.ENDER_LUMP_2, null, null, null, null, null, null};

  public static final SlimefunItemStack GENE_BERSERK = new SupremeItemStack("SUPREME_GENE_BERSERK", Material.FIRE_CORAL,
      "&aBerserk Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_INTELLIGENCE = new SupremeItemStack("SUPREME_GENE_INTELLIGENCE",
      Material.TUBE_CORAL, "&fIntelligence Gene", "", "&3Supreme Component");

  public static final SlimefunItemStack GENE_LUCK = new SupremeItemStack("SUPREME_GENE_LUCK", Material.HORN_CORAL,
      "&aLuck Gene", "", "&3Supreme Component");

}
