package com.github.relativobr.supreme.generators;

import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
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

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
      Material.ORANGE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisEnergy())));
  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_AURUM,
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE, SupremeComponents.ALLOY_AURUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.COAL_GENERATOR_2, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeComponents.CARRIAGE_MACHINE};

  public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
      Material.ORANGE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisEnergy())));
  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.AURUM_PLATE,
      SupremeCetrus.CETRUS_IGNIS, SupremeComponents.AURUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_IGNIS_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_FIRE, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusEnergy())));
  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_IRIDIUM,
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.BIO_REACTOR, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeComponents.CARRIAGE_MACHINE};

  public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusEnergy())));
  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.IRIDIUM_PLATE,
      SupremeCetrus.CETRUS_VENTUS, SupremeComponents.IRIDIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_VENTUS_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WIND, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
      Material.BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaEnergy())));
  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_MANGANESE,
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, SupremeComponents.ALLOY_MANGANESE, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.MAGNESIUM_GENERATOR, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeComponents.CARRIAGE_MACHINE};

  public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
      Material.BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaEnergy())), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.MANGANESE_PLATE,
      SupremeCetrus.CETRUS_AQUA, SupremeComponents.MANGANESE_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_AQUA_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_WATER, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
      Material.WHITE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_TITANIUM,
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ, SupremeComponents.TITANIUM_PLATE, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.SOLAR_GENERATOR_4, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.CARRIAGE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeComponents.CARRIAGE_MACHINE};

  public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
      Material.WHITE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxEnergy())));
  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE,
      SupremeCetrus.CETRUS_LUX, SupremeComponents.TITANIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_LUX_GENERATOR, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.CONVEYANCE_MACHINE,
      SlimefunItems.STAFF_STORM, SupremeComponents.CONVEYANCE_MACHINE};

  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUMIUM_GENERATOR",
      Material.BROWN_CONCRETE, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_ADAMANTIUM,
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.LAVA_GENERATOR_2, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.PETRIFIER_MACHINE,
      SlimefunItems.GEO_MINER, SupremeComponents.PETRIFIER_MACHINE};

  public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
      Material.BROWN_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumEnergy())));
  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE,
      SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeGenerator.BASIC_LUMIUM_GENERATOR, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.CRYSTALLIZER_MACHINE, SlimefunItems.GEO_MINER, SupremeComponents.CRYSTALLIZER_MACHINE};

  public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
      Material.BLACK_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumEnergy())));
  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED,
      SupremeGenerator.IGNIS_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.THORNIUM_ENERGIZED,
      SupremeGenerator.AQUA_GENERATOR, SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeGenerator.VENTUS_GENERATOR, SupremeComponents.CRYSTALLIZER_MACHINE};

  public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
      Material.PURPLE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeEnergy())));
  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeComponents.SUPREME,
      SupremeGenerator.LUX_GENERATOR, SupremeComponents.SUPREME, SupremeComponents.SUPREME,
      SupremeGenerator.LUMIUM_GENERATOR, SupremeComponents.SUPREME, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeGenerator.THORNIUM_GENERATOR, SupremeComponents.CRYSTALLIZER_MACHINE};

}
