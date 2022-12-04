package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;
import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.generic.electric.EnergyCapacitor;
import com.github.relativobr.supreme.generic.electric.EnergyGenerator;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.generators.GeneratorMob;
import com.github.relativobr.supreme.generators.SupremeCapacitor;
import com.github.relativobr.supreme.generators.SupremeGenerator;
import com.github.relativobr.supreme.generic.electric.GenerationType;
import com.github.relativobr.supreme.util.ItemGroups;

public class SetupGenerators {

  public static void setup(Supreme sup) {

    if (getSupremeOptions().isEnableTech()) {

      new GeneratorMob(GeneratorMob.GENERATOR_MOB_BASIC, GeneratorMob.RECIPE_GENERATOR_MOB_BASIC).setBuffer(
              getValueGeneratorsWithLimit(GeneratorMob.BASIC_GENERATOR_MOB_BUFFER))
          .setEnergy(getValueGeneratorsWithLimit(GeneratorMob.BASIC_GENERATOR_MOB_ENERGY)).setMobRange(3).register(sup);

      new GeneratorMob(GeneratorMob.GENERATOR_MOB_MEDIUM, GeneratorMob.RECIPE_GENERATOR_MOB_MEDIUM).setBuffer(
              getValueGeneratorsWithLimit(GeneratorMob.MEDIUM_GENERATOR_MOB_BUFFER))
          .setEnergy(getValueGeneratorsWithLimit(GeneratorMob.MEDIUM_GENERATOR_MOB_ENERGY)).setMobRange(6)
          .register(sup);

      new GeneratorMob(GeneratorMob.GENERATOR_MOB_ADVANCED, GeneratorMob.RECIPE_GENERATOR_MOB_ADVANCED).setBuffer(
              getValueGeneratorsWithLimit(GeneratorMob.ADVANCED_GENERATOR_MOB_BUFFER))
          .setEnergy(getValueGeneratorsWithLimit(GeneratorMob.ADVANCED_GENERATOR_MOB_ENERGY)).setMobRange(9)
          .register(sup);

    }

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.BASIC_IGNIS_GENERATOR,
        SupremeGenerator.RECIPE_BASIC_IGNIS_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_ENERGY)).setType(GenerationType.FIRE)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.IGNIS_GENERATOR,
        SupremeGenerator.RECIPE_IGNIS_GENERATOR).setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_ENERGY)).setType(GenerationType.FIRE)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.BASIC_VENTUS_GENERATOR,
        SupremeGenerator.RECIPE_BASIC_VENTUS_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_ENERGY)).setType(GenerationType.WIND)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.VENTUS_GENERATOR,
        SupremeGenerator.RECIPE_VENTUS_GENERATOR).setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_ENERGY)).setType(GenerationType.WIND)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.BASIC_AQUA_GENERATOR,
        SupremeGenerator.RECIPE_BASIC_AQUA_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_ENERGY)).setType(GenerationType.WATER)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.AQUA_GENERATOR,
        SupremeGenerator.RECIPE_AQUA_GENERATOR).setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_ENERGY)).setType(GenerationType.WATER)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.BASIC_LUX_GENERATOR,
        SupremeGenerator.RECIPE_BASIC_LUX_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_ENERGY)).setType(GenerationType.SKY)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.LUX_GENERATOR,
        SupremeGenerator.RECIPE_LUX_GENERATOR).setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUX_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.LUX_ENERGY)).setType(GenerationType.SKY)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.BASIC_LUMIUM_GENERATOR,
        SupremeGenerator.RECIPE_BASIC_LUMIUM_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_ENERGY)).setType(GenerationType.DARK)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.LUMIUM_GENERATOR,
        SupremeGenerator.RECIPE_LUMIUM_GENERATOR).setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_ENERGY)).setType(GenerationType.DARK)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.THORNIUM_GENERATOR,
        SupremeGenerator.RECIPE_THORNIUM_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_ENERGY)).setType(GenerationType.EVERY)
        .register(sup);

    new EnergyGenerator(ItemGroups.ELECTRIC_CATEGORY, SupremeGenerator.SUPREME_GENERATOR,
        SupremeGenerator.RECIPE_SUPREME_GENERATOR).setBuffer(
            getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_ENERGY)).setType(GenerationType.EVERY)
        .register(sup);

    new EnergyCapacitor(ItemGroups.ELECTRIC_CATEGORY, SupremeCapacitor.AURUM_CAPACITOR,
        SupremeCapacitor.MACHINE_AURUM_CAPACITOR,
        getValueGeneratorsWithLimit(SupremeCapacitor.AURUM_CAPACITY)).register(sup);

    new EnergyCapacitor(ItemGroups.ELECTRIC_CATEGORY, SupremeCapacitor.TITANIUM_CAPACITOR,
        SupremeCapacitor.MACHINE_TITANIUM_CAPACITOR,
        getValueGeneratorsWithLimit(SupremeCapacitor.TITANIUM_CAPACITY)).register(sup);

    new EnergyCapacitor(ItemGroups.ELECTRIC_CATEGORY, SupremeCapacitor.ADAMANTIUM_CAPACITOR,
        SupremeCapacitor.MACHINE_ADAMANTIUM_CAPACITOR,
        getValueGeneratorsWithLimit(SupremeCapacitor.ADAMANTIUM_CAPACITY)).register(sup);

    new EnergyCapacitor(ItemGroups.ELECTRIC_CATEGORY, SupremeCapacitor.THORNIUM_CAPACITOR,
        SupremeCapacitor.MACHINE_THORNIUM_CAPACITOR,
        getValueGeneratorsWithLimit(SupremeCapacitor.THORNIUM_CAPACITY)).register(sup);

    new EnergyCapacitor(ItemGroups.ELECTRIC_CATEGORY, SupremeCapacitor.SUPREME_CAPACITOR,
        SupremeCapacitor.MACHINE_SUPREME_CAPACITOR,
        getValueGeneratorsWithLimit(SupremeCapacitor.SUPREME_CAPACITY)).register(sup);

  }
}
