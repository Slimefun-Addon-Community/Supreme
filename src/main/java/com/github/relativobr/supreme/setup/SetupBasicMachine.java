package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockCoreFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockMagicalFabricator;

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
