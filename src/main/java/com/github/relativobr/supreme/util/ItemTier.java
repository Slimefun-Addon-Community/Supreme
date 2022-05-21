package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagic(SlimefunItemStack preItem) {
    return new ItemStack[]{
        SupremeComponents.THORNIUM_BIT_SYNTHETIC, preItem, SupremeComponents.THORNIUM_BIT_SYNTHETIC,
        SupremeComponents.THORNIUM_BIT_SYNTHETIC, new ItemStack(SupremeCetrus.CETRUS_IGNIS),
        SupremeComponents.THORNIUM_BIT_SYNTHETIC,
        SupremeComponents.THORNIUM_BIT_SYNTHETIC, preItem, SupremeComponents.THORNIUM_BIT_SYNTHETIC
    };
  }

  public static ItemStack[] getRare(SlimefunItemStack preItem) {
    return new ItemStack[]{
        SupremeComponents.THORNIUM_DUST_SYNTHETIC, preItem, SupremeComponents.THORNIUM_DUST_SYNTHETIC,
        SupremeComponents.THORNIUM_DUST_SYNTHETIC, new ItemStack(SupremeCetrus.CETRUS_VENTUS),
        SupremeComponents.THORNIUM_DUST_SYNTHETIC,
        SupremeComponents.THORNIUM_DUST_SYNTHETIC, preItem, SupremeComponents.THORNIUM_DUST_SYNTHETIC
    };
  }

  public static ItemStack[] getEpic(SlimefunItemStack preItem) {
    return new ItemStack[]{
        SupremeComponents.THORNIUM_INGOT_SYNTHETIC, preItem, SupremeComponents.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.THORNIUM_INGOT_SYNTHETIC, new ItemStack(SupremeCetrus.CETRUS_LUX),
        SupremeComponents.THORNIUM_INGOT_SYNTHETIC,
        SupremeComponents.THORNIUM_INGOT_SYNTHETIC, preItem, SupremeComponents.THORNIUM_INGOT_SYNTHETIC
    };
  }

  public static ItemStack[] getLegendary(SlimefunItemStack preItem) {
    return new ItemStack[]{
        SupremeComponents.THORNIUM_CARBONADO, preItem, SupremeComponents.THORNIUM_CARBONADO,
        SupremeComponents.THORNIUM_CARBONADO, new ItemStack(SupremeCetrus.CETRUS_LUMIUM),
        SupremeComponents.THORNIUM_CARBONADO,
        SupremeComponents.THORNIUM_CARBONADO, preItem, SupremeComponents.THORNIUM_CARBONADO
    };
  }

  public static ItemStack[] getSupreme(SlimefunItemStack preItem) {
    return new ItemStack[]{
        SupremeComponents.THORNIUM_ENERGIZED, preItem, SupremeComponents.THORNIUM_ENERGIZED,
        SupremeComponents.THORNIUM_ENERGIZED, SupremeComponents.SUPREME, SupremeComponents.THORNIUM_ENERGIZED,
        SupremeComponents.THORNIUM_ENERGIZED, preItem, SupremeComponents.THORNIUM_ENERGIZED
    };
  }

}
