package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class WeaponsBasic {

  public static final SlimefunItemStack ADAMANTIUM_SWORD = new SupremeItemStack("SUPREME_ADAMANTIUM_SWORD",
      Material.DIAMOND_SWORD);
  public static final ItemStack[] RECIPE_ADAMANTIUM_SWORD = {null, SupremeComponents.ADAMANTIUM_PLATE, null, null,
      SupremeComponents.ADAMANTIUM_PLATE, null, null, new ItemStack(Material.STICK), null};

  public static final SlimefunItemStack AURUM_SWORD = new SupremeItemStack("SUPREME_AURUM_SWORD",
      Material.DIAMOND_SWORD);
  public static final ItemStack[] RECIPE_AURUM_SWORD = {null, SupremeComponents.AURUM_PLATE, null, null,
      SupremeComponents.AURUM_PLATE, null, null, new ItemStack(Material.STICK), null};

  public static final SlimefunItemStack TITANIUM_SWORD = new SupremeItemStack("SUPREME_TITANIUM_SWORD",
      Material.DIAMOND_SWORD);
  public static final ItemStack[] RECIPE_TITANIUM_SWORD = {null, SupremeComponents.TITANIUM_PLATE, null, null,
      SupremeComponents.TITANIUM_PLATE, null, null, new ItemStack(Material.STICK), null};
}
