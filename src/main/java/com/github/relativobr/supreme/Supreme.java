package com.github.relativobr.supreme;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getNewIdSupremeLegacy;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getOldIdSupremeLegacy;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadComponents;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadCoreResource;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGear;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGenerators;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadMachines;

import com.github.relativobr.supreme.machine.tech.MobTechGeneric;
import com.github.relativobr.supreme.machine.tech.MobTechGeneric.MobTechType;
import com.github.relativobr.supreme.machine.AbstractQuarryOutput;
import com.github.relativobr.supreme.machine.AbstractQuarryOutputItem;
import com.github.relativobr.supreme.setup.MainSetup;
import com.github.relativobr.supreme.util.CompatibilySupremeLegacyItem;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import javax.annotation.Nonnull;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Supreme extends JavaPlugin implements SlimefunAddon {

  private static Supreme instance;
  private static SupremeOptions supremeOptions = null;
  private static SupremeLocalization localization = null;
  private static List<CompatibilySupremeLegacyItem> legacyItem = null;

  public static Supreme inst() {
    return instance;
  }

  public static SupremeOptions getSupremeOptions() {
    if (supremeOptions == null) {
      ConfigurationSection typeSection = inst().getConfig().getConfigurationSection("options");
      if (typeSection != null) {
        supremeOptions = SupremeOptions.builder().autoUpdate(typeSection.getBoolean("auto-update"))
            .useLegacySupremeexpansionItemId(
                typeSection.getBoolean("use-legacy-supremeexpansion-item-id", false))
            .lang(typeSection.getString("lang", "en-US"))
            .customTickerDelay(typeSection.getInt("custom-ticker-delay"))
            .enableGenerators(typeSection.getBoolean("enable-generators", true))
            .limitProductionGenerators(typeSection.getBoolean("limit-production-generators", false))
            .enableQuarry(typeSection.getBoolean("enable-quarry", true))
            .limitProductionQuarry(typeSection.getBoolean("limit-production-quarry", false))
            .baseTimeVirtualGarden(typeSection.getInt("base-time-virtual-garden", 15))
            .baseTimeVirtualAquarium(typeSection.getInt("base-time-virtual-aquarium", 15))
            .baseTimeMobCollector(typeSection.getInt("base-time-mob-collector", 15))
            .baseTimeTechGenerator(typeSection.getInt("base-time-tech-generator", 1800))
            .enableWeapons(typeSection.getBoolean("enable-weapons", true))
            .enableTools(typeSection.getBoolean("enable-tools", true))
            .enableArmor(typeSection.getBoolean("enable-armor", true))
            .enableTech(typeSection.getBoolean("enable-tech", true))
            .enableItemConverter(typeSection.getBoolean("enable-item-converter-machine", true))
            .customBc(typeSection.getBoolean("custom-bc", false)).build();
      }
    }
    return supremeOptions;
  }

  public static SupremeLocalization getLocalization() {
    if (localization == null) {
      localization = new SupremeLocalization(inst());
      localization.addLanguage(getSupremeOptions().getLang());
    }
    return localization;
  }

  public static List<CompatibilySupremeLegacyItem> getLegacyItem() {
    if (legacyItem == null || legacyItem.isEmpty()) {
      if (legacyItem == null) {
        legacyItem = new ArrayList<>();
      }
      loadComponents(legacyItem);
      loadGear(legacyItem);
      loadGenerators(legacyItem);
      loadMachines(legacyItem);
      loadCoreResource(legacyItem);
    }
    return legacyItem;
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

  public static int getValueGeneratorsWithLimit(int value) {
    return getSupremeOptions().isLimitProductionGenerators() ? (value / 5) : value;
  }

  public static String buildNameTier(String newName, Integer tier) {
    switch (tier) {
      case 1:
        return ChatColor.GRAY + newName + " I";
      case 2:
        return ChatColor.DARK_GREEN + newName + " II";
      case 3:
        return ChatColor.GREEN + newName + " III";
      case 4:
        return ChatColor.DARK_BLUE + newName + " IV";
      case 5:
        return ChatColor.BLUE + newName + " V";
      case 6:
        return ChatColor.GOLD + newName + " VI";
      case 7:
        return ChatColor.YELLOW + newName + " VII";
      case 8:
        return ChatColor.DARK_RED + newName + " VIII";
      case 9:
        return ChatColor.DARK_PURPLE + newName + " IX";
      default:
        return ChatColor.DARK_GRAY + newName;
    }
  }

  public static String buildIdTier(String newName, Integer tier) {
    switch (tier) {
      case 1:
        return newName + "_I";
      case 2:
        return newName + "_II";
      case 3:
        return newName + "_III";
      case 4:
        return newName + "_IV";
      case 5:
        return newName + "_V";
      case 6:
        return newName + "_VI";
      case 7:
        return newName + "_VII";
      case 8:
        return newName + "_VIII";
      case 9:
        return newName + "_IX";
      default:
        return newName + "_0";
    }
  }

  public static String buildLoreRadioactivityType(MobTechType mobTechType) {
    Radioactivity radioactivity;
    switch (mobTechType) {
      case MUTATION_INTELLIGENCE:
      case MUTATION_BERSERK:
      case MUTATION_LUCK:
        radioactivity = Radioactivity.VERY_DEADLY;
        break;
      case ROBOTIC_CLONING:
      case ROBOTIC_ACCELERATION:
      case ROBOTIC_EFFICIENCY:
        radioactivity = Radioactivity.HIGH;
        break;
      case SIMPLE:
      default:
        radioactivity = Radioactivity.LOW;
    }
    return radioactivity.getLore();
  }

  public static String buildLoreType(MobTechType mobTechType, Integer tier) {
    switch (mobTechType) {
      case MUTATION_BERSERK:
      case ROBOTIC_ACCELERATION:
        return ChatColor.YELLOW + String.valueOf(tier + 1) + "x " + ChatColor.GRAY
            + "increase speed " + ChatColor.GRAY + "increase energy";
      case MUTATION_LUCK:
      case ROBOTIC_CLONING:
        return buildLoreTypeLuckAndCloning(tier);
      case MUTATION_INTELLIGENCE:
      case ROBOTIC_EFFICIENCY:
        return ChatColor.YELLOW + String.valueOf(tier + 1) + "0% " + ChatColor.GRAY
            + " decrease energy";
      case SIMPLE:
      default:
        return ChatColor.GRAY + "Increases processing speed";
    }
  }

  private static String buildLoreTypeLuckAndCloning(Integer tier) {
    if (tier >= 8) {
      return ChatColor.YELLOW + "5x " + ChatColor.GRAY + "Stack clone";
    } else if (tier >= 6) {
      return ChatColor.YELLOW + "4x " + ChatColor.GRAY + "Stack clone";
    } else if (tier >= 4) {
      return ChatColor.YELLOW + "3x " + ChatColor.GRAY + "Stack clone";
    } else {
      return ChatColor.YELLOW + "2x " + ChatColor.GRAY + "Stack clone";
    }
  }

  private static String buildLoreTypeAmount(MobTechType mobTechType, Integer tier) {
    switch (mobTechType) {
      case MUTATION_BERSERK:
      case ROBOTIC_ACCELERATION:
        return ChatColor.YELLOW + "increase speed (" + String.valueOf(tier + 1)
            + " x amount stack x 0.5)  "
            + "increase energy (" + String.valueOf(tier + 1) + " x amount stack x 0.15625)"
            + ChatColor.GRAY
            + " value process";
      case MUTATION_INTELLIGENCE:
      case ROBOTIC_EFFICIENCY:
        return ChatColor.YELLOW + "decrease energy (" + String.valueOf(tier + 1)
            + " x amount stack x 0.15625)" + ChatColor.GRAY
            + " value process";
      case MUTATION_LUCK:
      case ROBOTIC_CLONING:
        return ChatColor.YELLOW + "(" + String.valueOf(tier + 1) + "x amount stack)"
            + ChatColor.GRAY
            + " value process (limit 64x)";
      case SIMPLE:
      default:
        return ChatColor.YELLOW + "1x amount stack" + ChatColor.GRAY + " value process";
    }
  }

  public static SlimefunItemStack buildItemFromMobTechDTO(MobTechGeneric mobTechGeneric,
      Integer tier) {
    return new SlimefunItemStack(buildIdTier(mobTechGeneric.getId(), tier),
        mobTechGeneric.getTexture(),
        buildNameTier(mobTechGeneric.getName(), tier), "",
        buildLoreRadioactivityType(mobTechGeneric.getMobTechType()),
        buildLoreType(mobTechGeneric.getMobTechType(), tier),
        buildLoreTypeAmount(mobTechGeneric.getMobTechType(), tier), "", "&3Supreme Component");
  }

  public static AbstractQuarryOutput getOutputQuarry(@Nonnull SlimefunItemStack item) {

    ConfigurationSection typeSection = inst().getConfig()
        .getConfigurationSection("quarry-custom-output");

    if (typeSection == null) {
      inst().log(Level.SEVERE,
          "Config section \"quarry-custom-output\" missing, Check your config and report this!");
      return null;
    }

    // find path
    String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();
    ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);

    List<AbstractQuarryOutputItem> outputItems = new ArrayList<>();
    if (itemSection != null) {
      int checkLimitChance = 0;
      for (int i = 1; i <= 12; i++) {
        ConfigurationSection itemConfig = itemSection.getConfigurationSection(String.valueOf(i));
        if (itemConfig == null || checkLimitChance >= 100) {
          break;
        }
        int chance = itemConfig.getInt("chance");
        if (checkLimitChance + chance >= 100) {
          chance = 100 - checkLimitChance;
        }
        final String itemId = itemConfig.getString("item");
        if (itemConfig.getBoolean("is-slimefun")) {
          SlimefunItem slimefunItem = SlimefunItem.getById(itemId);
          //check Legacy Supreme
          if (slimefunItem == null && getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
            slimefunItem = SlimefunItem.getById(getOldIdSupremeLegacy(itemId));
          }
          if (slimefunItem != null) {
            outputItems.add(
                AbstractQuarryOutputItem.builder().itemStack(slimefunItem.getItem().clone())
                    .chance(getSupremeOptions().isLimitProductionQuarry() ? (chance / 2) : chance)
                    .build());
          }
        } else {
          final Material material = Material.matchMaterial(itemId);
          if (material != null) {
            outputItems.add(AbstractQuarryOutputItem.builder().itemStack(new ItemStack(material, 1))
                .chance(getSupremeOptions().isLimitProductionQuarry() ? (chance / 2) : chance)
                .build());
          }
        }
        checkLimitChance = checkLimitChance + chance;
      }
    } else {
      inst().log(Level.SEVERE,
          "Config section for " + itemPath + " missing, Check your config and report this!");
    }

    return AbstractQuarryOutput.builder().outputItems(outputItems).build();
  }

  @Override
  public void onEnable() {

    instance = this;

    Supreme.inst().log(Level.INFO, "########################################");
    Supreme.inst().log(Level.INFO, "      Supreme 2.0  - By RelativoBR      ");
    Supreme.inst().log(Level.INFO, "########################################");

    Config cfg = new Config(this);
    if (getSupremeOptions() == null) {
      log(Level.SEVERE, "Config section \"options\" missing, Check your config and report this!");
      inst().onDisable();
      return;
    }

    if (getSupremeOptions().isAutoUpdate() && cfg.getBoolean("options.auto-update")
        && getDescription().getVersion()
        .startsWith("DEV - ")) {
      Supreme.inst().log(Level.INFO, "Auto Update: enable");
      new GitHubBuildsUpdater(this, getFile(), "RelativoBR/Supreme/main").start();
    } else {
      Supreme.inst().log(Level.INFO, "Auto Update: disable");
    }

    // localization
    Supreme.inst().log(Level.INFO, "Loaded language Supreme: " + getSupremeOptions().getLang());
    getLocalization();

    // check Compatibily Legacy (SupremeExpansion)
    if (getSupremeOptions().isUseLegacySupremeexpansionItemId()) {
      Supreme.inst().log(Level.INFO, "Legacy SupremeExpansion IDs: enable");
      getLegacyItem();
    } else {
      Supreme.inst().log(Level.INFO, "Legacy SupremeExpansion IDs: disable");
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
      String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();

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
      String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();

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

  public final void log(Level level, String messages) {
    this.getLogger().log(level, messages);
  }

}
