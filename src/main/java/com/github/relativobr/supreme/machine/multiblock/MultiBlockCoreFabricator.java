package com.github.relativobr.supreme.machine.multiblock;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.multiblocks.MultiBlockMachine;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Dispenser;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MultiBlockCoreFabricator extends MultiBlockMachine implements NotPlaceable {

  public static final SlimefunItemStack CORE_FABRICATOR = new SupremeItemStack("SUPREME_MULTIBLOCK_CORE",
      Material.SHROOMLIGHT, "&eCore Fabricator", "", "&7&oYou can craft core here!", "", "&aMultiBlock Machine");
  public static final RecipeType MACHINE_CORE_FABRICATOR = new RecipeType(
      new NamespacedKey(Supreme.inst(), "SUPREME_MULTIBLOCK_CORE_KEY"), CORE_FABRICATOR);

  @ParametersAreNonnullByDefault
  public MultiBlockCoreFabricator() {
    super(ItemGroups.MACHINES_CATEGORY, CORE_FABRICATOR,
        new ItemStack[]{new ItemStack(Material.SHROOMLIGHT), new ItemStack(Material.ORANGE_STAINED_GLASS),
            new ItemStack(Material.SHROOMLIGHT), new ItemStack(Material.IRON_BARS),
            new ItemStack(Material.IRON_TRAPDOOR), new ItemStack(Material.IRON_BARS),
            new ItemStack(Material.GOLD_BLOCK), new ItemStack(Material.DISPENSER), new ItemStack(Material.GOLD_BLOCK)},
        new ItemStack[0], BlockFace.SELF);
  }

  public static RecipeType getMachine() {
    return MACHINE_CORE_FABRICATOR;
  }

  @Override
  public void onInteract(Player p, Block b) {

    Block dispenser = b.getRelative(BlockFace.DOWN);
    if (!dispenser.isEmpty()) {

      Inventory inv = ((Dispenser) dispenser.getState()).getInventory();
      List<ItemStack[]> inputs = RecipeType.getRecipeInputList(this);

      recipe:
      for (ItemStack[] input : inputs) {
        for (int i = 0; i < inv.getContents().length; i++) {
          if (!SlimefunUtils.isItemSimilar(inv.getContents()[i], input[i], false, true)) {
            continue recipe;
          }
        }

        ItemStack output = RecipeType.getRecipeOutputList(this, input);
        SlimefunItem outputItem = SlimefunItem.getByItem(output);

        if (outputItem == null || outputItem.canUse(p, true)) {

          Inventory outputInv = findOutputInventory(output, dispenser, inv);
          boolean canFit = false;
          for (int i = 0; i < inv.getContents().length; i++) {
            if (inv.getContents()[i] != null
                || inv.getContents()[i].getAmount() == inv.getContents()[i].getMaxStackSize() || outputInv != null) {
              canFit = true;
            }
          }

          if (!canFit) {
            Slimefun.getLocalization().sendMessage(p, "machines.full-inventory", true);
            return;
          }

          for (int i = 0; i < inv.getContents().length; i++) {
            ItemStack item = inv.getItem(i);
            if (item != null) {
              ItemUtils.consumeItem(item, input[i].getAmount(), false);
            }
          }

          Bukkit.getScheduler().runTaskLater(Supreme.inst(),
              () -> p.getWorld().playSound(dispenser.getLocation(), Sound.BLOCK_LAVA_EXTINGUISH, 1F, 1F), 55L);
          for (int i = 1; i < 7; i++) {
            Bukkit.getScheduler().runTaskLater(Supreme.inst(),
                () -> p.getWorld().playSound(dispenser.getLocation(), Sound.BLOCK_METAL_PLACE, 7F, 1F), i * 5L);
          }

          if (outputInv != null) {
            outputInv.addItem(output);
          } else {
            inv.addItem(output);
          }
        }

        return;
      }
    }

    Slimefun.getLocalization().sendMessage(p, "machines.pattern-not-found", true);
  }
}
