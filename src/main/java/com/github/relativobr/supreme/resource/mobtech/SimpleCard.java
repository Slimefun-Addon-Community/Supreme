package com.github.relativobr.supreme.resource.mobtech;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.mobtech.TechGenerator;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SimpleCard {

    /**
     *  MUSIC_DISC_STRAD       1 branco
     *  MUSIC_DISC_13          2 amarelo/branco
     *  MUSIC_DISC_MELLOHI     3 rosa/branco
     *  MUSIC_DISC_FAR         4 verdeclaro
     *  MUSIC_DISC_CAT         5 verde
     *  MUSIC_DISC_WARD        6 verde/verdeclaro
     *  MUSIC_DISC_WAIT        7 azul
     */

    // cards basicos
    public static final SlimefunItemStack CARD_STONE = new SlimefunItemStack(
        "SUPREME_CARD_STONE", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Stone", "", "&fChange to Production Stone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_GRANITE = new SlimefunItemStack(
        "SUPREME_CARD_GRANITE", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Granite", "", "&fChange to Production Granite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_DIORITE = new SlimefunItemStack(
        "SUPREME_CARD_DIORITE", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Diorite", "", "&fChange to Production Diorite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_ANDESITE = new SlimefunItemStack(
        "SUPREME_CARD_ANDESITE", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Andesite", "", "&fChange to Production Andesite",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_GRAVEL = new SlimefunItemStack(
        "SUPREME_CARD_GRAVEL", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Gravel", "", "&fChange to Production Gravel",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_SAND = new SlimefunItemStack(
        "SUPREME_CARD_SAND", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Sand", "", "&fChange to Production Sand",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_ENDSTONE = new SlimefunItemStack(
        "SUPREME_CARD_ENDSTONE", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Endstone", "", "&fChange to Production Endstone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_CLAY = new SlimefunItemStack(
        "SUPREME_CARD_CLAY", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Glay", "", "&fChange to Production Glay",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_SNOW = new SlimefunItemStack(
        "SUPREME_CARD_SNOW", Material.MUSIC_DISC_STRAD,
        "&bCard Machine Snow", "", "&fChange to Production Snow",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_COAL = new SlimefunItemStack(
        "SUPREME_CARD_COAL", Material.MUSIC_DISC_13,
        "&bCard Machine Coal", "", "&fChange to Production Coal",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_IRON = new SlimefunItemStack(
        "SUPREME_CARD_IRON", Material.MUSIC_DISC_13,
        "&bCard Machine Iron", "", "&fChange to Production Iron",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_COPPER = new SlimefunItemStack(
        "SUPREME_CARD_COPPER", Material.MUSIC_DISC_13,
        "&bCard Machine Copper", "", "&fChange to Production Copper",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_GOLD = new SlimefunItemStack(
        "SUPREME_CARD_GOLD", Material.MUSIC_DISC_13,
        "&bCard Machine Gold", "", "&fChange to Production Gold",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_QUARTZ = new SlimefunItemStack(
        "SUPREME_CARD_QUARTZ", Material.MUSIC_DISC_13,
        "&bCard Machine Quartz", "", "&fChange to Production Quartz",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_QUARTZ_BLOCK = new SlimefunItemStack(
        "SUPREME_CARD_QUARTZ_BLOCK", Material.MUSIC_DISC_13,
        "&bCard Machine Quartz Block", "", "&fChange to Production Quartz Block",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_LAPIS = new SlimefunItemStack(
        "SUPREME_CARD_LAPIS", Material.MUSIC_DISC_13,
        "&bCard Machine Lapiz", "", "&fChange to Production Lapiz",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_REDSTONE = new SlimefunItemStack(
        "SUPREME_CARD_REDSTONE", Material.MUSIC_DISC_13,
        "&bCard Machine Redstone", "", "&fChange to Production Redstone",
        "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_DIAMOND = new SlimefunItemStack(
        "SUPREME_CARD_DIAMOND", Material.MUSIC_DISC_FAR,
        "&bCard Machine Diamond", "", "&fChange to Production Diamond",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_EMERALD = new SlimefunItemStack(
        "SUPREME_CARD_EMERALD", Material.MUSIC_DISC_FAR,
        "&bCard Machine Emerald", "", "&fChange to Production Emerald",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_NETHERITE = new SlimefunItemStack(
        "SUPREME_CARD_NETHERITE", Material.MUSIC_DISC_FAR,
        "&bCard Machine Netherite", "", "&fChange to Production Netherite",
        "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_AMETHYST = new SlimefunItemStack(
            "SUPREME_CARD_AMETHYST", Material.MUSIC_DISC_FAR,
            "&bCard Machine Ametista", "", "&fChange to Production Ametista",
            "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_IRON_DUST = new SlimefunItemStack(
        "SUPREME_CARD_IRON_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Iron Dust", "", "&fChange to Production Iron Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");

    public static final SlimefunItemStack CARD_LEAD_DUST = new SlimefunItemStack(
        "SUPREME_CARD_LEAD_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Lead Dust", "", "&fChange to Production Lead Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_GOLD_DUST = new SlimefunItemStack(
        "SUPREME_CARD_GOLD_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Gold Dust", "", "&fChange to Production Gold Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_COPPER_DUST = new SlimefunItemStack(
        "SUPREME_CARD_COPPER_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Copper Dust", "", "&fChange to Production Copper Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_MAGNESIUM_DUST = new SlimefunItemStack(
        "SUPREME_CARD_MAGNESIUM_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Magnesium Dust", "", "&fChange to Production Magnesium Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_ALUMINUM_DUST = new SlimefunItemStack(
        "SUPREME_CARD_ALUMINUM_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Aluminum Dust", "", "&fChange to Production Aluminum Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_SILVER_DUST = new SlimefunItemStack(
        "SUPREME_CARD_SILVER_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Silver Dust", "", "&fChange to Production Silver Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_TIN_DUST = new SlimefunItemStack(
        "SUPREME_CARD_TIN_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Tin Dust", "", "&fChange to Production Tin Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static final SlimefunItemStack CARD_ZINC_DUST = new SlimefunItemStack(
        "SUPREME_CARD_ZINC_DUST", Material.MUSIC_DISC_MELLOHI,
        "&bCard Machine Zinc Dust", "", "&fChange to Production Zinc Dust",
        "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), "", "&3Supreme Component");


    public static void setup(Supreme plugin) {

        // setup cards
        TechGenerator.preSetup(plugin, SimpleCard.CARD_STONE,
            Material.STONE, Material.COBBLESTONE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_GRANITE,
            Material.POLISHED_GRANITE, Material.GRANITE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_DIORITE,
            Material.POLISHED_DIORITE, Material.DIORITE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_ANDESITE,
            Material.POLISHED_ANDESITE, Material.ANDESITE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_GRAVEL,
            Material.GRAVEL, Material.GRAVEL);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_SAND,
            Material.SANDSTONE, Material.SAND);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_ENDSTONE,
            Material.END_STONE_BRICKS, Material.END_STONE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_CLAY,
            Material.CLAY, Material.CLAY);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_SNOW,
            Material.SNOW_BLOCK, Material.SNOW_BLOCK);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_COAL,
            Material.COAL_BLOCK, Material.COAL);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON,
            Material.IRON_BLOCK, Material.IRON_INGOT);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER,
            Material.COPPER_BLOCK, Material.COPPER_INGOT);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD,
            Material.GOLD_BLOCK, Material.GOLD_INGOT);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ,
            Material.QUARTZ, Material.QUARTZ);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ_BLOCK,
            Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_LAPIS,
            Material.LAPIS_LAZULI, Material.LAPIS_LAZULI);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_REDSTONE,
            Material.REDSTONE_BLOCK, Material.REDSTONE);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_DIAMOND,
            Material.DIAMOND_BLOCK, Material.DIAMOND);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_EMERALD,
            Material.EMERALD_BLOCK, Material.EMERALD);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHERITE,
            Material.NETHERITE_BLOCK, Material.NETHERITE_INGOT);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_AMETHYST,
            Material.AMETHYST_BLOCK, Material.AMETHYST_SHARD);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON_DUST,
            SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_LEAD_DUST,
            SlimefunItems.LEAD_DUST, SlimefunItems.LEAD_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD_DUST,
            SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER_DUST,
            SlimefunItems.COPPER_DUST, SlimefunItems.COPPER_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_MAGNESIUM_DUST,
            SlimefunItems.MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_ALUMINUM_DUST,
            SlimefunItems.ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_SILVER_DUST,
            SlimefunItems.SILVER_DUST, SlimefunItems.SILVER_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_TIN_DUST,
            SlimefunItems.TIN_DUST, SlimefunItems.TIN_DUST);

        TechGenerator.preSetup(plugin, SimpleCard.CARD_ZINC_DUST,
            SlimefunItems.ZINC_DUST, SlimefunItems.ZINC_DUST);

    }
}
