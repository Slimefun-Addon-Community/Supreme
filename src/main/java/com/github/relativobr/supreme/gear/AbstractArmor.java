package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.EnchantsAndEffectsUtil;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class AbstractArmor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {

  @ParametersAreNonnullByDefault
  private AbstractArmor(SlimefunItemStack item, ItemStack[] recipe) {
    super(ItemGroups.ARMOR_CATEGORY, item, MultiBlockGearFabricator.getMachine(), recipe,
            EnchantsAndEffectsUtil.getPotionEffects(item));
  }

  public static void setup(Supreme sup) {

    // add Enchant
    EnchantsAndEffectsUtil.addGearBasicEnchants(ArmorBasic.TITANIUM_HELMET, ArmorBasic.AURUM_HELMET, ArmorBasic.ADAMANTIUM_HELMET,
        ArmorBasic.TITANIUM_CHESTPLATE, ArmorBasic.AURUM_CHESTPLATE, ArmorBasic.ADAMANTIUM_CHESTPLATE,
        ArmorBasic.TITANIUM_LEGGINGS, ArmorBasic.AURUM_LEGGINGS, ArmorBasic.ADAMANTIUM_LEGGINGS,
        ArmorBasic.TITANIUM_BOOTS, ArmorBasic.AURUM_BOOTS, ArmorBasic.ADAMANTIUM_BOOTS);

    // add Enchant
    EnchantsAndEffectsUtil.addGearThorniumEnchants(ArmorThornium.THORNIUM_HELMET, ArmorThornium.THORNIUM_HELMET_MAGIC,
        ArmorThornium.THORNIUM_HELMET_RARE, ArmorThornium.THORNIUM_HELMET_EPIC, ArmorThornium.THORNIUM_HELMET_LEGENDARY,
        ArmorThornium.THORNIUM_HELMET_SUPREME, ArmorThornium.THORNIUM_CHESTPLATE,
        ArmorThornium.THORNIUM_CHESTPLATE_MAGIC, ArmorThornium.THORNIUM_CHESTPLATE_RARE,
        ArmorThornium.THORNIUM_CHESTPLATE_EPIC, ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY,
        ArmorThornium.THORNIUM_CHESTPLATE_SUPREME, ArmorThornium.THORNIUM_LEGGINGS,
        ArmorThornium.THORNIUM_LEGGINGS_MAGIC, ArmorThornium.THORNIUM_LEGGINGS_RARE,
        ArmorThornium.THORNIUM_LEGGINGS_EPIC, ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY,
        ArmorThornium.THORNIUM_LEGGINGS_SUPREME, ArmorThornium.THORNIUM_BOOTS, ArmorThornium.THORNIUM_BOOTS_MAGIC,
        ArmorThornium.THORNIUM_BOOTS_RARE, ArmorThornium.THORNIUM_BOOTS_EPIC, ArmorThornium.THORNIUM_BOOTS_LEGENDARY,
        ArmorThornium.THORNIUM_BOOTS_SUPREME);

    new AbstractArmor(ArmorBasic.TITANIUM_HELMET, ArmorBasic.RECIPE_TITANIUM_HELMET).register(sup);
    new AbstractArmor(ArmorBasic.AURUM_HELMET, ArmorBasic.RECIPE_AURUM_HELMET).register(sup);
    new AbstractArmor(ArmorBasic.ADAMANTIUM_HELMET, ArmorBasic.RECIPE_ADAMANTIUM_HELMET).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET, ArmorThornium.RECIPE_THORNIUM_HELMET).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET_MAGIC, ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_HELMET)).register(
        sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET_RARE,
        ItemTier.getRareRecipe(ArmorThornium.THORNIUM_HELMET_MAGIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET_EPIC,
        ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_HELMET_RARE)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET_LEGENDARY,
        ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_HELMET_EPIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_HELMET_SUPREME,
        ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_HELMET_LEGENDARY)).register(sup);

    new AbstractArmor(ArmorBasic.TITANIUM_CHESTPLATE, ArmorBasic.RECIPE_TITANIUM_CHESTPLATE).register(sup);
    new AbstractArmor(ArmorBasic.AURUM_CHESTPLATE, ArmorBasic.RECIPE_AURUM_CHESTPLATE).register(sup);
    new AbstractArmor(ArmorBasic.ADAMANTIUM_CHESTPLATE, ArmorBasic.RECIPE_ADAMANTIUM_CHESTPLATE).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE, ArmorThornium.RECIPE_THORNIUM_CHESTPLATE).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE_MAGIC,
        ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_CHESTPLATE)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE_RARE,
        ItemTier.getRareRecipe(ArmorThornium.THORNIUM_CHESTPLATE_MAGIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE_EPIC,
        ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_CHESTPLATE_RARE)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY,
        ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_CHESTPLATE_EPIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_CHESTPLATE_SUPREME,
        ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_CHESTPLATE_LEGENDARY)).register(sup);

    new AbstractArmor(ArmorBasic.TITANIUM_LEGGINGS, ArmorBasic.RECIPE_TITANIUM_LEGGINGS).register(sup);
    new AbstractArmor(ArmorBasic.AURUM_LEGGINGS, ArmorBasic.RECIPE_AURUM_LEGGINGS).register(sup);
    new AbstractArmor(ArmorBasic.ADAMANTIUM_LEGGINGS, ArmorBasic.RECIPE_ADAMANTIUM_LEGGINGS).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS, ArmorThornium.RECIPE_THORNIUM_LEGGINGS).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS_MAGIC,
        ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_LEGGINGS)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS_RARE,
        ItemTier.getRareRecipe(ArmorThornium.THORNIUM_LEGGINGS_MAGIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS_EPIC,
        ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_LEGGINGS_RARE)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY,
        ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_LEGGINGS_EPIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_LEGGINGS_SUPREME,
        ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_LEGGINGS_LEGENDARY)).register(sup);

    new AbstractArmor(ArmorBasic.TITANIUM_BOOTS, ArmorBasic.RECIPE_TITANIUM_BOOTS).register(sup);
    new AbstractArmor(ArmorBasic.AURUM_BOOTS, ArmorBasic.RECIPE_AURUM_BOOTS).register(sup);
    new AbstractArmor(ArmorBasic.ADAMANTIUM_BOOTS, ArmorBasic.RECIPE_ADAMANTIUM_BOOTS).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS, ArmorThornium.RECIPE_THORNIUM_BOOTS).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS_MAGIC, ItemTier.getMagicRecipe(ArmorThornium.THORNIUM_BOOTS)).register(
        sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS_RARE, ItemTier.getRareRecipe(ArmorThornium.THORNIUM_BOOTS_MAGIC)).register(
        sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS_EPIC, ItemTier.getEpicRecipe(ArmorThornium.THORNIUM_BOOTS_RARE)).register(
        sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS_LEGENDARY,
        ItemTier.getLegendaryRecipe(ArmorThornium.THORNIUM_BOOTS_EPIC)).register(sup);
    new AbstractArmor(ArmorThornium.THORNIUM_BOOTS_SUPREME,
        ItemTier.getSupremeRecipe(ArmorThornium.THORNIUM_BOOTS_LEGENDARY)).register(sup);
  }

  @Nonnull
  @Override
  public ProtectionType[] getProtectionTypes() {
    return new ProtectionType[]{ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL};
  }

  @Override
  public boolean isFullSetRequired() {
    return false;
  }

  @Nonnull
  @Override
  public NamespacedKey getArmorSetId() {
    return new NamespacedKey(getAddon().getJavaPlugin(), "supreme_armor");
  }
}
