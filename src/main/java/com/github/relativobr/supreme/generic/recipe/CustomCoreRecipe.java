package com.github.relativobr.supreme.generic.recipe;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class CustomCoreRecipe {

  private SlimefunItemStack material;
  private String name;

  //index 0,1,2
  private Material mainItem;
  //index 3,4,5
  private Material secondItem;
  //index 6,7,8
  private Material lastItem;


  public CustomCoreRecipe(SlimefunItemStack material, Material mainItem) {
    this.material = material;
    this.name = material.getItemId();
    this.mainItem = mainItem;
    this.secondItem = mainItem;
    this.lastItem = mainItem;
  }

  public CustomCoreRecipe(SlimefunItemStack material, Material mainItem, Material secondItem) {
    this.material = material;
    this.name = material.getItemId();
    this.mainItem = mainItem;
    this.secondItem = secondItem;
    this.lastItem = mainItem;
  }

  public CustomCoreRecipe(SlimefunItemStack material, Material mainItem, Material secondItem,
      Material lastItem) {
    this.material = material;
    this.name = material.getItemId();
    this.mainItem = mainItem;
    this.secondItem = secondItem;
    this.lastItem = lastItem;
  }

  public static ItemStack[] getRecipe(CustomCoreRecipe customCoreRecipe) {
    return new ItemStack[]{
        new ItemStack(customCoreRecipe.getMainItem(),
            customCoreRecipe.getMainItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getMainItem(),
            customCoreRecipe.getMainItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getMainItem(),
            customCoreRecipe.getMainItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getSecondItem(),
            customCoreRecipe.getSecondItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getSecondItem(),
            customCoreRecipe.getSecondItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getSecondItem(),
            customCoreRecipe.getSecondItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getLastItem(),
            customCoreRecipe.getLastItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getLastItem(),
            customCoreRecipe.getLastItem().getMaxStackSize()),
        new ItemStack(customCoreRecipe.getLastItem(),
            customCoreRecipe.getLastItem().getMaxStackSize())
    };
  }

  public static SlimefunItemStack getOutput(CustomCoreRecipe customCoreRecipe) {
    return new SlimefunItemStack(customCoreRecipe.getMaterial(), 1);
  }

}
