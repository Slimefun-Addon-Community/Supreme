package com.github.relativobr.supreme;

import java.text.MessageFormat;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import net.guizhanss.guizhanlib.localization.Localization;
import net.guizhanss.guizhanlib.utils.ChatUtil;
import net.guizhanss.guizhanlib.utils.StringUtil;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.entity.Player;

public class SupremeLocalization extends Localization {

  public SupremeLocalization(Supreme plugin) {
    super(plugin);
  }

  @ParametersAreNonnullByDefault
  public @Nonnull
  String getString(String key, Object... args) {
    return MessageFormat.format(getString(key), args);
  }

  public @Nonnull
  String getCategoryName(@Nonnull String categoryId) {
    Validate.notNull(categoryId, "Category Id cannot be null");

    return getString("categories." + StringUtil.dehumanize(categoryId).toLowerCase(Locale.ROOT));
  }

  public @Nonnull
  String getItemName(@Nonnull String itemId) {
    Validate.notNull(itemId, "Item Id cannot be null");

    return getString("items." + StringUtil.dehumanize(itemId).toLowerCase(Locale.ROOT) + ".name");
  }

  public @Nonnull
  String[] getItemLore(@Nonnull String itemId) {
    Validate.notNull(itemId, "Item Id cannot be null");

    return getStringArray("items." + StringUtil.dehumanize(itemId).toLowerCase(Locale.ROOT) + ".lore");
  }

  public @Nonnull
  String getResearchName(@Nonnull String researchId) {
    Validate.notNull(researchId, "Research Id cannot be null");

    return getString("researches." + StringUtil.dehumanize(researchId).toLowerCase(Locale.ROOT));
  }

  @ParametersAreNonnullByDefault
  public void sendMessage(Player p, String messageKey, Object... args) {
    Validate.notNull(p, "Player cannot be null");
    Validate.notNull(messageKey, "Message key cannot be null");

    ChatUtil.send(p, MessageFormat.format(getString("messages." + messageKey), args));
  }

  @ParametersAreNonnullByDefault
  public void sendActionbarMessage(Player p, String messageKey, Object... args) {
    Validate.notNull(p, "Player cannot be null");
    Validate.notNull(messageKey, "Message key cannot be null");

    String message = MessageFormat.format(getString("messages." + messageKey), args);

    BaseComponent[] components = TextComponent.fromLegacyText(ChatUtil.color(message));
    p.spigot().sendMessage(ChatMessageType.ACTION_BAR, components);
  }

}
