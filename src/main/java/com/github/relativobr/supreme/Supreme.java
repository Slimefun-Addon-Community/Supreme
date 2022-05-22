package com.github.relativobr.supreme;

import com.github.relativobr.supreme.setup.MainSetup;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Supreme extends JavaPlugin implements SlimefunAddon {

  private static Supreme instance;
  private static Boolean limitProductionQuarry = null;
  private static Boolean limitProductionGenerators = null;
  private static Boolean customBc = null;

  public static Supreme inst() {
    return instance;
  }

  public static boolean checkLimitProductionquarry() {
    if(limitProductionQuarry == null) {
      limitProductionQuarry = inst().getConfig().getBoolean("options.limit-production-quarry");
    }
    return limitProductionQuarry;
  }

  private static boolean checkLimitProductionGenerators() {
    if(limitProductionGenerators == null) {
      limitProductionGenerators = inst().getConfig().getBoolean("options.limit-production-generators");
    }
    return limitProductionGenerators;
  }

  public static boolean checkCustomBc() {
    if(customBc == null) {
      customBc = inst().getConfig().getBoolean("options.custom-bc");
    }
    return customBc;
  }

  @Override
  public void onEnable() {

    instance = this;

    Supreme.inst().log(Level.INFO, "########################################");
    Supreme.inst().log(Level.INFO, "                 Supreme                ");
    Supreme.inst().log(Level.INFO, "########################################");

    Config cfg = new Config(this);
    if (cfg.getBoolean("options.auto-update") && getDescription().getVersion()
        .startsWith("DEV - ")) {
      new GitHubBuildsUpdater(this, getFile(), "RelativoBR/Supreme/main").start();
    }

    MainSetup.setup(this);

  }

  @Override
  public void onDisable() {
    instance = null;
  }

  @Override
  public String getBugTrackerURL() {
    return "";
  }

  @Override
  public JavaPlugin getJavaPlugin() {
    return this;
  }

  @Nonnull
  private static Map<Enchantment, Integer> getEnchants(@Nonnull ConfigurationSection section) {
    Map<Enchantment, Integer> enchants = new HashMap<>();
    for (String path : section.getKeys(false)) {
      Enchantment e = new EnchantmentWrapper(path);
      if (e != null) {
        int level = section.getInt(path);
        if (level > 0 && level <= 100) {
          enchants.put(e, level);
        } else if (level != 0) {
          enchants.put(e, 1);
        }
      }
    }
    return enchants;
  }

  public void addSupremeEnchantsAndSoulbound(@Nonnull SlimefunItemStack... items) {

    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "Config section \"supreme-enchant\" missing, Check your config and report this!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.AQUA + "Soulbound");

      // find path
      String itemPath = item.getItemId().toLowerCase();

      String amplifier = "I";
      if (itemPath.contains("legendary") || itemPath.contains("supreme")) {
        amplifier = "III";
      } else if (itemPath.contains("epic") || itemPath.contains("rare")) {
        amplifier = "II";
      }

      if (itemPath.contains("helmet")) {
        lore.add(ChatColor.DARK_PURPLE + "Night Vision " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Conduit Power " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Water Breathing " + amplifier);
      } else if (itemPath.contains("chestplate")) {
        lore.add(ChatColor.DARK_PURPLE + "Damage Resistance " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Increase Damage " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Saturation " + amplifier);
      } else if (itemPath.contains("leggings")) {
        lore.add(ChatColor.DARK_PURPLE + "Speed " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Fast Digging " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Regeneration " + amplifier);
      } else if (itemPath.contains("boots")) {
        lore.add(ChatColor.DARK_PURPLE + "Dolphins Grace " + amplifier);
        lore.add(ChatColor.DARK_PURPLE + "Fire Resistance " + amplifier);
      }

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "Config section for " + itemPath + " missing, Check your config and report this!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public void addGearEnchants(@Nonnull SlimefunItemStack... items) {
    ConfigurationSection typeSection = this.getConfig().getConfigurationSection("supreme-enchant");

    if (typeSection == null) {
      log(Level.SEVERE,
          "Config section \"supreme-enchant\" missing, Check your config and report this!");
      return;
    }

    for (SlimefunItemStack item : items) {

      ItemMeta meta = item.getItemMeta();

      // lore
      List<String> lore;
      if (meta.hasLore()) {
        lore = meta.getLore();
      } else {
        lore = new ArrayList<>();
        lore.add("");
      }

      lore.add(ChatColor.AQUA + "Soulbound");

      // find path
      String itemPath = item.getItemId().toLowerCase();

      meta.setLore(lore);

      ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
      if (itemSection != null) {
        // unbreakable and enchants
        meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
        for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
          meta.addEnchant(entry.getKey(), entry.getValue(), true);
        }
      } else {
        log(Level.SEVERE,
            "Config section for " + itemPath + " missing, Check your config and report this!");
      }

      // add meta
      item.setItemMeta(meta);

    }
  }

  public static int getValueGeneratorsWithLimit(int value) {
    return checkLimitProductionGenerators() ? (value / 5) : value;
  }

  public final void log(Level level, String messages) {
    this.getLogger().log(level, messages);
  }

}
