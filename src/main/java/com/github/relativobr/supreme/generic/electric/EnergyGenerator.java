package com.github.relativobr.supreme.generic.electric;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import javax.annotation.Nonnull;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.inventory.ItemStack;

public final class EnergyGenerator extends SlimefunItem implements EnergyNetProvider {

  private int energy;
  private int buffer;
  private Type type;
//  private static Location location;
//  private static Block blockMachine;
//  private static Block blockDown;
//  private static Block blockNorth;
//  private static Block blockEast;
//  private static Block blockSouth;
//  private static Block blockWest;
//  private static World world;
//  private static BlockData blockData;


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
    Block b = l.getBlock();
    final Type generatorType = this.type;
    if (generatorType == Type.EVERY) {
      return true;
    } else if (generatorType == Type.DAY) {
      return checkDay(b) && checkSky(b);
    } else if (generatorType == Type.NIGHT) {
      return checkNight(b) && checkSky(b);
    } else if (generatorType == Type.SKY) {
      return checkSky(b);
    } else if (generatorType == Type.FIRE) {
      return checkUnderFire(b);
    } else if (generatorType == Type.WATER) {
      return checkUnderWater(b);
    } else if (generatorType == Type.WIND) {
      return checkWind(b);
    } else if (generatorType == Type.DARK) {
      return checkDark(b);
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

  public static boolean checkUnderWater(@Nonnull Block b) {
    return b.getRelative(BlockFace.DOWN).getType().equals(Material.WATER);
  }

  public static boolean checkInWater(@Nonnull Block b) {
    if (b.getBlockData() instanceof Waterlogged) {
      Waterlogged waterLogged = (Waterlogged) b.getBlockData();
      return waterLogged.isWaterlogged();
    }
    return false;
  }

  public static boolean checkUnderFire(@Nonnull Block b) {
    final Material material = b.getRelative(BlockFace.DOWN).getType();
    return material.equals(Material.FIRE)
        || material.equals(Material.SOUL_FIRE)
        || material.equals(Material.LAVA)
        || material.equals(Material.CAMPFIRE)
        || material.equals(Material.SOUL_CAMPFIRE);
  }

  public static boolean checkWind(@Nonnull Block b) {
    World world = b.getLocation().getWorld();
    if (world != null && world.getEnvironment() == World.Environment.THE_END) {
      return false;
    } else {
      return b.getRelative(BlockFace.NORTH).getType().equals(Material.AIR)
          || b.getRelative(BlockFace.EAST).getType().equals(Material.AIR)
          || b.getRelative(BlockFace.SOUTH).getType().equals(Material.AIR)
          || b.getRelative(BlockFace.WEST).getType().equals(Material.AIR);
    }
  }

  public static boolean checkDay(@Nonnull Block b) {
    World world = b.getLocation().getWorld();
    if (world != null) {
      if (world.getEnvironment() == World.Environment.NETHER) {
        return false;
      } else if (world.getEnvironment() == World.Environment.THE_END) {
        return false;
      } else {
        return !world.hasStorm() && !world.isThundering() && world.getTime() <= 13000;
      }
    }
    return false;
  }

  public static boolean checkNight(@Nonnull Block b) {
    World world = b.getLocation().getWorld();
    if (world != null) {
      if (world.getEnvironment() == World.Environment.NETHER) {
        return true;
      } else if (world.getEnvironment() == World.Environment.THE_END) {
        return true;
      } else {
        return world.hasStorm() && world.isThundering() && world.getTime() >= 13000;
      }
    }
    return false;
  }

  public static boolean checkDark(@Nonnull Block b) {
    Location location = b.getLocation();
    World world = location.getWorld();
    if (world != null) {
      if (world.getEnvironment() == World.Environment.NETHER) {
        return true;
      } else if (world.getEnvironment() == World.Environment.THE_END) {
        return true;
      } else {
        return (location.add(0, 1, 0).getBlock().getLightFromSky() != 15);
      }
    }
    return false;
  }

  public static boolean checkSky(@Nonnull Block b) {
    Location location = b.getLocation();
    World world = location.getWorld();
    if (world != null) {
      return (location.add(0, 1, 0).getBlock().getLightFromSky() >= 15);
    }
    return false;
  }

}