package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getValueGeneratorsWithLimit;

import com.github.relativobr.electric.EnergyCapacitor;
import com.github.relativobr.electric.EnergyGenerator;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.generators.SupremeCapacitor;
import com.github.relativobr.supreme.generators.SupremeGenerator;
import com.github.relativobr.supreme.util.ItemGroups;

public class SetupGenerators {

  public static void setup(Supreme sup) {

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_IGNIS_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_IGNIS_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_IGNIS_ENERGY))
        .setType(EnergyGenerator.Type.FIRE)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.IGNIS_GENERATOR,
            SupremeGenerator.MACHINE_IGNIS_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.IGNIS_ENERGY))
        .setType(EnergyGenerator.Type.FIRE)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_VENTUS_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_VENTUS_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_VENTUS_ENERGY))
        .setType(EnergyGenerator.Type.WIND)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.VENTUS_GENERATOR,
            SupremeGenerator.MACHINE_VENTUS_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.VENTUS_ENERGY))
        .setType(EnergyGenerator.Type.WIND)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_AQUA_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_AQUA_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_AQUA_ENERGY))
        .setType(EnergyGenerator.Type.WATER)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.AQUA_GENERATOR,
            SupremeGenerator.MACHINE_AQUA_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.AQUA_ENERGY))
        .setType(EnergyGenerator.Type.WATER)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_LUX_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_LUX_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUX_ENERGY))
        .setType(EnergyGenerator.Type.SKY)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.LUX_GENERATOR,
            SupremeGenerator.MACHINE_LUX_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUX_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.LUX_ENERGY))
        .setType(EnergyGenerator.Type.SKY)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.BASIC_LUMIUM_GENERATOR,
            SupremeGenerator.MACHINE_BASIC_LUMIUM_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.BASIC_LUMIUM_ENERGY))
        .setType(EnergyGenerator.Type.DARK)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.LUMIUM_GENERATOR,
            SupremeGenerator.MACHINE_LUMIUM_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.LUMIUM_ENERGY))
        .setType(EnergyGenerator.Type.DARK)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.THORNIUM_GENERATOR,
            SupremeGenerator.MACHINE_THORNIUM_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.THORNIUM_ENERGY))
        .setType(EnergyGenerator.Type.EVERY)
        .register(sup);

    new EnergyGenerator(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeGenerator.SUPREME_GENERATOR,
            SupremeGenerator.MACHINE_SUPREME_GENERATOR)
        .setBuffer(getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_BUFFER))
        .setEnergy(getValueGeneratorsWithLimit(SupremeGenerator.SUPREME_ENERGY))
        .setType(EnergyGenerator.Type.EVERY)
        .register(sup);

    new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.AURUM_CAPACITOR,
            SupremeCapacitor.MACHINE_AURUM_CAPACITOR,
            getValueGeneratorsWithLimit(SupremeCapacitor.AURUM_CAPACITY))
        .register(sup);

    new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.TITANIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_TITANIUM_CAPACITOR,
            getValueGeneratorsWithLimit(SupremeCapacitor.TITANIUM_CAPACITY))
        .register(sup);

    new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.ADAMANTIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_ADAMANTIUM_CAPACITOR,
            getValueGeneratorsWithLimit(SupremeCapacitor.ADAMANTIUM_CAPACITY))
        .register(sup);

    new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.THORNIUM_CAPACITOR,
            SupremeCapacitor.MACHINE_THORNIUM_CAPACITOR,
            getValueGeneratorsWithLimit(SupremeCapacitor.THORNIUM_CAPACITY))
        .register(sup);

    new EnergyCapacitor(
            ItemGroups.ELECTRIC_CATEGORY,
            SupremeCapacitor.SUPREME_CAPACITOR,
            SupremeCapacitor.MACHINE_SUPREME_CAPACITOR,
            getValueGeneratorsWithLimit(SupremeCapacitor.SUPREME_CAPACITY))
        .register(sup);
  }
}
