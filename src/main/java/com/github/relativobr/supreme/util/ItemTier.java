package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.resource.SupremeComponents.SUPREME;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_BIT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_CARBONADO;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_DUST_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_ENERGIZED;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_INGOT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_IGNIS;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUMIUM;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUX;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_VENTUS;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_BIT_SYNTHETIC, preItem, THORNIUM_BIT_SYNTHETIC,
        THORNIUM_BIT_SYNTHETIC, CETRUS_IGNIS, THORNIUM_BIT_SYNTHETIC,
				THORNIUM_BIT_SYNTHETIC, preItem, THORNIUM_BIT_SYNTHETIC};
  }

  public static ItemStack[] getRareRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_DUST_SYNTHETIC, preItem, THORNIUM_DUST_SYNTHETIC,
				THORNIUM_DUST_SYNTHETIC, CETRUS_VENTUS, THORNIUM_DUST_SYNTHETIC,
        THORNIUM_DUST_SYNTHETIC, preItem, THORNIUM_DUST_SYNTHETIC};
  }

  public static ItemStack[] getEpicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_INGOT_SYNTHETIC, preItem, THORNIUM_INGOT_SYNTHETIC,
				THORNIUM_INGOT_SYNTHETIC, CETRUS_LUX, THORNIUM_INGOT_SYNTHETIC,
        THORNIUM_INGOT_SYNTHETIC, preItem, THORNIUM_INGOT_SYNTHETIC};
  }

  public static ItemStack[] getLegendaryRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_CARBONADO, preItem, THORNIUM_CARBONADO,
        THORNIUM_CARBONADO, CETRUS_LUMIUM, THORNIUM_CARBONADO,
				THORNIUM_CARBONADO, preItem, THORNIUM_CARBONADO};
  }

  public static ItemStack[] getSupremeRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_ENERGIZED, preItem, THORNIUM_ENERGIZED,
        THORNIUM_ENERGIZED, SUPREME, THORNIUM_ENERGIZED,
        THORNIUM_ENERGIZED, preItem, THORNIUM_ENERGIZED};
  }

}