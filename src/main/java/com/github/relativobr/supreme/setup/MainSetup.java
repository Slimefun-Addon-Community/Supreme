package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.gear.AbstractArmor;
import com.github.relativobr.supreme.tools.AbstractTools;
import com.github.relativobr.supreme.gear.AbstractWeapons;

public class MainSetup {

  public static void setup(Supreme sup) {

    SetupResourceCore.setup(sup);
    SetupSupremeComponents.setup(sup);
    SetupMachines.setup(sup);

    if (getSupremeOptions().isEnableGenerators()) {
      SetupGenerators.setup(sup);
    }

    if (getSupremeOptions().isEnableWeapons()) {
      AbstractWeapons.setup(sup);
    }

    if (getSupremeOptions().isEnableTools()) {
      AbstractTools.setup(sup);
    }

    if (getSupremeOptions().isEnableArmor()) {
      AbstractArmor.setup(sup);
    }

    if (getSupremeOptions().isEnableQuarry()) {
      SetupSupremeQuarry.setup(sup);
    }

  }
}
