package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.AbstractQuarry;
import com.github.relativobr.supreme.machine.SupremeQuarry;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemUtil;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SetupSupremeQuarry {

  public static void setup(Supreme sup) {

    AbstractQuarry quarrySupremeNuggets =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.UNIQUENUGGETS_QUARRY,
                SupremeQuarry.MACHINE_SUPREMENUGGETS_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {
                      new SlimefunItemStack(SupremeComponents.SUPREME_NUGGET, 1),
                      new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 9),
                      new ItemStack(Material.NETHERITE_INGOT, 30)
                    }
                    : Supreme.checkCustomBc() ?
                        new ItemStack[] {
                            new SlimefunItemStack(SupremeComponents.SUPREME_NUGGET, 4),
                            new ItemStack(Material.ANCIENT_DEBRIS, 4),
                            new ItemStack(Material.EMERALD_BLOCK, 6),
                            new ItemStack(Material.DIAMOND_BLOCK, 6),
                            new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 10),
                            new ItemStack(Material.GOLD_BLOCK, 10),
                            new ItemStack(Material.IRON_BLOCK, 10),
                            new ItemStack(Material.COAL_BLOCK, 25),
                            new ItemStack(Material.COPPER_BLOCK, 25)
                        }
                        :
                    new ItemStack[] {
                      new SlimefunItemStack(SupremeComponents.SUPREME_NUGGET, 5),
                      new ItemStack(Material.NETHERITE_BLOCK, 5),
                      new ItemStack(Material.EMERALD_BLOCK, 10),
                      new ItemStack(Material.DIAMOND_BLOCK, 10),
                      new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 10),
                      new ItemStack(Material.COAL_BLOCK, 20),
                      new ItemStack(Material.IRON_BLOCK, 20),
                      new ItemStack(Material.GOLD_BLOCK, 20)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarrySupremeNuggets);
    quarrySupremeNuggets.register(sup);

    AbstractQuarry quarryThornium =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.THORNIUM_QUARRY,
                SupremeQuarry.MACHINE_THORNIUM_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {
                      new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 1),
                      new ItemStack(Supreme.checkCustomBc() ? Material.ANCIENT_DEBRIS : Material.NETHERITE_INGOT, 9),
                      new ItemStack(Material.REDSTONE, 15),
                      new ItemStack(Material.LAPIS_LAZULI, 15)
                    }
                    : Supreme.checkCustomBc() ?
                        new ItemStack[] {
                            new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 5),
                            new ItemStack(Material.ANCIENT_DEBRIS, 2),
                            new ItemStack(Material.IRON_BLOCK, 4),
                            new ItemStack(Material.COAL_BLOCK, 25),
                            new ItemStack(Material.COPPER_BLOCK, 25),
                            new ItemStack(Material.LAPIS_BLOCK, 5),
                            new ItemStack(Material.QUARTZ_BLOCK, 15),
                            new ItemStack(Material.REDSTONE_BLOCK, 15),
                            new ItemStack(Material.GOLD_BLOCK, 4)
                        }
                    : new ItemStack[] {
                      new SlimefunItemStack(SupremeComponents.THORNIUM_BIT, 5),
                      new ItemStack(Material.NETHERITE_INGOT, 5),
                      new ItemStack(Material.IRON_BLOCK, 15),
                      new ItemStack(Material.COAL_BLOCK, 15),
                      new ItemStack(Material.LAPIS_BLOCK, 15),
                      new ItemStack(Material.QUARTZ_BLOCK, 15),
                      new ItemStack(Material.REDSTONE_BLOCK, 15),
                      new ItemStack(Material.GOLD_BLOCK, 15)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryThornium);
    quarryThornium.register(sup);

    AbstractQuarry quarryDiamond =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.DIAMOND_QUARRY,
                SupremeQuarry.MACHINE_DIAMOND_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {
                      new ItemStack(Material.DIAMOND, 25), new ItemStack(Material.EMERALD, 25)
                    }
                    : new ItemStack[] {
                      new ItemStack(Material.DIAMOND, Supreme.checkCustomBc() ? 15 : 20),
                      new ItemStack(Material.EMERALD, Supreme.checkCustomBc() ? 15 : 20),
                      new ItemStack(Material.QUARTZ, 20),
                      new ItemStack(Material.OBSIDIAN, 5),
                      new ItemStack(Material.CRYING_OBSIDIAN, 5),
                      new ItemStack(Material.END_STONE, 20),
                      new ItemStack(Material.SEA_LANTERN, 5),
                      new ItemStack(Material.BLACKSTONE, Supreme.checkCustomBc() ? 15 : 5)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryDiamond);
    quarryDiamond.register(sup);

    AbstractQuarry quarryGold =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.GOLD_QUARRY,
                SupremeQuarry.MACHINE_GOLD_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {
                      new ItemStack(Material.GOLD_INGOT, 25), new ItemStack(Material.QUARTZ, 25)
                    }
                    : new ItemStack[] {
                      new ItemStack(Material.GOLD_INGOT, 20),
                      new ItemStack(Material.GLOWSTONE_DUST, Supreme.checkCustomBc() ? 25 : 5),
                      new ItemStack(Material.LAPIS_LAZULI, Supreme.checkCustomBc() ? 10 : 20),
                      new ItemStack(Material.REDSTONE, Supreme.checkCustomBc() ? 10 : 20),
                      new SlimefunItemStack(SlimefunItems.SULFATE, 10),
                      new SlimefunItemStack(SlimefunItems.OIL_BUCKET, 5),
                      new ItemStack(Material.CLAY, 10),
                      new ItemStack(Material.SNOW_BLOCK, 10)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryGold);
    quarryGold.register(sup);

    AbstractQuarry quarryIron =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.IRON_QUARRY,
                SupremeQuarry.MACHINE_IRON_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {
                      new ItemStack(Material.IRON_INGOT, 25),
                      new ItemStack(Material.COPPER_INGOT, 25)
                    }
                    : new ItemStack[] {
                      new ItemStack(Material.IRON_INGOT, 20),
                      new ItemStack(Material.COPPER_INGOT, 10),
                      new ItemStack(Material.ICE, 10),
                      new ItemStack(Material.GRANITE, 20),
                      new ItemStack(Material.ANDESITE, 20),
                      new ItemStack(Material.DIORITE, 20)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryIron);
    quarryIron.register(sup);

    AbstractQuarry quarryCoal =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.COAL_QUARRY,
                SupremeQuarry.MACHINE_COAL_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {new ItemStack(Material.COAL, 50)}
                    : new ItemStack[] {
                      new ItemStack(Material.COAL, 20),
                      new ItemStack(Material.MYCELIUM, 10),
                      new ItemStack(Material.GRAVEL, 20),
                      new ItemStack(Material.SAND, 10),
                      new ItemStack(Material.CLAY_BALL, 20),
                      new ItemStack(Material.SNOWBALL, 20)
                    })
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryCoal);
    quarryCoal.register(sup);

    AbstractQuarry quarryCobblestone =
        new AbstractQuarry(
                ItemGroups.MACHINES_CATEGORY,
                SupremeQuarry.COBBLESTONE_QUARRY,
                SupremeQuarry.MACHINE_COBBLESTONE_QUARRY)
            .setOutput(
                Supreme.checkLimitProductionquarry()
                    ? new ItemStack[] {new ItemStack(Material.COBBLESTONE, 50)}
                    : new ItemStack[] {new ItemStack(Material.COBBLESTONE, 100)})
            .setCapacity(1000)
            .setEnergyConsumption(10);
    ItemUtil.addLoreQuarry(quarryCobblestone);
    quarryCobblestone.register(sup);
  }
}
