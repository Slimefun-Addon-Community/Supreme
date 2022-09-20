package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.Supreme;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ZombieTech {

  public static final MobTechGeneric SIMPLE_ZOMBIE = new MobTechGeneric("SUPREME_SIMPLE_ZOMBIE", "Common Zombie",
      "311dd91ee4d31ddd591d2832ea1ec080f2eded33ab89ee1db8b04b26a68a", MobTechType.SIMPLE);

  public static final MobTechGeneric MUTATION_BERSERK_ZOMBIE = new MobTechGeneric("SUPREME_BERSERK_ZOMBIE",
      "Berserk Mutant Zombie", "5c23fd70d0eaff52461f0708c616aa671b495865972297b56689088318f4258e",
      MobTechType.MUTATION_BERSERK);

  public static final MobTechGeneric ROBOTIC_ACCELERATION_ZOMBIE = new MobTechGeneric("SUPREME_ACCELERATION_ZOMBIE",
      "Robotic Zombie Accelerator", "a2f620381658c9d7f9a1d861198277b9e86ba9e0293a5d2d722d8ec926642d99",
      MobTechType.ROBOTIC_ACCELERATION);

  public static final MobTechGeneric MUTATION_INTELLIGENCE_ZOMBIE = new MobTechGeneric("SUPREME_INTELLIGENCE_ZOMBIE",
      "Intelligent Mutant Zombie", "deffe193e441b71d59b8f3db2256355a1203dc478b1d587c4fb3e110b116a653",
      MobTechType.MUTATION_INTELLIGENCE);

  public static final MobTechGeneric ROBOTIC_EFFICIENCY_ZOMBIE = new MobTechGeneric("SUPREME_EFFICIENCY_ZOMBIE",
      "Efficient Robotic Zombie", "c14b277ddbc58c4880d9a57b11eeacab9da856e9e28bf61593ede7ce539184d",
      MobTechType.ROBOTIC_EFFICIENCY);

  public static final MobTechGeneric MUTATION_LUCK_ZOMBIE = new MobTechGeneric("SUPREME_LUCK_ZOMBIE", "Lucky Mutant Zombie",
      "f644c8f36e21d5ea95624928e3f35a2b4949ce75b2fa68ccd2bc84d9ada0cb7", MobTechType.MUTATION_LUCK);

  public static final MobTechGeneric ROBOTIC_CLONING_ZOMBIE = new MobTechGeneric("SUPREME_CLONING_ZOMBIE",
      "Cloner Robotic Zombie", "6f35ac5534b1bf1ab96be198e6aceac1a36112d86863d0a637f865839d2bb4a6",
      MobTechType.ROBOTIC_CLONING);


  public static void setup(Supreme plugin) {

    MobTech.preSetup(plugin, ZombieTech.SIMPLE_ZOMBIE);

    MobTech.preSetup(plugin, ZombieTech.ROBOTIC_EFFICIENCY_ZOMBIE);
    MobTech.preSetup(plugin, ZombieTech.ROBOTIC_CLONING_ZOMBIE);
    MobTech.preSetup(plugin, ZombieTech.ROBOTIC_ACCELERATION_ZOMBIE);

    MobTech.preSetup(plugin, ZombieTech.MUTATION_INTELLIGENCE_ZOMBIE);
    MobTech.preSetup(plugin, ZombieTech.MUTATION_LUCK_ZOMBIE);
    MobTech.preSetup(plugin, ZombieTech.MUTATION_BERSERK_ZOMBIE);

  }


}