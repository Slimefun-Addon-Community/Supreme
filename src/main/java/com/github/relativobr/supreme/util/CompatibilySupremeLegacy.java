package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.gear.ArmorBasic;
import com.github.relativobr.supreme.gear.ArmorThornium;
import com.github.relativobr.supreme.gear.ToolsBasic;
import com.github.relativobr.supreme.gear.ToolsThornium;
import com.github.relativobr.supreme.gear.WeaponsBasic;
import com.github.relativobr.supreme.gear.WeaponsThornium;
import com.github.relativobr.supreme.generators.SupremeCapacitor;
import com.github.relativobr.supreme.generators.SupremeGenerator;
import com.github.relativobr.supreme.machine.SupremeQuarry;
import com.github.relativobr.supreme.machine.multiblock.ElectricCoreFabricator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.core.SupremeCoreBlock;
import com.github.relativobr.supreme.resource.core.SupremeCoreColor;
import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreLife;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import java.util.ArrayList;
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

  private static List<CompatibilySupremeLegacyItem> legacyItems = new ArrayList<>();

  public static void loadCompatibilySupremeLegacy() {
    loadComponents();
    loadGear();
    loadGenerators();
    loadMachines();
    loadCoreResource();
  }

  public static String getOldIdSupremeLegacy(String newId) {
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      if (legacyItems.isEmpty()) {
        Supreme.inst().log(Level.SEVERE, "valid SupremeLegacy error");
      }
      final Optional<CompatibilySupremeLegacyItem> legacyItem = legacyItems.stream()
          .filter(x -> x.getNewSupremeID().equals(newId)).findFirst();
      if(legacyItem.isPresent()){
        return legacyItem.get().getOldSupremeID();
      }
    }
    return newId;
  }

  public static String getNewIdSupremeLegacy(String oldId) {
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      if (legacyItems.isEmpty()) {
        Supreme.inst().log(Level.SEVERE, "valid SupremeLegacy error");
      }
      final Optional<CompatibilySupremeLegacyItem> legacyItem = legacyItems.stream()
          .filter(x -> x.getOldSupremeID().equals(oldId)).findFirst();
      if(legacyItem.isPresent()){
        return legacyItem.get().getNewSupremeID();
      }
    }
    return oldId;
  }

  private static void addSupremeLegacyItem(String newSupremeID, String oldSupremeID) {
    legacyItems.add(new CompatibilySupremeLegacyItem(newSupremeID, oldSupremeID));
  }

  private static void addSupremeLegacyItemWithReplace(String newSupremeID, String oldString) {
    addSupremeLegacyItemWithReplace(newSupremeID, oldString, "SUPREME_");
  }

  private static void addSupremeLegacyItemWithReplace(String newSupremeID, String oldString, String newString) {
    legacyItems.add(new CompatibilySupremeLegacyItem(newSupremeID, newSupremeID.replaceAll(oldString, newString)));
  }

  private static void addSupremeLegacyItemRemovePrefix(String newSupremeID) {
    addSupremeLegacyItemRemovePrefix(newSupremeID, "SUPREME_");
  }

  private static void addSupremeLegacyItemRemovePrefix(String newSupremeID, String prefix) {
    legacyItems.add(new CompatibilySupremeLegacyItem(newSupremeID, newSupremeID.substring(prefix.length())));
  }

  private static void loadComponents() {

    //SupremeComponents
    final String resourcePrefix = "RESOURCE_";
    addSupremeLegacyItemRemovePrefix(SupremeComponents.SUPREME.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeComponents.SUPREME_NUGGET.getItemId());
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_BIT.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_DUST.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_INGOT.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_BIT_SYNTHETIC.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_DUST_SYNTHETIC.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_INGOT_SYNTHETIC.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_CARBONADO.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNIUM_ENERGIZED.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_ZIRCONIUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ZIRCONIUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_TITANIUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.TITANIUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_IRIDIUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.IRIDIUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_AURUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.AURUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_MANGANESE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.MANGANESE_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_PLATINUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.PLATINUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ALLOY_ADAMANTIUM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.ADAMANTIUM_PLATE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.SYNTHETIC_AMETHYST.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.SYNTHETIC_RUBY.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.THORNERITE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.INDUCTIVE_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.INDUCTOR_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.RUSTLESS_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.STAINLESS_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.CARRIAGE_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.CONVEYANCE_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.PETRIFIER_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.CRYSTALLIZER_MACHINE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeComponents.BLEND_MACHINE.getItemId(), resourcePrefix);

    //SupremeCore
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_LIFE.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_DEATH.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_COLOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_BLOCK.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_NATURE.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCore.CORE_OF_ALLOY.getItemId());

    //SupremeCetrus
    addSupremeLegacyItemRemovePrefix(SupremeCetrus.CETRUS_LUX.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCetrus.CETRUS_VENTUS.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCetrus.CETRUS_LUMIUM.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCetrus.CETRUS_AQUA.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCetrus.CETRUS_IGNIS.getItemId());

    //SupremeAttribute
    addSupremeLegacyItemRemovePrefix(SupremeAttribute.ATTRIBUTE_MAGIC.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeAttribute.ATTRIBUTE_BOMB.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeAttribute.ATTRIBUTE_FORTUNE.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeAttribute.ATTRIBUTE_IMPETUS.getItemId());

  }

  private static void loadGear() {

    //ArmorBasic
    final String armorPrefix = "ARMOR_";
    addSupremeLegacyItemWithReplace(ArmorBasic.ADAMANTIUM_HELMET.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.AURUM_HELMET.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.TITANIUM_HELMET.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.ADAMANTIUM_CHESTPLATE.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.AURUM_CHESTPLATE.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.TITANIUM_CHESTPLATE.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.ADAMANTIUM_LEGGINGS.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.AURUM_LEGGINGS.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.TITANIUM_LEGGINGS.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.ADAMANTIUM_BOOTS.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.AURUM_BOOTS.getItemId(), armorPrefix);
    addSupremeLegacyItemWithReplace(ArmorBasic.TITANIUM_BOOTS.getItemId(), armorPrefix);

    //ArmorThornium
    final String armorThorniumPrefix = "ARMOR_THORNIUM_";
    addSupremeLegacyItem(ArmorThornium.THORNIUM_BOOTS.getItemId(), "ARMOR_THORNIUM_BOOTS");
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_BOOTS_MAGIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_BOOTS_RARE.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_BOOTS_EPIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_BOOTS_LEGENDARY.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_BOOTS_SUPREME.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItem(ArmorThornium.THORNIUM_CHESTPLATE.getItemId(), "ARMOR_THORNIUM_CHESTPLATE");
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_CHESTPLATE_MAGIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_CHESTPLATE_RARE.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_CHESTPLATE_EPIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_CHESTPLATE_SUPREME.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItem(ArmorThornium.THORNIUM_HELMET.getItemId(), "ARMOR_THORNIUM_HELMET");
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_HELMET_MAGIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_HELMET_RARE.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_HELMET_EPIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_HELMET_LEGENDARY.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_HELMET_SUPREME.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItem(ArmorThornium.THORNIUM_LEGGINGS.getItemId(), "ARMOR_THORNIUM_LEGGINGS");
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_LEGGINGS_MAGIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_LEGGINGS_RARE.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_LEGGINGS_EPIC.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY.getItemId(), armorThorniumPrefix);
    addSupremeLegacyItemWithReplace(ArmorThornium.THORNIUM_LEGGINGS_SUPREME.getItemId(), armorThorniumPrefix);

    //ToolsBasic
    final String toolsPrefix = "TOOLS_";
    addSupremeLegacyItemWithReplace(ToolsBasic.ADAMANTIUM_AXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.AURUM_AXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.TITANIUM_AXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.ADAMANTIUM_PICKAXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.AURUM_PICKAXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.TITANIUM_PICKAXE.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.ADAMANTIUM_SHOVEL.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.AURUM_SHOVEL.getItemId(), toolsPrefix);
    addSupremeLegacyItemWithReplace(ToolsBasic.TITANIUM_SHOVEL.getItemId(), toolsPrefix);

    //ToolsThornium
    final String toolsThorniumPrefix = "TOOLS_THORNIUM_";
    addSupremeLegacyItem(ToolsThornium.THORNIUM_AXE.getItemId(), "TOOLS_THORNIUM_AXE");
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_AXE_MAGIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_AXE_RARE.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_AXE_EPIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_AXE_LEGENDARY.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_AXE_SUPREME.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItem(ToolsThornium.THORNIUM_PICKAXE.getItemId(), "TOOLS_THORNIUM_PICKAXE");
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_PICKAXE_MAGIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_PICKAXE_RARE.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_PICKAXE_EPIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_PICKAXE_LEGENDARY.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_PICKAXE_SUPREME.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItem(ToolsThornium.THORNIUM_SHOVEL.getItemId(), "TOOLS_THORNIUM_SHOVEL");
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_SHOVEL_MAGIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_SHOVEL_RARE.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_SHOVEL_EPIC.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_SHOVEL_LEGENDARY.getItemId(), toolsThorniumPrefix);
    addSupremeLegacyItemWithReplace(ToolsThornium.THORNIUM_SHOVEL_SUPREME.getItemId(), toolsThorniumPrefix);

    //WeaponsBasic
    final String weaponsPrefix = "WEAPONS_";
    addSupremeLegacyItemWithReplace(WeaponsBasic.ADAMANTIUM_SWORD.getItemId(), weaponsPrefix);
    addSupremeLegacyItemWithReplace(WeaponsBasic.AURUM_SWORD.getItemId(), weaponsPrefix);
    addSupremeLegacyItemWithReplace(WeaponsBasic.TITANIUM_SWORD.getItemId(), weaponsPrefix);

    //WeaponsThornium
    final String weaponsThorniumPrefix = "WEAPONS_THORNIUM_";
    addSupremeLegacyItem(WeaponsThornium.THORNIUM_BOW.getItemId(), "WEAPONS_THORNIUM_BOW");
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_BOW_MAGIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_BOW_RARE.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_BOW_EPIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_BOW_LEGENDARY.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_BOW_SUPREME.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItem(WeaponsThornium.THORNIUM_SHIELD.getItemId(), "WEAPONS_THORNIUM_SHIELD");
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SHIELD_MAGIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SHIELD_RARE.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SHIELD_EPIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SHIELD_SUPREME.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItem(WeaponsThornium.THORNIUM_SWORD.getItemId(), "WEAPONS_THORNIUM_SWORD");
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SWORD_MAGIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SWORD_RARE.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SWORD_EPIC.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SWORD_LEGENDARY.getItemId(), weaponsThorniumPrefix);
    addSupremeLegacyItemWithReplace(WeaponsThornium.THORNIUM_SWORD_SUPREME.getItemId(), weaponsThorniumPrefix);
  }

  private static void loadGenerators() {

    //SupremeCapacitor
    addSupremeLegacyItemRemovePrefix(SupremeCapacitor.AURUM_CAPACITOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCapacitor.TITANIUM_CAPACITOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCapacitor.ADAMANTIUM_CAPACITOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCapacitor.THORNIUM_CAPACITOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeCapacitor.SUPREME_CAPACITOR.getItemId());

    //SupremeGenerator
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.BASIC_IGNIS_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.IGNIS_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.BASIC_VENTUS_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.VENTUS_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.BASIC_AQUA_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.AQUA_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.BASIC_LUX_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.LUX_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.BASIC_LUMIUM_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.LUMIUM_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.THORNIUM_GENERATOR.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeGenerator.SUPREME_GENERATOR.getItemId());

  }

  private static void loadMachines() {

    //ElectricCoreFabricator
    addSupremeLegacyItem(ElectricCoreFabricator.ELECTRIC_CORE_MACHINE.getItemId(), "ELECTRIC_CORE_MACHINE");
    addSupremeLegacyItem(ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_II.getItemId(), "ELECTRIC_CORE_MACHINE_II");
    addSupremeLegacyItem(ElectricCoreFabricator.ELECTRIC_CORE_MACHINE_III.getItemId(), "ELECTRIC_CORE_MACHINE_III");

    //SupremeQuarry
    addSupremeLegacyItemRemovePrefix(SupremeQuarry.COAL_QUARRY.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeQuarry.IRON_QUARRY.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeQuarry.GOLD_QUARRY.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeQuarry.DIAMOND_QUARRY.getItemId());
    addSupremeLegacyItemRemovePrefix(SupremeQuarry.THORNIUM_QUARRY.getItemId());
    addSupremeLegacyItem(SupremeQuarry.SUPREME_NUGGETS_QUARRY.getItemId(), "SUPREME_SUPREME_NUGGETS_QUARRY");

  }

  private static void loadCoreResource() {

    final String resourcePrefix = "RESOURCE_";
    //SupremeCoreAlloy
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_COAL.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_IRON.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_GOLD.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_LAPIS.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_EMERALD.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.getItemId(), resourcePrefix);

    //SupremeCoreBlock
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_STONE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_GRANITE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_DIORITE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_ANDESITE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_GRAVEL.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_SAND.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_ENDSTONE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_CLAY.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreBlock.RESOURCE_CORE_SNOW.getItemId(), resourcePrefix);

    //SupremeCoreColor
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_RED.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_YELLOW.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_PURPLE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_BLUE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_BLACK.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_GREEN.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_PINK.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_GRAY.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreColor.RESOURCE_CORE_CYAN.getItemId(), resourcePrefix);

    //SupremeCoreDeath
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_PORKCHOP.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_BEEF.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_MUTTON.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_CHICKEN.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_SALMON.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_COD.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_STRING.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_SPIDER_EYE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreDeath.RESOURCE_CORE_TEAR.getItemId(), resourcePrefix);

    //SupremeCoreLife
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_POTATO.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_APPLE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_BEETROOT.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_WHEAT.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_SUGAR_CANE.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_SWEET_BERRIES.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_MELON.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_CARROT.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreLife.RESOURCE_CORE_PUMPKIN.getItemId(), resourcePrefix);

    //SupremeCoreNature
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_OAK_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_SPRUCE_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_BIRCH_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_JUNGLE_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_ACACIA_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_DARK_OAK_LOG.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_CRIMSON_STEM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_WARPED_STEM.getItemId(), resourcePrefix);
    addSupremeLegacyItemWithReplace(SupremeCoreNature.RESOURCE_CORE_WITHER_ROSE.getItemId(), resourcePrefix);
  }
}
