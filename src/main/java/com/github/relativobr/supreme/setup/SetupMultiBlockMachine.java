package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockCoreFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockMagicalFabricator;

public class SetupMultiBlockMachine {

  public static void setup(Supreme sup) {

    new MultiBlockCoreFabricator().register(sup);

    new MultiBlockMagicalFabricator().register(sup);

    new MultiBlockGearFabricator().register(sup);
  }
}
