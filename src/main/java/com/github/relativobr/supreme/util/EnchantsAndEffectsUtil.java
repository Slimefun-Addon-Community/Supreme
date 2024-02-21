package com.github.relativobr.supreme.util;

import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.logging.Level;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getNewIdSupremeLegacy;

public class EnchantsAndEffectsUtil {

    public static void addGearThorniumEnchants(@Nonnull SlimefunItemStack... items) {

        ConfigurationSection typeSection = Supreme.inst().getConfig().getConfigurationSection("supreme-enchant");

        if (typeSection == null) {
            Supreme.inst().log(Level.SEVERE,
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

            buildLoreEffects(lore, itemPath);

            meta.setLore(lore);

            ConfigurationSection itemSection = typeSection.getConfigurationSection(itemPath);
            if (itemSection != null) {
                // unbreakable and enchants
                meta.setUnbreakable(itemSection.getBoolean("unbreakable"));
                for (Map.Entry<Enchantment, Integer> entry : getEnchants(itemSection).entrySet()) {
                    meta.addEnchant(entry.getKey(), entry.getValue(), true);
                }
            } else {
                Supreme.inst().log(Level.SEVERE,
                        "Config section for " + itemPath + " missing, Check your config and report this!");
            }

            // add meta
            item.setItemMeta(meta);

        }
    }

    public static void addGearBasicEnchants(@Nonnull SlimefunItemStack... items) {
        ConfigurationSection typeSection = Supreme.inst().getConfig().getConfigurationSection("supreme-enchant");

        if (typeSection == null) {
            Supreme.inst().log(Level.SEVERE,
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
                Supreme.inst().log(Level.SEVERE,
                        "Config section for " + itemPath + " missing, Check your config and report this!");
            }

            // add meta
            item.setItemMeta(meta);

        }
    }

    @Nonnull
    private static Map<Enchantment, Integer> getEnchants(@Nonnull ConfigurationSection section) {

        Map<Enchantment, Integer> enchants = new HashMap<>();
        for (String path : section.getKeys(false)) {
            Enchantment e = Enchantment.getByKey(NamespacedKey.minecraft(path));
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


    public static PotionEffect[] getPotionEffects(SlimefunItemStack item) {

        PotionEffect[] effect = new PotionEffect[]{};

        ConfigurationSection typeSectionEffects = Supreme.inst().getConfig().getConfigurationSection("supreme-effect");

        if (typeSectionEffects == null) {
            Supreme.inst().log(Level.SEVERE,
                    "Config section \"supreme-enchant\" missing, Check your config and report this!");
            return effect;
        }

        // find path
        String itemPath = getNewIdSupremeLegacy(item.getItemId()).toLowerCase();

        // ignore basic armor effects
        if (itemPath.contains("adamantium")
                || itemPath.contains("aurum")
                || itemPath.contains("titanium")) {
            return effect;
        }

        int amplifier = getAmplifier(typeSectionEffects, itemPath);

        if (itemPath.contains("helmet")) {
            effect = getEffects(effect, amplifier, typeSectionEffects.getConfigurationSection("helmet"));
        } else if (itemPath.contains("chestplate")) {
            effect = getEffects(effect, amplifier, typeSectionEffects.getConfigurationSection("chestplate"));
        } else if (itemPath.contains("leggings")) {
            effect = getEffects(effect, amplifier, typeSectionEffects.getConfigurationSection("leggings"));
        } else if (itemPath.contains("boots")) {
            effect = getEffects(effect, amplifier, typeSectionEffects.getConfigurationSection("boots"));
        }

        return effect;

    }

    private static void buildLoreEffects(List<String> lore, String itemPath) {

        ConfigurationSection typeSectionEffects = Supreme.inst().getConfig().getConfigurationSection("supreme-effect");

        if (typeSectionEffects == null) {
            Supreme.inst().log(Level.SEVERE,
                    "Config section \"supreme-enchant\" missing, Check your config and report this!");
            return;
        }

        String amplifier = buildLoreAmplifier(getAmplifier(typeSectionEffects, itemPath));

        if (itemPath.contains("helmet")) {
            for (String nameEffect : getNamesEffects(typeSectionEffects.getConfigurationSection("helmet"))) {
                lore.add(ChatColor.DARK_PURPLE + nameEffect + amplifier);
            }
        } else if (itemPath.contains("chestplate")) {
            for (String nameEffect : getNamesEffects(typeSectionEffects.getConfigurationSection("chestplate"))) {
                lore.add(ChatColor.DARK_PURPLE + nameEffect + amplifier);
            }
        } else if (itemPath.contains("leggings")) {
            for (String nameEffect : getNamesEffects(typeSectionEffects.getConfigurationSection("leggings"))) {
                lore.add(ChatColor.DARK_PURPLE + nameEffect + amplifier);
            }
        } else if (itemPath.contains("boots")) {
            for (String nameEffect : getNamesEffects(typeSectionEffects.getConfigurationSection("boots"))) {
                lore.add(ChatColor.DARK_PURPLE + nameEffect + amplifier);
            }
        }
    }

    private static String buildLoreAmplifier(int amplifier) {
        switch (amplifier) {
            case 0:
                return " I";
            case 1:
                return " II";
            case 2:
                return " III";
            case 3:
                return " IV";
            case 4:
                return " V";
            case 5:
                return " VI";
            case 6:
                return " VII";
            case 7:
                return " VIII";
            case 8:
                return " IX";
            case 9:
                return " X";
            default:
                return "";
        }
    }

    private static int getAmplifier(ConfigurationSection typeSection, String itemPath) {
        int amplifier = 0;
        if (itemPath.endsWith("supreme")) {
            amplifier = typeSection.getInt("amplifier_supreme", 3);
        } else if (itemPath.endsWith("legendary")) {
            amplifier = typeSection.getInt("amplifier_legendary", 3);
        } else if (itemPath.endsWith("epic")) {
            amplifier = typeSection.getInt("amplifier_epic", 2);
        } else if (itemPath.endsWith("rare")) {
            amplifier = typeSection.getInt("amplifier_rare", 2);
        } else if (itemPath.endsWith("magic")) {
            amplifier = typeSection.getInt("amplifier_magic", 1);
        } else if (itemPath.endsWith("thornium")) {
            amplifier = typeSection.getInt("amplifier_thornium", 1);
        }
        // fix start value 0
        amplifier--;
        // fix max value 10
        if (amplifier > 10) {
            amplifier = 10;
        }
        // fix min value 0
        if (amplifier < 0) {
            amplifier = 0;
        }
        return amplifier;
    }

    private static PotionEffect[] getEffects(PotionEffect[] effect, int amplifier, ConfigurationSection section) {
        if (section != null) {
            List<PotionEffect> potionEffects = new ArrayList<>();
            for (String key : section.getKeys(true)) {
                PotionEffectType potionEffectType = PotionEffectType.getByName(key);
                // check enable
                if (section.getBoolean(key) && potionEffectType != null) {
                    potionEffects.add(new PotionEffect(potionEffectType, 600, amplifier, false, false, false));
                }
            }
            if (potionEffects.size() > 0) {
                effect = potionEffects.toArray(new PotionEffect[]{});
            }
        }
        return effect;
    }

    private static List<String> getNamesEffects(ConfigurationSection section) {
        List<String> names = new ArrayList<>();
        if (section != null) {
            for (String key : section.getKeys(true)) {
                PotionEffectType potionEffectType = PotionEffectType.getByName(key);
                // check enable
                if (section.getBoolean(key) && potionEffectType != null) {
                    String name = potionEffectType.getName();
                    name = name.replace("_", " ");
                    name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
                    names.add(name);
                }
            }
        }
        return names;
    }

}
