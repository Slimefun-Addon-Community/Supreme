package com.github.relativobr.supreme;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadComponents;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadCoreResource;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGear;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadGenerators;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.loadMachines;

import com.github.relativobr.supreme.setup.MainSetup;
import com.github.relativobr.supreme.util.CompatibilySupremeLegacyItem;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.bukkit.configuration.ConfigurationSection;
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
            .maxAmountTechGenerator(typeSection.getInt("tech-generator-max-amount", 64))
            .mobTechEnableBee(typeSection.getBoolean("mob-tech-enable-bee", true))
            .mobTechEnableIronGolem(typeSection.getBoolean("mob-tech-enable-iron-golem", true))
            .mobTechEnableZombie(typeSection.getBoolean("mob-tech-enable-zombie", true))
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

  public final void log(Level level, String messages) {
    this.getLogger().log(level, messages);
  }

}
