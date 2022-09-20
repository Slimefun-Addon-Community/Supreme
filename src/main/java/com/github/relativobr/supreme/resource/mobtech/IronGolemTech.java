package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.Supreme;
import lombok.experimental.UtilityClass;

@UtilityClass
public class IronGolemTech {

  public static final MobTechGeneric SIMPLE_GOLEM = new MobTechGeneric("SUPREME_SIMPLE_GOLEM", "Common Golem",
      "e13f34227283796bc017244cb46557d64bd562fa9dab0e12af5d23ad699cf697", MobTechType.SIMPLE);

  public static final MobTechGeneric MUTATION_BERSERK_GOLEM = new MobTechGeneric("SUPREME_BERSERK_GOLEM",
      "Berserk Mutant Golem", "ca14326aeac97f96189bb9969e7b955ec650d37b7c9790356ff09f32010f1ae0",
      MobTechType.MUTATION_BERSERK);

  public static final MobTechGeneric ROBOTIC_ACCELERATION_GOLEM = new MobTechGeneric("SUPREME_ACCELERATION_GOLEM",
      "Robotic Accelerator Golem", "1bfb3534baf81dc3f82feffbcd1c9ae33fac7dcc8291d2ee43d819d5a9b61",
      MobTechType.ROBOTIC_ACCELERATION);

  public static final MobTechGeneric MUTATION_INTELLIGENCE_GOLEM = new MobTechGeneric("SUPREME_INTELLIGENCE_GOLEM",
      "Intelligent Mutant Golem", "562f0e9a738265c75bdd92b9e2e02377fec9f3b027086a0dec273bbdf6798be",
      MobTechType.MUTATION_INTELLIGENCE);

  public static final MobTechGeneric ROBOTIC_EFFICIENCY_GOLEM = new MobTechGeneric("SUPREME_EFFICIENCY_GOLEM",
      "Efficient Robotic Golem", "6d351a4ef45749565514d22f48e9695005a582b9ddbbbc444647ff0b056f4ffa",
      MobTechType.ROBOTIC_EFFICIENCY);

  public static final MobTechGeneric MUTATION_LUCK_GOLEM = new MobTechGeneric("SUPREME_LOCK_GOLEM",
      "Lucky Mutant Golem", "ef6e7a9c941e71bbfeb9ccdf91119ed7868bef05e661b1e14d3e34a9b17088d9",
      MobTechType.MUTATION_LUCK);

  public static final MobTechGeneric ROBOTIC_CLONING_GOLEM = new MobTechGeneric("SUPREME_CLONING_GOLEM",
      "Cloner Robotic Golem", "ec4a74ac2d0ceff89157ad16121b6bcb2b5e5e694b460a27d3b9944f368c17ce",
      MobTechType.ROBOTIC_CLONING);

  public static void setup(Supreme plugin) {

    MobTech.preSetup(plugin, IronGolemTech.SIMPLE_GOLEM);

    MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_EFFICIENCY_GOLEM);
    MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_CLONING_GOLEM);
    MobTech.preSetup(plugin, IronGolemTech.ROBOTIC_ACCELERATION_GOLEM);

    MobTech.preSetup(plugin, IronGolemTech.MUTATION_INTELLIGENCE_GOLEM);
    MobTech.preSetup(plugin, IronGolemTech.MUTATION_LUCK_GOLEM);
    MobTech.preSetup(plugin, IronGolemTech.MUTATION_BERSERK_GOLEM);

  }

}