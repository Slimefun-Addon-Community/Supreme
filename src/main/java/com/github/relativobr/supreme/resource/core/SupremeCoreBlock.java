package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreBlock {

  public static final SlimefunItemStack RESOURCE_CORE_STONE = new SupremeItemStack("SUPREME_CORE_STONE",
      "454d9c488c3fbde5454e38619f9cc5b5ba8c6c0186f8aa1da60900fcbc3ea6", "&aSupreme cobblestone", "",
      "&7A super cobblestone", "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_STONE = new CustomCoreRecipe(RESOURCE_CORE_STONE,
      Material.COBBLESTONE);

  public static final SlimefunItemStack RESOURCE_CORE_GRANITE = new SupremeItemStack("SUPREME_CORE_GRANITE",
      "a0285bea3c8a02db139fa8ec5cc588615a98550725f8e676c93fdbc33b6b", "&aSupreme granite", "", "&7A super granite", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRANITE = new CustomCoreRecipe(RESOURCE_CORE_GRANITE,
      Material.GRANITE);

  public static final SlimefunItemStack RESOURCE_CORE_DIORITE = new SupremeItemStack("SUPREME_CORE_DIORITE",
      "13fa5265a336abde301a9d59af4783e82a10dad0817716ead2962ab7c6d3dff", "&aSupreme diorite", "", "&7A super diorite",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DIORITE = new CustomCoreRecipe(RESOURCE_CORE_DIORITE,
      Material.DIORITE);

  public static final SlimefunItemStack RESOURCE_CORE_ANDESITE = new SupremeItemStack("SUPREME_CORE_ANDESITE",
      "adb7bf059a62d27b1e1e2f34394f3f38ed8cda45471f6f4d5b47c3912d181135", "&aSupreme andesite", "",
      "&7A super andesite", "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ANDESITE = new CustomCoreRecipe(RESOURCE_CORE_ANDESITE,
      Material.ANDESITE);

  public static final SlimefunItemStack RESOURCE_CORE_GRAVEL = new SupremeItemStack("SUPREME_CORE_GRAVEL",
      "7788b61fcd46cad9235cc32ac57a54f708110329447bb24c0877886e3f4907f1", "&aSupreme gravel", "", "&7A super gravel",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_GRAVEL = new CustomCoreRecipe(RESOURCE_CORE_GRAVEL,
      Material.GRAVEL);

  public static final SlimefunItemStack RESOURCE_CORE_SAND = new SupremeItemStack("SUPREME_CORE_SAND",
      "53398ab3cb696b34430be944b14afbd227fd87e99026bcfc8b7387a861bde", "&aSupreme sand", "", "&7A super sand", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SAND = new CustomCoreRecipe(RESOURCE_CORE_SAND,
      Material.SAND);

  public static final SlimefunItemStack RESOURCE_CORE_ENDSTONE = new SupremeItemStack("SUPREME_CORE_ENDSTONE",
      "19f21f5d883316fd65a9366f32a33013182e3381dec21c17c78355d9bf4f0", "&aSupreme endstone", "", "&7A super endstone",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ENDSTONE = new CustomCoreRecipe(RESOURCE_CORE_ENDSTONE,
      Material.END_STONE);

  public static final SlimefunItemStack RESOURCE_CORE_CLAY = new SupremeItemStack("SUPREME_CORE_CLAY",
      "67826829eab5ad62f0c11d9faafdc9954364871160dd839e1ab5a3b213a33", "&aSupreme clay", "", "&7A super clay", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CLAY = new CustomCoreRecipe(RESOURCE_CORE_CLAY,
      Material.CLAY);

  public static final SlimefunItemStack RESOURCE_CORE_SNOW = new SupremeItemStack("SUPREME_CORE_SNOW",
      "5dd6fe267a418dcc7f37a8f76855b5328b1303897b342a107cf162f14fe3d", "&aSupreme snow", "", "&7A super snow", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SNOW = new CustomCoreRecipe(RESOURCE_CORE_SNOW,
      Material.SNOW_BLOCK);
}
