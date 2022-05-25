package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.util.RegisterItem.registerEnhancedCraft;
import static com.github.relativobr.supreme.util.RegisterItem.registerMagicalFabricator;
import static com.github.relativobr.supreme.util.RegisterItem.registerNullRecipe;
import static com.github.relativobr.supreme.util.RegisterItem.registerSmeltery;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;

public class SetupSupremeComponents {

  public static void setup(Supreme sup) {

    registerSmeltery(SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.RECIPE_ALLOY_ZIRCONIUM);

    registerSmeltery(SupremeComponents.ALLOY_TITANIUM, SupremeComponents.RECIPE_ALLOY_TITANIUM);

    registerSmeltery(SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.RECIPE_ALLOY_IRIDIUM);

    registerSmeltery(SupremeComponents.ALLOY_AURUM, SupremeComponents.RECIPE_ALLOY_AURUM);

    registerSmeltery(SupremeComponents.ALLOY_MANGANESE, SupremeComponents.RECIPE_ALLOY_MANGANESE);

    registerSmeltery(SupremeComponents.ALLOY_PLATINUM, SupremeComponents.RECIPE_ALLOY_PLATINUM);

    registerSmeltery(SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.RECIPE_ALLOY_ADAMANTIUM);

    registerEnhancedCraft(SupremeComponents.ZIRCONIUM_PLATE, SupremeComponents.RECIPE_ZIRCONIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.TITANIUM_PLATE, SupremeComponents.RECIPE_TITANIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.IRIDIUM_PLATE, SupremeComponents.RECIPE_IRIDIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.AURUM_PLATE, SupremeComponents.RECIPE_AURUM_PLATE);

    registerEnhancedCraft(SupremeComponents.MANGANESE_PLATE, SupremeComponents.RECIPE_MANGANESE_PLATE);

    registerEnhancedCraft(SupremeComponents.PLATINUM_PLATE, SupremeComponents.RECIPE_PLATINUM_PLATE);

    registerEnhancedCraft(SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.RECIPE_ADAMANTIUM_PLATE);

    registerEnhancedCraft(SupremeComponents.SYNTHETIC_AMETHYST, SupremeComponents.RECIPE_SYNTHETIC_AMETHYST);

    registerEnhancedCraft(SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.RECIPE_SYNTHETIC_RUBY);

    registerNullRecipe(SupremeComponents.THORNIUM_BIT, SupremeComponents.RECIPE_THORNIUM_BIT);

    registerEnhancedCraft(SupremeComponents.THORNIUM_DUST, SupremeComponents.RECIPE_THORNIUM_DUST);

    registerEnhancedCraft(SupremeComponents.THORNIUM_INGOT, SupremeComponents.RECIPE_THORNIUM_INGOT);

    registerEnhancedCraft(SupremeComponents.THORNIUM_BIT_SYNTHETIC, SupremeComponents.RECIPE_THORNIUM_BIT_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_DUST_SYNTHETIC, SupremeComponents.RECIPE_THORNIUM_DUST_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_INGOT_SYNTHETIC);

    registerEnhancedCraft(SupremeComponents.THORNIUM_CARBONADO, SupremeComponents.RECIPE_THORNIUM_CARBONADO);

    registerEnhancedCraft(SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.RECIPE_THORNIUM_ENERGIZED);

    registerSmeltery(SupremeComponents.THORNERITE, SupremeComponents.RECIPE_THORNERITE);

    registerNullRecipe(SupremeComponents.SUPREME_NUGGET, SupremeComponents.RECIPE_SUPREME_NUGGET);

    registerMagicalFabricator(SupremeComponents.SUPREME, SupremeComponents.RECIPE_SUPREME);

    registerEnhancedCraft(SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.RECIPE_INDUCTIVE_MACHINE);

    registerEnhancedCraft(SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.RECIPE_INDUCTOR_MACHINE);

    registerEnhancedCraft(SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.RECIPE_RUSTLESS_MACHINE);

    registerEnhancedCraft(SupremeComponents.STAINLESS_MACHINE, SupremeComponents.RECIPE_STAINLESS_MACHINE);

    registerEnhancedCraft(SupremeComponents.CARRIAGE_MACHINE, SupremeComponents.RECIPE_CARRIAGE_MACHINE);

    registerEnhancedCraft(SupremeComponents.CONVEYANCE_MACHINE, SupremeComponents.RECIPE_CONVEYANCE_MACHINE);

    registerEnhancedCraft(SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.RECIPE_PETRIFIER_MACHINE);

    registerEnhancedCraft(SupremeComponents.CRYSTALLIZER_MACHINE, SupremeComponents.RECIPE_CRYSTALLIZER_MACHINE);

    registerMagicalFabricator(SupremeComponents.BLEND_MACHINE, SupremeComponents.RECIPE_BLEND_MACHINE);

    SetupSupremeCore.setup(sup);

    SetupMagicalComponents.setup(sup);

    SetupTechComponents.setup(sup);
  }

}
