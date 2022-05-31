package com.github.relativobr.supreme.machine;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.machine.recipe.MobCollectorMachineRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.inventory.InvUtils;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.apache.commons.lang.Validate;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.springframework.scheduling.annotation.Async;

@Async
public class MobCollector extends AContainer implements RecipeDisplayItem {


  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE = new SupremeItemStack("SUPREME_MOB_COLLECTOR_MACHINE_I",
      Material.RESPAWN_ANCHOR, "&bMob Collector", "", "&fThis machine allows you to collect ",
      "&fitems from nearby mobs. (4 block)", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
      LoreBuilder.speed(1), LoreBuilder.powerBuffer(1000), LoreBuilder.powerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE = new ItemStack[]{SupremeComponents.RUSTLESS_MACHINE,
      new ItemStack(Material.RESPAWN_ANCHOR), SupremeComponents.RUSTLESS_MACHINE, SupremeComponents.INDUCTIVE_MACHINE,
      SupremeComponents.SYNTHETIC_RUBY, SupremeComponents.INDUCTIVE_MACHINE, SupremeComponents.ADAMANTIUM_PLATE,
      SlimefunItems.PROGRAMMABLE_ANDROID_3_BUTCHER, SupremeComponents.ADAMANTIUM_PLATE};

  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_II = new SupremeItemStack(
      "SUPREME_MOB_COLLECTOR_MACHINE_II", Material.RESPAWN_ANCHOR, "&bMob Collector II", "",
      "&fThis machine allows you to collect", "&f items from nearby mobs. (8 block)", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      LoreBuilder.powerBuffer(5000), LoreBuilder.powerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE_II = new ItemStack[]{
      SupremeComponents.CONVEYANCE_MACHINE, SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CONVEYANCE_MACHINE,
      SupremeComponents.INDUCTOR_MACHINE, MobCollector.MOB_COLLECTOR_MACHINE, SupremeComponents.INDUCTOR_MACHINE,
      SupremeComponents.THORNERITE, SupremeCetrus.CETRUS_IGNIS, SupremeComponents.THORNERITE};

  public static final SlimefunItemStack MOB_COLLECTOR_MACHINE_III = new SupremeItemStack(
      "SUPREME_MOB_COLLECTOR_MACHINE_III", Material.RESPAWN_ANCHOR, "&bMob Collector III", "",
      "&fThis machine allows you to collect", "&f items from nearby mobs. (16 block)", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      LoreBuilder.powerBuffer(15000), LoreBuilder.powerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MOB_COLLECTOR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE,
      SupremeAttribute.getBomb(), SupremeComponents.THORNERITE, SupremeComponents.SUPREME,
      MobCollector.MOB_COLLECTOR_MACHINE_II, SupremeComponents.SUPREME, SupremeComponents.CRYSTALLIZER_MACHINE,
      SupremeCetrus.CETRUS_LUMIUM, SupremeComponents.CRYSTALLIZER_MACHINE};

  private final Set<MobCollectorMachineRecipe> mobCollectorMachineRecipes = new HashSet();
  private int mobRange = 4;

  @ParametersAreNonnullByDefault
  public MobCollector(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }


  @Override
  protected void registerDefaultRecipes() {
    this.recipes.clear();
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()),
        new ItemStack(Material.HONEY_BOTTLE, this.getSpeed()), (n) -> n instanceof Bee));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()),
        new ItemStack(Material.INK_SAC, this.getSpeed()), (n) -> n instanceof Squid));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()),
        new ItemStack(Material.GLOW_INK_SAC, this.getSpeed()), (n) -> n instanceof GlowSquid));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()),
        new ItemStack(Material.EXPERIENCE_BOTTLE, this.getSpeed()), (n) -> n instanceof Wither));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()),
        new ItemStack(Material.DRAGON_BREATH, this.getSpeed()), (n) -> n instanceof EnderDragon));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.HONEYCOMB, this.getSpeed()), (n) -> n instanceof Bee));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.WHITE_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.WHITE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.ORANGE_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.ORANGE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.MAGENTA_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.MAGENTA));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.LIGHT_BLUE_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.LIGHT_BLUE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.YELLOW_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.YELLOW));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.LIME_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.LIME));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.PINK_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.PINK));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.GRAY_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.GRAY));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.LIGHT_GRAY_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.LIGHT_GRAY));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.CYAN_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.CYAN));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.PURPLE_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.PURPLE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.BLUE_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.BLUE));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.BROWN_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.BROWN));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.GREEN_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.GREEN));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS), new ItemStack(Material.RED_WOOL, this.getSpeed()),
            (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.RED));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.BLACK_WOOL, this.getSpeed()),
        (n) -> n instanceof Sheep && ((Sheep) n).getColor() == DyeColor.BLACK));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS), new ItemStack(Material.LEATHER, this.getSpeed()),
            (n) -> n instanceof Cow));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS), new ItemStack(Material.FEATHER, this.getSpeed()),
            (n) -> n instanceof Chicken));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS), new ItemStack(Material.SPONGE, this.getSpeed()),
            (n) -> n instanceof Guardian));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.SPIDER_EYE, this.getSpeed()), (n) -> n instanceof Spider));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS), new ItemStack(Material.COAL, this.getSpeed()),
            (n) -> n instanceof WitherSkeleton));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new SlimefunItemStack(SlimefunItems.COMPRESSED_CARBON, this.getSpeed()), (n) -> n instanceof Wither));
    if (!getSupremeOptions().isCustomBc()) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
          new SlimefunItemStack(SlimefunItems.BASIC_CIRCUIT_BOARD, this.getSpeed()), (n) -> n instanceof IronGolem));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.SHEARS),
        new ItemStack(Material.ROTTEN_FLESH, this.getSpeed()), (n) -> n instanceof Zombie));
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD), new ItemStack(Material.BONE, this.getSpeed()),
            (n) -> n instanceof Skeleton));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.GUNPOWDER, this.getSpeed()), (n) -> n instanceof Creeper));
    if (!getSupremeOptions().isCustomBc()) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.SLIME_BALL, this.getSpeed()), (n) -> n instanceof Slime));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.STRING, this.getSpeed()), (n) -> n instanceof Spider));
    if (!getSupremeOptions().isCustomBc()) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.WITHER_SKELETON_SKULL, this.getSpeed()), (n) -> n instanceof WitherSkeleton));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.ENDER_PEARL, this.getSpeed()), (n) -> n instanceof Enderman));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.BLAZE_ROD, this.getSpeed()), (n) -> n instanceof Blaze));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.MAGMA_CREAM, this.getSpeed()), (n) -> n instanceof MagmaCube));
    if (!getSupremeOptions().isCustomBc()) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.NETHER_STAR, this.getSpeed()), (n) -> n instanceof Wither));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.GHAST_TEAR, this.getSpeed()), (n) -> n instanceof Ghast));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.TOTEM_OF_UNDYING, this.getSpeed()), (n) -> n instanceof Ravager));
    }
    this.addProduce(
        new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD), new ItemStack(Material.BEEF, this.getSpeed()),
            (n) -> n instanceof Cow));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.PORKCHOP, this.getSpeed()), (n) -> n instanceof Pig));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.CHICKEN, this.getSpeed()), (n) -> n instanceof Chicken));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.MUTTON, this.getSpeed()), (n) -> n instanceof Sheep));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.SNOWBALL, this.getSpeed()), (n) -> n instanceof Snowman));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.IRON_INGOT, this.getSpeed()), (n) -> n instanceof IronGolem));
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.NAUTILUS_SHELL, this.getSpeed()), (n) -> n instanceof Drowned));
    if (!getSupremeOptions().isCustomBc()) {
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.PRISMARINE_SHARD, this.getSpeed()), (n) -> n instanceof Guardian));
      this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
          new ItemStack(Material.PRISMARINE_CRYSTALS, this.getSpeed()), (n) -> n instanceof ElderGuardian));
    }
    this.addProduce(new MobCollectorMachineRecipe(new ItemStack(Material.IRON_SWORD),
        new ItemStack(Material.GLASS_BOTTLE, this.getSpeed()), (n) -> n instanceof Witch));
  }


  public void addProduce(@Nonnull MobCollectorMachineRecipe produce) {
    Validate.notNull(produce, "A produce cannot be null");
    this.mobCollectorMachineRecipes.add(produce);
  }

  @Override
  public void preRegister() {
    this.addItemHandler(new BlockTicker() {
      public void tick(Block b, SlimefunItem sf, Config data) {
        MobCollector.this.tick(b);
      }

      public boolean isSynchronized() {
        return true;
      }
    });
  }

  @Nonnull
  @Override
  public List<ItemStack> getDisplayRecipes() {
    return MobCollectorMachineRecipe.getAllRecipe();
  }

  @Nonnull
  @Override
  public String getRecipeSectionLabel(@Nonnull Player p) {
    return "&7Collects:";
  }


  @Override
  protected MachineRecipe findNextRecipe(@Nonnull BlockMenu inv) {
    int[] inputSlots = this.getInputSlots();

    for (int i = 0; i < inputSlots.length; ++i) {
      int slot = inputSlots[i];
      Iterator iterator = this.mobCollectorMachineRecipes.iterator();

      while (iterator.hasNext()) {
        MobCollectorMachineRecipe produce = (MobCollectorMachineRecipe) iterator.next();
        ItemStack itemInSlot = inv.getItemInSlot(slot);
        final ItemStack itemInInput = produce.getInput()[0];
        if (itemInSlot != null && itemInInput != null && (itemInSlot.getType() == itemInInput.getType())
            && InvUtils.fits(inv.toInventory(), produce.getOutput()[0], this.getOutputSlots())) {
          Block invBlock = inv.getBlock();
          produce.getClass();
          if (this.isAnimalNearby(invBlock, produce::test)) {
            if (itemInSlot.getType() == Material.GLASS_BOTTLE) {
              inv.consumeItem(slot, this.getSpeed());
            } else {
              ItemMeta itemMeta = itemInSlot.getItemMeta();
              if(itemMeta != null && !itemMeta.isUnbreakable()) {
                Damageable durability = (Damageable) itemMeta;
                int current = durability.getDamage();
                if (current + 2 >= itemInSlot.getType().getMaxDurability()) {
                  inv.consumeItem(slot);
                } else { //reduce
                  ((Damageable) itemMeta).setDamage(current + 2);
                  itemInSlot.setItemMeta(itemMeta);
                  inv.replaceExistingItem(slot, itemInSlot);
                }
              }
            }
            return produce;
          }
        }
      }
    }

    return null;
  }

  @ParametersAreNonnullByDefault
  private boolean isAnimalNearby(Block b, Predicate<LivingEntity> predicate) {
    return !b.getWorld().getNearbyEntities(b.getLocation(), mobRange, mobRange, mobRange, (n) -> {
      return this.isValidAnimal(n, predicate);
    }).isEmpty();
  }

  @ParametersAreNonnullByDefault
  private boolean isValidAnimal(Entity n, Predicate<LivingEntity> predicate) {
    return n instanceof LivingEntity && predicate.test((LivingEntity) n);
  }

  @Nonnull
  @Override
  public String getMachineIdentifier() {
    return "MOB_COLLECTOR";
  }

  @Override
  public ItemStack getProgressBar() {
    return new ItemStack(Material.IRON_SWORD);
  }


  public final MobCollector setMobRange(int value) {
    this.mobRange = value;
    return this;
  }

}
