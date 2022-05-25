package com.github.relativobr.supreme.generators;

import static com.github.relativobr.supreme.Supreme.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeGenerator {

  // BASIC TIER
  public static final int BASIC_IGNIS_ENERGY = 2500;
  public static final int BASIC_IGNIS_BUFFER = 5000;
  public static final int BASIC_VENTUS_ENERGY = 2500;
  public static final int BASIC_VENTUS_BUFFER = 5000;
  public static final int BASIC_AQUA_ENERGY = 2500;
  public static final int BASIC_AQUA_BUFFER = 5000;
  public static final int BASIC_LUX_ENERGY = 2500;
  public static final int BASIC_LUX_BUFFER = 5000;
  public static final int BASIC_LUMIUM_ENERGY = 5000;
  public static final int BASIC_LUMIUM_BUFFER = 10000;
  // ADVANCED TIER
  public static final int IGNIS_ENERGY = 25000;
  public static final int IGNIS_BUFFER = 50000;
  public static final int VENTUS_ENERGY = 25000;
  public static final int VENTUS_BUFFER = 50000;
  public static final int AQUA_ENERGY = 25000;
  public static final int AQUA_BUFFER = 50000;
  public static final int LUX_ENERGY = 25000;
  public static final int LUX_BUFFER = 50000;
  public static final int LUMIUM_ENERGY = 75000;
  public static final int LUMIUM_BUFFER = 500000;
  // END_GAME TIER
  public static final int THORNIUM_ENERGY = 1000000; //  (IGNIS + AQUA + VENTUS)
  public static final int THORNIUM_BUFFER = 6000000;
  public static final int SUPREME_ENERGY = 2000000; //  (LUX + LUMIUM + THORNIUM)
  public static final int SUPREME_BUFFER = 12000000;

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
      Material.ORANGE_CONCRETE, "&9Basic Ignis Generator", "&fNeed fire under this block to work", "", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(BASIC_IGNIS_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(BASIC_IGNIS_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.AURUM_PLATE,
      SupremeCetrus.CETRUS_IGNIS, SupremeComponents.AURUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_IGNIS_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeComponents.CONVEYANCE_MACHINE};
  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_AURUM,
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE, SupremeComponents.ALLOY_AURUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.COAL_GENERATOR_2, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeComponents.CARRIAGE_MACHINE};
  public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
      Material.ORANGE_GLAZED_TERRACOTTA, "&9Ignis Generator", "&fNeed fire under this block to work", "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(IGNIS_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(IGNIS_ENERGY)), "", "&3Supreme Machine");
  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_CONCRETE, "&9Basic Ventus Generator", "&fIt needs to be with its faces",
      "&fin the wind to work", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(BASIC_VENTUS_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(BASIC_VENTUS_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.IRIDIUM_PLATE,
      SupremeCetrus.CETRUS_VENTUS, SupremeComponents.IRIDIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_VENTUS_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeComponents.CONVEYANCE_MACHINE};
  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_IRIDIUM,
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.BIO_REACTOR, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeComponents.CARRIAGE_MACHINE};
  public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_GLAZED_TERRACOTTA, "&9Ventus Generator", "&fIt needs to be with its faces",
      "&fin the wind to work", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(VENTUS_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(VENTUS_ENERGY)), "", "&3Supreme Machine");
  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
      Material.BLUE_CONCRETE, "&9Basic Aqua Generator", "&fNeed water under this block to work", "", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(BASIC_AQUA_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(BASIC_AQUA_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.MANGANESE_PLATE,
      SupremeCetrus.CETRUS_AQUA, SupremeComponents.MANGANESE_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_AQUA_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeComponents.CONVEYANCE_MACHINE};
  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_MANGANESE,
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.ALLOY_MANGANESE, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.MAGNESIUM_GENERATOR, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeComponents.CARRIAGE_MACHINE};
  public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
      Material.BLUE_GLAZED_TERRACOTTA, "&9Aqua Generator", "&fNeed water under this block to work", "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(AQUA_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(AQUA_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED,
      SupremeGenerator.IGNIS_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.THORNIUM_ENERGIZED,
      SupremeGenerator.AQUA_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeGenerator.VENTUS_GENERATOR, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
      Material.WHITE_CONCRETE, "&9Basic Lux Generator", "&fNeeds to receive sunlight", "&for moonlight to work", "",
      LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(BASIC_LUX_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(BASIC_LUX_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE,
      SupremeCetrus.CETRUS_LUX, SupremeComponents.TITANIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_LUX_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeComponents.CONVEYANCE_MACHINE};
  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_TITANIUM,
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ, SupremeComponents.TITANIUM_PLATE, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.SOLAR_GENERATOR_4, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeComponents.CARRIAGE_MACHINE};
  public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
      Material.WHITE_GLAZED_TERRACOTTA, "&9Lux Generator", "&fNeeds to receive sunlight", "&for moonlight to work", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(LUX_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(LUX_ENERGY)), "", "&3Supreme Machine");
  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUMIUM_GENERATOR",
      Material.BROWN_CONCRETE, "&9Basic Lumium Generator", "&fNeeds to be below ground to work", "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(BASIC_LUMIUM_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(BASIC_LUMIUM_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE,
      SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_LUMIUM_GENERATOR, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.CRYSTALLIZER_MACHINE, SlimefunItems.GEO_MINER, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.LAVA_GENERATOR_2, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.PETRIFIER_MACHINE,
      SlimefunItems.GEO_MINER, SupremeComponents.PETRIFIER_MACHINE};
  public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
      Material.BROWN_GLAZED_TERRACOTTA, "&9Lumium Generator", "&fNeeds to be below ground to work", "", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(LUMIUM_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(LUMIUM_ENERGY)), "", "&3Supreme Machine");
  public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
      Material.BLACK_GLAZED_TERRACOTTA, "&9Thornium Generator", "&fGenerates energy anywhere", "", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(THORNIUM_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(THORNIUM_ENERGY)), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeComponents.SUPREME,
      SupremeGenerator.LUX_GENERATOR, SupremeComponents.SUPREME, SupremeComponents.SUPREME,
      SupremeGenerator.LUMIUM_GENERATOR, SupremeComponents.SUPREME, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeGenerator.THORNIUM_GENERATOR, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
      Material.PURPLE_GLAZED_TERRACOTTA, "&9Supreme Generator", "&fGenerates energy anywhere", "", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(SUPREME_BUFFER)),
      UtilEnergy.energyPowerPerSecond(getValueGeneratorsWithLimit(SUPREME_ENERGY)), "", "&3Supreme Machine");

}
