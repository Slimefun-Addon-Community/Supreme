package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.multiblock.MultiBlockGearFabricator;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.ItemTier;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.inventory.ItemStack;

public class AbstractWeapons extends SlimefunItem implements Soulbound, NotPlaceable {

  @ParametersAreNonnullByDefault
  public AbstractWeapons(@Nonnull SlimefunItemStack stack, ItemStack[] recipe) {
    super(ItemGroups.WEAPONS_CATEGORY, stack, MultiBlockGearFabricator.getMachine(), recipe);
  }

  public static void setup(Supreme sup) {

    // add Enchant
    sup.addGearEnchants(WeaponsBasic.TITANIUM_SWORD, WeaponsBasic.AURUM_SWORD, WeaponsBasic.ADAMANTIUM_SWORD);

    // add Enchant
    sup.addSupremeEnchantsAndSoulbound(WeaponsThornium.THORNIUM_BOW, WeaponsThornium.THORNIUM_BOW_MAGIC,
        WeaponsThornium.THORNIUM_BOW_RARE, WeaponsThornium.THORNIUM_BOW_EPIC, WeaponsThornium.THORNIUM_BOW_LEGENDARY,
        WeaponsThornium.THORNIUM_BOW_SUPREME, WeaponsThornium.THORNIUM_SWORD, WeaponsThornium.THORNIUM_SWORD_MAGIC,
        WeaponsThornium.THORNIUM_SWORD_RARE, WeaponsThornium.THORNIUM_SWORD_EPIC,
        WeaponsThornium.THORNIUM_SWORD_LEGENDARY, WeaponsThornium.THORNIUM_SWORD_SUPREME,
        WeaponsThornium.THORNIUM_SHIELD, WeaponsThornium.THORNIUM_SHIELD_MAGIC, WeaponsThornium.THORNIUM_SHIELD_RARE,
        WeaponsThornium.THORNIUM_SHIELD_EPIC, WeaponsThornium.THORNIUM_SHIELD_LEGENDARY,
        WeaponsThornium.THORNIUM_SHIELD_SUPREME);

    final AbstractWeapons bow = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW, WeaponsThornium.RECIPE_THORNIUM_BOW);
    bow.register(sup);
    final AbstractWeapons bowMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_MAGIC,
        ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_BOW));
    bowMagic.register(sup);
    final AbstractWeapons bowRare = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_RARE,
        ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_BOW_MAGIC));
    bowRare.register(sup);
    final AbstractWeapons bowEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_EPIC,
        ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_BOW_RARE));
    bowEpic.register(sup);
    final AbstractWeapons bowLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_LEGENDARY,
        ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_BOW_EPIC));
    bowLegendary.register(sup);
    final AbstractWeapons bowSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_BOW_SUPREME,
        ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_BOW_LEGENDARY));
    bowSupreme.register(sup);

    final AbstractWeapons titaniumSword = new AbstractWeapons(WeaponsBasic.TITANIUM_SWORD,
        WeaponsBasic.RECIPE_TITANIUM_SWORD);
    titaniumSword.register(sup);
    final AbstractWeapons aurumSword = new AbstractWeapons(WeaponsBasic.AURUM_SWORD, WeaponsBasic.RECIPE_AURUM_SWORD);
    aurumSword.register(sup);
    final AbstractWeapons adamantiumSword = new AbstractWeapons(WeaponsBasic.ADAMANTIUM_SWORD,
        WeaponsBasic.RECIPE_ADAMANTIUM_SWORD);
    adamantiumSword.register(sup);

    final AbstractWeapons sword = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD,
        WeaponsThornium.RECIPE_THORNIUM_SWORD);
    sword.register(sup);
    final AbstractWeapons swordMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_MAGIC,
        ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_SWORD));
    swordMagic.register(sup);
    final AbstractWeapons swordRare = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_RARE,
        ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_SWORD_MAGIC));
    swordRare.register(sup);
    final AbstractWeapons swordEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_EPIC,
        ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_SWORD_RARE));
    swordEpic.register(sup);
    final AbstractWeapons swordLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_LEGENDARY,
        ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_SWORD_EPIC));
    swordLegendary.register(sup);
    final AbstractWeapons swordSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_SWORD_SUPREME,
        ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_SWORD_LEGENDARY));
    swordSupreme.register(sup);

    final AbstractWeapons shield = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD,
        WeaponsThornium.RECIPE_THORNIUM_SHIELD);
    shield.register(sup);
    final AbstractWeapons shieldMagic = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_MAGIC,
        ItemTier.getMagicRecipe(WeaponsThornium.THORNIUM_SHIELD));
    shieldMagic.register(sup);
    final AbstractWeapons shieldRare = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_RARE,
        ItemTier.getRareRecipe(WeaponsThornium.THORNIUM_SHIELD_MAGIC));
    shieldRare.register(sup);
    final AbstractWeapons shieldEpic = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_EPIC,
        ItemTier.getEpicRecipe(WeaponsThornium.THORNIUM_SHIELD_RARE));
    shieldEpic.register(sup);
    final AbstractWeapons shieldLegendary = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY,
        ItemTier.getLegendaryRecipe(WeaponsThornium.THORNIUM_SHIELD_EPIC));
    shieldLegendary.register(sup);
    final AbstractWeapons shieldSupreme = new AbstractWeapons(WeaponsThornium.THORNIUM_SHIELD_SUPREME,
        ItemTier.getSupremeRecipe(WeaponsThornium.THORNIUM_SHIELD_LEGENDARY));
    shieldSupreme.register(sup);
  }
}
