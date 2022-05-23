package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.mobtech.TechMutation;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockMagicalFabricator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.AdvancedCard;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.SimpleCard;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.util.ItemNotPlaceable;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class SetupSupremeComponents {

  public static void setup(Supreme sup) {

    registerSmeltery(sup, SupremeComponents.ALLOY_ZIRCONIUM, SupremeComponents.RECIPE_ALLOY_ZIRCONIUM);

    registerSmeltery(sup, SupremeComponents.ALLOY_TITANIUM, SupremeComponents.RECIPE_ALLOY_TITANIUM);

    registerSmeltery(sup, SupremeComponents.ALLOY_IRIDIUM, SupremeComponents.RECIPE_ALLOY_IRIDIUM);

    registerSmeltery(sup, SupremeComponents.ALLOY_AURUM, SupremeComponents.RECIPE_ALLOY_AURUM);

    registerSmeltery(sup, SupremeComponents.ALLOY_MANGANESE, SupremeComponents.RECIPE_ALLOY_MANGANESE);

    registerSmeltery(sup, SupremeComponents.ALLOY_PLATINUM, SupremeComponents.RECIPE_ALLOY_PLATINUM);

    registerSmeltery(sup, SupremeComponents.ALLOY_ADAMANTIUM, SupremeComponents.RECIPE_ALLOY_ADAMANTIUM);

    registerEnhancedCraft(sup, SupremeComponents.ZIRCONIUM_PLATE, SupremeComponents.RECIPE_ZIRCONIUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.TITANIUM_PLATE, SupremeComponents.RECIPE_TITANIUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.IRIDIUM_PLATE, SupremeComponents.RECIPE_IRIDIUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.AURUM_PLATE, SupremeComponents.RECIPE_AURUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.MANGANESE_PLATE, SupremeComponents.RECIPE_MANGANESE_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.PLATINUM_PLATE, SupremeComponents.RECIPE_PLATINUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.RECIPE_ADAMANTIUM_PLATE);

    registerEnhancedCraft(sup, SupremeComponents.SYNTHETIC_AMETHYST, SupremeComponents.RECIPE_SYNTHETIC_AMETHYST);

    registerEnhancedCraft(sup, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.RECIPE_SYNTHETIC_RUBY);

    registerNullRecipe(sup, SupremeComponents.THORNIUM_BIT, SupremeComponents.RECIPE_THORNIUM_BIT);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_DUST, SupremeComponents.RECIPE_THORNIUM_DUST);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_INGOT, SupremeComponents.RECIPE_THORNIUM_INGOT);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_BIT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_BIT_SYNTHETIC);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_DUST_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_DUST_SYNTHETIC);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.RECIPE_THORNIUM_INGOT_SYNTHETIC);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_CARBONADO, SupremeComponents.RECIPE_THORNIUM_CARBONADO);

    registerEnhancedCraft(sup, SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.RECIPE_THORNIUM_ENERGIZED);

    registerSmeltery(sup, SupremeComponents.THORNERITE, SupremeComponents.RECIPE_THORNERITE);

    registerNullRecipe(sup, SupremeComponents.SUPREME_NUGGET, SupremeComponents.RECIPE_SUPREME_NUGGET);

    registerMagicalFabricator(sup, SupremeComponents.SUPREME, SupremeComponents.RECIPE_SUPREME);

    registerEnhancedCraft(sup, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.RECIPE_INDUCTIVE_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.RECIPE_INDUCTOR_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.RECIPE_RUSTLESS_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.STAINLESS_MACHINE, SupremeComponents.RECIPE_STAINLESS_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.CARRIAGE_MACHINE, SupremeComponents.RECIPE_CARRIAGE_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.CONVEYANCE_MACHINE, SupremeComponents.RECIPE_CONVEYANCE_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.RECIPE_PETRIFIER_MACHINE);

    registerEnhancedCraft(sup, SupremeComponents.CRYSTALLIZER_MACHINE, SupremeComponents.RECIPE_CRYSTALLIZER_MACHINE);

    registerMagicalFabricator(sup, SupremeComponents.BLEND_MACHINE, SupremeComponents.RECIPE_BLEND_MACHINE);

    SetupMagical.setup(sup);

    if (Supreme.checkEnableMobtech()) {

      registerEnhancedCraft(sup, SupremeComponents.CENTER_CARD_SIMPLE, SupremeComponents.RECIPE_CENTER_CARD_SIMPLE);
      registerEnhancedCraft(sup, SupremeComponents.CENTER_CARD_ADVANCED, SupremeComponents.RECIPE_CENTER_CARD_ADVANCED);
      registerEnhancedCraft(sup, SupremeComponents.CENTER_CARD_ULTIMATE, SupremeComponents.RECIPE_CENTER_CARD_ULTIMATE);

      registerGrindStone(sup, SupremeComponents.DUST_NETHERITE, SupremeComponents.RECIPE_DUST_NETHERITE);
      registerGrindStone(sup, SupremeComponents.DUST_GLOW_INK, SupremeComponents.RECIPE_DUST_GLOW_INK);
      registerGrindStone(sup, SupremeComponents.DUST_AMETHYST, SupremeComponents.RECIPE_DUST_AMETHYST);

      addRecipeTechMutation(SupremeComponents.DUST_NETHERITE, SlimefunItems.FIRE_RUNE, SupremeComponents.GENE_BERSERK);
      addRecipeTechMutation(SupremeComponents.DUST_GLOW_INK, SlimefunItems.LIGHTNING_RUNE, SupremeComponents.GENE_LUCK);
      addRecipeTechMutation(SupremeComponents.DUST_AMETHYST, SlimefunItems.RAINBOW_RUNE,
          SupremeComponents.GENE_INTELLIGENCE);

      registerTechMutation(sup, SupremeComponents.GENE_BERSERK);
      registerTechMutation(sup, SupremeComponents.GENE_LUCK);
      registerTechMutation(sup, SupremeComponents.GENE_INTELLIGENCE);
      registerEnhancedCraft(sup, SupremeComponents.GENE_CORE, SupremeComponents.RECIPE_GENE_CORE);

      addRecipeTechMutation(SlimefunItems.URANIUM, SlimefunItems.URANIUM, SlimefunItems.NEPTUNIUM);
      addRecipeTechMutation(SlimefunItems.NEPTUNIUM, SlimefunItems.NEPTUNIUM, SlimefunItems.PLUTONIUM);
      addRecipeTechMutation(SlimefunItems.PLUTONIUM, SlimefunItems.URANIUM, SlimefunItems.BOOSTED_URANIUM);

      registerEnhancedCraft(sup, SupremeComponents.EMPTY_MOBTECH, SupremeComponents.RECIPE_EMPTY_MOBTECH);

      BeeTech.setup(sup);
      IronGolemTech.setup(sup);

      SimpleCard.setup(sup);
      AdvancedCard.setup(sup);
    }
  }

  @ParametersAreNonnullByDefault
  private static void registerSmeltery(Supreme sup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.SMELTERY, recipe).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void registerEnhancedCraft(Supreme sup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.ENHANCED_CRAFTING_TABLE,
        recipe).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void registerMagicalFabricator(Supreme sup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(ItemGroups.COMPONENTS_CATEGORY, itemStack, MultiBlockMagicalFabricator.getMachine(),
        recipe).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void registerNullRecipe(Supreme sup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new ItemNotPlaceable(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.NULL, recipe).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void registerGrindStone(Supreme sup, SlimefunItemStack itemStack, ItemStack[] recipe) {
    new SlimefunItem(ItemGroups.COMPONENTS_CATEGORY, itemStack, RecipeType.GRIND_STONE, recipe,
        new SlimefunItemStack(itemStack, 4)).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void registerTechMutation(Supreme sup, SlimefunItemStack output) {
    new ItemNotPlaceable(ItemGroups.COMPONENTS_CATEGORY, output, RecipeType.NULL,
        new ItemStack[]{TechMutation.TECH_MUTATION}).register(sup);
  }

  @ParametersAreNonnullByDefault
  private static void addRecipeTechMutation(SlimefunItemStack itemStack1, SlimefunItemStack itemStack2,
      SlimefunItemStack output) {
    TechMutation.addRecipe(itemStack1, itemStack2, 100, output);
  }
}
