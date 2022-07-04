package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getOldIdSupremeLegacy;

import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.ArrayUtils;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;

public class SupremeItemStack extends SlimefunItemStack {

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material, @Nullable String name, String... lor) {
    super(getOldIdSupremeLegacy(id), material, name, lor);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material) {
    super(getOldIdSupremeLegacy(id), material, Supreme.getLocalization().getItemName(id),
        Supreme.getLocalization().getItemLore(id));
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull Material material, boolean suffixLore, String... lor) {
    super(getOldIdSupremeLegacy(id), material, Supreme.getLocalization().getItemName(id),
        getMultipleLore(id, suffixLore, lor));
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture, @Nullable String name, String... lor) {
    super(getOldIdSupremeLegacy(id), texture, name, lor);
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture) {
    super(getOldIdSupremeLegacy(id), texture, Supreme.getLocalization().getItemName(id),
        Supreme.getLocalization().getItemLore(id));
  }

  public SupremeItemStack(@Nonnull String id, @Nonnull String texture, boolean suffixLore, String... lor) {
    super(getOldIdSupremeLegacy(id), texture, Supreme.getLocalization().getItemName(id),
        getMultipleLore(id, suffixLore, lor));
  }

  private static String[] getMultipleLore(@Nonnull String id, boolean suffixLore, String... lor) {
    if (lor.length == 0) {
      return Supreme.getLocalization().getItemLore(id);
    }
    String[] itemLore;
    if (suffixLore) {
      itemLore = (String[]) ArrayUtils.addAll(Supreme.getLocalization().getItemLore(id), lor);
    } else {
      itemLore = (String[]) ArrayUtils.addAll(lor, Supreme.getLocalization().getItemLore(id));
    }
    return itemLore;
  }

}
