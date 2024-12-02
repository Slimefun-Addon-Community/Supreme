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

public class SimpleItemContainerMachine extends GenericMachine {

    @ParametersAreNonnullByDefault
    protected SimpleItemContainerMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
    public int[] getInputSlots() {
        return InventoryRecipe.SIMPLE_INPUT;
    }

    @Override
    public int[] getOutputSlots() {
        return InventoryRecipe.SIMPLE_OUTPUT;
    }

    @Override
    public int getStatusSlot(){
        return InventoryRecipe.SIMPLE_STATUS_SLOT;
    }

    @Override
    public int[] getBorderSlots(){
        return InventoryRecipe.SIMPLE_BORDER;
    }

    @Override
    public int[] getInputBorderSlots(){
        return InventoryRecipe.SIMPLE_INPUT_BORDER;
    }

    @Override
    public int[] getOutputBorderSlots(){
        return InventoryRecipe.SIMPLE_OUTPUT_BORDER;
    }

}