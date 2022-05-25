package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;

public class SetupMagicalComponents {

  public static void setup(Supreme sup) {

    registerMagicalFabricator(SupremeCetrus.CETRUS_LUMIUM, SupremeCetrus.RECIPE_CETRUS_LUMIUM);

    registerMagicalFabricator(SupremeCetrus.CETRUS_LUX, SupremeCetrus.RECIPE_CETRUS_LUX);

    registerMagicalFabricator(SupremeCetrus.CETRUS_VENTUS, SupremeCetrus.RECIPE_CETRUS_VENTUS);

    registerMagicalFabricator(SupremeCetrus.CETRUS_AQUA, SupremeCetrus.RECIPE_CETRUS_AQUA);

    registerMagicalFabricator(SupremeCetrus.CETRUS_IGNIS, SupremeCetrus.RECIPE_CETRUS_IGNIS);

    registerMagicalFabricator(SupremeAttribute.getMagic(), SupremeAttribute.RECIPE_ATTRIBUTE_MAGIC);

    registerMagicalFabricator(SupremeAttribute.getBomb(), SupremeAttribute.RECIPE_ATTRIBUTE_BOMB);

    registerMagicalFabricator(SupremeAttribute.getFortune(), SupremeAttribute.RECIPE_ATTRIBUTE_FORTUNE);

    registerMagicalFabricator(SupremeAttribute.getImpetus(), SupremeAttribute.RECIPE_ATTRIBUTE_IMPETUS);

  }
}
