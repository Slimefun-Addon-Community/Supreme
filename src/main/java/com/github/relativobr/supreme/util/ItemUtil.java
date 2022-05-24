package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.machine.AbstractQuarry;
import com.github.relativobr.supreme.machine.AbstractQuarryOutput;
import com.github.relativobr.supreme.machine.AbstractQuarryOutputItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
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
    List<String> lore = new ArrayList<>();
    lore.add(" ");
    Optional<List<String>> lastElementLore = Optional.empty();
    if (meta.hasLore()) {
      lastElementLore = Optional.of(meta.getLore());
    }
    final AbstractQuarryOutput output = quarry.getOutput();
    final List<AbstractQuarryOutputItem> outputItems = output.getOutputItems().stream().filter(Objects::nonNull)
        .collect(Collectors.toList());
    for (AbstractQuarryOutputItem outputItem : outputItems) {
      if (outputItem != null && outputItem.getItemStack() != null && outputItem.getItemStack().getItemMeta() != null) {
        String name = outputItem.getItemStack().getType().name();
        if (outputItem.getItemStack().getItemMeta().hasDisplayName()) {
          name = outputItem.getItemStack().getItemMeta().getDisplayName();
        } else {
          name = name.replace("_", " ");
          name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
          name = ChatColor.AQUA + name;
        }
        lore.add(name + " " + ChatColor.YELLOW + outputItem.getChance() + "%");
      }
    }

    if (getSupremeOptions().isLimitProductionQuarry()) {
      lore.add(" ");
      lore.add(ChatColor.GOLD + "Limit Production Quarry");
    }

    lastElementLore.ifPresent(lore::addAll);
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
      effect = new PotionEffect[]{new PotionEffect(PotionEffectType.NIGHT_VISION, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.CONDUIT_POWER, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.WATER_BREATHING, 600, amplifier, false, false, false)};
    } else if (itemPath.contains("chestplate")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.SATURATION, 600, amplifier, false, false, false)};
    } else if (itemPath.contains("leggings")) {
      effect = new PotionEffect[]{new PotionEffect(PotionEffectType.SPEED, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FAST_DIGGING, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.REGENERATION, 600, amplifier, false, false, false)};
    } else if (itemPath.contains("boots")) {
      effect = new PotionEffect[]{
          new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 600, amplifier, false, false, false),
          new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, amplifier, false, false, false)};
    } else {
      effect = new PotionEffect[]{};
    }

    return effect;

  }

  public static ItemStack getItemQuarry(AbstractQuarryOutput output, int randomInt) {
    AtomicInteger startValue = new AtomicInteger(0);
    AtomicInteger nextValue = new AtomicInteger(0);
    ItemStack item = null;
    final List<AbstractQuarryOutputItem> outputItems = output.getOutputItems().stream().filter(Objects::nonNull)
        .collect(Collectors.toList());
    for (AbstractQuarryOutputItem outputItem : outputItems) {
      nextValue.set(startValue.get() + outputItem.getChance());
      if (startValue.get() <= randomInt && nextValue.get() >= randomInt) {
        item = outputItem.getItemStack();
        break;
      }
      startValue.set(nextValue.get());
    }
    return item;
  }
}
