package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.Supreme;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BeeTech {

  public static final MobTechGeneric SIMPLE_BEE = new MobTechGeneric("SUPREME_SIMPLE_BEE", "Common Bee",
      "259001a851bb1b9e9c05de5d5c68b1ea0dc8bd86babf188e0aded8f912c07d0d", MobTechType.SIMPLE);

  public static final MobTechGeneric MUTATION_BERSERK_BEE = new MobTechGeneric("SUPREME_BERSERK_BEE",
      "Berserk Mutant Bee", "d8916ea1ffb39f13dbbf4e62449dd2cbd5d2812f414e97608af0609e139d6115",
      MobTechType.MUTATION_BERSERK);

  public static final MobTechGeneric ROBOTIC_ACCELERATION_BEE = new MobTechGeneric("SUPREME_ACCELERATION_BEE",
      "Robotic Bee Accelerator", "725926d73f6f9480efad9e930e8a4a2566c115287a5b40ec0f50d58afab1a72a",
      MobTechType.ROBOTIC_ACCELERATION);

  public static final MobTechGeneric MUTATION_INTELLIGENCE_BEE = new MobTechGeneric("SUPREME_INTELLIGENCE_BEE",
      "Intelligent Mutant Bee", "1445c3def689427fd8df8cad824c0a6b553d4f847eb03705196a69c7eed946af",
      MobTechType.MUTATION_INTELLIGENCE);

  public static final MobTechGeneric ROBOTIC_EFFICIENCY_BEE = new MobTechGeneric("SUPREME_EFFICIENCY_BEE",
      "Efficient Robotic Bee", "fb7a761d715d2c3c73a7d01411e61f4237e4f7633cc9f4db2cf05f66d2030a17",
      MobTechType.ROBOTIC_EFFICIENCY);

  public static final MobTechGeneric MUTATION_LUCK_BEE = new MobTechGeneric("SUPREME_LUCK_BEE", "Lucky Mutant Bee",
      "929fa8cd84ac125021d6201a148a9e862c0b772c48477b06c19145c4a673aa24", MobTechType.MUTATION_LUCK);

  public static final MobTechGeneric ROBOTIC_CLONING_BEE = new MobTechGeneric("SUPREME_CLONING_BEE",
      "Cloner Robotic Bee", "2ea2ba84c8c91dcb28af56a36dd49a1e51c3557e853f5d3777877758737b5557",
      MobTechType.ROBOTIC_CLONING);


  public static void setup(Supreme plugin) {

    MobTech.preSetup(plugin, BeeTech.SIMPLE_BEE);

    MobTech.preSetup(plugin, BeeTech.ROBOTIC_EFFICIENCY_BEE);
    MobTech.preSetup(plugin, BeeTech.ROBOTIC_CLONING_BEE);
    MobTech.preSetup(plugin, BeeTech.ROBOTIC_ACCELERATION_BEE);

    MobTech.preSetup(plugin, BeeTech.MUTATION_INTELLIGENCE_BEE);
    MobTech.preSetup(plugin, BeeTech.MUTATION_LUCK_BEE);
    MobTech.preSetup(plugin, BeeTech.MUTATION_BERSERK_BEE);

  }


}