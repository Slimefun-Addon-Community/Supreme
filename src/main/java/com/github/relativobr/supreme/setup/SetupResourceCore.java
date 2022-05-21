package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.machine.MultiBlockCoreFabricator;
import com.github.relativobr.recipe.CustomCoreRecipe;
import com.github.relativobr.util.ItemNotPlaceable;

public class SetupResourceCore {


  public static void setup(Supreme sup) {

    ItemNotPlaceable itemResourceCoreStone = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_STONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));
    itemResourceCoreStone.register(sup);

    ItemNotPlaceable itemResourceCoreGranite = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_GRANITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    itemResourceCoreGranite.register(sup);

    ItemNotPlaceable itemResourceCoreDiorite = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_DIORITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    itemResourceCoreDiorite.register(sup);

    ItemNotPlaceable itemResourceCoreAndesite = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_ANDESITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    itemResourceCoreAndesite.register(sup);

    ItemNotPlaceable itemResourceCoreGravel = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_GRAVEL, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    itemResourceCoreGravel.register(sup);

    ItemNotPlaceable itemResourceCoreSand = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_SAND, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));
    itemResourceCoreSand.register(sup);

    ItemNotPlaceable itemResourceCoreEndstone = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_ENDSTONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    itemResourceCoreEndstone.register(sup);

    ItemNotPlaceable itemResourceCoreClay = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_CLAY, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    itemResourceCoreClay.register(sup);

    ItemNotPlaceable itemResourceCoreSnow = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreBlock.RESOURCE_CORE_SNOW, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    itemResourceCoreSnow.register(sup);

    ItemNotPlaceable itemResourceCorePorkchop = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_PORKCHOP, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    itemResourceCorePorkchop.register(sup);

    ItemNotPlaceable itemResourceCoreBeef = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_BEEF, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    itemResourceCoreBeef.register(sup);

    ItemNotPlaceable itemResourceCoreMutton = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_MUTTON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    itemResourceCoreMutton.register(sup);

    ItemNotPlaceable itemResourceCoreRawChicken = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_CHICKEN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    itemResourceCoreRawChicken.register(sup);

    ItemNotPlaceable itemResourceCoreSalmon = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_SALMON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    itemResourceCoreSalmon.register(sup);

    ItemNotPlaceable itemResourceCoreCod = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_COD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));
    itemResourceCoreCod.register(sup);

    ItemNotPlaceable itemResourceCoreLead = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_STRING, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));
    itemResourceCoreLead.register(sup);

    ItemNotPlaceable itemResourceCoreSpiderEye = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    itemResourceCoreSpiderEye.register(sup);

    ItemNotPlaceable itemResourceCoreGhastTear = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreDeath.RESOURCE_CORE_TEAR, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    itemResourceCoreGhastTear.register(sup);

    ItemNotPlaceable itemResourceCorePotato = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_POTATO, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));
    itemResourceCorePotato.register(sup);

    ItemNotPlaceable itemResourceCoreApple = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_APPLE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));
    itemResourceCoreApple.register(sup);

    ItemNotPlaceable itemResourceCoreBeetroot = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_BEETROOT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    itemResourceCoreBeetroot.register(sup);

    ItemNotPlaceable itemResourceCoreWheat = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_WHEAT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    itemResourceCoreWheat.register(sup);

    ItemNotPlaceable itemResourceCoreSugarCane = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    itemResourceCoreSugarCane.register(sup);

    ItemNotPlaceable itemResourceCoreSweetBerries = new ItemNotPlaceable(
        ItemGroups.RESOURCE_CATEGORY, SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES,
        MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    itemResourceCoreSweetBerries.register(sup);

    ItemNotPlaceable itemResourceCoreMelon = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_MELON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));
    itemResourceCoreMelon.register(sup);

    ItemNotPlaceable itemResourceCoreCarrot = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_CARROT, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));
    itemResourceCoreCarrot.register(sup);

    ItemNotPlaceable itemResourceCorePumpkin = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreLife.RESOURCE_CORE_PUMPKIN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    itemResourceCorePumpkin.register(sup);

    ItemNotPlaceable itemResourceCoreRed = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_RED, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));
    itemResourceCoreRed.register(sup);

    ItemNotPlaceable itemResourceCoreYellow = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_YELLOW, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    itemResourceCoreYellow.register(sup);

    ItemNotPlaceable itemResourceCorePurple = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_PURPLE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    itemResourceCorePurple.register(sup);

    ItemNotPlaceable itemResourceCoreBlue = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_BLUE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));
    itemResourceCoreBlue.register(sup);

    ItemNotPlaceable itemResourceCoreBlack = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_BLACK, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));
    itemResourceCoreBlack.register(sup);

    ItemNotPlaceable itemResourceCoreGreen = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_GREEN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));
    itemResourceCoreGreen.register(sup);

    ItemNotPlaceable itemResourceCorePink = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_PINK, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));
    itemResourceCorePink.register(sup);

    ItemNotPlaceable itemResourceCoreGray = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_GRAY, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));
    itemResourceCoreGray.register(sup);

    ItemNotPlaceable itemResourceCoreCyan = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreColor.RESOURCE_CORE_CYAN, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));
    itemResourceCoreCyan.register(sup);

    ItemNotPlaceable itemResourceCoreOakLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_OAK_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    itemResourceCoreOakLog.register(sup);

    ItemNotPlaceable itemResourceCoreSpruceLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    itemResourceCoreSpruceLog.register(sup);

    ItemNotPlaceable itemResourceCoreBirchLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    itemResourceCoreBirchLog.register(sup);

    ItemNotPlaceable itemResourceCoreJungleLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    itemResourceCoreJungleLog.register(sup);

    ItemNotPlaceable itemResourceCoreAcaciaLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    itemResourceCoreAcaciaLog.register(sup);

    ItemNotPlaceable itemResourceCoreDarkLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    itemResourceCoreDarkLog.register(sup);

    ItemNotPlaceable itemResourceCoreCrimsonLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    itemResourceCoreCrimsonLog.register(sup);

    ItemNotPlaceable itemResourceCoreWarpedLog = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_WARPED_STEM, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    itemResourceCoreWarpedLog.register(sup);

    ItemNotPlaceable itemResourceCoreWitherRose = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    itemResourceCoreWitherRose.register(sup);

    ItemNotPlaceable itemResourceCoreCoal = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_COAL, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    itemResourceCoreCoal.register(sup);

    ItemNotPlaceable itemResourceCoreIron = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_IRON, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    itemResourceCoreIron.register(sup);

    ItemNotPlaceable itemResourceCoreGold = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_GOLD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    itemResourceCoreGold.register(sup);

    ItemNotPlaceable itemResourceCoreRedstone = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_REDSTONE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    itemResourceCoreRedstone.register(sup);

    ItemNotPlaceable itemResourceCoreLapis = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_LAPIS, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    itemResourceCoreLapis.register(sup);

    ItemNotPlaceable itemResourceCoreDiamond = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_DIAMOND, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    itemResourceCoreDiamond.register(sup);

    ItemNotPlaceable itemResourceCoreEmerald = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_EMERALD, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    itemResourceCoreEmerald.register(sup);

    ItemNotPlaceable itemResourceCoreQuartz = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_QUARTZ, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    itemResourceCoreQuartz.register(sup);

    ItemNotPlaceable itemResourceCoreNetherite = new ItemNotPlaceable(ItemGroups.RESOURCE_CATEGORY,
        SupremeCoreAlloy.RESOURCE_CORE_NETHERITE, MultiBlockCoreFabricator.getMachine(),
        CustomCoreRecipe.getRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    itemResourceCoreNetherite.register(sup);


  }

}
