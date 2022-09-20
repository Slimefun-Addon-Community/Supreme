package com.github.relativobr.supreme.machine;

import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getNewIdSupremeLegacy;
import static com.github.relativobr.supreme.util.CompatibilySupremeLegacy.getOldIdSupremeLegacy;

import com.github.relativobr.supreme.generic.machine.SimpleItemContainerMachine;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nonnull;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.Repairable;

public class ItemConverter extends SimpleItemContainerMachine {

  public static final SlimefunItemStack ITEM_CONVERTER_MACHINE = new SupremeItemStack("SUPREME_ITEM_CONVERTER_MACHINE",
      Material.CARTOGRAPHY_TABLE, "&bItem Converter", "", "&fOriginal Converter Item by ID,",
      "&frestore values of name and meta item", "&fconverting to a new item",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1000),
      UtilEnergy.energyPowerPerSecond(0), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_ITEM_CONVERTER_MACHINE = new ItemStack[]{new ItemStack(Material.REDSTONE),
      new ItemStack(Material.REDSTONE), new ItemStack(Material.REDSTONE), new ItemStack(Material.PAPER),
      new ItemStack(Material.CARTOGRAPHY_TABLE), new ItemStack(Material.PAPER), new ItemStack(Material.REDSTONE_BLOCK),
      new ItemStack(Material.REDSTONE_BLOCK), new ItemStack(Material.REDSTONE_BLOCK)};

  public ItemConverter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  @Nonnull
  public List<ItemStack> getDisplayRecipes() {
    return new ArrayList<>();
  }

  @Override
  protected void tick(Block b) {
    BlockMenu inv = BlockStorage.getInventory(b);
    int[] outputSlots = this.getOutputSlots();
    int[] inputSlots = this.getInputSlots();
    for (int inputSlot : inputSlots) {
      ItemStack inputStack = inv.getItemInSlot(inputSlot);
      if (inputStack != null) {

        //is SlimefunItem
        if (inputStack.hasItemMeta() && inputStack.getItemMeta() != null) {
          final ItemMeta inputItemMeta = inputStack.getItemMeta();
          Optional<String> id = Slimefun.getItemDataService().getItemData(inputItemMeta);
          if (id.isPresent()) {
            if (checkSlimefunConverter(inv, outputSlots, inputSlot, inputStack, inputItemMeta, id.get())) {
              break;
            }
            if (checkSlimefunConverter(inv, outputSlots, inputSlot, inputStack, inputItemMeta,
                getNewIdSupremeLegacy(id.get()))) {
              break;
            }
            if (checkSlimefunConverter(inv, outputSlots, inputSlot, inputStack, inputItemMeta,
                getOldIdSupremeLegacy(id.get()))) {
              break;
            }
          }
        }

        //check inputStack
        SlimefunItem slimefunItem = SlimefunItem.getByItem(inputStack);
        ItemStack item;
        if (slimefunItem != null) {
          item = slimefunItem.getItem().clone();
          processOutputItem(inv, outputSlots, inputSlot, new SlimefunItemStack(slimefunItem.getId(), item),
              inputStack.getAmount(), inputStack.getItemMeta());
        } else {
          item = inputStack.clone();
          processOutputItem(inv, outputSlots, inputSlot, item, inputStack.getAmount(), inputStack.getItemMeta());
        }
        break;
      }
    }
  }

  private boolean checkSlimefunConverter(BlockMenu inv, int[] outputSlots, int inputSlot, ItemStack inputStack,
      ItemMeta inputItemMeta, String itemId) {
    SlimefunItem slimefunItem = SlimefunItem.getById(itemId);
    if (slimefunItem != null) {
      ItemStack item = slimefunItem.getItem().clone();
      processOutputItem(inv, outputSlots, inputSlot, new SlimefunItemStack(itemId, item), inputStack.getAmount(),
          inputItemMeta);
      return true;
    }
    return false;
  }

  private void processOutputItem(BlockMenu inv, int[] outputSlots, int inputSlot, ItemStack itemStack, int amount,
      ItemMeta inputItemMeta) {

    for (int outputSlot : outputSlots) {
      ItemStack outputStack = inv.getItemInSlot(outputSlot);
      if (outputStack == null) {
        pushOutputItem(inv, inputSlot, amount, getItemWithEnchantAndRepairable(itemStack, inputItemMeta), outputSlot);
        break;
      } else {
        if (SlimefunUtils.isItemSimilar(itemStack, outputStack, false, false)) {
          final int outputAmount = outputStack.getAmount();
          if (outputAmount < outputStack.getMaxStackSize()) {
            final int maxAmount = outputStack.getMaxStackSize() - outputAmount;
            final int newAmount = Math.min(maxAmount, amount);
            pushOutputItem(inv, inputSlot, newAmount, getItemWithEnchantAndRepairable(itemStack, inputItemMeta),
                outputSlot);
            break;
          }
        }
      }
    }
  }

  private ItemStack getItemWithEnchantAndRepairable(ItemStack itemStack, ItemMeta inputItemMeta) {
    itemStack = itemStack.clone();
    if (inputItemMeta != null) {
      // remove enchant
      removeEnchant(itemStack);

      // add if it has enchants
      if (inputItemMeta.hasEnchants()) {
        itemStack.addUnsafeEnchantments(inputItemMeta.getEnchants());
      }

      ItemMeta itemMeta = itemStack.getItemMeta();
      if (itemMeta != null) {

        // replace repairCost
        ((Repairable) itemMeta).setRepairCost(((Repairable) inputItemMeta).getRepairCost());

        // replace durability
        Damageable durability = (Damageable) inputItemMeta;
        ((Damageable) itemMeta).setDamage(durability.getDamage());

        // save
        itemStack.setItemMeta(itemMeta);
      }
    }
    return itemStack;
  }

  private void removeEnchant(ItemStack itemStack) {
    if (!itemStack.getEnchantments().isEmpty()) {
      itemStack.getEnchantments().forEach((enchantment, integer) -> itemStack.removeEnchantment(enchantment));
    }
  }

  private void pushOutputItem(BlockMenu inv, int inputSlot, int amount, ItemStack itemStack, int outputSlot) {
    ItemStack inputItem = inv.getItemInSlot(inputSlot);
    if (inputItem != null && inputItem.getAmount() >= amount) {
      inv.consumeItem(inputSlot, amount);
      itemStack.setAmount(amount);
      inv.pushItem(itemStack, outputSlot);
    }
  }
}
