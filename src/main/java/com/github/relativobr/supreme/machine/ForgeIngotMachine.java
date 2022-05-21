package com.github.relativobr.supreme.machine;

import com.github.relativobr.machine.SimpleItemContainerMachine;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.recipe.SimpleItemRecipe;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ForgeIngotMachine extends SimpleItemContainerMachine {

  public static final SlimefunItemStack FORGE_INGOT_MACHINE = new SlimefunItemStack(
      "SUPREME_FORGE_INGOT_I", Material.BLAST_FURNACE,
      "&bForge Ingot", "", "&fThis machine allows you to", "&fforge ingot resources.",
      "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20),
      "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE = new ItemStack[]{
      SupremeComponents.RUSTLESS_MACHINE, new ItemStack(Material.BLAST_FURNACE), SupremeComponents.RUSTLESS_MACHINE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.PETRIFIER_MACHINE, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.CARBON_PRESS_3};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_II = new SlimefunItemStack(
      "SUPREME_FORGE_INGOT_II", Material.BLAST_FURNACE,
      "&bForge Ingot II", "", "&fThis machine allows you to", "&fforge ingot resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100),
      "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE, SupremeCetrus.CETRUS_IGNIS, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, ForgeIngotMachine.FORGE_INGOT_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.THORNERITE, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.THORNERITE};

  public static final SlimefunItemStack FORGE_INGOT_MACHINE_III = new SlimefunItemStack(
      "SUPREME_FORGE_INGOT_III", Material.BLAST_FURNACE,
      "&bForge Ingot III", "", "&fThis machine allows you to", "&fforge ingot resources.",
      "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300),
      "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_FORGE_INGOT_MACHINE_III = new ItemStack[]{
      SupremeComponents.THORNERITE, SupremeCetrus.CETRUS_LUX, SupremeComponents.THORNERITE,
      SupremeComponents.SUPREME, ForgeIngotMachine.FORGE_INGOT_MACHINE_II, SupremeComponents.SUPREME,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_LEAD = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.LEAD_DUST, 32),
      new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_ALUMINUM = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ALUMINUM_DUST, 32),
      new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_SILVER = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILVER_DUST, 32),
      new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_COPPER = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.COPPER_DUST, 32),
      new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_MAGNESIUM = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_DUST, 32),
      new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_IRON = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.IRON_DUST, 32), new ItemStack(Material.IRON_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_TIN = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.TIN_DUST, 32),
      new SlimefunItemStack(SlimefunItems.TIN_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_ZINC = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.ZINC_DUST, 32),
      new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_4K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_DUST, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_4K, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_6K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_4K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_6K, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_8K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_6K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_8K, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_10K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_8K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_10K, 30));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_12K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_10K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_12K, 28));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_14K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_12K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_14K, 26));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_16K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_14K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_16K, 24));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_18K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_16K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_18K, 22));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_20K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_18K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_20K, 20));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_22K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_20K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_22K, 18));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_GOLD_24K = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.GOLD_22K, 32),
      new SlimefunItemStack(SlimefunItems.GOLD_24K, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_COBALT_INGOT = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.NICKEL_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.COBALT_INGOT, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.STEEL_INGOT, 32),
      new SlimefunItemStack(SlimefunItems.DAMASCUS_STEEL_INGOT, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_SILICON = new SimpleItemRecipe(
      new ItemStack(Material.QUARTZ_BLOCK, 32), new SlimefunItemStack(SlimefunItems.SILICON, 32));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_FERROSILICON = new SimpleItemRecipe(
      new SlimefunItemStack(SlimefunItems.SILICON, 32),
      new SlimefunItemStack(SlimefunItems.FERROSILICON, 16));
  public static final SimpleItemRecipe RECIPE_FORGE_INGOT_SULFATE = new SimpleItemRecipe(
      new ItemStack(Material.NETHERRACK, 64), new SlimefunItemStack(SlimefunItems.SULFATE, 8));

  public ForgeIngotMachine(ItemGroup category, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<SimpleItemRecipe> getAllRecipe() {
    List<SimpleItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_FORGE_INGOT_LEAD);
    list.add(RECIPE_FORGE_INGOT_ALUMINUM);
    list.add(RECIPE_FORGE_INGOT_SILVER);
    list.add(RECIPE_FORGE_INGOT_COPPER);
    list.add(RECIPE_FORGE_INGOT_MAGNESIUM);
    list.add(RECIPE_FORGE_INGOT_IRON);
    list.add(RECIPE_FORGE_INGOT_TIN);
    list.add(RECIPE_FORGE_INGOT_ZINC);
    list.add(RECIPE_FORGE_INGOT_GOLD_4K);
    list.add(RECIPE_FORGE_INGOT_GOLD_6K);
    list.add(RECIPE_FORGE_INGOT_GOLD_8K);
    list.add(RECIPE_FORGE_INGOT_GOLD_10K);
    list.add(RECIPE_FORGE_INGOT_GOLD_12K);
    list.add(RECIPE_FORGE_INGOT_GOLD_14K);
    list.add(RECIPE_FORGE_INGOT_GOLD_16K);
    list.add(RECIPE_FORGE_INGOT_GOLD_18K);
    list.add(RECIPE_FORGE_INGOT_GOLD_20K);
    list.add(RECIPE_FORGE_INGOT_GOLD_22K);
    list.add(RECIPE_FORGE_INGOT_GOLD_24K);
    list.add(RECIPE_FORGE_INGOT_COBALT_INGOT);
    list.add(RECIPE_FORGE_INGOT_DAMASCUS_STEEL_INGOT);
    list.add(RECIPE_FORGE_INGOT_SILICON);
    list.add(RECIPE_FORGE_INGOT_FERROSILICON);
    list.add(RECIPE_FORGE_INGOT_SULFATE);
    return list;
  }

}
