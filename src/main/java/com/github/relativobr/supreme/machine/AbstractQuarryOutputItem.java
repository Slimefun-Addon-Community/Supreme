package com.github.relativobr.supreme.machine;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class AbstractQuarryOutputItem {

  ItemStack itemStack;
  int chance;

}
