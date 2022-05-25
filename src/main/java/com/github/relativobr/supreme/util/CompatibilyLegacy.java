package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CompatibilyLegacy {

  List<CompatibilyLegacyItem> legacyItems;

  @Getter
  @Setter
  @Builder
  @AllArgsConstructor
  public class CompatibilyLegacyItem {

    String oldSupremeID;
    String newSupremeID;

  }

  public static SlimefunItemStack validLegacyItem(SlimefunItemStack itemStack){
    if(getSupremeOptions().isChangeLegacyId()){
      final Optional<CompatibilyLegacyItem> legacyItem = getList().stream()
          .filter(x -> x.getNewSupremeID().equals(itemStack.getItemId())).findFirst();
      legacyItem.ifPresent(x -> Slimefun.getItemDataService()
          .setItemData(itemStack, x.getOldSupremeID()));
    }
    return itemStack;
  }

  public static List<CompatibilyLegacyItem> getList(){
    return List.of(CompatibilyLegacyItem.builder()
        .newSupremeID("SUPREME_SUPREME")
        .oldSupremeID("SUPREME")
        .build(),
        CompatibilyLegacyItem.builder()
            .newSupremeID("SUPREME_THORNIUM_BIT")
            .oldSupremeID("THORNIUM_BIT")
            .build());
  }

}
