package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;
import static com.github.relativobr.supreme.machine.mobtech.TechMutation.addRecipe;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.mobtech.MobTechCollector;
import com.github.relativobr.supreme.machine.mobtech.TechGenerator;
import com.github.relativobr.supreme.machine.mobtech.TechMutation;
import com.github.relativobr.supreme.machine.mobtech.TechRobotic;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.ItemGroups;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public class SetupMobTechMachines {

  public static void setup(Supreme sup) {

    if (getSupremeOptions().isEnableMobtech()) {

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_I,
          RecipeType.ENHANCED_CRAFTING_TABLE, MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_I).setMobRange(3)
          .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_II,
          RecipeType.ENHANCED_CRAFTING_TABLE, MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_II).setMobRange(6)
          .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

      new MobTechCollector(ItemGroups.MACHINES_CATEGORY, MobTechCollector.MOB_TECH_COLLECTOR_MACHINE_III,
          RecipeType.ENHANCED_CRAFTING_TABLE, MobTechCollector.RECIPE_MOB_TECH_COLLECTOR_MACHINE_III).setMobRange(9)
          .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(200).register(sup);

      new TechGenerator(TechGenerator.TECH_GENERATOR, TechGenerator.RECIPE_TECH_GENERATOR).setTimeProcess(1800)
          .setMachineIdentifier(TechGenerator.TECH_GENERATOR.getItemId()).setCapacity(5000).setEnergyConsumption(2000)
          .register(sup);

      new TechRobotic(TechRobotic.TECH_ROBOTIC, TechRobotic.RECIPE_TECH_ROBOTIC).setTimeProcess(60)
          .setMachineIdentifier(TechRobotic.TECH_ROBOTIC.getItemId()).setCapacity(500).setEnergyConsumption(500)
          .register(sup);

      new TechMutation(TechMutation.TECH_MUTATION, TechMutation.RECIPE_TECH_MUTATION).setTimeProcess(60)
          .setMachineIdentifier(TechMutation.TECH_MUTATION.getItemId()).setCapacity(500).setEnergyConsumption(500)
          .register(sup);

      addRecipe(SupremeComponents.DUST_NETHERITE, SlimefunItems.FIRE_RUNE, SupremeComponents.GENE_BERSERK);
      addRecipe(SupremeComponents.DUST_GLOW_INK, SlimefunItems.LIGHTNING_RUNE, SupremeComponents.GENE_LUCK);
      addRecipe(SupremeComponents.DUST_AMETHYST, SlimefunItems.RAINBOW_RUNE, SupremeComponents.GENE_INTELLIGENCE);
      addRecipe(SlimefunItems.URANIUM, SlimefunItems.URANIUM, SlimefunItems.NEPTUNIUM);
      addRecipe(SlimefunItems.NEPTUNIUM, SlimefunItems.NEPTUNIUM, SlimefunItems.PLUTONIUM);
      addRecipe(SlimefunItems.PLUTONIUM, SlimefunItems.URANIUM, SlimefunItems.BOOSTED_URANIUM);
    }
  }

}
