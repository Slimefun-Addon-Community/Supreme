package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.util.ItemGroups;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import lombok.Getter;
import lombok.Setter;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.Lightable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class CheckInventory extends SlimefunItem implements InventoryBlock {

  public static final SlimefunItemStack CHECK_INVENTORY = new SlimefunItemStack("SUPREME_CHECK_INVENTORY",
      Material.REDSTONE_LAMP, "&bCheckInventory", "", "&fChecks if the nearby chest has the filter item",
      "&fall faces are being considered (find first)", "&fif found, this block will light up", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      LoreBuilder.speed(1), UtilEnergy.energyPowerPerSecond(0), "", "&3Supreme Machine");
  private static final ItemStack[] RECIPE_CHECK_INVENTORY = new ItemStack[]{SupremeComponents.ALLOY_AURUM,
      new ItemStack(Material.REDSTONE_LAMP), SupremeComponents.ALLOY_AURUM, SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE, new ItemStack(Material.REDSTONE_BLOCK),
      new ItemStack(Material.COMPARATOR), new ItemStack(Material.REDSTONE_BLOCK)};

  public static void setup(Supreme plugin) {

    new CheckInventory(ItemGroups.MACHINES_CATEGORY, CheckInventory.CHECK_INVENTORY, RecipeType.ENHANCED_CRAFTING_TABLE,
        CheckInventory.RECIPE_CHECK_INVENTORY).register(plugin);

  }

  private static int MAIN_SLOT = 13;
  private static int[] BORDER_SLOT = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
      24, 25, 26};
  private int countDelayTick = 0;

  @Getter
  @Setter
  private static boolean light = false;

  @ParametersAreNonnullByDefault
  public CheckInventory(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
    addItemHandler(onBlockBreak());
    new BlockMenuPreset(getId(), getItemName()) {

      @Override
      public void init() {
        constructMenu(this);
      }

      @Override
      public boolean canOpen(Block b, Player p) {
        return p.hasPermission("slimefun.inventory.bypass") || Slimefun.getProtectionManager()
            .hasPermission(p, b.getLocation(), Interaction.INTERACT_BLOCK);
      }

      @Override
      public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
        if (flow == ItemTransportFlow.INSERT) {
          return getInputSlots();
        } else {
          return getOutputSlots();
        }
      }
    };
  }

  @Override
  public void preRegister() {
    addItemHandler(new BlockTicker() {

      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        CheckInventory.this.tick(b);
      }

      @Override
      public boolean isSynchronized() {
        return false;
      }

    });
  }

  private void tick(Block b) {
    if (countDelayTick < 8) {
      countDelayTick++;
      return;
    }
    countDelayTick = 0;
    if (!BlockStorage.hasInventory(b) || !(b.getBlockData() instanceof Lightable)) {
      BlockStorage.clearBlockInfo(b);
      return;
    }
    BlockMenu inv = BlockStorage.getInventory(b);
    final ItemStack itemStack = inv.getItemInSlot(MAIN_SLOT);
    if (itemStack == null) {
      if (isLight()) {
        changeLightable(b, false);
      }
      return;
    }

    final Block blockTarget = Stream.of(b.getRelative(BlockFace.DOWN), b.getRelative(BlockFace.UP),
        b.getRelative(BlockFace.NORTH), b.getRelative(BlockFace.EAST), b.getRelative(BlockFace.SOUTH),
        b.getRelative(BlockFace.WEST)).filter(
        x -> Material.TRAPPED_CHEST.equals(x.getType()) || Material.CHEST.equals(x.getType()) || Material.BARREL.equals(
            x.getType())).findFirst().orElse(null);

    checkItemInInventory(itemStack, b, blockTarget);
  }

  public static void checkItemInInventory(@Nonnull ItemStack itemStack, @Nonnull Block block, Block blockTarget) {
    if (blockTarget != null) {
      Bukkit.getScheduler().scheduleSyncDelayedTask(Supreme.inst(), (Runnable) () -> {
        final BlockState targetState = blockTarget.getState();
        if (targetState instanceof InventoryHolder) {
          final Inventory targetInv = ((InventoryHolder) targetState).getInventory();
          final int amountMatch = Arrays.stream(targetInv.getContents()).filter(Objects::nonNull)
              .filter(itemInv -> (SlimefunUtils.isItemSimilar(itemStack, itemInv, false, false)))
              .mapToInt(ItemStack::getAmount).sum();
          changeLightable(block, itemStack.getAmount() <= amountMatch);
        } else {
          changeLightable(block, false);
        }
      }, 1);
    }
  }

  private static void changeLightable(Block b, boolean status) {
    setLight(status);
    if (b.getBlockData() instanceof Lightable) {
      Lightable lightable = (Lightable) b.getBlockData();
      lightable.setLit(status);
      b.setBlockData(lightable);
    }
  }

  private void constructMenu(BlockMenuPreset menu) {
    for (int slot : BORDER_SLOT) {
      buildMenuBorder(menu, slot);
    }
  }

  private void buildMenuBorder(BlockMenuPreset menu, int slot) {
    menu.addItem(slot, new CustomItemStack(Material.WHITE_STAINED_GLASS_PANE, " "),
        ChestMenuUtils.getEmptyClickHandler());
    menu.addMenuClickHandler(slot, ChestMenuUtils.getEmptyClickHandler());
  }

  @Override
  public int[] getInputSlots() {
    return new int[]{MAIN_SLOT};
  }

  @Override
  public int[] getOutputSlots() {
    return new int[]{MAIN_SLOT};
  }

  @Nonnull
  protected BlockBreakHandler onBlockBreak() {
    return new SimpleBlockBreakHandler() {
      public void onBlockBreak(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        if (inv != null) {
          inv.dropItems(b.getLocation(), getInputSlots());
          inv.dropItems(b.getLocation(), getOutputSlots());
        }
      }
    };
  }
}
