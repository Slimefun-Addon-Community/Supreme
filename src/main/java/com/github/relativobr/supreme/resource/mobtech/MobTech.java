package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.tools.MobCollectorTools;
import com.github.relativobr.supreme.machine.tech.TechMutation;
import com.github.relativobr.supreme.machine.tech.TechRobotic;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemUtil;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import javax.annotation.Nonnull;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MobTech extends SlimefunItem implements Radioactive, NotPlaceable {

  @Setter
  @Getter
  private Integer mobTechTier;

  @Setter
  @Getter
  private MobTechType mobTechType;

  public MobTech(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
  }

  public static void preSetup(Supreme plugin, MobTechGeneric item) {
    if (MobTechType.SIMPLE == item.getMobTechType()) {
      MobTech mobTech = new MobTech(ItemGroups.COMPONENTS_CATEGORY,
          ItemUtil.buildItemFromMobTechDTO(item, 0),
          RecipeType.NULL,
          new ItemStack[]{MobCollectorTools.MOB_COLLECTOR_I});
      mobTech.setMobTechType(item.getMobTechType());
      mobTech.setMobTechTier(0);
      mobTech.register(plugin);
    } else {

      if (MobTechType.ROBOTIC_ACCELERATION == item.getMobTechType()
          || MobTechType.ROBOTIC_CLONING == item.getMobTechType()
          || MobTechType.ROBOTIC_EFFICIENCY == item.getMobTechType()) {
        buildRobotic(plugin, item);
      }

      if (MobTechType.MUTATION_BERSERK == item.getMobTechType()
          || MobTechType.MUTATION_INTELLIGENCE == item.getMobTechType()
          || MobTechType.MUTATION_LUCK == item.getMobTechType()) {
        buildMutation(plugin, item);
      }
    }
  }

  private static void buildRobotic(Supreme plugin, MobTechGeneric item) {

    MobTech mobTech = new MobTech(ItemGroups.TECHMOB_CATEGORY,
        ItemUtil.buildItemFromMobTechDTO(item, 1),
        RecipeType.ENHANCED_CRAFTING_TABLE,
        getRoboticStartRecipe(item));
    mobTech.setMobTechType(item.getMobTechType());
    mobTech.setMobTechTier(1);
    mobTech.register(plugin);

    // upgrade tier
    for (int i = 2; i <= 9; i++) {
      TechRobotic.addRecipe(ItemUtil.buildItemFromMobTechDTO(item, (i - 1)),
          ItemUtil.buildItemFromMobTechDTO(item, i));
      mobTech = new MobTech(ItemGroups.TECHMOB_CATEGORY,
          ItemUtil.buildItemFromMobTechDTO(item, i),
          RecipeType.NULL,
          new ItemStack[]{TechRobotic.TECH_ROBOTIC});
      mobTech.setMobTechType(item.getMobTechType());
      mobTech.setMobTechTier(i);
      mobTech.register(plugin);
    }
  }

  private static ItemStack[] getRoboticStartRecipe(MobTechGeneric mobTech) {
    MobTechType mobTechType = mobTech.getMobTechType();
    ItemStack itemStack = getItemStackMobTechSimpleRobotic(mobTech);
    if (itemStack == null) {
      return null;
    }

    if (MobTechType.ROBOTIC_ACCELERATION == mobTechType) {
      return new ItemStack[]{SlimefunItems.PLASTIC_SHEET, SlimefunItems.FIRE_RUNE,
          SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.ANDROID_MEMORY_CORE,
          SlimefunItems.PLASTIC_SHEET,
          SupremeComponents.SYNTHETIC_RUBY, itemStack, SupremeComponents.SYNTHETIC_RUBY};
    }
    if (MobTechType.ROBOTIC_CLONING == mobTechType) {
      return new ItemStack[]{SlimefunItems.PLASTIC_SHEET, SlimefunItems.RAINBOW_RUNE,
          SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.ANDROID_MEMORY_CORE,
          SlimefunItems.PLASTIC_SHEET,
          SupremeComponents.SYNTHETIC_RUBY, itemStack, SupremeComponents.SYNTHETIC_RUBY};
    }
    if (MobTechType.ROBOTIC_EFFICIENCY == mobTechType) {
      return new ItemStack[]{SlimefunItems.PLASTIC_SHEET, SlimefunItems.LIGHTNING_RUNE,
          SlimefunItems.PLASTIC_SHEET,
          SlimefunItems.PLASTIC_SHEET, SlimefunItems.ANDROID_MEMORY_CORE,
          SlimefunItems.PLASTIC_SHEET,
          SupremeComponents.SYNTHETIC_RUBY, itemStack, SupremeComponents.SYNTHETIC_RUBY};
    }
    return null;
  }

  private static ItemStack getItemStackMobTechSimpleRobotic(MobTechGeneric mobTech) {
    ItemStack itemStack = null;
    if (mobTech.getId().contains("_BEE")) {
      itemStack = new ItemStack(Material.HONEYCOMB);
    } else if (mobTech.getId().contains("_GOLEM")) {
      itemStack = new ItemStack(Material.POPPY);
    } else if (mobTech.getId().contains("_ZOMBIE")) {
      itemStack = new ItemStack(Material.ROTTEN_FLESH);
    }
    return itemStack;
  }

  private static SlimefunItemStack getItemStackMobTechSimpleMutation(MobTechGeneric mobTech) {
    SlimefunItemStack itemStack = null;
    if (mobTech.getId().contains("_BEE")) {
      itemStack = ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0);
    } else if (mobTech.getId().contains("_GOLEM")) {
      itemStack = ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0);
    } else if (mobTech.getId().contains("_ZOMBIE")) {
      itemStack = ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0);
    }
    return itemStack;
  }

  private static void buildMutation(Supreme plugin, MobTechGeneric item) {

    MobTech mobTech = new MobTech(ItemGroups.TECHMOB_CATEGORY,
        ItemUtil.buildItemFromMobTechDTO(item, 1),
        RecipeType.NULL,
        new ItemStack[]{TechMutation.TECH_MUTATION_I});
    mobTech.setMobTechType(item.getMobTechType());
    mobTech.setMobTechTier(1);
    mobTech.register(plugin);

    SlimefunItemStack simpleInput = getItemStackMobTechSimpleMutation(item);
    if (simpleInput == null) {
      return;
    }

    final SlimefunItemStack geneMutation = getMutationStartRecipe(item.getMobTechType());
    if (geneMutation != null) {
      TechMutation.addRecipeTechMutation(simpleInput, geneMutation,
          (MobTechType.MUTATION_BERSERK == item.getMobTechType()) ? 25 : 20,
          ItemUtil.buildItemFromMobTechDTO(item, 1));
    }

    for (int i = 2; i <= 9; i++) {
      final SlimefunItemStack inputTier = ItemUtil.buildItemFromMobTechDTO(item, (i - 1));
      final SlimefunItemStack itemStack = ItemUtil.buildItemFromMobTechDTO(item, i);
      TechMutation.addRecipeTechMutation(inputTier, inputTier,
          (MobTechType.MUTATION_BERSERK == item.getMobTechType()) ? 25 : 20, itemStack);
      mobTech = new MobTech(ItemGroups.TECHMOB_CATEGORY, itemStack, RecipeType.NULL,
          new ItemStack[]{TechMutation.TECH_MUTATION_I});
      mobTech.setMobTechType(item.getMobTechType());
      mobTech.setMobTechTier(i);
      mobTech.register(plugin);
    }

  }

  private static SlimefunItemStack getMutationStartRecipe(MobTechType mobTechType) {
    if (MobTechType.MUTATION_BERSERK == mobTechType) {
      return SupremeComponents.GENE_BERSERK;
    } else if (MobTechType.MUTATION_INTELLIGENCE == mobTechType) {
      return SupremeComponents.GENE_INTELLIGENCE;
    } else if (MobTechType.MUTATION_LUCK == mobTechType) {
      return SupremeComponents.GENE_LUCK;
    }
    return null;
  }

  @Nonnull
  @Override
  public Radioactivity getRadioactivity() {
    Radioactivity radioactivity;
    switch (this.mobTechType) {
      case MUTATION_INTELLIGENCE:
      case MUTATION_BERSERK:
      case MUTATION_LUCK:
        radioactivity = Radioactivity.VERY_DEADLY;
        break;
      case ROBOTIC_CLONING:
      case ROBOTIC_ACCELERATION:
      case ROBOTIC_EFFICIENCY:
        radioactivity = Radioactivity.HIGH;
        break;
      case SIMPLE:
      default:
        radioactivity = Radioactivity.LOW;
    }
    return radioactivity;
  }

}
