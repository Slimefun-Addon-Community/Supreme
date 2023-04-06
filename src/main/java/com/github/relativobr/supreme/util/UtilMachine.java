package com.github.relativobr.supreme.util;

import java.util.concurrent.atomic.AtomicInteger;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class UtilMachine {

  public static int getRandomInt() {
    return (int) (Math.random() * ((100 - 1) + 1)) + 1;
  }

  public static ItemStack getMaterial(ItemStack[] output, int randomInt) {
    AtomicInteger startValue = new AtomicInteger(0);
    AtomicInteger nextValue = new AtomicInteger(0);
    ItemStack item = null;
    for (ItemStack itemStack : output) {
      nextValue.set(startValue.get() + itemStack.getAmount());
      if (startValue.get() <= randomInt && nextValue.get() >= randomInt) {
        item = itemStack;
        break;
      }
      startValue.set(nextValue.get());
    }
    return item;
  }

  public static boolean containsLimitMaterialInChunk(Chunk chunk, int limit, Material type) {
    int found = 0;
    for(int y = -64; y <= 320; y++) {
      for(int x = 0; x <= 15; x++) {
        for(int z = 0; z <= 15; z++) {
          if(chunk.getBlock(x, y, z).getType() == type) {
            if(found > limit) {
              return true;
            } else {
              found++;
            }
          }
        }
      }
    }
    return found > limit;
  }

}
