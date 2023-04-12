package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.MobTechCollector;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.machine.tech.TechMutation;
import com.github.relativobr.supreme.machine.tech.TechRobotic;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class SetupTechMachines {

  public static void setup(Supreme sup) {

    SupremeOptions supremeOptions = getSupremeOptions();

    if (supremeOptions.isEnableTech()) {

      if (supremeOptions.isMobTechEnableBee()
          || supremeOptions.isMobTechEnableIronGolem()
          || supremeOptions.isMobTechEnableZombie()) {

        new MobTechCollector(ItemGroups.MACHINES_CATEGORY,
            MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_I, RecipeType.ENHANCED_CRAFTING_TABLE,
            MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_I).setMobRange(3).setCapacity(1000)
            .setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

        new MobTechCollector(ItemGroups.MACHINES_CATEGORY,
            MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
            MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_II).setMobRange(6).setCapacity(1000)
            .setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

        new MobTechCollector(ItemGroups.MACHINES_CATEGORY,
            MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
            MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_III).setMobRange(9).setCapacity(1000)
            .setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

      }

      new TechMutation(TechMutation.TECH_MUTATION_I,
          TechMutation.RECIPE_TECH_MUTATION_I).setUpgradeLuck(1).setTimeProcess(60)
          .setMachineIdentifier(TechMutation.TECH_MUTATION_I.getItemId()).setCapacity(500)
          .setEnergyConsumption(500).register(sup);

      new TechMutation(TechMutation.TECH_MUTATION_II,
          TechMutation.RECIPE_TECH_MUTATION_II).setUpgradeLuck(2).setTimeProcess(60)
          .setMachineIdentifier(TechMutation.TECH_MUTATION_II.getItemId()).setCapacity(500)
          .setEnergyConsumption(500).register(sup);

      new TechMutation(TechMutation.TECH_MUTATION_III,
          TechMutation.RECIPE_TECH_MUTATION_III).setUpgradeLuck(4).setTimeProcess(60)
          .setMachineIdentifier(TechMutation.TECH_MUTATION_III.getItemId()).setCapacity(500)
          .setEnergyConsumption(500).register(sup);

      new TechRobotic(TechRobotic.TECH_ROBOTIC, TechRobotic.RECIPE_TECH_ROBOTIC).setAmountUpgrade(
              64).setTimeProcess(60).setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId())
          .setCapacity(500).setEnergyConsumption(500).register(sup);

      new TechRobotic(TechRobotic.TECH_ROBOTIC_II,
          TechRobotic.RECIPE_TECH_ROBOTIC_II).setAmountUpgrade(32).setTimeProcess(60)
          .setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId()).setCapacity(500)
          .setEnergyConsumption(500).register(sup);

      new TechRobotic(TechRobotic.TECH_ROBOTIC_III,
          TechRobotic.RECIPE_TECH_ROBOTIC_III).setAmountUpgrade(16).setTimeProcess(60)
          .setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId()).setCapacity(500)
          .setEnergyConsumption(500).register(sup);

      new TechGenerator(TechGenerator.TECH_GENERATOR,
          TechGenerator.RECIPE_TECH_GENERATOR).setTimeProcess(
              supremeOptions.getBaseTimeTechGenerator())
          .setMachineIdentifier(TechGenerator.TECH_GENERATOR.getItemId()).setCapacity(40000)
          .setEnergyConsumption(2000).register(sup);

    }
  }

}
