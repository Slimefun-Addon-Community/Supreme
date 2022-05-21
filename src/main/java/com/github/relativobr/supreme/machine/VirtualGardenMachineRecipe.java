package com.github.relativobr.supreme.machine;

import com.github.relativobr.recipe.DoubleMaterialRecipe;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VirtualGardenMachineRecipe extends MachineRecipe {

  @ParametersAreNonnullByDefault
  public VirtualGardenMachineRecipe(DoubleMaterialRecipe recipe) {
    super(15, recipe.getInput(),
        (recipe.getOutput()[0].getType() == recipe.getOutput()[1].getType()) ? new ItemStack[]{
            recipe.getOutput()[0]} : recipe.getOutput());
  }

  public static final DoubleMaterialRecipe RECIPE_GARDEN_WHITE_DYE = new DoubleMaterialRecipe(
      Material.LILY_OF_THE_VALLEY, Material.WHITE_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_ORANGE_DYE = new DoubleMaterialRecipe(
      Material.ORANGE_TULIP, Material.ORANGE_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_MAGENTA_DYE = new DoubleMaterialRecipe(
      Material.ALLIUM, Material.MAGENTA_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_LIGHT_BLUE_DYE = new DoubleMaterialRecipe(
      Material.BLUE_ORCHID, Material.LIGHT_BLUE_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_YELLOW_DYE = new DoubleMaterialRecipe(
      Material.DANDELION, Material.YELLOW_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_LIME_DYE = new DoubleMaterialRecipe(
      Material.BAMBOO, Material.LIME_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_PINK_DYE = new DoubleMaterialRecipe(
      Material.PINK_TULIP, Material.PINK_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_GRAY_DYE = new DoubleMaterialRecipe(
      Material.BROWN_MUSHROOM, Material.GRAY_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_LIGHT_GRAY_DYE = new DoubleMaterialRecipe(
      Material.WHITE_TULIP, Material.LIGHT_GRAY_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_CYAN_DYE = new DoubleMaterialRecipe(
      Material.TWISTING_VINES, Material.CYAN_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_PURPLE_DYE = new DoubleMaterialRecipe(
      Material.CHORUS_FRUIT, Material.PURPLE_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_BLUE_DYE = new DoubleMaterialRecipe(
      Material.CORNFLOWER, Material.BLUE_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_BROWN_DYE = new DoubleMaterialRecipe(
      Material.COCOA_BEANS, Material.BROWN_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_GREEN_DYE = new DoubleMaterialRecipe(
      Material.CACTUS, Material.GREEN_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_RED_DYE = new DoubleMaterialRecipe(
      Material.POPPY, Material.RED_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_BLACK_DYE = new DoubleMaterialRecipe(
      Material.INK_SAC, Material.BLACK_DYE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_POTATO = new DoubleMaterialRecipe(
      Material.POTATO, Material.POTATO);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_CARROT = new DoubleMaterialRecipe(
      Material.CARROT, Material.CARROT);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_BEETROOT = new DoubleMaterialRecipe(
      Material.BEETROOT_SEEDS, Material.BEETROOT);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_WHEAT = new DoubleMaterialRecipe(
      Material.WHEAT_SEEDS, Material.WHEAT);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_SUGAR_CANE = new DoubleMaterialRecipe(
      Material.SUGAR_CANE, Material.SUGAR_CANE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_SWEET_BERRIES = new DoubleMaterialRecipe(
      Material.SWEET_BERRIES, Material.SWEET_BERRIES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_MELON = new DoubleMaterialRecipe(
      Material.MELON_SEEDS, Material.MELON);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_PUMPKIN = new DoubleMaterialRecipe(
      Material.PUMPKIN_SEEDS, Material.PUMPKIN);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_APPLE = new DoubleMaterialRecipe(
      Material.APPLE, Material.APPLE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_DARK_OAK_SAPLING = new DoubleMaterialRecipe(
      Material.DARK_OAK_SAPLING, Material.DARK_OAK_LOG, Material.DARK_OAK_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_JUNGLE_SAPLING = new DoubleMaterialRecipe(
      Material.JUNGLE_SAPLING, Material.JUNGLE_LOG, Material.JUNGLE_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_BIRCH_SAPLING = new DoubleMaterialRecipe(
      Material.BIRCH_SAPLING, Material.BIRCH_LOG, Material.BIRCH_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_SPRUCE_SAPLING = new DoubleMaterialRecipe(
      Material.SPRUCE_SAPLING, Material.SPRUCE_LOG, Material.SPRUCE_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_ACACIA_SAPLING = new DoubleMaterialRecipe(
      Material.ACACIA_SAPLING, Material.ACACIA_LOG, Material.ACACIA_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_OAK_SAPLING = new DoubleMaterialRecipe(
      Material.OAK_SAPLING, Material.OAK_LOG, Material.OAK_LEAVES);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_CRIMSON_FUNGUS = new DoubleMaterialRecipe(
      Material.CRIMSON_FUNGUS, Material.CRIMSON_STEM);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_WARPED_FUNGUS = new DoubleMaterialRecipe(
      Material.WARPED_FUNGUS, Material.WARPED_STEM);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_WITHER_ROSE = new DoubleMaterialRecipe(
      Material.WITHER_ROSE, Material.WITHER_ROSE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_NETHER_WART = new DoubleMaterialRecipe(
      Material.NETHER_WART, Material.NETHER_WART);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_HONEY_BOTTLE = new DoubleMaterialRecipe(
      Material.HONEY_BLOCK, Material.HONEY_BOTTLE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_CLAY_BALL = new DoubleMaterialRecipe(
      Material.CLAY, Material.CLAY_BALL);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_SNOWBALL = new DoubleMaterialRecipe(
      Material.SNOW_BLOCK, Material.SNOWBALL);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_END_STONE = new DoubleMaterialRecipe(
      Material.END_CRYSTAL, Material.END_STONE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_GRANITE = new DoubleMaterialRecipe(
      Material.POLISHED_GRANITE, Material.GRANITE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_DIORITE = new DoubleMaterialRecipe(
      Material.POLISHED_DIORITE, Material.DIORITE);
  public static final DoubleMaterialRecipe RECIPE_GARDEN_ANDESITE = new DoubleMaterialRecipe(
      Material.POLISHED_ANDESITE, Material.ANDESITE);

  public static List<DoubleMaterialRecipe> getAllRecipe() {
    List<DoubleMaterialRecipe> list = new ArrayList<>();
    list.add(RECIPE_GARDEN_WHITE_DYE);
    list.add(RECIPE_GARDEN_ORANGE_DYE);
    list.add(RECIPE_GARDEN_MAGENTA_DYE);
    list.add(RECIPE_GARDEN_LIGHT_BLUE_DYE);
    list.add(RECIPE_GARDEN_YELLOW_DYE);
    list.add(RECIPE_GARDEN_LIME_DYE);
    list.add(RECIPE_GARDEN_PINK_DYE);
    list.add(RECIPE_GARDEN_GRAY_DYE);
    list.add(RECIPE_GARDEN_LIGHT_GRAY_DYE);
    list.add(RECIPE_GARDEN_CYAN_DYE);
    list.add(RECIPE_GARDEN_PURPLE_DYE);
    list.add(RECIPE_GARDEN_BLUE_DYE);
    list.add(RECIPE_GARDEN_BROWN_DYE);
    list.add(RECIPE_GARDEN_GREEN_DYE);
    list.add(RECIPE_GARDEN_RED_DYE);
    list.add(RECIPE_GARDEN_BLACK_DYE);
    list.add(RECIPE_GARDEN_POTATO);
    list.add(RECIPE_GARDEN_CARROT);
    list.add(RECIPE_GARDEN_BEETROOT);
    list.add(RECIPE_GARDEN_WHEAT);
    list.add(RECIPE_GARDEN_SUGAR_CANE);
    list.add(RECIPE_GARDEN_SWEET_BERRIES);
    list.add(RECIPE_GARDEN_MELON);
    list.add(RECIPE_GARDEN_PUMPKIN);
    list.add(RECIPE_GARDEN_APPLE);
    list.add(RECIPE_GARDEN_DARK_OAK_SAPLING);
    list.add(RECIPE_GARDEN_JUNGLE_SAPLING);
    list.add(RECIPE_GARDEN_BIRCH_SAPLING);
    list.add(RECIPE_GARDEN_SPRUCE_SAPLING);
    list.add(RECIPE_GARDEN_ACACIA_SAPLING);
    list.add(RECIPE_GARDEN_OAK_SAPLING);
    list.add(RECIPE_GARDEN_CRIMSON_FUNGUS);
    list.add(RECIPE_GARDEN_WARPED_FUNGUS);
    list.add(RECIPE_GARDEN_WITHER_ROSE);
    list.add(RECIPE_GARDEN_NETHER_WART);
    list.add(RECIPE_GARDEN_SNOWBALL);
    list.add(RECIPE_GARDEN_HONEY_BOTTLE);
    list.add(RECIPE_GARDEN_CLAY_BALL);
    list.add(RECIPE_GARDEN_END_STONE);
    list.add(RECIPE_GARDEN_GRANITE);
    list.add(RECIPE_GARDEN_DIORITE);
    list.add(RECIPE_GARDEN_ANDESITE);
    return list;
  }

}
