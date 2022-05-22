package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.mobtech.TechGenerator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class AdvancedCard {

  /**
   * MUSIC_DISC_BLOCKS      8 laranja
   * MUSIC_DISC_CHIRP       9 vemelho
   * MUSIC_DISC_MALL        10 roxo
   * MUSIC_DISC_STAL        11 preto
   */

  public static final SlimefunItemStack CARD_SOLDER_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_SOLDER", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Solder Ingot", "", "&fChange to Production Solder Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_BILLON_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_BILLON", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Billon Ingot", "", "&fChange to Production Billon Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_BRONZE_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_BRONZE", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Bronze Ingot", "", "&fChange to Production Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_BRASS_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_BRASS", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Brass Ingot", "", "&fChange to Production Brass Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_SULFATE = new SlimefunItemStack(
      "SUPREME_CARD_SULFATE", Material.MUSIC_DISC_BLOCKS,
      "&bCard de Sulfate", "", "&fChange to Production Sulfate",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

  public static final SlimefunItemStack CARD_CARBON = new SlimefunItemStack(
      "SUPREME_CARD_CARBON", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Carbon", "", "&fChange to Production Carbon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SILICON = new SlimefunItemStack(
      "SUPREME_CARD_SILICON", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Silicon", "", "&fChange to Production Silicon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_STEEL = new SlimefunItemStack("SUPREME_CARD_STEEL",
      Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Steel", "", "&fChange to Production Steel",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_NICKEL = new SlimefunItemStack(
      "SUPREME_CARD_NICKEL", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Nickel", "", "&fChange to Production Nickel",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_FERROSILICON = new SlimefunItemStack(
      "SUPREME_CARD_FERROSILICON", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Ferrosilicon", "", "&fChange to Production Ferrosilicon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_DAMASCUS = new SlimefunItemStack(
      "SUPREME_CARD_DAMASCUS", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Damascus", "", "&fChange to Production Damascus",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_COBALT = new SlimefunItemStack(
      "SUPREME_CARD_COBALT", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Cobalt", "", "&fChange to Production Cobalt",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_DURALUMIN_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_DURALUMIN", Material.MUSIC_DISC_BLOCKS,
      "&bCard Machine Duralumin Ingot", "", "&fChange to Production Duralumin Ingot",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  // TIER 2
  public static final SlimefunItemStack CARD_ALUMINUM_BRONZE_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_ALUMINUM_BRONZE", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Aluminum Bronze Ingot", "",
      "&fChange to Production Aluminum Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ALUMINUM_BRASS_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_ALUMINUM_BRASS", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Aluminum Brass Ingot", "",
      "&fAltera para Aluminum Produção de Brass Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_CORINTHIAN_BRONZE", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Corinthian Bronze Ingot", "",
      "&fChange to Production Corinthian Bronze Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_GOLD24K = new SlimefunItemStack(
      "SUPREME_CARD_GOLD24K", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Gold 24k", "", "&fChange to Production Ouro 24k",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_CARBON_PRESS = new SlimefunItemStack(
      "SUPREME_CARD_CARBON_PRESS", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Compressed Carbon", "", "&fChange to Production Compressed Carbon",
      "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_HARDENED_METAL_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_HARDENED_METAL", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Hardened Metal Ingot", "",
      "&fChange to Production Hardened Metal Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_REDSTONE_ALLOY = new SlimefunItemStack(
      "SUPREME_CARD_REDSTONE_ALLOY", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Redstone Alloy", "", "&fChange to Production Redstone Alloy",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_PLASTIC_SHEET = new SlimefunItemStack(
      "SUPREME_CARD_PLASTIC_SHEET", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Plastic Sheet", "", "&fChange to Production Plastic Sheet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_BATTERY = new SlimefunItemStack(
      "SUPREME_CARD_BATTERY", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Battery", "", "&fChange to Production Battery",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_MAGNET = new SlimefunItemStack(
      "SUPREME_CARD_MAGNET", Material.MUSIC_DISC_CHIRP,
      "&bCard Machine Magnet", "", "&fChange to Production Magnet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ELECTRO_MAGNET = new SlimefunItemStack(
      "SUPREME_CARD_ELECTRO_MAGNET", Material.MUSIC_DISC_MALL,
      "&bCard Machine Electro Magnet", "", "&fChange to Production Electro Magnet",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_ELECTRIC_MOTOR = new SlimefunItemStack(
      "SUPREME_CARD_ELECTRIC_MOTOR", Material.MUSIC_DISC_MALL,
      "&bCard Machine Electric Motor", "", "&fChange to Production Electric Motor",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_HEATING_COIL= new SlimefunItemStack(
      "SUPREME_CARD_HEATING_COIL", Material.MUSIC_DISC_MALL,
      "&bCard Machine Heating Coil", "", "&fChange to Production Heating Coil",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SYNTHETIC_SAPPHIRE = new SlimefunItemStack(
      "SUPREME_CARD_SYNTHETIC_SAPPHIRE", Material.MUSIC_DISC_MALL,
      "&bCard Machine Synthetic Sapphire", "", "&fChange to Production Synthetic Sapphire",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SYNTHETIC_EMERALD = new SlimefunItemStack(
      "SUPREME_CARD_SYNTHETIC_EMERALD", Material.MUSIC_DISC_MALL,
      "&bCard Machine Synthetic Emerald", "", "&fChange to Production Synthetic Emerald",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_SYNTHETIC_DIAMOND = new SlimefunItemStack(
      "SUPREME_CARD_SYNTHETIC_DIAMOND", Material.MUSIC_DISC_MALL,
      "&bCard Machine Synthetic Diamond", "", "&fChange to Production Synthetic Diamond",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_CARBONADO= new SlimefunItemStack(
      "SUPREME_CARD_CARBONADO", Material.MUSIC_DISC_STAL,
      "&bCard Machine Carbonado", "", "&fChange to Production Carbonado",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static final SlimefunItemStack CARD_REINFORCED_ALLOY_INGOT = new SlimefunItemStack(
      "SUPREME_CARD_REINFORCED_ALLOY", Material.MUSIC_DISC_STAL,
      "&bCard Machine Reinforced Alloy Ingot", "",
      "&fChange to Production Reinforced Alloy Ingot",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


  public static void setup(Supreme plugin) {

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SOLDER_INGOT,
        SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BILLON_INGOT,
        SlimefunItems.BILLON_INGOT, SlimefunItems.BILLON_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRONZE_INGOT,
        SlimefunItems.BRONZE_INGOT, SlimefunItems.BRONZE_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRASS_INGOT,
        SlimefunItems.BRASS_INGOT, SlimefunItems.BRASS_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SULFATE,
        SlimefunItems.SULFATE, SlimefunItems.SULFATE);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_CARBON,
        SlimefunItems.CARBON, SlimefunItems.CARBON);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SILICON,
        SlimefunItems.SILICON, SlimefunItems.SILICON);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_STEEL,
        SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_NICKEL,
        SlimefunItems.NICKEL_INGOT, SlimefunItems.NICKEL_INGOT);

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_DURALUMIN_INGOT,
        SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_FERROSILICON,
        SlimefunItems.FERROSILICON, SlimefunItems.FERROSILICON);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_DAMASCUS,
        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_COBALT,
        SlimefunItems.COBALT_INGOT, SlimefunItems.COBALT_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRONZE_INGOT,
        SlimefunItems.ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRASS_INGOT,
        SlimefunItems.ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CORINTHIAN_BRONZE_INGOT,
        SlimefunItems.CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_GOLD24K,
        SlimefunItems.GOLD_24K, SlimefunItems.GOLD_24K);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CARBON_PRESS,
        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.COMPRESSED_CARBON);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_SAPPHIRE,
        SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_EMERALD,
        SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_BATTERY,
        SlimefunItems.BATTERY, SlimefunItems.BATTERY);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_MAGNET,
        SlimefunItems.MAGNET, SlimefunItems.MAGNET);

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_PLASTIC_SHEET,
        SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HARDENED_METAL_INGOT,
        SlimefunItems.HARDENED_METAL_INGOT, SupremeComponents.TITANIUM_PLATE, SlimefunItems.HARDENED_METAL_INGOT);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REDSTONE_ALLOY,
        SlimefunItems.REDSTONE_ALLOY, SupremeComponents.TITANIUM_PLATE, SlimefunItems.REDSTONE_ALLOY);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRO_MAGNET,
        SlimefunItems.ELECTRO_MAGNET, SupremeComponents.IRIDIUM_PLATE, SlimefunItems.ELECTRO_MAGNET);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRIC_MOTOR,
        SlimefunItems.ELECTRIC_MOTOR, SupremeComponents.AURUM_PLATE, SlimefunItems.ELECTRIC_MOTOR);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HEATING_COIL,
        SlimefunItems.HEATING_COIL, SupremeComponents.AURUM_PLATE, SlimefunItems.HEATING_COIL);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_SYNTHETIC_DIAMOND,
        SlimefunItems.SYNTHETIC_DIAMOND, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.SYNTHETIC_DIAMOND);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_CARBONADO,
        SlimefunItems.CARBONADO, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.CARBONADO);

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REINFORCED_ALLOY_INGOT,
        SlimefunItems.REINFORCED_ALLOY_INGOT, SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.REINFORCED_ALLOY_INGOT);

  }
}
