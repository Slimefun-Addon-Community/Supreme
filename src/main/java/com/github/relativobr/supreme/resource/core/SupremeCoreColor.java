package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreColor {

  public static final SlimefunItemStack RESOURCE_CORE_RED = new SupremeItemStack("SUPREME_CORE_RED",
      "a5d53ef428b369fd5cce94ce205d0d2d7b095fad676a9b383971ee1049e367ad", "&aSupreme Red", "", "&7A super red", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_RED = new CustomCoreRecipe(RESOURCE_CORE_RED,
      Material.RED_DYE, Material.BROWN_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_YELLOW = new SupremeItemStack("SUPREME_CORE_YELLOW",
      "8a03a8a877de7a4d6b167633a96ae3983998fd9d9a4c5e3fa817d138e81e4499", "&aSupreme Yellow", "", "&7A super yellow",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_YELLOW = new CustomCoreRecipe(RESOURCE_CORE_YELLOW,
      Material.YELLOW_DYE, Material.ORANGE_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_PURPLE = new SupremeItemStack("SUPREME_CORE_PURPLE",
      "b21f8f3e52fa21b45ff56f3f73dd21661ff257d97bd52ed958f2d757be89a961", "&aSupreme Purple", "", "&7A super purple",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PURPLE = new CustomCoreRecipe(RESOURCE_CORE_PURPLE,
      Material.PURPLE_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_BLUE = new SupremeItemStack("SUPREME_CORE_BLUE",
      "5f1e18cd9f9d3822196f0ccf1a8e071d87bb32ab50df4d6cfed93a1a948835ca", "&aSupreme Blue", "", "&7A super blue", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BLUE = new CustomCoreRecipe(RESOURCE_CORE_BLUE,
      Material.BLUE_DYE, Material.LIGHT_BLUE_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_BLACK = new SupremeItemStack("SUPREME_CORE_BLACK",
      "3e1e5c81fb9d64b74996fd171489deadbb8cb772d52cf8b566e3bc102301044", "&aSupreme Black", "", "&7A super black", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BLACK = new CustomCoreRecipe(RESOURCE_CORE_BLACK,
      Material.BLACK_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_GREEN = new SupremeItemStack("SUPREME_CORE_GREEN",
      "db3bcc1a668fb3397507359674128a42c26f344974189ec322a33d13168428ea", "&aSupreme Green", "", "&7A super green", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GREEN = new CustomCoreRecipe(RESOURCE_CORE_GREEN,
      Material.GREEN_DYE, Material.LIME_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_PINK = new SupremeItemStack("SUPREME_CORE_PINK",
      "2b5ad8ead60ca895c0d706cf3ad381be0540f28c5294d2b6e145675c963325cf", "&aSupreme pink", "", "&7A super pink", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_PINK = new CustomCoreRecipe(RESOURCE_CORE_PINK,
      Material.PINK_DYE, Material.MAGENTA_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_GRAY = new SupremeItemStack("SUPREME_CORE_GRAY",
      "145fd2c3736af4bd2811296661e0cb49bab2cfa65f5c9e598aa43bebfa1ea368", "&aSupreme Gray", "", "&7A super gray", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRAY = new CustomCoreRecipe(RESOURCE_CORE_GRAY,
      Material.GRAY_DYE, Material.LIGHT_GRAY_DYE);

  public static final SlimefunItemStack RESOURCE_CORE_CYAN = new SupremeItemStack("SUPREME_CORE_CYAN",
      "de73a8675ec1be13b1932627533212b1ded2b1773e54b06ea489a35d9744d615", "&aSupreme Cyan", "", "&7A super cyan", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CYAN = new CustomCoreRecipe(RESOURCE_CORE_CYAN,
      Material.CYAN_DYE, Material.WHITE_DYE);
}
