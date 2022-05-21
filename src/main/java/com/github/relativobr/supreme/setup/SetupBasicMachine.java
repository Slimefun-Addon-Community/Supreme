package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.MultiBlockCoreFabricator;
import com.github.relativobr.supreme.machine.MultiBlockGearFabricator;
import com.github.relativobr.supreme.machine.MultiBlockMagicalFabricator;

public class SetupBasicMachine {

  public static void setup(Supreme sup) {

    // define CoreFabricator
    new MultiBlockCoreFabricator().register(sup);

    // define MagicalFabricator
    new MultiBlockMagicalFabricator().register(sup);

    // define GearFabricator
    new MultiBlockGearFabricator().register(sup);
  }
}
