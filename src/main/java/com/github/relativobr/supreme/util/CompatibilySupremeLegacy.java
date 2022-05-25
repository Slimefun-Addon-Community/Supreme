package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.Supreme.getLegacyItem;
import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CompatibilySupremeLegacy {

  public static String getOldIdSupremeLegacy(String newId) {
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      if (getLegacyItem().isEmpty()) {
        Supreme.inst().log(Level.WARNING, "get Legacy Items error");
      }
      final Optional<CompatibilySupremeLegacyItem> legacyItem = getLegacyItem().stream()
          .filter(x -> x.getNewSupremeID().equals(newId)).findFirst();
      if (legacyItem.isPresent()) {
        return legacyItem.get().getOldSupremeID();
      }
    }
    return newId;
  }

  public static String getNewIdSupremeLegacy(String oldId) {
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      if (getLegacyItem().isEmpty()) {
        Supreme.inst().log(Level.WARNING, "get Legacy Items error");
      }
      final Optional<CompatibilySupremeLegacyItem> legacyItem = getLegacyItem().stream()
          .filter(x -> x.getOldSupremeID().equals(oldId)).findFirst();
      if (legacyItem.isPresent()) {
        return legacyItem.get().getNewSupremeID();
      }
    }
    return oldId;
  }

  private static CompatibilySupremeLegacyItem addSupremeLegacyItem(String newSupremeID, String oldSupremeID) {
    return new CompatibilySupremeLegacyItem(newSupremeID, oldSupremeID);
  }

  private static CompatibilySupremeLegacyItem addSupremeLegacyItemWithReplace(String newSupremeID, String oldString) {
    return addSupremeLegacyItemWithReplace(newSupremeID, oldString, "SUPREME_");
  }

  private static CompatibilySupremeLegacyItem addSupremeLegacyItemWithReplace(String newSupremeID, String oldString,
      String newString) {
    return new CompatibilySupremeLegacyItem(newSupremeID, newSupremeID.replaceAll(newString, oldString));
  }

  private static CompatibilySupremeLegacyItem addSupremeLegacyItemRemovePrefix(String newSupremeID) {
    return addSupremeLegacyItemRemovePrefix(newSupremeID, "SUPREME_");
  }

  private static CompatibilySupremeLegacyItem addSupremeLegacyItemRemovePrefix(String newSupremeID, String prefix) {
    return new CompatibilySupremeLegacyItem(newSupremeID, newSupremeID.substring(prefix.length()));
  }

  public static void loadComponents(List<CompatibilySupremeLegacyItem> result) {

    //SupremeComponents
    final String resourcePrefix = "RESOURCE_";
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_SUPREME"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_SUPREME_NUGGET"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_BIT", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_DUST", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_INGOT", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_BIT_SYNTHETIC", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_DUST_SYNTHETIC", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_INGOT_SYNTHETIC", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_CARBONADO", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNIUM_ENERGIZED", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_ZIRCONIUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ZIRCONIUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_TITANIUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_IRIDIUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_IRIDIUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_AURUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_MANGANESE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_MANGANESE_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_PLATINUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PLATINUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ALLOY_ADAMANTIUM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_PLATE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SYNTHETIC_AMETHYST", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SYNTHETIC_RUBY", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_THORNERITE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_INDUCTIVE_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_INDUCTOR_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_RUSTLESS_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_STAINLESS_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CARRIAGE_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CONVEYANCE_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PETRIFIER_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CRYSTALLIZER_MACHINE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BLEND_MACHINE", resourcePrefix));

    //SupremeCore
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_LIFE"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_DEATH"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_COLOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_BLOCK"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_NATURE"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CORE_OF_ALLOY"));

    //SupremeCetrus
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CETRUS_LUX"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CETRUS_VENTUS"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CETRUS_LUMIUM"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CETRUS_AQUA"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_CETRUS_IGNIS"));

    //SupremeAttribute
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_ATTRIBUTE_MAGIC"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_ATTRIBUTE_BOMB"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_ATTRIBUTE_FORTUNE"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_ATTRIBUTE_IMPETUS"));

  }

  public static void loadGear(List<CompatibilySupremeLegacyItem> result) {

    //ArmorBasic
    final String armorPrefix = "ARMOR_";
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_HELMET", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_HELMET", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_HELMET", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_CHESTPLATE", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_CHESTPLATE", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_CHESTPLATE", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_LEGGINGS", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_LEGGINGS", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_LEGGINGS", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_BOOTS", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_BOOTS", armorPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_BOOTS", armorPrefix));

    //ArmorThornium
    final String armorThorniumPrefix = "ARMOR_THORNIUM_";
    result.add(addSupremeLegacyItem("SUPREME_BOOTS_THORNIUM", "ARMOR_THORNIUM_BOOTS"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOOTS_MAGIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOOTS_RARE", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOOTS_EPIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOOTS_LEGENDARY", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOOTS_SUPREME", armorThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_CHESTPLATE_THORNIUM", "ARMOR_THORNIUM_CHESTPLATE"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CHESTPLATE_MAGIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CHESTPLATE_RARE", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CHESTPLATE_EPIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CHESTPLATE_LEGENDARY", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CHESTPLATE_SUPREME", armorThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_HELMET_THORNIUM", "ARMOR_THORNIUM_HELMET"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_HELMET_MAGIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_HELMET_RARE", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_HELMET_EPIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_HELMET_LEGENDARY", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_HELMET_SUPREME", armorThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_LEGGINGS_THORNIUM", "ARMOR_THORNIUM_LEGGINGS"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_LEGGINGS_MAGIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_LEGGINGS_RARE", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_LEGGINGS_EPIC", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_LEGGINGS_LEGENDARY", armorThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_LEGGINGS_SUPREME", armorThorniumPrefix));

    //ToolsBasic
    final String toolsPrefix = "TOOLS_";
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_AXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_AXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_AXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_PICKAXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_PICKAXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_PICKAXE", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_SHOVEL", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_SHOVEL", toolsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_SHOVEL", toolsPrefix));

    //ToolsThornium
    final String toolsThorniumPrefix = "TOOLS_THORNIUM_";
    result.add(addSupremeLegacyItem("SUPREME_AXE_THORNIUM", "TOOLS_THORNIUM_AXE"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AXE_MAGIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AXE_RARE", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AXE_EPIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AXE_LEGENDARY", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AXE_SUPREME", toolsThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_PICKAXE_THORNIUM", "TOOLS_THORNIUM_PICKAXE"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PICKAXE_MAGIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PICKAXE_RARE", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PICKAXE_EPIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PICKAXE_LEGENDARY", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_PICKAXE_SUPREME", toolsThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_SHOVEL_THORNIUM", "TOOLS_THORNIUM_SHOVEL"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHOVEL_MAGIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHOVEL_RARE", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHOVEL_EPIC", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHOVEL_LEGENDARY", toolsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHOVEL_SUPREME", toolsThorniumPrefix));

    //WeaponsBasic
    final String weaponsPrefix = "WEAPONS_";
    result.add(addSupremeLegacyItemWithReplace("SUPREME_ADAMANTIUM_SWORD", weaponsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_AURUM_SWORD", weaponsPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_TITANIUM_SWORD", weaponsPrefix));

    //WeaponsThornium
    final String weaponsThorniumPrefix = "WEAPONS_THORNIUM_";
    result.add(addSupremeLegacyItem("SUPREME_BOW_THORNIUM", "WEAPONS_THORNIUM_BOW"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOW_MAGIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOW_RARE", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOW_EPIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOW_LEGENDARY", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_BOW_SUPREME", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_SHIELD_THORNIUM", "WEAPONS_THORNIUM_SHIELD"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHIELD_MAGIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHIELD_RARE", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHIELD_EPIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHIELD_LEGENDARY", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SHIELD_SUPREME", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItem("SUPREME_SWORD_THORNIUM", "WEAPONS_THORNIUM_SWORD"));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SWORD_MAGIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SWORD_RARE", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SWORD_EPIC", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SWORD_LEGENDARY", weaponsThorniumPrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_SWORD_SUPREME", weaponsThorniumPrefix));
  }

  public static void loadGenerators(List<CompatibilySupremeLegacyItem> result) {

    //SupremeCapacitor
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_AURUM_CAPACITOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_TITANIUM_CAPACITOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_ADAMANTIUM_CAPACITOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_THORNIUM_CAPACITOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_SUPREME_CAPACITOR"));

    //SupremeGenerator
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_BASIC_IGNIS_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_IGNIS_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_BASIC_VENTUS_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_VENTUS_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_BASIC_AQUA_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_AQUA_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_BASIC_LUX_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_LUX_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_BASIC_LUMIUM_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_LUMIUM_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_THORNIUM_GENERATOR"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_SUPREME_GENERATOR"));

  }

  public static void loadMachines(List<CompatibilySupremeLegacyItem> result) {

    //ElectricCoreFabricator
    result.add(addSupremeLegacyItem("SUPREME_ELECTRIC_CORE_I", "ELECTRIC_CORE_MACHINE"));
    result.add(addSupremeLegacyItem("SUPREME_ELECTRIC_CORE_II", "ELECTRIC_CORE_MACHINE_II"));
    result.add(addSupremeLegacyItem("SUPREME_ELECTRIC_CORE_III", "ELECTRIC_CORE_MACHINE_III"));

    //SupremeQuarry
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_COAL_QUARRY"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_IRON_QUARRY"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_GOLD_QUARRY"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_DIAMOND_QUARRY"));
    result.add(addSupremeLegacyItemRemovePrefix("SUPREME_THORNIUM_QUARRY"));
    result.add(addSupremeLegacyItem("SUPREME_SUPREME_NUGGETS_QUARRY", "UNIQUENUGGETS_QUARRY"));

  }

  public static void loadCoreResource(List<CompatibilySupremeLegacyItem> result) {

    final String resourcePrefix = "RESOURCE_";
    //SupremeCoreAlloy
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_COAL", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_IRON", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_GOLD", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_REDSTONE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_LAPIS", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_DIAMOND", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_EMERALD", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_QUARTZ", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_NETHERITE", resourcePrefix));

    //SupremeCoreBlock
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_STONE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_GRANITE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_DIORITE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_ANDESITE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_GRAVEL", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SAND", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_ENDSTONE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_CLAY", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SNOW", resourcePrefix));

    //SupremeCoreColor
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_RED", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_YELLOW", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_PURPLE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_BLUE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_BLACK", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_GREEN", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_PINK", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_GRAY", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_CYAN", resourcePrefix));

    //SupremeCoreDeath
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_PORKCHOP", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_BEEF", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_MUTTON", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_CHICKEN", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SALMON", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_COD", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_STRING", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SPIDER_EYE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_TEAR", resourcePrefix));

    //SupremeCoreLife
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_POTATO", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_APPLE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_BEETROOT", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_WHEAT", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SUGAR_CANE", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SWEET_BERRIES", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_MELON", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_CARROT", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_PUMPKIN", resourcePrefix));

    //SupremeCoreNature
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_OAK_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_SPRUCE_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_BIRCH_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_JUNGLE_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_ACACIA_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_DARK_OAK_LOG", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_CRIMSON_STEM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_WARPED_STEM", resourcePrefix));
    result.add(addSupremeLegacyItemWithReplace("SUPREME_CORE_WITHER_ROSE", resourcePrefix));
  }
}
