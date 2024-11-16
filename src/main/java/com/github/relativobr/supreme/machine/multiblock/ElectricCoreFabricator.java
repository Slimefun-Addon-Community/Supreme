package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.generic.recipe.CustomCoreRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ElectricCoreFabricator extends GenericMachine {

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE = new SupremeItemStack("SUPREME_ELECTRIC_CORE_I",
      Material.SHROOMLIGHT, "&bElectric Core Machine", "", "&fCraft resource of core", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE,
      SlimefunItems.PROGRAMMABLE_ANDROID_3, SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.CARBONADO_EDGED_CAPACITOR, SlimefunItems.ELECTRIC_MOTOR};

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_II = new SupremeItemStack("SUPREME_ELECTRIC_CORE_II",
      Material.SHROOMLIGHT, "&bElectric Core Machine II", "", "&fAdvanced craft resource of core", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE, SupremeCetrus.CETRUS_LUX, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, ElectricCoreFabricator.ELECTRIC_CORE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, SupremeComponents.BLEND_MACHINE, SupremeCetrus.CETRUS_IGNIS,
      SupremeComponents.BLEND_MACHINE};

  public static final SlimefunItemStack ELECTRIC_CORE_MACHINE_III = new SupremeItemStack("SUPREME_ELECTRIC_CORE_III",
      Material.SHROOMLIGHT, "&bElectric Core Machine III", "", "&fAdvanced craft resource of core", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");

  public static final ItemStack[] RECIPE_ELECTRIC_CORE_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE,
      SupremeCetrus.CETRUS_LUX, SupremeComponents.THORNERITE, SupremeComponents.SUPREME,
      ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II, SupremeComponents.SUPREME,
      SupremeComponents.CRYSTALLIZER_MACHINE, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};

  @ParametersAreNonnullByDefault
  public ElectricCoreFabricator(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_STONE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRANITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_DIORITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ANDESITE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_GRAVEL));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SAND));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_ENDSTONE));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_CLAY));
    list.add(addRecipe(SupremeCoreBlock.RECIPE_RESOURCE_CORE_SNOW));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_RED));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_YELLOW));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PURPLE));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLUE));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_BLACK));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GREEN));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_PINK));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_GRAY));
    list.add(addRecipe(SupremeCoreColor.RECIPE_RESOURCE_CORE_CYAN));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_PORKCHOP));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_BEEF));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_MUTTON));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_CHICKEN));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SALMON));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_COD));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_STRING));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_SPIDER_EYE));
    list.add(addRecipe(SupremeCoreDeath.RECIPE_RESOURCE_CORE_TEAR));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_POTATO));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_APPLE));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_BEETROOT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_WHEAT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SUGAR_CANE));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_SWEET_BERRIES));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_MELON));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_CARROT));
    list.add(addRecipe(SupremeCoreLife.RECIPE_RESOURCE_CORE_PUMPKIN));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_OAK_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_SPRUCE_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_BIRCH_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_JUNGLE_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_ACACIA_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_DARK_OAK_LOG));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_CRIMSON_STEM));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WARPED_STEM));
    list.add(addRecipe(SupremeCoreNature.RECIPE_RESOURCE_CORE_WITHER_ROSE));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_COAL));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_IRON));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_GOLD));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_LAPIS));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_REDSTONE));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_QUARTZ));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_DIAMOND));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_EMERALD));
    list.add(addRecipe(SupremeCoreAlloy.RECIPE_RESOURCE_CORE_NETHERITE));
    return list;
  }

  private static AbstractItemRecipe addRecipe(CustomCoreRecipe customCoreRecipe) {
    final ItemStack itemStack1 = new ItemStack(customCoreRecipe.getMainItem(),
        customCoreRecipe.getMainItem().getMaxStackSize());
    final ItemStack itemStack2 = new ItemStack(customCoreRecipe.getSecondItem(),
        customCoreRecipe.getSecondItem().getMaxStackSize());
    final ItemStack itemStack3 = new ItemStack(customCoreRecipe.getLastItem(),
        customCoreRecipe.getLastItem().getMaxStackSize());
    return new AbstractItemRecipe(
        new ItemStack[]{itemStack1, itemStack1, itemStack1, itemStack2, itemStack2, itemStack2, itemStack3, itemStack3,
            itemStack3}, customCoreRecipe.getMaterial());
  }
}
