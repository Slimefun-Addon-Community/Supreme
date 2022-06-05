package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ArmorBasic {

  public static final SlimefunItemStack ADAMANTIUM_HELMET = new SupremeItemStack("SUPREME_ADAMANTIUM_HELMET",
      Material.DIAMOND_HELMET);
  public static final ItemStack[] RECIPE_ADAMANTIUM_HELMET = {SupremeComponents.ADAMANTIUM_PLATE,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, null,
      SupremeComponents.ADAMANTIUM_PLATE, null, null, null};

  public static final SlimefunItemStack AURUM_HELMET = new SupremeItemStack("SUPREME_AURUM_HELMET",
      Material.DIAMOND_HELMET);
  public static final ItemStack[] RECIPE_AURUM_HELMET = {SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
      SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE, null, null,
      null};

  public static final SlimefunItemStack TITANIUM_HELMET = new SupremeItemStack("SUPREME_TITANIUM_HELMET",
      Material.DIAMOND_HELMET);
  public static final ItemStack[] RECIPE_TITANIUM_HELMET = {SupremeComponents.TITANIUM_PLATE,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, null,
      SupremeComponents.TITANIUM_PLATE, null, null, null};

  public static final SlimefunItemStack ADAMANTIUM_CHESTPLATE = new SupremeItemStack("SUPREME_ADAMANTIUM_CHESTPLATE",
      Material.DIAMOND_CHESTPLATE);
  public static final ItemStack[] RECIPE_ADAMANTIUM_CHESTPLATE = {SupremeComponents.ADAMANTIUM_PLATE, null,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE,
      SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack AURUM_CHESTPLATE = new SupremeItemStack("SUPREME_AURUM_CHESTPLATE",
      Material.DIAMOND_CHESTPLATE);
  public static final ItemStack[] RECIPE_AURUM_CHESTPLATE = {SupremeComponents.AURUM_PLATE, null,
      SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
      SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
      SupremeComponents.AURUM_PLATE};

  public static final SlimefunItemStack TITANIUM_CHESTPLATE = new SupremeItemStack("SUPREME_TITANIUM_CHESTPLATE",
      Material.DIAMOND_CHESTPLATE);
  public static final ItemStack[] RECIPE_TITANIUM_CHESTPLATE = {SupremeComponents.TITANIUM_PLATE, null,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE,
      SupremeComponents.TITANIUM_PLATE};

  public static final SlimefunItemStack ADAMANTIUM_LEGGINGS = new SupremeItemStack("SUPREME_ADAMANTIUM_LEGGINGS",
      Material.DIAMOND_LEGGINGS);
  public static final ItemStack[] RECIPE_ADAMANTIUM_LEGGINGS = {SupremeComponents.ADAMANTIUM_PLATE,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, null,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, null, SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack AURUM_LEGGINGS = new SupremeItemStack("SUPREME_AURUM_LEGGINGS",
      Material.DIAMOND_LEGGINGS);
  public static final ItemStack[] RECIPE_AURUM_LEGGINGS = {SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE,
      SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE,
      SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE};

  public static final SlimefunItemStack TITANIUM_LEGGINGS = new SupremeItemStack("SUPREME_TITANIUM_LEGGINGS",
      Material.DIAMOND_LEGGINGS);
  public static final ItemStack[] RECIPE_TITANIUM_LEGGINGS = {SupremeComponents.TITANIUM_PLATE,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, null,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, null, SupremeComponents.TITANIUM_PLATE};

  public static final SlimefunItemStack ADAMANTIUM_BOOTS = new SupremeItemStack("SUPREME_ADAMANTIUM_BOOTS",
      Material.DIAMOND_BOOTS, "&f&lAdamantium Boots", "&f&lA Boots of Adamantium", "", "&3Supreme Armor");
  public static final ItemStack[] RECIPE_ADAMANTIUM_BOOTS = {null, null, null, SupremeComponents.ADAMANTIUM_PLATE, null,
      SupremeComponents.ADAMANTIUM_PLATE, SupremeComponents.ADAMANTIUM_PLATE, null, SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack AURUM_BOOTS = new SupremeItemStack("SUPREME_AURUM_BOOTS",
      Material.DIAMOND_BOOTS);
  public static final ItemStack[] RECIPE_AURUM_BOOTS = {null, null, null, SupremeComponents.AURUM_PLATE, null,
      SupremeComponents.AURUM_PLATE, SupremeComponents.AURUM_PLATE, null, SupremeComponents.AURUM_PLATE};

  public static final SlimefunItemStack TITANIUM_BOOTS = new SupremeItemStack("SUPREME_TITANIUM_BOOTS",
      Material.DIAMOND_BOOTS);
  public static final ItemStack[] RECIPE_TITANIUM_BOOTS = {null, null, null, SupremeComponents.TITANIUM_PLATE, null,
      SupremeComponents.TITANIUM_PLATE, SupremeComponents.TITANIUM_PLATE, null, SupremeComponents.TITANIUM_PLATE};
}
