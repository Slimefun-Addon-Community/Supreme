package com.github.relativobr.generic.util;

import javax.annotation.Nonnull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Waterlogged;

public class UtilCheckBlock {

  public static boolean checkUnderWater(@Nonnull Block b) {
    return b.getRelative(BlockFace.DOWN).getType().equals(Material.WATER);
  }

  public static boolean checkInWater(@Nonnull Block b) {
    BlockData blockData = b.getBlockData();
    if (blockData instanceof Waterlogged) {
      Waterlogged waterLogged = (Waterlogged) blockData;
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
    final Location location = b.getLocation();
    final World world = location.getWorld();
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
    final Location location = b.getLocation();
    final World world = location.getWorld();
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
    final Location location = b.getLocation();
    final World world = location.getWorld();
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
    final Location l = b.getLocation();
    final World world = l.getWorld();
    if (world != null) {
      if (world.getEnvironment() == World.Environment.NETHER) {
        return true;
      } else if (world.getEnvironment() == World.Environment.THE_END) {
        return true;
      } else {
        return (l.add(0, 1, 0).getBlock().getLightFromSky() != 15);
      }
    }
    return false;
  }

  public static boolean checkSky(@Nonnull Block b) {
    final Location l = b.getLocation();
    final World world = l.getWorld();
    if (world != null) {
      return (l.add(0, 1, 0).getBlock().getLightFromSky() >= 15);
    }
    return false;
  }

}
