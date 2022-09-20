package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeQuarry {


  public static final SlimefunItemStack STONE_QUARRY = new SupremeItemStack("SUPREME_STONE_QUARRY",
      "139ac257f4e04adc6ab3e46fd3b28749e866faa9ce6a1d6d526e0e3864d9222", "&eStone Quarry", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_STONE_QUARRY = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE,
      SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.ADAMANTIUM_PLATE, new ItemStack(Material.DIAMOND_PICKAXE),
      SlimefunItems.PROGRAMMABLE_ANDROID_MINER, new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeComponents.ADAMANTIUM_PLATE, SlimefunItems.COAL_GENERATOR, SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack COAL_QUARRY = new SupremeItemStack("SUPREME_COAL_QUARRY",
      "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04", "&eCoal Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_COAL_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_IGNIS,
      SupremeComponents.ALLOY_PLATINUM, SupremeCetrus.CETRUS_IGNIS, new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeQuarry.STONE_QUARRY, new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.COAL_GENERATOR,
      SlimefunItems.GEO_MINER, SlimefunItems.LARGE_CAPACITOR};

  public static final SlimefunItemStack IRON_QUARRY = new SupremeItemStack("SUPREME_IRON_QUARRY",
      "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0", "&eIron Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_IRON_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_VENTUS,
      SupremeComponents.ALLOY_IRIDIUM, SupremeCetrus.CETRUS_VENTUS, SupremeComponents.STAINLESS_MACHINE,
      SupremeQuarry.COAL_QUARRY, SupremeComponents.STAINLESS_MACHINE, SlimefunItems.ELECTRO_MAGNET,
      SlimefunItems.IRON_GOLEM_ASSEMBLER, SlimefunItems.ELECTRO_MAGNET};

  public static final SlimefunItemStack GOLD_QUARRY = new SupremeItemStack("SUPREME_GOLD_QUARRY",
      "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43", "&eGold Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_GOLD_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUX,
      SupremeComponents.ALLOY_AURUM, SupremeCetrus.CETRUS_LUX, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeQuarry.IRON_QUARRY, SupremeComponents.CONVEYANCE_MACHINE, SlimefunItems.ELECTRO_MAGNET,
      SlimefunItems.ELECTRIC_SMELTERY, SlimefunItems.ELECTRO_MAGNET};

  public static final SlimefunItemStack DIAMOND_QUARRY = new SupremeItemStack("SUPREME_DIAMOND_QUARRY",
      "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6", "&eDiamond Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_DIAMOND_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_AQUA,
      SupremeComponents.ALLOY_TITANIUM, SupremeCetrus.CETRUS_AQUA, SupremeComponents.INDUCTOR_MACHINE,
      SupremeQuarry.GOLD_QUARRY, SupremeComponents.INDUCTOR_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.HEATED_PRESSURE_CHAMBER, SlimefunItems.ELECTRIC_MOTOR};

  public static final SlimefunItemStack THORNIUM_QUARRY = new SupremeItemStack("SUPREME_THORNIUM_QUARRY",
      "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0", "&eThornium Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_THORNIUM_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM,
      SupremeComponents.ALLOY_ADAMANTIUM, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeQuarry.DIAMOND_QUARRY, SupremeComponents.CRYSTALLIZER_MACHINE, SlimefunItems.ELECTRIC_MOTOR,
      SlimefunItems.WITHER_ASSEMBLER, SlimefunItems.ELECTRIC_MOTOR};

  public static final SlimefunItemStack SUPREME_NUGGETS_QUARRY = new SupremeItemStack("SUPREME_SUPREME_NUGGETS_QUARRY",
      "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d", "&eNuggets of Supreme Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_SUPREME_NUGGETS_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM,
      SupremeComponents.THORNERITE, SupremeCetrus.CETRUS_LUMIUM, SupremeCore.CORE_OF_NATURE,
      SupremeQuarry.THORNIUM_QUARRY, SupremeCore.CORE_OF_BLOCK, SupremeCore.CORE_OF_LIFE, SlimefunItems.NUCLEAR_REACTOR,
      SupremeCore.CORE_OF_DEATH};

}
