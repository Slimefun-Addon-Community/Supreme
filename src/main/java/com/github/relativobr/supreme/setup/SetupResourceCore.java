package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerCoreFabricator;

import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;

public class SetupResourceCore {

  public static void setup(Supreme sup) {

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_STONE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_GRANITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_DIORITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_ANDESITE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_GRAVEL,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_SAND,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_ENDSTONE,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_CLAY,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));

    registerCoreFabricator(SupremeCoreBlock.RESOURCE_CORE_SNOW,
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_PORKCHOP,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_BEEF,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_MUTTON,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_CHICKEN,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_SALMON,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_COD,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_STRING,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));

    registerCoreFabricator(SupremeCoreDeath.RESOURCE_CORE_TEAR,
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_POTATO,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_APPLE,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_BEETROOT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_WHEAT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_MELON,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_CARROT,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));

    registerCoreFabricator(SupremeCoreLife.RESOURCE_CORE_PUMPKIN,
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_RED,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_YELLOW,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_PURPLE,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_BLUE,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_BLACK,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_GREEN,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_PINK,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_GRAY,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));

    registerCoreFabricator(SupremeCoreColor.RESOURCE_CORE_CYAN,
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_WARPED_STEM,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));

    registerCoreFabricator(SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE,
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_COAL,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_IRON,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_GOLD,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_REDSTONE,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_LAPIS,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_DIAMOND,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_EMERALD,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_QUARTZ,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));

    registerCoreFabricator(SupremeCoreAlloy.RESOURCE_CORE_NETHERITE,
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));

  }

}
