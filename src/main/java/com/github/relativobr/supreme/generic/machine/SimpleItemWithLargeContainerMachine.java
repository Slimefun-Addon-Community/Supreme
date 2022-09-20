package com.github.relativobr.supreme.generic.machine;

import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

/**
 * Machine that uses only 1 item in the input and only 1 item in the output
 */
public class SimpleItemWithLargeContainerMachine extends MediumContainerMachine {

    @ParametersAreNonnullByDefault
    protected SimpleItemWithLargeContainerMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList();
        machineRecipes.forEach(recipe -> {
            displayRecipes.add(recipe.getFirstItemInput());
            displayRecipes.add(recipe.getFirstItemOutput());
        });
        return displayRecipes;
    }

    @Override
    public int getSizeProcessInput(){
        return 1;
    }

    @Override
    public int[] getInputSlots() {
        return InventoryRecipe.INVERT_LARGE_INPUT;
    }

    @Override
    public int[] getOutputSlots() {
        return InventoryRecipe.INVERT_LARGE_OUTPUT;
    }

    @Override
    public int getStatusSlot(){
        return InventoryRecipe.INVERT_LARGE_STATUS_SLOT;
    }

    @Override
    public int[] getBorderSlots(){
        return InventoryRecipe.INVERT_LARGE_BORDER;
    }

    @Override
    public int[] getInputBorderSlots(){
        return InventoryRecipe.INVERT_LARGE_INPUT_BORDER;
    }

    @Override
    public int[] getOutputBorderSlots(){
        return InventoryRecipe.INVERT_LARGE_OUTPUT_BORDER;
    }

}