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

  public static NestedItemGroup MULTI_CATEGORY = new NestedItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_MAIN"),
      new CustomItemStack(
          new SlimefunItemStack("SUPREME_MAIN_ITEM", "c69e3e6e5b2b92f0beb368b738b993d7ba225bf9bb2758bfc9fc2daba4a5a7d",
              "Main item"), Supreme.getLocalization().getCategoryName("main")));

  public static ItemGroup RESOURCE_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_RESOURCE"),
      MULTI_CATEGORY,
      new CustomItemStack(Material.GOLDEN_APPLE, Supreme.getLocalization().getCategoryName("resource")));

  public static ItemGroup COMPONENTS_CATEGORY = new SubItemGroup(
      new NamespacedKey(Supreme.inst(), "SUPREME_COMPONENTS"), MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_INGOT, Supreme.getLocalization().getCategoryName("components")));

  public static ItemGroup CARDS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_CARDS"),
      MULTI_CATEGORY,
      new CustomItemStack(Material.MUSIC_DISC_PIGSTEP, Supreme.getLocalization().getCategoryName("cards")));

  public static ItemGroup TECHMOB_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_TECHMOB"),
      MULTI_CATEGORY, new CustomItemStack(Material.HONEYCOMB, Supreme.getLocalization().getCategoryName("techmob")));

  public static ItemGroup MACHINES_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_MACHINES"),
      MULTI_CATEGORY, new CustomItemStack(Material.OBSERVER, Supreme.getLocalization().getCategoryName("machines")));

  public static ItemGroup ELECTRIC_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_ELECTRIC"),
      MULTI_CATEGORY, new CustomItemStack(
      new SlimefunItemStack("SUPREME_ELECTRIC_ITEM", "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422",
          "Eletric Item"), Supreme.getLocalization().getCategoryName("electric")));

  public static ItemGroup TOOLS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_TOOLS"),
      MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_PICKAXE, Supreme.getLocalization().getCategoryName("tools")));

  public static ItemGroup ARMOR_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_ARMOR"),
      MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_CHESTPLATE, Supreme.getLocalization().getCategoryName("armor")));

  public static ItemGroup WEAPONS_CATEGORY = new SubItemGroup(new NamespacedKey(Supreme.inst(), "SUPREME_WEAPONS"),
      MULTI_CATEGORY,
      new CustomItemStack(Material.NETHERITE_SWORD, Supreme.getLocalization().getCategoryName("weapons")));

}
