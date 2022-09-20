package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.util.SupremeOptions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;

public class VirtualGardenMachineRecipe extends MachineRecipe {

  public static final AbstractItemRecipe RECIPE_GARDEN_WHITE_DYE = new AbstractItemRecipe(Material.LILY_OF_THE_VALLEY,
      Material.WHITE_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_ORANGE_DYE = new AbstractItemRecipe(Material.ORANGE_TULIP,
      Material.ORANGE_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_MAGENTA_DYE = new AbstractItemRecipe(Material.ALLIUM,
      Material.MAGENTA_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_LIGHT_BLUE_DYE = new AbstractItemRecipe(Material.BLUE_ORCHID,
      Material.LIGHT_BLUE_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_YELLOW_DYE = new AbstractItemRecipe(Material.DANDELION,
      Material.YELLOW_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_LIME_DYE = new AbstractItemRecipe(Material.BAMBOO,
      Material.LIME_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_PINK_DYE = new AbstractItemRecipe(Material.PINK_TULIP,
      Material.PINK_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_GRAY_DYE = new AbstractItemRecipe(Material.BROWN_MUSHROOM,
      Material.GRAY_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_LIGHT_GRAY_DYE = new AbstractItemRecipe(Material.WHITE_TULIP,
      Material.LIGHT_GRAY_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_CYAN_DYE = new AbstractItemRecipe(Material.TWISTING_VINES,
      Material.CYAN_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_PURPLE_DYE = new AbstractItemRecipe(Material.CHORUS_FRUIT,
      Material.PURPLE_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_BLUE_DYE = new AbstractItemRecipe(Material.CORNFLOWER,
      Material.BLUE_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_BROWN_DYE = new AbstractItemRecipe(Material.COCOA_BEANS,
      Material.BROWN_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_GREEN_DYE = new AbstractItemRecipe(Material.CACTUS,
      Material.GREEN_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_RED_DYE = new AbstractItemRecipe(Material.POPPY,
      Material.RED_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_BLACK_DYE = new AbstractItemRecipe(Material.INK_SAC,
      Material.BLACK_DYE);
  public static final AbstractItemRecipe RECIPE_GARDEN_POTATO = new AbstractItemRecipe(Material.POTATO,
      Material.POTATO);
  public static final AbstractItemRecipe RECIPE_GARDEN_CARROT = new AbstractItemRecipe(Material.CARROT,
      Material.CARROT);
  public static final AbstractItemRecipe RECIPE_GARDEN_BEETROOT = new AbstractItemRecipe(Material.BEETROOT_SEEDS,
      Material.BEETROOT);
  public static final AbstractItemRecipe RECIPE_GARDEN_WHEAT = new AbstractItemRecipe(Material.WHEAT_SEEDS,
      Material.WHEAT);
  public static final AbstractItemRecipe RECIPE_GARDEN_SUGAR_CANE = new AbstractItemRecipe(Material.SUGAR_CANE,
      Material.SUGAR_CANE);
  public static final AbstractItemRecipe RECIPE_GARDEN_SWEET_BERRIES = new AbstractItemRecipe(Material.SWEET_BERRIES,
      Material.SWEET_BERRIES);
  public static final AbstractItemRecipe RECIPE_GARDEN_MELON = new AbstractItemRecipe(Material.MELON_SEEDS,
      Material.MELON);
  public static final AbstractItemRecipe RECIPE_GARDEN_PUMPKIN = new AbstractItemRecipe(Material.PUMPKIN_SEEDS,
      Material.PUMPKIN);
  public static final AbstractItemRecipe RECIPE_GARDEN_CARVED_PUMPKIN = new AbstractItemRecipe(Material.PUMPKIN,
      Material.CARVED_PUMPKIN);
  public static final AbstractItemRecipe RECIPE_GARDEN_APPLE = new AbstractItemRecipe(Material.APPLE, Material.APPLE);
  public static final AbstractItemRecipe RECIPE_GARDEN_DARK_OAK_SAPLING = new AbstractItemRecipe(
      Material.DARK_OAK_SAPLING, null, Material.DARK_OAK_LOG, Material.DARK_OAK_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_JUNGLE_SAPLING = new AbstractItemRecipe(Material.JUNGLE_SAPLING,
      null, Material.JUNGLE_LOG, Material.JUNGLE_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_BIRCH_SAPLING = new AbstractItemRecipe(Material.BIRCH_SAPLING,
      null, Material.BIRCH_LOG, Material.BIRCH_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_SPRUCE_SAPLING = new AbstractItemRecipe(Material.SPRUCE_SAPLING,
      null, Material.SPRUCE_LOG, Material.SPRUCE_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_ACACIA_SAPLING = new AbstractItemRecipe(Material.ACACIA_SAPLING,
      null, Material.ACACIA_LOG, Material.ACACIA_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_OAK_SAPLING = new AbstractItemRecipe(Material.OAK_SAPLING, null,
      Material.OAK_LOG, Material.OAK_LEAVES);
  public static final AbstractItemRecipe RECIPE_GARDEN_CRIMSON_FUNGUS = new AbstractItemRecipe(Material.CRIMSON_FUNGUS,
      Material.CRIMSON_STEM);
  public static final AbstractItemRecipe RECIPE_GARDEN_WARPED_FUNGUS = new AbstractItemRecipe(Material.WARPED_FUNGUS,
      Material.WARPED_STEM);
  public static final AbstractItemRecipe RECIPE_GARDEN_WITHER_ROSE = new AbstractItemRecipe(Material.WITHER_ROSE,
      Material.WITHER_ROSE);
  public static final AbstractItemRecipe RECIPE_GARDEN_NETHER_WART = new AbstractItemRecipe(Material.NETHER_WART,
      Material.NETHER_WART);
  public static final AbstractItemRecipe RECIPE_GARDEN_HONEY_BOTTLE = new AbstractItemRecipe(Material.HONEY_BLOCK,
      Material.HONEY_BOTTLE);
  public static final AbstractItemRecipe RECIPE_GARDEN_CLAY_BALL = new AbstractItemRecipe(Material.CLAY,
      Material.CLAY_BALL);
  public static final AbstractItemRecipe RECIPE_GARDEN_SNOWBALL = new AbstractItemRecipe(Material.SNOW_BLOCK,
      Material.SNOWBALL);
  public static final AbstractItemRecipe RECIPE_GARDEN_END_STONE = new AbstractItemRecipe(Material.END_CRYSTAL,
      Material.END_STONE);
  public static final AbstractItemRecipe RECIPE_GARDEN_GRANITE = new AbstractItemRecipe(Material.POLISHED_GRANITE,
      Material.GRANITE);
  public static final AbstractItemRecipe RECIPE_GARDEN_DIORITE = new AbstractItemRecipe(Material.POLISHED_DIORITE,
      Material.DIORITE);
  public static final AbstractItemRecipe RECIPE_GARDEN_ANDESITE = new AbstractItemRecipe(Material.POLISHED_ANDESITE,
      Material.ANDESITE);

  @ParametersAreNonnullByDefault
  public VirtualGardenMachineRecipe(AbstractItemRecipe recipe) {
    super(Supreme.getSupremeOptions().getBaseTimeVirtualGarden(), recipe.getInput(), recipe.getOutput());
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
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
    list.add(RECIPE_GARDEN_CARVED_PUMPKIN);
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
