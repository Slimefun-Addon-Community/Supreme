package com.github.relativobr.generic.electric;

import com.github.relativobr.generic.util.UtilCheckBlock;
import com.github.relativobr.supreme.Supreme;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import javax.annotation.Nonnull;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

public final class EnergyGenerator extends SlimefunItem implements EnergyNetProvider {

  private int delayTick = 0;
  private int processTick = 0;
  private int energy;
  private int buffer;
  private Type type;

  public EnergyGenerator(ItemGroup categories, SlimefunItemStack item, ItemStack[] recipe) {
    super(categories, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
  }

  public Type getType() {
    return type;
  }

  public final EnergyGenerator setType(Type value) {
    this.type = value;
    return this;
  }

  public final EnergyGenerator setEnergy(int value) {
    final int i = value / 2;
    this.energy = Math.round(i);
    return this;
  }

  public final EnergyGenerator setBuffer(int value) {
    this.buffer = value;
    return this;
  }

  @Nonnull
  @Override
  public EnergyNetComponentType getEnergyComponentType() {
    return EnergyNetComponentType.GENERATOR;
  }

  @Override
  public int getGeneratedOutput(Location l, Config config) {
    return validateLocation(l) ? energy : 0;
  }

  @Override
  public int getCapacity() {
    return this.buffer;
  }

  private boolean validateLocation(Location l) {
    if(this.delayTick == 0){
      this.delayTick = Supreme.getSupremeOptions().getDelayCheckGenerators();
    }
    if(this.processTick <= this.delayTick){
      this.processTick++;
      return true;
    } else {
      this.processTick = 0;
    }
    Block b = l.getBlock();
    final Type generatorType = this.type;
    if (generatorType == Type.EVERY) {
      return true;
    } else if (generatorType == Type.DAY) {
      return UtilCheckBlock.checkDay(b) && UtilCheckBlock.checkSky(b);
    } else if (generatorType == Type.NIGHT) {
      return UtilCheckBlock.checkNight(b) && UtilCheckBlock.checkSky(b);
    } else if (generatorType == Type.SKY) {
      return UtilCheckBlock.checkSky(b);
    } else if (generatorType == Type.FIRE) {
      return UtilCheckBlock.checkUnderFire(b);
    } else if (generatorType == Type.WATER) {
      return UtilCheckBlock.checkUnderWater(b);
    } else if (generatorType == Type.WIND) {
      return UtilCheckBlock.checkWind(b);
    } else if (generatorType == Type.DARK) {
      return UtilCheckBlock.checkDark(b);
    }
    return false;
  }

  public enum Type {
    DAY,
    NIGHT,
    FIRE,
    WATER,
    WIND,
    SKY,
    DARK,
    EVERY,
  }

}
