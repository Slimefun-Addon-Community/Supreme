package com.github.relativobr.supreme.machine.recipe;

import static com.github.relativobr.supreme.Supreme.getSupremeOptions;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobCollectorMachineRecipe(ItemStack input, ItemStack result, Predicate<LivingEntity> predicate) {
    super(Supreme.getSupremeOptions().getBaseTimeMobCollector(), new ItemStack[]{input}, new ItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public static List<ItemStack> getAllRecipe() {

    SupremeOptions supremeOptions = getSupremeOptions();

    List<ItemStack> displayRecipes = new ArrayList();
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(Material.HONEY_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bSquid &fnearby"));
    displayRecipes.add(new ItemStack(Material.INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bGlowSquid &fnearby"));
    displayRecipes.add(new ItemStack(Material.GLOW_INK_SAC));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(new ItemStack(Material.EXPERIENCE_BOTTLE));
    displayRecipes.add(new CustomItemStack(Material.GLASS_BOTTLE, null, "&fRequires &bEnderDragon &fnearby"));
    displayRecipes.add(new ItemStack(Material.DRAGON_BREATH));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bBee &fnearby"));
    displayRecipes.add(new ItemStack(Material.HONEYCOMB));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bSheep &fnearby (with color)"));
    displayRecipes.add(new ItemStack(Material.WHITE_WOOL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(Material.LEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(Material.FEATHER));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bGuardian &fnearby"));
    displayRecipes.add(new ItemStack(Material.SPONGE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bSpider &fnearby"));
    displayRecipes.add(new ItemStack(Material.SPIDER_EYE));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bWither Skeleton &fnearby"));
    displayRecipes.add(new ItemStack(Material.COAL));
    displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bWither &fnearby"));
    displayRecipes.add(SlimefunItems.COMPRESSED_CARBON);
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.SHEARS, null, "&fRequires &bIronGolem &fnearby"));
      displayRecipes.add(SlimefunItems.BASIC_CIRCUIT_BOARD);
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bPhantom &fnearby"));
    displayRecipes.add(new ItemStack(Material.PHANTOM_MEMBRANE));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bZombie &fnearby"));
    displayRecipes.add(new ItemStack(Material.ROTTEN_FLESH));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSkeleton &fnearby"));
    displayRecipes.add(new ItemStack(Material.BONE));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bCreeper &fnearby"));
    displayRecipes.add(new ItemStack(Material.GUNPOWDER));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSlime &fnearby"));
      displayRecipes.add(new ItemStack(Material.SLIME_BALL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSpider &fnearby"));
    displayRecipes.add(new ItemStack(Material.STRING));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bWither Skeleton &fnearby"));
      displayRecipes.add(new ItemStack(Material.WITHER_SKELETON_SKULL));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bEnderman &fnearby"));
    displayRecipes.add(new ItemStack(Material.ENDER_PEARL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bBlaze &fnearby"));
    displayRecipes.add(new ItemStack(Material.BLAZE_ROD));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bMagmaCube &fnearby"));
    displayRecipes.add(new ItemStack(Material.MAGMA_CREAM));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bWither &fnearby"));
      displayRecipes.add(new ItemStack(Material.NETHER_STAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bGhast &fnearby"));
      displayRecipes.add(new ItemStack(Material.GHAST_TEAR));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bRavager &fnearby"));
      displayRecipes.add(new ItemStack(Material.TOTEM_OF_UNDYING));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bCow &fnearby"));
    displayRecipes.add(new ItemStack(Material.BEEF));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bPig &fnearby"));
    displayRecipes.add(new ItemStack(Material.PORKCHOP));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bChicken &fnearby"));
    displayRecipes.add(new ItemStack(Material.CHICKEN));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSheep &fnearby"));
    displayRecipes.add(new ItemStack(Material.MUTTON));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bSnowman &fnearby"));
    displayRecipes.add(new ItemStack(Material.SNOWBALL));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bIronGolem &fnearby"));
    displayRecipes.add(new ItemStack(Material.IRON_INGOT));
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bDrowned &fnearby"));
    displayRecipes.add(new ItemStack(Material.NAUTILUS_SHELL));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bGuardian &fnearby"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_SHARD));
      displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bElderGuardian &fnearby"));
      displayRecipes.add(new ItemStack(Material.PRISMARINE_CRYSTALS));
    }
    displayRecipes.add(new CustomItemStack(Material.IRON_SWORD, null, "&fRequires &bWitch &fnearby"));
    displayRecipes.add(new ItemStack(Material.GLASS_BOTTLE));
    if (!supremeOptions.isCustomBc()) {
      displayRecipes.add(new CustomItemStack(Material.GOLD_INGOT, null, "&fRequires &bPiglin &fnearby"));
      displayRecipes.add(SlimefunItems.STRANGE_NETHER_GOO);
    }
    return displayRecipes;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
