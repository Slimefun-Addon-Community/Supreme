package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.gear.AbstractArmor;
import com.github.relativobr.supreme.tools.AbstractTools;
import com.github.relativobr.supreme.gear.AbstractWeapons;
import com.github.relativobr.supreme.util.SupremeOptions;

public class MainSetup {

  public static void setup(Supreme sup) {

    SetupResourceCore.setup(sup);
    SetupSupremeComponents.setup(sup);
    SetupMachines.setup(sup);

    SupremeOptions supremeOptions = getSupremeOptions();

    if (supremeOptions.isEnableGenerators()) {
      SetupGenerators.setup(sup);
    }

    if (supremeOptions.isEnableWeapons()) {
      AbstractWeapons.setup(sup);
    }

    if (supremeOptions.isEnableTools()) {
      AbstractTools.setup(sup);
    }

    if (supremeOptions.isEnableArmor()) {
      AbstractArmor.setup(sup);
    }

    if (supremeOptions.isEnableQuarry()) {
      SetupSupremeQuarry.setup(sup);
    }

  }
}
