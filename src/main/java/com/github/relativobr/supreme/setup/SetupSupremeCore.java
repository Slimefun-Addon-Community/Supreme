package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.machine.MultiBlockCoreFabricator;
import com.github.relativobr.util.ItemNotPlaceable;

public class SetupSupremeCore {

  public static void setup(Supreme sup) {

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_BLOCK,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_BLOCK)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_DEATH,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_DEATH)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_LIFE,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_LIFE)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_COLOR,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_COLOR)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_NATURE,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_NATURE)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCore.CORE_OF_ALLOY,
            MultiBlockCoreFabricator.getMachine(),
            SupremeCore.RECIPE_CORE_OF_ALLOY)
        .register(sup);
  }
}
