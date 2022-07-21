package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockCoreFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockMagicalFabricator;
import com.github.relativobr.supreme.machine.tech.TechMutation;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class RegisterItem {

  @ParametersAreNonnullByDefault
  public static void registerSmeltery(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerSmeltery(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerSmeltery(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new UnplaceableBlock(itemGroup, itemStack, RecipeType.SMELTERY, recipe).register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerEnhancedCraft(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerEnhancedCraft(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerEnhancedCraft(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new UnplaceableBlock(itemGroup, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE, recipe).register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerNullRecipe(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerNullRecipe(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerNullRecipe(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new UnplaceableBlock(itemGroup, itemStack, RecipeType.NULL, recipe).register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerGrindStone(SlimefunItemStack itemStack, ItemStack[] recipe, int amount) {
    registerGrindStone(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe, amount);
  }

  @ParametersAreNonnullByDefault
  public static void registerGrindStone(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe,
      int amount) {
    new SlimefunItem(itemGroup, itemStack, RecipeType.GRIND_STONE, recipe,
        new SlimefunItemStack(itemStack, amount)).register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerMagicalFabricator(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerMagicalFabricator(ItemGroups.COMPONENTS_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerMagicalFabricator(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new UnplaceableBlock(itemGroup, itemStack, MultiBlockMagicalFabricator.getMachine(), recipe).register(
        Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerCoreFabricator(SlimefunItemStack itemStack, ItemStack[] recipe) {
    registerCoreFabricator(ItemGroups.RESOURCE_CATEGORY, itemStack, recipe);
  }

  @ParametersAreNonnullByDefault
  public static void registerCoreFabricator(ItemGroup itemGroup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new UnplaceableBlock(itemGroup, itemStack, MultiBlockCoreFabricator.getMachine(), recipe).register(Supreme.inst());
  }

  @ParametersAreNonnullByDefault
  public static void registerTechMutation(SlimefunItemStack itemStack) {
    new UnplaceableBlock(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.NULL,
        new ItemStack[]{TechMutation.TECH_MUTATION_I}).register(Supreme.inst());
  }

}
