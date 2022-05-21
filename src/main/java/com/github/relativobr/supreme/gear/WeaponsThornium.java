package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.resource.core.SupremeCoreDeath;
import com.github.relativobr.supreme.resource.core.SupremeCoreNature;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.SupremeComponents;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class WeaponsThornium {

  public static final SlimefunItemStack THORNIUM_BOW =
      new SlimefunItemStack(
          "SUPREME_BOW_THORNIUM",
          Material.BOW,
          "&f&lThornium Bow",
          "&f&lA Bow of Thornium",
          "",
          "&3Supreme Weapons");
  public static final ItemStack[] RECIPE_THORNIUM_BOW = {
    null,
    SupremeComponents.THORNIUM_INGOT,
    SupremeCoreDeath.RESOURCE_CORE_STRING,
    SupremeCetrus.CETRUS_LUMIUM,
    null,
    SupremeCoreDeath.RESOURCE_CORE_STRING,
    null,
    SupremeComponents.THORNIUM_INGOT,
    SupremeCoreDeath.RESOURCE_CORE_STRING
  };

  public static final SlimefunItemStack THORNIUM_BOW_MAGIC =
      new SlimefunItemStack(
          "SUPREME_BOW_MAGIC",
          Material.BOW,
          "&a&lMagic Bow",
          "&f&lA Magic Bow of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_BOW_RARE =
      new SlimefunItemStack(
          "SUPREME_BOW_RARE",
          Material.BOW,
          "&b&lRare Bow",
          "&f&lA Rare Bow of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_BOW_EPIC =
      new SlimefunItemStack(
          "SUPREME_BOW_EPIC",
          Material.BOW,
          "&d&lEpic Bow",
          "&f&lA Epic Bow of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_BOW_LEGENDARY =
      new SlimefunItemStack(
          "SUPREME_BOW_LEGENDARY",
          Material.BOW,
          "&6&lLegendary Bow",
          "&f&lA Legendary Bow of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_BOW_SUPREME =
      new SlimefunItemStack(
          "SUPREME_BOW_SUPREME",
          Material.BOW,
          "&4&lSupreme Bow",
          "&f&lA Supreme Bow ofThornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SHIELD =
      new SlimefunItemStack(
          "SUPREME_SHIELD_THORNIUM",
          Material.SHIELD,
          "&f&lThornium Shield",
          "&f&lA Shield of Thornium",
          "",
          "&3Supreme Weapons");
  public static final ItemStack[] RECIPE_THORNIUM_SHIELD = {
    SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
    SupremeComponents.THORNIUM_INGOT,
    SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
    SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
    SupremeCetrus.CETRUS_LUX,
    SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
    null,
    SupremeCoreNature.RESOURCE_CORE_OAK_LOG,
    null
  };

  public static final SlimefunItemStack THORNIUM_SHIELD_MAGIC =
      new SlimefunItemStack(
          "SUPREME_SHIELD_MAGIC",
          Material.SHIELD,
          "&a&lMagic Shield",
          "&f&lA Magic Shield of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SHIELD_RARE =
      new SlimefunItemStack(
          "SUPREME_SHIELD_RARE",
          Material.SHIELD,
          "&b&lRare Shield",
          "&f&lA Rare Shield of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SHIELD_EPIC =
      new SlimefunItemStack(
          "SUPREME_SHIELD_EPIC",
          Material.SHIELD,
          "&d&lEpic Shield",
          "&f&lA Epic Shield of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SHIELD_LEGENDARY =
      new SlimefunItemStack(
          "SUPREME_SHIELD_LEGENDARY",
          Material.SHIELD,
          "&6&lLegendary Shield",
          "&f&lA Legendary Shield of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SHIELD_SUPREME =
      new SlimefunItemStack(
          "SUPREME_SHIELD_SUPREME",
          Material.SHIELD,
          "&4&lSupreme Shield",
          "&f&lA Supreme Shield of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SWORD =
      new SlimefunItemStack(
          "SUPREME_SWORD_THORNIUM",
          Material.NETHERITE_SWORD,
          "&f&lThornium Sword",
          "&f&lA Sword of Thornium",
          "",
          "&3Supreme Weapons");
  public static final ItemStack[] RECIPE_THORNIUM_SWORD = {
    null, SupremeComponents.THORNIUM_INGOT, null,
    null, SupremeComponents.THORNIUM_INGOT, null,
    null, SupremeCetrus.CETRUS_LUMIUM, null
  };

  public static final SlimefunItemStack THORNIUM_SWORD_MAGIC =
      new SlimefunItemStack(
          "SUPREME_SWORD_MAGIC",
          Material.NETHERITE_SWORD,
          "&a&lMagic Sword",
          "&f&lA Magic Sword of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SWORD_RARE =
      new SlimefunItemStack(
          "SUPREME_SWORD_RARE",
          Material.NETHERITE_SWORD,
          "&b&lRare Sword",
          "&f&lA Rare Sword of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SWORD_EPIC =
      new SlimefunItemStack(
          "SUPREME_SWORD_EPIC",
          Material.NETHERITE_SWORD,
          "&d&lEpic Sword",
          "&f&lA Epic Sword of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SWORD_LEGENDARY =
      new SlimefunItemStack(
          "SUPREME_SWORD_LEGENDARY",
          Material.NETHERITE_SWORD,
          "&6&lLegendary Sword",
          "&f&lA Legendary Sword of Thornium",
          "",
          "&3Supreme Weapons");

  public static final SlimefunItemStack THORNIUM_SWORD_SUPREME =
      new SlimefunItemStack(
          "SUPREME_SWORD_SUPREME",
          Material.NETHERITE_SWORD,
          "&4&lSupreme Sword",
          "&f&lA Supreme Sword of Thornium",
          "",
          "&3Supreme Weapons");
}
