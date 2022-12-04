package com.github.relativobr.supreme.machine.recipe;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.BeeTech;
import com.github.relativobr.supreme.resource.mobtech.IronGolemTech;
import com.github.relativobr.supreme.resource.mobtech.ZombieTech;
import com.github.relativobr.supreme.util.ItemUtil;
import com.github.relativobr.supreme.util.SupremeOptions;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import io.github.thebusybiscuit.slimefun4.libraries.commons.lang.Validate;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

public class MobTechCollectorMachineRecipe extends MachineRecipe implements Predicate<LivingEntity> {

  private final Predicate<LivingEntity> predicate;

  @ParametersAreNonnullByDefault
  public MobTechCollectorMachineRecipe(SlimefunItemStack input, SlimefunItemStack result,
      Predicate<LivingEntity> predicate) {
    super(15, new SlimefunItemStack[]{input}, new SlimefunItemStack[]{result});
    Validate.notNull(predicate, "The Predicate must not be null");
    this.predicate = predicate;
  }

  public static List<ItemStack> getAllRecipe() {
    List<ItemStack> displayRecipes = new ArrayList();
    SupremeOptions supremeOptions = Supreme.getSupremeOptions();
    if (supremeOptions.isMobTechEnableBee()) {
      displayRecipes.add(
          new CustomItemStack(SupremeComponents.EMPTY_MOBTECH.getType(),
              SupremeComponents.EMPTY_MOBTECH.getDisplayName(),
              "", "&fRequires &bBee &fnearby", ""));
      displayRecipes.add(ItemUtil.buildItemFromMobTechDTO(BeeTech.SIMPLE_BEE, 0));
    }
    if (supremeOptions.isMobTechEnableIronGolem()) {
      displayRecipes.add(
          new CustomItemStack(SupremeComponents.EMPTY_MOBTECH.getType(),
              SupremeComponents.EMPTY_MOBTECH.getDisplayName(),
              "", "&fRequires &bIronGolen &fnearby", ""));
      displayRecipes.add(ItemUtil.buildItemFromMobTechDTO(IronGolemTech.SIMPLE_GOLEM, 0));
    }
    if (supremeOptions.isMobTechEnableZombie()) {
      displayRecipes.add(
          new CustomItemStack(SupremeComponents.EMPTY_MOBTECH.getType(),
              SupremeComponents.EMPTY_MOBTECH.getDisplayName(),
              "", "&fRequires &bZombie &fnearby", ""));
      displayRecipes.add(ItemUtil.buildItemFromMobTechDTO(ZombieTech.SIMPLE_ZOMBIE, 0));
    }
    return displayRecipes;
  }

  public boolean test(@Nonnull LivingEntity entity) {
    return this.predicate.test(entity);
  }

}
