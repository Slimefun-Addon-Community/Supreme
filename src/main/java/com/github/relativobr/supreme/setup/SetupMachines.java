package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.CheckInventory;
import com.github.relativobr.supreme.machine.ElectricCrafter;
import com.github.relativobr.supreme.machine.ForgeIngot;
import com.github.relativobr.supreme.machine.ForgeMagical;
import com.github.relativobr.supreme.machine.Foundry;
import com.github.relativobr.supreme.machine.MagicAltar;
import com.github.relativobr.supreme.machine.MobCollector;
import com.github.relativobr.supreme.machine.VirtualAquarium;
import com.github.relativobr.supreme.machine.VirtualGarden;
import com.github.relativobr.supreme.machine.multiblock.ElectricCoreFabricator;
import com.github.relativobr.supreme.machine.multiblock.ElectricGearFabricator;
import com.github.relativobr.supreme.machine.multiblock.ElectricMagicalFabricator;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class SetupMachines {

  public static void setup(Supreme sup) {

    SupremeOptions supremeOptions = getSupremeOptions();

    SetupMultiBlockMachine.setup(sup);

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE.getItemId())
        .setMachineRecipes(ElectricCoreFabricator.getAllRecipe()).setCapacity(40).setEnergyConsumption(20)
        .setProcessingSpeed(1).register(sup);

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE_II).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricCoreFabricator.getAllRecipe()).setCapacity(200).setEnergyConsumption(100)
        .setProcessingSpeed(5).register(sup);

    new ElectricCoreFabricator(ItemGroups.MACHINES_CATEGORY, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricCoreFabricator.RECIPE_ELECTRIC_CORE_MACHINE_III).setMachineIdentifier(
            ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricCoreFabricator.getAllRecipe()).setCapacity(600).setEnergyConsumption(300)
        .setProcessingSpeed(15).register(sup);

    new ElectricMagicalFabricator(ItemGroups.MACHINES_CATEGORY, ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricMagicalFabricator.RECIPE_ELECTRIC_MAGICAL_MACHINE).setMachineIdentifier(
            ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE.getItemId())
        .setMachineRecipes(ElectricMagicalFabricator.getAllRecipe()).setCapacity(40).setEnergyConsumption(20)
        .setProcessingSpeed(1).register(sup);

    new ElectricMagicalFabricator(ItemGroups.MACHINES_CATEGORY, ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricMagicalFabricator.RECIPE_ELECTRIC_MAGICAL_MACHINE_II).setMachineIdentifier(
            ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricMagicalFabricator.getAllRecipe()).setCapacity(200).setEnergyConsumption(100)
        .setProcessingSpeed(5).register(sup);

    new ElectricMagicalFabricator(ItemGroups.MACHINES_CATEGORY, ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricMagicalFabricator.RECIPE_ELECTRIC_MAGICAL_MACHINE_III).setMachineIdentifier(
            ElectricMagicalFabricator.ELECTRIC_MAGICAL_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricMagicalFabricator.getAllRecipe()).setCapacity(600).setEnergyConsumption(300)
        .setProcessingSpeed(15).register(sup);

    new ElectricGearFabricator(ItemGroups.MACHINES_CATEGORY, ElectricGearFabricator.ELECTRIC_GEAR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricGearFabricator.RECIPE_ELECTRIC_GEAR_MACHINE).setMachineIdentifier(
            ElectricGearFabricator.ELECTRIC_GEAR_MACHINE.getItemId())
        .setMachineRecipes(ElectricGearFabricator.getAllRecipe()).setCapacity(40).setEnergyConsumption(20)
        .setProcessingSpeed(1).register(sup);

    new ElectricGearFabricator(ItemGroups.MACHINES_CATEGORY, ElectricGearFabricator.ELECTRIC_GEAR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricGearFabricator.RECIPE_ELECTRIC_GEAR_MACHINE_II).setMachineIdentifier(
            ElectricGearFabricator.ELECTRIC_GEAR_MACHINE_II.getItemId())
        .setMachineRecipes(ElectricGearFabricator.getAllRecipe()).setCapacity(200).setEnergyConsumption(100)
        .setProcessingSpeed(5).register(sup);

    new ElectricGearFabricator(ItemGroups.MACHINES_CATEGORY, ElectricGearFabricator.ELECTRIC_GEAR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE,
        ElectricGearFabricator.RECIPE_ELECTRIC_GEAR_MACHINE_III).setMachineIdentifier(
            ElectricGearFabricator.ELECTRIC_GEAR_MACHINE_III.getItemId())
        .setMachineRecipes(ElectricGearFabricator.getAllRecipe()).setCapacity(600).setEnergyConsumption(300)
        .setProcessingSpeed(15).register(sup);

    final int baseTimeMobCollector = supremeOptions.getBaseTimeMobCollector();

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE)
        .setMobRange(4).setTimeProcess(baseTimeMobCollector).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_II)
        .setMobRange(8).setTimeProcess(baseTimeMobCollector)
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new MobCollector(ItemGroups.MACHINES_CATEGORY, MobCollector.MOB_COLLECTOR_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollector.RECIPE_MOB_COLLECTOR_MACHINE_III)
        .setMobRange(16).setTimeProcess(baseTimeMobCollector)
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    final int baseTimeVirtualGarden = supremeOptions.getBaseTimeVirtualGarden();

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE)
        .setTimeProcess(baseTimeVirtualGarden).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_II)
        .setTimeProcess(baseTimeVirtualGarden).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualGarden(ItemGroups.MACHINES_CATEGORY, VirtualGarden.VIRTUAL_GARDEN_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualGarden.RECIPE_VIRTUAL_GARDEN_MACHINE_III)
        .setTimeProcess(baseTimeVirtualGarden).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngot.RECIPE_FORGE_INGOT_MACHINE).setMachineIdentifier(ForgeIngot.FORGE_INGOT_MACHINE.getItemId())
        .setMachineRecipes(ForgeIngot.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(1).setCapacity(1000)
        .setEnergyConsumption(20).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngot.RECIPE_FORGE_INGOT_MACHINE_II).setMachineIdentifier(ForgeIngot.FORGE_INGOT_MACHINE_II.getItemId())
        .setMachineRecipes(ForgeIngot.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(5).setCapacity(5000)
        .setEnergyConsumption(100).register(sup);

    new ForgeIngot(ItemGroups.MACHINES_CATEGORY, ForgeIngot.FORGE_INGOT_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        ForgeIngot.RECIPE_FORGE_INGOT_MACHINE_III).setMachineIdentifier(ForgeIngot.FORGE_INGOT_MACHINE_III.getItemId())
        .setMachineRecipes(ForgeIngot.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(15).setCapacity(15000)
        .setEnergyConsumption(300).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE).setTimeProcess(15)
        .setMachineIdentifier(ForgeMagical.FORGE_MAGICAL_MACHINE.getItemId())
        .setMachineRecipes(ForgeMagical.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(1).setCapacity(1000)
        .setEnergyConsumption(20).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE_II).setTimeProcess(15)
        .setMachineIdentifier(ForgeMagical.FORGE_MAGICAL_MACHINE_II.getItemId())
        .setMachineRecipes(ForgeMagical.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(5).setCapacity(5000)
        .setEnergyConsumption(100).register(sup);

    new ForgeMagical(ItemGroups.MACHINES_CATEGORY, ForgeMagical.FORGE_MAGICAL_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ForgeMagical.RECIPE_FORGE_MAGICAL_MACHINE_III).setMachineIdentifier(
            ForgeMagical.FORGE_MAGICAL_MACHINE_III.getItemId()).setMachineRecipes(ForgeMagical.getAllRecipe())
        .setTimeProcess(15).setProcessingSpeed(15).setCapacity(15000).setEnergyConsumption(300).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE).setMachineIdentifier(MagicAltar.MAGIC_ALTAR_MACHINE.getItemId())
        .setMachineRecipes(MagicAltar.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(1).setCapacity(40)
        .setEnergyConsumption(20).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE_II).setMachineIdentifier(MagicAltar.MAGIC_ALTAR_MACHINE_II.getItemId())
        .setMachineRecipes(MagicAltar.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(5).setCapacity(200)
        .setEnergyConsumption(100).register(sup);

    new MagicAltar(ItemGroups.MACHINES_CATEGORY, MagicAltar.MAGIC_ALTAR_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        MagicAltar.RECIPE_MAGIC_ALTAR_MACHINE_III).setMachineIdentifier(MagicAltar.MAGIC_ALTAR_MACHINE_III.getItemId())
        .setMachineRecipes(MagicAltar.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(15).setCapacity(600)
        .setEnergyConsumption(300).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE, RecipeType.ENHANCED_CRAFTING_TABLE,
        Foundry.RECIPE_FOUNDRY_MACHINE).setMachineIdentifier(Foundry.FOUNDRY_MACHINE.getItemId())
        .setMachineRecipes(Foundry.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(1).setCapacity(2000)
        .setEnergyConsumption(1000).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE_II, RecipeType.ENHANCED_CRAFTING_TABLE,
        Foundry.RECIPE_FOUNDRY_MACHINE_II).setMachineIdentifier(Foundry.FOUNDRY_MACHINE_II.getItemId())
        .setMachineRecipes(Foundry.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(5).setCapacity(10000)
        .setEnergyConsumption(5000).register(sup);

    new Foundry(ItemGroups.MACHINES_CATEGORY, Foundry.FOUNDRY_MACHINE_III, RecipeType.ENHANCED_CRAFTING_TABLE,
        Foundry.RECIPE_FOUNDRY_MACHINE_III).setMachineIdentifier(Foundry.FOUNDRY_MACHINE_III.getItemId())
        .setMachineRecipes(Foundry.getAllRecipe()).setTimeProcess(15).setProcessingSpeed(15).setCapacity(30000)
        .setEnergyConsumption(15000).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE.getItemId()).setMachineRecipes(ElectricCrafter.getAllRecipe())
        .setCapacity(1000).setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE_II).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_II.getItemId()).setMachineRecipes(ElectricCrafter.getAllRecipe())
        .setCapacity(5000).setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new ElectricCrafter(ItemGroups.MACHINES_CATEGORY, ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, ElectricCrafter.RECIPE_ELECTRIC_CRAFTER_MACHINE_III).setMachineIdentifier(
            ElectricCrafter.ELECTRIC_CRAFTER_MACHINE_III.getItemId()).setMachineRecipes(ElectricCrafter.getAllRecipe())
        .setCapacity(15000).setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    final int baseTimeVirtualAquarium = supremeOptions.getBaseTimeVirtualAquarium();

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE)
        .setTimeProcess(baseTimeVirtualAquarium).setCapacity(1000)
        .setProcessingSpeed(1).setEnergyConsumption(20).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_II)
        .setTimeProcess(baseTimeVirtualAquarium).setCapacity(5000)
        .setProcessingSpeed(5).setEnergyConsumption(100).register(sup);

    new VirtualAquarium(ItemGroups.MACHINES_CATEGORY, VirtualAquarium.VIRTUAL_AQUARIUM_MACHINE_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, VirtualAquarium.RECIPE_VIRTUAL_AQUARIUM_MACHINE_III)
        .setTimeProcess(baseTimeVirtualAquarium).setCapacity(15000)
        .setProcessingSpeed(15).setEnergyConsumption(300).register(sup);

    SetupTechMachines.setup(sup);

    CheckInventory.setup(sup);

  }
}
