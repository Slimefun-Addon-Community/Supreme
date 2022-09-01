package com.github.relativobr.generic.machine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Machine that uses flex item in the input (1~9) and only 1 item in the output
 */
public class FlexItemContainerMachine extends MediumContainerMachine {

    @ParametersAreNonnullByDefault
    protected FlexItemContainerMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList();
        machineRecipes.forEach(recipe -> {
            displayRecipes.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
            displayRecipes.add(recipe.getFirstItemOutput());
        });
        return displayRecipes;
    }

    @Override
    public int getSizeProcessInput(){
        return -1;
    }

}