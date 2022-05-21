package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.MultiBlockMagicalFabricator;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.util.ItemNotPlaceable;

public class SetupMagical {

  public static void setup(Supreme sup) {

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_LUMIUM,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_LUMIUM)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_LUX,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_LUX)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_VENTUS,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_VENTUS)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_AQUA,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_AQUA)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeCetrus.CETRUS_IGNIS,
            MultiBlockMagicalFabricator.getMachine(),
            SupremeCetrus.RECIPE_CETRUS_IGNIS)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getMagic(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getBomb(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_BOMB)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getFortune(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE)
        .register(sup);

    new ItemNotPlaceable(
            ItemGroups.MAGICAL_CATEGORY,
            SupremeAttribute.getImpetus(),
            MultiBlockMagicalFabricator.getMachine(),
            SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS)
        .register(sup);
  }
}
