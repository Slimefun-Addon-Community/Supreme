package com.github.relativobr.supreme.util;

import java.util.List;

import com.github.relativobr.supreme.machine.AbstractQuarryOutputItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SupremeQuarryOutput {

  List<AbstractQuarryOutputItem> outputItems;

  //todo include defaultValue
/*
quarry-custom-output:
  supreme_stone_quarry:
    1:
      item: "COBBLESTONE"
      chance: 80
      is-slimefun: false
    2:
      item: "STONE"
      chance: 20
      is-slimefun: false
  supreme_coal_quarry:
    1:
      item: "COAL"
      chance: 20
      is-slimefun: false
    2:
      item: "MYCELIUM"
      chance: 10
      is-slimefun: false
    3:
      item: "GRAVEL"
      chance: 20
      is-slimefun: false
    4:
      item: "SAND"
      chance: 10
      is-slimefun: false
    5:
      item: "CLAY_BALL"
      chance: 20
      is-slimefun: false
    6:
      item: "SNOWBALL"
      chance: 20
      is-slimefun: false
  supreme_iron_quarry:
    1:
      item: "IRON_INGOT"
      chance: 20
      is-slimefun: false
    2:
      item: "COPPER_INGOT"
      chance: 10
      is-slimefun: false
    3:
      item: "ICE"
      chance: 10
      is-slimefun: false
    4:
      item: "GRANITE"
      chance: 20
      is-slimefun: false
    5:
      item: "ANDESITE"
      chance: 20
      is-slimefun: false
    6:
      item: "DIORITE"
      chance: 20
      is-slimefun: false
  supreme_gold_quarry:
    1:
      item: "GOLD_INGOT"
      chance: 20
      is-slimefun: false
    2:
      item: "GLOWSTONE_DUST"
      chance: 5
      is-slimefun: false
    3:
      item: "LAPIS_LAZULI"
      chance: 20
      is-slimefun: false
    4:
      item: "REDSTONE"
      chance: 20
      is-slimefun: false
    5:
      item: "SULFATE"
      chance: 10
      is-slimefun: true
    6:
      item: "BUCKET_OF_OIL"
      chance: 5
      is-slimefun: true
    7:
      item: "CLAY"
      chance: 10
      is-slimefun: false
    8:
      item: "SNOWBALL"
      chance: 10
      is-slimefun: false
  supreme_diamond_quarry:
    1:
      item: "DIAMOND"
      chance: 20
      is-slimefun: false
    2:
      item: "EMERALD"
      chance: 20
      is-slimefun: false
    3:
      item: "QUARTZ"
      chance: 20
      is-slimefun: false
    4:
      item: "OBSIDIAN"
      chance: 5
      is-slimefun: false
    5:
      item: "CRYING_OBSIDIAN"
      chance: 5
      is-slimefun: false
    6:
      item: "END_STONE"
      chance: 20
      is-slimefun: false
    7:
      item: "SEA_LANTERN"
      chance: 5
      is-slimefun: false
    8:
      item: "BLACKSTONE"
      chance: 5
      is-slimefun: false
  supreme_thornium_quarry:
    1:
      item: "SUPREME_THORNIUM_BIT"
      chance: 5
      is-slimefun: true
    2:
      item: "NETHERITE_INGOT"
      chance: 5
      is-slimefun: false
    3:
      item: "IRON_BLOCK"
      chance: 15
      is-slimefun: false
    4:
      item: "COAL_BLOCK"
      chance: 15
      is-slimefun: false
    5:
      item: "LAPIS_BLOCK"
      chance: 15
      is-slimefun: false
    6:
      item: "QUARTZ_BLOCK"
      chance: 15
      is-slimefun: false
    7:
      item: "REDSTONE_BLOCK"
      chance: 15
      is-slimefun: false
    8:
      item: "GOLD_BLOCK"
      chance: 15
      is-slimefun: false
  supreme_supreme_nuggets_quarry:
    1:
      item: "SUPREME_SUPREME_NUGGET"
      chance: 5
      is-slimefun: true
    2:
      item: "NETHERITE_BLOCK"
      chance: 5
      is-slimefun: false
    3:
      item: "EMERALD_BLOCK"
      chance: 10
      is-slimefun: false
    4:
      item: "DIAMOND_BLOCK"
      chance: 10
      is-slimefun: false
    5:
      item: "SUPREME_THORNIUM_BIT"
      chance: 10
      is-slimefun: true
    6:
      item: "COAL_BLOCK"
      chance: 20
      is-slimefun: false
    7:
      item: "IRON_BLOCK"
      chance: 20
      is-slimefun: false
    8:
      item: "GOLD_BLOCK"
      chance: 20
      is-slimefun: false
*/
}
