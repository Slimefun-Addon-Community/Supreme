package com.github.relativobr.supreme.gear;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.Rechargeable;
import io.github.thebusybiscuit.slimefun4.core.handlers.EntityInteractHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MobCollectorTools extends SlimefunItem implements Rechargeable, NotPlaceable {

  public static final SlimefunItemStack MOB_COLLECTOR_I = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_I",
      Material.IRON_SHOVEL, "&6MobTech Collector I", "", "&fUsed to capture MobTech (Bees and IronGolen)", "",
      LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 500));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_I = new ItemStack[]{null, SupremeComponents.SYNTHETIC_RUBY, null,
      null, WeaponsBasic.AURUM_SWORD, null, null, SlimefunItems.MEDIUM_CAPACITOR, null};

  public static final SlimefunItemStack MOB_COLLECTOR_II = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_II",
      Material.DIAMOND_SHOVEL, "&6MobTech Collector II", "", "&fUsed to capture MobTech (Bees and IronGolen)", "",
      LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 5000));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_II = new ItemStack[]{null, SupremeCetrus.CETRUS_AQUA, null, null,
      MobCollectorTools.MOB_COLLECTOR_I, null, null, SupremeCetrus.CETRUS_VENTUS, null};

  public static final SlimefunItemStack MOB_COLLECTOR_III = new SupremeItemStack("SUPREME_MOB_COLLECTOR_TOOL_III",
      Material.NETHERITE_SHOVEL, "&6MobTech Collector III", "", "&fUsed to capture MobTech (Bees and IronGolen)", "",
      LoreBuilder.power(50, " per use"), LoreBuilder.powerCharged(0, 50000));
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_III = new ItemStack[]{null, SupremeCore.CORE_OF_NATURE, null,
      null, MobCollectorTools.MOB_COLLECTOR_II, null, null, SupremeCore.CORE_OF_LIFE, null};
  int charge;
  int maxCharge;
  public MobCollectorTools(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
    addItemHandler(getItemHandler());
  }

  public static void setup(Supreme plugin) {

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_I,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_I).setCharge(50).setMaxCharge(500)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_II,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_II).setCharge(50).setMaxCharge(5000)
        .register(plugin);

    new MobCollectorTools(ItemGroups.TOOLS_CATEGORY, MobCollectorTools.MOB_COLLECTOR_III,
        RecipeType.ENHANCED_CRAFTING_TABLE, MobCollectorTools.RECIPE_MOB_COLLECTOR_III).setCharge(50).setMaxCharge(5000)
        .register(plugin);

  }

  public int getCharge() {
    return this.charge;
  }

  public final MobCollectorTools setCharge(int value) {
    this.charge = value;
    return this;
  }

  public int getMaxCharge() {
    return this.maxCharge;
  }

  public final MobCollectorTools setMaxCharge(int value) {
    this.maxCharge = value;
    return this;
  }

  public EntityInteractHandler getItemHandler() {
    return (e, item, offhand) -> {
      if (getItemCharge(item) < getCharge()) {
        return;
      }
      Entity entity = e.getRightClicked();
      if (e.isCancelled() || !Slimefun.getProtectionManager()
          .hasPermission(e.getPlayer(), entity.getLocation(), Interaction.INTERACT_ENTITY)) {
        return;
      }
      Player p = e.getPlayer();
      if (entity instanceof Bee) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), Supreme.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
        entity.remove();
        removeItemCharge(item, getCharge());
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
      }
      if (entity instanceof Golem) {
        entity.getWorld()
            .dropItemNaturally(entity.getLocation(), Supreme.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0));
        entity.remove();
        removeItemCharge(item, getCharge());
        p.playSound(p.getLocation(), Sound.BLOCK_ANVIL_FALL, 1, 1);
      }

    };

  }

  @Override
  public float getMaxItemCharge(ItemStack item) {
    return getMaxCharge();
  }

}
