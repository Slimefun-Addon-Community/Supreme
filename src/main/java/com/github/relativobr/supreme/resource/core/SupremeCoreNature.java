package com.github.relativobr.supreme.resource.core;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SupremeCoreNature {

  public static final SlimefunItemStack RESOURCE_CORE_OAK_LOG = new SupremeItemStack("SUPREME_CORE_OAK_LOG",
      "5c44262564ac5a0049a982558d087733b0ee2b5a2bf5fc5fdafe6e08f496174c", "&aCarvalho Supremo", "", "&7A super oak", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_OAK_LOG = new CustomCoreRecipe(RESOURCE_CORE_OAK_LOG,
      Material.OAK_LOG, Material.OAK_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_SPRUCE_LOG = new SupremeItemStack("SUPREME_CORE_SPRUCE_LOG",
      "9f4af289825e127dac32208b1e0389a927ef405597b6c9a64cef03f21d9273b5", "&aPinheiro Supremo", "", "&7A super spruce",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_SPRUCE_LOG = new CustomCoreRecipe(RESOURCE_CORE_SPRUCE_LOG,
      Material.SPRUCE_LOG, Material.SPRUCE_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_BIRCH_LOG = new SupremeItemStack("SUPREME_CORE_BIRCH_LOG",
      "a991f3b73ebb9dec91eddc8361ca2fecf5280d2c733eda9ecb695f83d1580", "&aBétula Supremo", "", "&7A super birch", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_BIRCH_LOG = new CustomCoreRecipe(RESOURCE_CORE_BIRCH_LOG,
      Material.BIRCH_LOG, Material.BIRCH_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_JUNGLE_LOG = new SupremeItemStack("SUPREME_CORE_JUNGLE_LOG",
      "79ca3540621c1c79c32bf42438708ff1f5f7d0af9b14a074731107edfeb691c", "&aJungle Suprema", "", "&7A super jungle", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_JUNGLE_LOG = new CustomCoreRecipe(RESOURCE_CORE_JUNGLE_LOG,
      Material.JUNGLE_LOG, Material.JUNGLE_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_ACACIA_LOG = new SupremeItemStack("SUPREME_CORE_ACACIA_LOG",
      "e6669fe2dbf78792a3e191622a8ed1f9eb803f8826c9b949d0dc15a51c59391", "&aAcácia Suprema", "", "&7A super acacia", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_ACACIA_LOG = new CustomCoreRecipe(RESOURCE_CORE_ACACIA_LOG,
      Material.ACACIA_LOG, Material.ACACIA_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_DARK_OAK_LOG = new SupremeItemStack("SUPREME_CORE_DARK_OAK_LOG",
      "f77dc6e8b45adcf928f2c6139dfa2a361aa107b89c9ad35c347b677a07c79f5", "&aDark Supremo", "", "&7A super dark", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_DARK_OAK_LOG = new CustomCoreRecipe(
      RESOURCE_CORE_DARK_OAK_LOG, Material.DARK_OAK_LOG, Material.DARK_OAK_LEAVES);

  public static final SlimefunItemStack RESOURCE_CORE_CRIMSON_STEM = new SupremeItemStack("SUPREME_CORE_CRIMSON_STEM",
      "b28874497332731576eb1b5b35c877b619ed23622716afe7d2291a684aaaa013", "&aCrimson Supremo", "", "&7A super crimson",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_CRIMSON_STEM = new CustomCoreRecipe(
      RESOURCE_CORE_CRIMSON_STEM, Material.CRIMSON_STEM);

  public static final SlimefunItemStack RESOURCE_CORE_WARPED_STEM = new SupremeItemStack("SUPREME_CORE_WARPED_STEM",
      "e32d41daee6f61ca00e5ecf9dfdd6245af620f1ab6258e986da673c57e5312a6", "&aWarped Supremo", "", "&7A super warped",
      "", "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WARPED_STEM = new CustomCoreRecipe(
      RESOURCE_CORE_WARPED_STEM, Material.WARPED_STEM);

  public static final SlimefunItemStack RESOURCE_CORE_WITHER_ROSE = new SupremeItemStack("SUPREME_CORE_WITHER_ROSE",
      "9dba38e9fc67f72c458fdac8ecd7cabaed3eb83737143a0128350a1ab381e3e", "&aRosa Suprema", "", "&7A super rose", "",
      "&3Supreme Core Components");
  public static final CustomCoreRecipe RECIPE_RESOURCE_CORE_WITHER_ROSE = new CustomCoreRecipe(
      RESOURCE_CORE_WITHER_ROSE, Material.WITHER_ROSE);
}
