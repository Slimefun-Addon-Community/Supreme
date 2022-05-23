package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.gear.AbstractArmor;
import com.github.relativobr.supreme.gear.AbstractTools;
import com.github.relativobr.supreme.gear.AbstractWeapons;

public class MainSetup {

  public static void setup(Supreme sup) {

    SetupBasicMachine.setup(sup);
    SetupResourceCore.setup(sup);
    SetupSupremeCore.setup(sup);
    SetupSupremeComponents.setup(sup);
    SetupElectricMachine.setup(sup);

    if (sup.getConfig().getBoolean("options.enable-generators")) {
      SetupGenerators.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-weapons")) {
      AbstractWeapons.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-tools")) {
      AbstractTools.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-armor")) {
      AbstractArmor.setup(sup);
    }

    if (sup.getConfig().getBoolean("options.enable-quarry")) {
      SetupSupremeQuarry.setup(sup);
    }

  }
}
