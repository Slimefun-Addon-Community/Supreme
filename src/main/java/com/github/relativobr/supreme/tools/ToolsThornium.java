package com.github.relativobr.supreme.tools;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class ToolsThornium {

  public static final SlimefunItemStack THORNIUM_AXE = new SupremeItemStack("SUPREME_AXE_THORNIUM",
      Material.NETHERITE_AXE);
  public static final ItemStack[] RECIPE_THORNIUM_AXE = {SupremeComponents.THORNIUM_INGOT, SupremeCetrus.CETRUS_VENTUS,
      null, SupremeComponents.THORNIUM_INGOT, SlimefunItems.STAFF_ELEMENTAL, null, null, SlimefunItems.STAFF_ELEMENTAL,
      null};

  public static final SlimefunItemStack THORNIUM_AXE_MAGIC = new SupremeItemStack("SUPREME_AXE_MAGIC",
      Material.NETHERITE_AXE);

  public static final SlimefunItemStack THORNIUM_AXE_RARE = new SupremeItemStack("SUPREME_AXE_RARE",
      Material.NETHERITE_AXE);

  public static final SlimefunItemStack THORNIUM_AXE_EPIC = new SupremeItemStack("SUPREME_AXE_EPIC",
      Material.NETHERITE_AXE);

  public static final SlimefunItemStack THORNIUM_AXE_LEGENDARY = new SupremeItemStack("SUPREME_AXE_LEGENDARY",
      Material.NETHERITE_AXE);

  public static final SlimefunItemStack THORNIUM_AXE_SUPREME = new SupremeItemStack("SUPREME_AXE_SUPREME",
      Material.NETHERITE_AXE);

  public static final SlimefunItemStack THORNIUM_PICKAXE = new SupremeItemStack("SUPREME_PICKAXE_THORNIUM",
      Material.NETHERITE_PICKAXE);
  public static final ItemStack[] RECIPE_THORNIUM_PICKAXE = {SupremeComponents.THORNIUM_INGOT,
      SupremeCetrus.CETRUS_IGNIS, SupremeComponents.THORNIUM_INGOT, null, SlimefunItems.STAFF_ELEMENTAL, null, null,
      SlimefunItems.STAFF_ELEMENTAL, null};

  public static final SlimefunItemStack THORNIUM_PICKAXE_MAGIC = new SupremeItemStack("SUPREME_PICKAXE_MAGIC",
      Material.NETHERITE_PICKAXE);

  public static final SlimefunItemStack THORNIUM_PICKAXE_RARE = new SupremeItemStack("SUPREME_PICKAXE_RARE",
      Material.NETHERITE_PICKAXE);

  public static final SlimefunItemStack THORNIUM_PICKAXE_EPIC = new SupremeItemStack("SUPREME_PICKAXE_EPIC",
      Material.NETHERITE_PICKAXE);

  public static final SlimefunItemStack THORNIUM_PICKAXE_LEGENDARY = new SupremeItemStack("SUPREME_PICKAXE_LEGENDARY",
      Material.NETHERITE_PICKAXE);

  public static final SlimefunItemStack THORNIUM_PICKAXE_SUPREME = new SupremeItemStack("SUPREME_PICKAXE_SUPREME",
      Material.NETHERITE_PICKAXE);

  public static final SlimefunItemStack THORNIUM_SHOVEL = new SupremeItemStack("SUPREME_SHOVEL_THORNIUM",
      Material.NETHERITE_SHOVEL);
  public static final ItemStack[] RECIPE_THORNIUM_SHOVEL = {null, SupremeComponents.THORNIUM_INGOT, null, null,
      SupremeCetrus.CETRUS_AQUA, null, null, SlimefunItems.STAFF_ELEMENTAL, null};

  public static final SlimefunItemStack THORNIUM_SHOVEL_MAGIC = new SupremeItemStack("SUPREME_SHOVEL_MAGIC",
      Material.NETHERITE_SHOVEL);

  public static final SlimefunItemStack THORNIUM_SHOVEL_RARE = new SupremeItemStack("SUPREME_SHOVEL_RARE",
      Material.NETHERITE_SHOVEL);

  public static final SlimefunItemStack THORNIUM_SHOVEL_EPIC = new SupremeItemStack("SUPREME_SHOVEL_EPIC",
      Material.NETHERITE_SHOVEL);

  public static final SlimefunItemStack THORNIUM_SHOVEL_LEGENDARY = new SupremeItemStack("SUPREME_SHOVEL_LEGENDARY",
      Material.NETHERITE_SHOVEL);

  public static final SlimefunItemStack THORNIUM_SHOVEL_SUPREME = new SupremeItemStack("SUPREME_SHOVEL_SUPREME",
      Material.NETHERITE_SHOVEL);
}
