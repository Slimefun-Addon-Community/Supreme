package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class ItemGroups {

  public static NestedItemGroup MULTI_CATEGORY = new NestedItemGroup(new NamespacedKey(Supreme.inst(), "MAIN"),
      new CustomItemStack(
          new SlimefunItemStack("MAIN_ITEM", "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d",
              "Main item"), "&4Supreme Expansion"));

  public static ItemGroup RESOURCE_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "RESOURCE"),
      MULTI_CATEGORY, new CustomItemStack(Material.GOLDEN_APPLE, "&4Resource"));

  public static ItemGroup COMPONENTS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "COMPONENTS"),
      MULTI_CATEGORY, new CustomItemStack(Material.NETHERITE_INGOT, "&4Components"));

  public static ItemGroup MAGICAL_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "MAGICAL"),
      MULTI_CATEGORY, new CustomItemStack(Material.BREWING_STAND, "&4Magical and Core Components"));

  public static ItemGroup CARDS_RESOURCE_CATEGORY = new SubItemGroup(
      new NamespacedKey(Supreme.inst(), "CARDS_RESOURCE_CATEGORY"), MULTI_CATEGORY,
      new CustomItemStack(Material.MUSIC_DISC_PIGSTEP, "&4Cards Components"));

  public static ItemGroup TECHMOB_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "TECHMOB_CATEGORY"),
      MULTI_CATEGORY, new CustomItemStack(Material.HONEYCOMB, "&4TechMob"));

  public static ItemGroup MACHINES_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "MACHINES"),
      MULTI_CATEGORY, new CustomItemStack(Material.OBSERVER, "&4Machines"));

  public static ItemGroup ELECTRIC_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "ELECTRIC"),
      MULTI_CATEGORY, new CustomItemStack(
      new SlimefunItemStack("ELECTRIC_ITEM", "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422",
          "Eletric Item"), "&4Electric"));

  public static ItemGroup TOOLS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "TOOLS"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_PICKAXE, "&4Supreme Tools"));

  public static ItemGroup ARMOR_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "ARMOR"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_CHESTPLATE, "&4Supreme Armor"));

  public static ItemGroup WEAPONS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "WEAPONS"),
      MULTI_CATEGORY, new CustomItemStack(Material.NETHERITE_SWORD, "&4Supreme Weapons"));

}
