package com.github.relativobr.supreme.machine;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.generic.recipe.InventoryRecipe;
import com.github.relativobr.supreme.util.SupremeQuarryOutput;
import com.github.relativobr.supreme.util.ItemUtil;
import com.github.relativobr.supreme.util.UtilEnergy;
import com.github.relativobr.supreme.util.UtilMachine;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemState;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.tags.SlimefunTag;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class AbstractQuarry extends SlimefunItem implements EnergyNetComponent {

  private static final DecimalFormat FORMAT = new DecimalFormat("###,###,##0.00",
      DecimalFormatSymbols.getInstance(Locale.ENGLISH));
  private int tickDelayThreshold = 0;
  private int energyConsumed = -1;
  private int energyCapacity = -1;
  private int energyCharge = 0;
  private boolean enabled = true;
  private boolean effect = true;
  private int delaySpeed = 1;

  private SupremeQuarryOutput output;

  @ParametersAreNonnullByDefault
  public AbstractQuarry(ItemGroup category, SlimefunItemStack machine, ItemStack[] recipe) {
    super(category, machine, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);
    addItemHandler(onPlace(), onRightClick());
  }

  @Nonnull
  public static String format(double number) {
    return FORMAT.format(number);
  }

  @Override
  public void preRegister() {
    addItemHandler(new BlockTicker() {
      @Override
      public void tick(Block b, SlimefunItem sf, Config data) {
        AbstractQuarry.this.tick(b);
      }

      @Override
      public boolean isSynchronized() {
        return true;
      }
    });
  }

  private void tick(Block b) {
    Block targetBlock = b.getRelative(BlockFace.DOWN);
    if (isInvalidInventory(targetBlock) || !this.enabled || getCharge(b.getLocation()) < getEnergyConsumption()) {
      // disabled machine or no energy, abort...
      return;
    }
    BlockState state = targetBlock.getState();
    if (state instanceof InventoryHolder) {

      // The delay is not same as minecraft tick,
      // but it's based on 'custom-ticker-delay' config.
      if (tickDelayThreshold < (getSupremeOptions().getCustomTickerDelay() * delaySpeed)) {
        tickDelayThreshold++;
        return;
      }
      tickDelayThreshold = 0;
      Inventory inv = ((InventoryHolder) state).getInventory();
      if (inv.firstEmpty() != -1) {
        ItemStack material = ItemUtil.getItemQuarry(this.getOutput(), UtilMachine.getRandomInt());
        if (material != null) {
          final ItemStack itemStack = material.clone();
          itemStack.setAmount(1);
          inv.addItem(itemStack);
          if (effect) {
            Location loc = b.getLocation().add(0.5, 0.8, 0.5);
            b.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, loc, 6);
          }
          removeCharge(b.getLocation(), getEnergyConsumption());
          energyCharge = getCharge(b.getLocation());
        }
      }
    }
  }

  @Nonnull
  private BlockPlaceHandler onPlace() {
    return new BlockPlaceHandler(false) {
      @Override
      public void onPlayerPlace(BlockPlaceEvent e) {
        Block b = e.getBlockPlaced();
        BlockStorage.addBlockInfo(b, "owner", e.getPlayer().getUniqueId().toString());
      }
    };
  }

  @Nonnull
  public BlockUseHandler onRightClick() {
    return e -> {
      e.cancel();
      Player p = e.getPlayer();
      Block b = e.getClickedBlock().get();
      energyCharge = getCharge(b.getLocation());
      if (isInvalidInventory(b.getRelative(BlockFace.DOWN))) {
        Slimefun.getLocalization().sendMessage(p, "machines.CARGO_NODES.must-be-placed");
      } else if (BlockStorage.getLocationInfo(b.getLocation(), "owner").equals(p.getUniqueId().toString())
          && Slimefun.getProtectionManager().hasPermission(p, b, Interaction.INTERACT_BLOCK)) {
        showMachine(p, b);
      } else {
        Slimefun.getLocalization().sendMessage(p, "inventory.no-access");
      }
    };
  }

  @ParametersAreNonnullByDefault
  protected void showMachine(Player p, Block b) {

    Validate.notNull(p, "The Player should not be null");
    Validate.notNull(b, "The Block should not be null");
    ChestMenu menu = new ChestMenu(getItemName());
    menu.setPlayerInventoryClickable(false);
    menu.setEmptySlotsClickable(false);

    ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_BORDER);
    ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_OUTPUT);
    ChestMenuUtils.drawBackground(menu, InventoryRecipe.QUARRY_OUTPUT_BORDER);

    for (int i = 0; i < InventoryRecipe.QUARRY_INPUT_BORDER.length; ++i) {
      int slot = InventoryRecipe.QUARRY_INPUT_BORDER[i];
      menu.addItem(slot, ChestMenuUtils.getInputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
    }

    final String powerPerSecond = LoreBuilder.powerPerSecond(getEnergyConsumption());
    final String powerCharged = LoreBuilder.powerCharged(energyCharge, getCapacity());
    final String infoSpeed = UtilEnergy.timePerItem((getSupremeOptions().getCustomTickerDelay() * delaySpeed) / 2);
    if (energyCharge < getEnergyConsumption() || !this.enabled) {
      menu.addItem(InventoryRecipe.QUARRY_STATUS,
          new CustomItemStack(Material.OBSIDIAN, ChatColor.RED + "NOT-ACTIVE", powerPerSecond, powerCharged,
              infoSpeed));
      menu.addMenuClickHandler(InventoryRecipe.QUARRY_STATUS, ChestMenuUtils.getEmptyClickHandler());
    } else {
      menu.addItem(InventoryRecipe.QUARRY_STATUS,
          new CustomItemStack(Material.GLOWSTONE, ChatColor.GREEN + "ACTIVE", powerPerSecond, powerCharged, infoSpeed));
      menu.addMenuClickHandler(InventoryRecipe.QUARRY_STATUS, ChestMenuUtils.getEmptyClickHandler());
    }
    if (enabled) {
      menu.addItem(InventoryRecipe.QUARRY_BUTTON, new CustomItemStack(Material.EMERALD_BLOCK,
          Slimefun.getLocalization().getMessages(p, "messages.auto-crafting.tooltips.enabled")));
      menu.addMenuClickHandler(InventoryRecipe.QUARRY_BUTTON, (pl, item, slot, action) -> {
        enabled = false;
        showMachine(p, b);
        return false;
      });
    } else {
      menu.addItem(InventoryRecipe.QUARRY_BUTTON, new CustomItemStack(Material.REDSTONE_BLOCK,
          Slimefun.getLocalization().getMessages(p, "messages.auto-crafting.tooltips.disabled")));
      menu.addMenuClickHandler(InventoryRecipe.QUARRY_BUTTON, (pl, item, slot, action) -> {
        enabled = true;
        showMachine(p, b);
        return false;
      });
    }
    p.playSound(p.getLocation(), Sound.BLOCK_BARREL_OPEN, 1, 1);
    menu.open(p);
  }

  protected boolean isInvalidInventory(@Nonnull Block block) {
    Material type = block.getType();
    switch (type) {
      case CHEST:
      case TRAPPED_CHEST:
      case BARREL:
        return false;
      default:
        return !SlimefunTag.SHULKER_BOXES.isTagged(type);
    }
  }

  @Override
  public int getCapacity() {
    return energyCapacity;
  }

  @Nonnull
  public final AbstractQuarry setCapacity(int capacity) {
    Validate.isTrue(capacity > 0, "The capacity must be greater than zero!");
    if (getState() == ItemState.UNREGISTERED) {
      energyCapacity = capacity;
      return this;
    } else {
      throw new IllegalStateException("You cannot modify the capacity after the Item was registered.");
    }
  }

  public int getEnergyConsumption() {
    return energyConsumed;
  }

  @Nonnull
  public final AbstractQuarry setEnergyConsumption(int energyConsumption) {
    Validate.isTrue(energyConsumption > 0, "The energy consumption must be greater than zero!");
    Validate.isTrue(energyCapacity > 0, "You must specify the capacity before you can set the consumption amount.");
    Validate.isTrue(energyConsumption <= energyCapacity,
        "The energy consumption cannot be higher than the capacity (" + energyCapacity + ')');
    this.energyConsumed = energyConsumption;
    return this;
  }

  @Nonnull
  @Override
  public final EnergyNetComponentType getEnergyComponentType() {
    return EnergyNetComponentType.CONSUMER;
  }

  public SupremeQuarryOutput getOutput() {
    return output;
  }

  public AbstractQuarry setOutput(SupremeQuarryOutput output) {
    this.output = output;
    return this;
  }

  public AbstractQuarry setEffect(boolean effect) {
    this.effect = effect;
    return this;
  }

  public AbstractQuarry setDelaySpeed(int delaySpeed) {
    this.delaySpeed = delaySpeed;
    return this;
  }
}
