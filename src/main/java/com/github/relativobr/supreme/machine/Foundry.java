package com.github.relativobr.supreme.machine;

import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_DIAMOND;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_EMERALD;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_GOLD;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_IRON;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_LAPIS;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_NETHERITE;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_QUARTZ;
import static com.github.relativobr.supreme.resource.core.SupremeCoreAlloy.RESOURCE_CORE_REDSTONE;
import static com.github.relativobr.supreme.resource.core.SupremeCoreBlock.RESOURCE_CORE_GRAVEL;
import static com.github.relativobr.supreme.resource.core.SupremeCoreColor.RESOURCE_CORE_BLACK;
import static com.github.relativobr.supreme.resource.core.SupremeCoreDeath.RESOURCE_CORE_STRING;
import static com.github.relativobr.supreme.resource.core.SupremeCoreLife.RESOURCE_CORE_APPLE;

import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class Foundry extends GenericMachine {

  public static final SlimefunItemStack FOUNDRY_MACHINE = new SupremeItemStack("SUPREME_FOUNDRY_I", Material.GRINDSTONE,
      "&bFoundry", "", "&fFoundry and Synthesizer Items", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE = new ItemStack[]{SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
      SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE,
      SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.PROGRAMMABLE_ANDROID_3, SlimefunItems.ELECTRIC_SMELTERY_2};

  public static final SlimefunItemStack FOUNDRY_MACHINE_II = new SupremeItemStack("SUPREME_FOUNDRY_II",
      Material.GRINDSTONE, "&bFoundry II", "", "&fAdvanced Foundry and Synthesizer Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(5000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_II = new ItemStack[]{SupremeComponents.BLEND_MACHINE,
      SupremeCetrus.CETRUS_AQUA, SupremeComponents.BLEND_MACHINE, SupremeCetrus.CETRUS_VENTUS, Foundry.FOUNDRY_MACHINE,
      SupremeCetrus.CETRUS_LUX, SupremeCore.CORE_OF_ALLOY, SupremeCetrus.CETRUS_IGNIS, SupremeCore.CORE_OF_ALLOY};

  public static final SlimefunItemStack FOUNDRY_MACHINE_III = new SupremeItemStack("SUPREME_FOUNDRY_III",
      Material.GRINDSTONE, "&bFoundry III", "", "&fAdvanced Foundry and Synthesizer Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(15000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_FOUNDRY_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE,
      SupremeAttribute.getFortune(), SupremeComponents.THORNERITE, SupremeComponents.SUPREME,
      Foundry.FOUNDRY_MACHINE_II, SupremeComponents.SUPREME, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};
	
  public static final AbstractItemRecipe RECIPE_BLISTERING_INGOT_3 = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_EMERALD, RESOURCE_CORE_EMERALD, RESOURCE_CORE_EMERALD,
					RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD,
					RESOURCE_CORE_EMERALD, RESOURCE_CORE_EMERALD, RESOURCE_CORE_EMERALD},
      new SlimefunItemStack(SlimefunItems.BLISTERING_INGOT_3, 64));
	public static final AbstractItemRecipe RECIPE_REDSTONE_ALLOY = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_REDSTONE, RESOURCE_CORE_REDSTONE, RESOURCE_CORE_REDSTONE,
					RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND,
					RESOURCE_CORE_REDSTONE, RESOURCE_CORE_REDSTONE, RESOURCE_CORE_REDSTONE},
			new SlimefunItemStack(SlimefunItems.REDSTONE_ALLOY, 64));
	public static final AbstractItemRecipe RECIPE_HARDENED_METAL_INGOT = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_LAPIS, RESOURCE_CORE_LAPIS, RESOURCE_CORE_LAPIS,
					RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND,
					RESOURCE_CORE_LAPIS, RESOURCE_CORE_LAPIS, RESOURCE_CORE_LAPIS},
			new SlimefunItemStack(SlimefunItems.HARDENED_METAL_INGOT, 64));
	public static final AbstractItemRecipe RECIPE_REINFORCED_ALLOY_INGOT = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_NETHERITE, RESOURCE_CORE_NETHERITE, RESOURCE_CORE_NETHERITE,
					RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND, RESOURCE_CORE_DIAMOND,
					RESOURCE_CORE_NETHERITE, RESOURCE_CORE_NETHERITE, RESOURCE_CORE_NETHERITE},
			new SlimefunItemStack(SlimefunItems.REINFORCED_ALLOY_INGOT, 64));
	public static final AbstractItemRecipe RECIPE_ENCHANTED_GOLDEN_APPLE = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD,
					RESOURCE_CORE_APPLE, RESOURCE_CORE_APPLE, RESOURCE_CORE_APPLE,
					RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD, RESOURCE_CORE_GOLD},
			new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 64));
	public static final AbstractItemRecipe RECIPE_SOLAR_PANEL = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_QUARTZ, RESOURCE_CORE_QUARTZ, RESOURCE_CORE_QUARTZ,
					RESOURCE_CORE_STRING, RESOURCE_CORE_STRING, RESOURCE_CORE_STRING,
					RESOURCE_CORE_QUARTZ, RESOURCE_CORE_QUARTZ, RESOURCE_CORE_QUARTZ},
			new SlimefunItemStack(SlimefunItems.SOLAR_PANEL, 64));
	public static final AbstractItemRecipe RECIPE_OIL_BUCKET = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_BLACK, RESOURCE_CORE_BLACK, RESOURCE_CORE_BLACK,
					RESOURCE_CORE_IRON, RESOURCE_CORE_IRON, RESOURCE_CORE_IRON,
					RESOURCE_CORE_BLACK, RESOURCE_CORE_BLACK, RESOURCE_CORE_BLACK},
			new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 64));
	public static final AbstractItemRecipe RECIPE_PLASTIC_SHEET = new AbstractItemRecipe(
			new ItemStack[]{RESOURCE_CORE_STRING, RESOURCE_CORE_STRING, RESOURCE_CORE_STRING,
					RESOURCE_CORE_GRAVEL, RESOURCE_CORE_GRAVEL, RESOURCE_CORE_GRAVEL,
					RESOURCE_CORE_STRING, RESOURCE_CORE_STRING, RESOURCE_CORE_STRING},
			new SlimefunItemStack(SlimefunItems.PLASTIC_SHEET, 64));
	
  public Foundry(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_BLISTERING_INGOT_3);
    list.add(RECIPE_REDSTONE_ALLOY);
    list.add(RECIPE_HARDENED_METAL_INGOT);
    list.add(RECIPE_REINFORCED_ALLOY_INGOT);
    list.add(RECIPE_ENCHANTED_GOLDEN_APPLE);
    list.add(RECIPE_SOLAR_PANEL);
    list.add(RECIPE_OIL_BUCKET);
    list.add(RECIPE_PLASTIC_SHEET);
    return list;
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    List<ItemStack> displayRecipes = new ArrayList();
    machineRecipes
        .stream().filter(Objects::nonNull)
        .forEach(recipe -> {
      ItemStack itemStack1 = new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " ");
      ItemStack itemStack2 = new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " ");
      if (recipe.getItemInput(0) != null) {
        itemStack1 = recipe.getItemInput(0).clone();
        itemStack1.setAmount(6);
      }
      if (recipe.getItemInput(3) != null) {
        itemStack2 = recipe.getItemInput(3).clone();
        itemStack2.setAmount(3);
      }
      displayRecipes.add(itemStack1);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(itemStack2);
      displayRecipes.add(recipe.getFirstItemOutput());
      displayRecipes.add(new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
      displayRecipes.add(new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "));
    });
    return displayRecipes;
  }

}
