package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.ElectricCoreMachine;
import com.github.relativobr.supreme.machine.ElectricCrafterMachine;
import com.github.relativobr.supreme.machine.ForgeIngotMachine;
import com.github.relativobr.supreme.machine.ForgeMagicalMachine;
import com.github.relativobr.supreme.machine.FoundryMachine;
import com.github.relativobr.supreme.machine.MagicAltarMachine;
import com.github.relativobr.supreme.machine.MobCollector;
import com.github.relativobr.supreme.machine.VirtualAquarium;
import com.github.relativobr.supreme.machine.VirtualGarden;
import com.github.relativobr.supreme.util.ItemGroups;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class SetupElectricMachine {

  public static void setup(Supreme sup) {

    new ElectricCoreMachine(ItemGroups.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE).setMachineIdentifier(
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE.getItemId()).setMachineRecipes(ElectricCoreMachine.getAllRecipe())
        .setCapacity(40).setEnergyConsumption(20).setProcessingSpeed(1).register(sup);

    new ElectricCoreMachine(ItemGroups.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_II).setMachineIdentifier(
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE_II.getItemId()).setMachineRecipes(ElectricCoreMachine.getAllRecipe())
        .setCapacity(200).setEnergyConsumption(100).setProcessingSpeed(5).register(sup);

    new ElectricCoreMachine(ItemGroups.MACHINES_CATEGORY, ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreMachine.RECIPE_ELECTRIC_CORE_MACHINE_III).setMachineIdentifier(
            ElectricCoreMachine.ELECTRIC_CORE_MACHINE_III.getItemId()).setMachineRecipes(ElectricCoreMachine.getAllRecipe())
        .setCapacity(600).setEnergyConsumption(300).setProcessingSpeed(15).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE).setMobRange(4).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_II).setMobRange(8)
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_III).setMobRange(16)
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_II).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_III).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new ForgeIngotMachine(ItemGroups.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE).setMachineIdentifier(
            ForgeIngotMachine.FORGE_INGOT_MACHINE.getItemId()).setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new ForgeIngotMachine(ItemGroups.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE_II).setMachineIdentifier(
            ForgeIngotMachine.FORGE_INGOT_MACHINE_II.getItemId()).setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new ForgeIngotMachine(ItemGroups.MACHINES_CATEGORY, ForgeIngotMachine.FORGE_INGOT_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeIngotMachine.RECIPE_FORGE_INGOT_MACHINE_III).setMachineIdentifier(
            ForgeIngotMachine.FORGE_INGOT_MACHINE_III.getItemId()).setMachineRecipes(ForgeIngotMachine.getAllRecipe())
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new ForgeMagicalMachine(ItemGroups.MACHINES_CATEGORY, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE).setMachineIdentifier(
            ForgeMagicalMachine.FORGE_MAGICAL_MACHINE.getItemId()).setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new ForgeMagicalMachine(ItemGroups.MACHINES_CATEGORY, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE_II).setMachineIdentifier(
            ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_II.getItemId()).setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new ForgeMagicalMachine(ItemGroups.MACHINES_CATEGORY, ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagicalMachine.RECIPE_FORGE_MAGICAL_MACHINE_III).setMachineIdentifier(
            ForgeMagicalMachine.FORGE_MAGICAL_MACHINE_III.getItemId()).setMachineRecipes(ForgeMagicalMachine.getAllRecipe())
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new MagicAltarMachine(ItemGroups.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE).setMachineIdentifier(
            MagicAltarMachine.MAGIC_ALTAR_MACHINE.getItemId()).setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(40).setEnergyConsumption(20).setProcessingSpeed(1).register(sup);

    new MagicAltarMachine(ItemGroups.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE_II).setMachineIdentifier(
            MagicAltarMachine.MAGIC_ALTAR_MACHINE_II.getItemId()).setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(200).setEnergyConsumption(100).setProcessingSpeed(5).register(sup);

    new MagicAltarMachine(ItemGroups.MACHINES_CATEGORY, MagicAltarMachine.MAGIC_ALTAR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MagicAltarMachine.RECIPE_MAGIC_ALTAR_MACHINE_III).setMachineIdentifier(
            MagicAltarMachine.MAGIC_ALTAR_MACHINE_III.getItemId()).setMachineRecipes(MagicAltarMachine.getAllRecipe())
        .setCapacity(600).setEnergyConsumption(300).setProcessingSpeed(15).register(sup);

    new FoundryMachine(ItemGroups.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        FoundryMachine.RECIPE_FOUNDRY_MACHINE).setMachineIdentifier(FoundryMachine.FOUNDRY_MACHINE.getItemId())
        .setMachineRecipes(FoundryMachine.getAllRecipe()).setCapacity(2000).setEnergyConsumption(1000)
        .setProcessingSpeed(1).register(sup);

    new FoundryMachine(ItemGroups.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, FoundryMachine.RECIPE_FOUNDRY_MACHINE_II).setMachineIdentifier(
            FoundryMachine.FOUNDRY_MACHINE_II.getItemId()).setMachineRecipes(FoundryMachine.getAllRecipe())
        .setCapacity(10000).setEnergyConsumption(5000).setProcessingSpeed(5).register(sup);

    new FoundryMachine(ItemGroups.MACHINES_CATEGORY, FoundryMachine.FOUNDRY_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, FoundryMachine.RECIPE_FOUNDRY_MACHINE_III).setMachineIdentifier(
            FoundryMachine.FOUNDRY_MACHINE_III.getItemId()).setMachineRecipes(FoundryMachine.getAllRecipe())
        .setCapacity(30000).setEnergyConsumption(15000).setProcessingSpeed(15).register(sup);

    new ElectricCrafterMachine(ItemGroups.MACHINES_CATEGORY, ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE).setMachineIdentifier(
            ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe()).setCapacity(1000).setProcessingSpeed(1)
        .setEnergyConsumption(20).register(sup);

    new ElectricCrafterMachine(ItemGroups.MACHINES_CATEGORY, ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE_II).setMachineIdentifier(
            ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe()).setCapacity(5000).setProcessingSpeed(5)
        .setEnergyConsumption(100).register(sup);

    new ElectricCrafterMachine(ItemGroups.MACHINES_CATEGORY, ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCrafterMachine.RECIPE_ELECTRIC_CRAFTER_MACHINE_III).setMachineIdentifier(
            ElectricCrafterMachine.ELECTRIC_CRAFTER_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricCrafterMachine.getAllRecipe()).setCapacity(15000).setProcessingSpeed(15)
        .setEnergyConsumption(300).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_II).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_III).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);
  }
}
