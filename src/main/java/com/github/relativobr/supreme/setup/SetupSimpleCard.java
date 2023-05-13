package com.github.relativobr.supreme.setup;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.resource.mobtech.SimpleCard;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public class SetupSimpleCard {

  public static void setup(Supreme plugin) {

    boolean customBc = getSupremeOptions().isCustomBc();

    // setup cards
    TechGenerator.preSetup(plugin, SimpleCard.CARD_STONE, Material.STONE, Material.COBBLESTONE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GRANITE, Material.POLISHED_GRANITE, Material.GRANITE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_DIORITE, Material.POLISHED_DIORITE, Material.DIORITE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ANDESITE, Material.POLISHED_ANDESITE, Material.ANDESITE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GRAVEL, Material.GRAVEL, Material.GRAVEL);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SAND, Material.SANDSTONE, Material.SAND);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ENDSTONE, Material.END_STONE_BRICKS, Material.END_STONE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_CLAY, Material.CLAY, Material.CLAY);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SNOW, Material.SNOW_BLOCK, Material.SNOW_BLOCK);
    
    TechGenerator.preSetup(plugin, SimpleCard.CARD_APPLE, Material.APPLE, Material.APPLE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHER_STAR, Material.NETHER_STAR, Material.NETHER_STAR);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_WITHER_ROSE, Material.WITHER_ROSE, Material.WITHER_ROSE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SLIME_BALL, Material.SLIME_BALL, Material.SLIME_BALL);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_INK_SAC, Material.INK_SAC, Material.INK_SAC);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GLOW_INK_SAC, Material.GLOW_INK_SAC, Material.GLOW_INK_SAC);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_HONEY_BOTTLE, Material.HONEY_BOTTLE, Material.HONEY_BOTTLE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COAL, Material.COAL_BLOCK, Material.COAL);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON, Material.IRON_BLOCK, Material.IRON_INGOT);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER, Material.COPPER_BLOCK, Material.COPPER_INGOT);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD, Material.GOLD_BLOCK, Material.GOLD_INGOT);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ, Material.QUARTZ, Material.QUARTZ);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_QUARTZ_BLOCK, Material.QUARTZ_BLOCK, Material.QUARTZ_BLOCK);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_LAPIS, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_REDSTONE, Material.REDSTONE_BLOCK, Material.REDSTONE);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_DIAMOND, Material.DIAMOND_BLOCK, Material.DIAMOND);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_EMERALD, Material.EMERALD_BLOCK, Material.EMERALD);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_BLAZE_ROD, Material.BLAZE_ROD, Material.BLAZE_ROD);

    if(customBc){
      TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHERITE, Material.NETHERITE_BLOCK, Material.NETHERITE_SCRAP);
    } else {
      TechGenerator.preSetup(plugin, SimpleCard.CARD_NETHERITE, Material.NETHERITE_BLOCK, Material.NETHERITE_INGOT);
    }

    TechGenerator.preSetup(plugin, SimpleCard.CARD_AMETHYST, Material.AMETHYST_BLOCK, Material.AMETHYST_SHARD);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_IRON_DUST, SlimefunItems.IRON_DUST, SlimefunItems.IRON_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_LEAD_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.LEAD_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_GOLD_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.GOLD_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_COPPER_DUST, SlimefunItems.COPPER_DUST, SlimefunItems.COPPER_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_MAGNESIUM_DUST, SlimefunItems.MAGNESIUM_DUST,
        SlimefunItems.MAGNESIUM_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ALUMINUM_DUST, SlimefunItems.ALUMINUM_DUST,
        SlimefunItems.ALUMINUM_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_SILVER_DUST, SlimefunItems.SILVER_DUST, SlimefunItems.SILVER_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_TIN_DUST, SlimefunItems.TIN_DUST, SlimefunItems.TIN_DUST);

    TechGenerator.preSetup(plugin, SimpleCard.CARD_ZINC_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.ZINC_DUST);
  }
}
