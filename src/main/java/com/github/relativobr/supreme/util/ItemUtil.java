package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.machine.AbstractQuarry;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemUtil {

  public static void addLoreQuarry(@Nonnull AbstractQuarry quarry) {
    ItemStack item = quarry.getItem();
    ItemMeta meta = item.getItemMeta();
    // lore
    List<String> lore;
    if (meta.hasLore()) {
      lore = meta.getLore();
    } else {
      lore = new ArrayList<>();
    }
    final ItemStack[] output = quarry.getOutput();
    for (ItemStack itemStack : output) {
      if (itemStack.getItemMeta() != null) {
        String name = itemStack.getType().name();
        if (itemStack.getItemMeta().hasDisplayName()) {
          name = itemStack.getItemMeta().getDisplayName();
        } else {
          name = name.replace("_", " ");
          name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
          name = ChatColor.AQUA + name;
        }
        lore.add(name + " " + ChatColor.YELLOW + itemStack.getAmount() + "%");
      }
    }
    meta.setLore(lore);
    // add meta
    item.setItemMeta(meta);
  }


  public static PotionEffect[] getSupremeEffects(SlimefunItemStack item) {

    // find path
    String itemPath = item.getItemId().toLowerCase();
    PotionEffect[] effect;
    int amplifier = 0;
    if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
      amplifier = 2;
    } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
      amplifier = 1;
    }

    if (itemPath.contains("helmet")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.NIGHT_VISION, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.WATER_BREATHING, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("chestplate")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.SATURATION, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("leggings")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.SPEED, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FAST_DIGGING, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.REGENERATION, 600, amplifier, false, false, false)
      };
    } else if (itemPath.contains("boots")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, amplifier, false, false, false)
      };
    } else {
      effect = new PotionEffect[]{};
    }

    return effect;

  }

}
