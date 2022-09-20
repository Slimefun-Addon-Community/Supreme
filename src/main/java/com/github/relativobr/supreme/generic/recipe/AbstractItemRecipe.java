package com.github.relativobr.supreme.generic.recipe;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AbstractItemRecipe {

  private ItemStack[] input;
  private ItemStack[] output;

  public ItemStack[] getInputNotNull() {
    return filterNotNull(this.getInput());
  }

  public ItemStack[] getOutputNotNull() {
    return filterNotNull(this.getOutput());
  }

  private ItemStack[] filterNotNull(ItemStack[] array){
    List<ItemStack> list = new ArrayList<>();
    for (ItemStack itemStack : array) {
      if(itemStack != null){
        list.add(itemStack);
      }
    }
    return list.toArray(new ItemStack[0]);
  }

  public ItemStack getItemInput(int index) {
    return input[index];
  }

  public ItemStack getItemOutput(int index) {
    return output[index];
  }

  public Material getMaterialInput(int index) {
    return getItemInput(index) != null ? getItemInput(index).getType() : null;
  }

  public Material getMaterialOutput(int index) {
    return getItemOutput(index) != null ? getItemOutput(index).getType() : null;
  }

  public ItemStack getFirstItemInput() {
    return getItemInput(0);
  }

  public ItemStack getFirstItemOutput() {
    return getItemOutput(0);
  }

  public ItemStack getSecondItemInput() {
    return getItemInput(1);
  }

  public ItemStack getSecondItemOutput() {
    return getItemOutput(1);
  }

  public Material getFirstMaterialInput() {
    return getMaterialInput(0);
  }

  public Material getFirstMaterialOutput() {
    return getMaterialOutput(0);
  }

  public Material getSecondMaterialInput() {
    return getMaterialInput(1);
  }

  public Material getSecondMaterialOutput() {
    return getMaterialOutput(1);
  }

  public AbstractItemRecipe(@Nonnull ItemStack input, @Nonnull ItemStack output) {
    this.input = new ItemStack[]{input};
    this.output = new ItemStack[]{output};
  }

  public AbstractItemRecipe(@Nonnull ItemStack[] input, @Nonnull ItemStack output) {
    this.input = input;
    this.output = new ItemStack[]{output};
  }

  public AbstractItemRecipe(@Nonnull ItemStack input, @Nonnull ItemStack[] output) {
    this.input = new ItemStack[]{input};
    this.output = output;
  }

  public AbstractItemRecipe(@Nonnull Material input, @Nonnull Material output) {
    this.input = new ItemStack[]{new ItemStack(input)};
    this.output = new ItemStack[]{new ItemStack(output)};
  }

  public AbstractItemRecipe(@Nonnull ItemStack[] input, @Nonnull Material output) {
    this.input = input;
    this.output = new ItemStack[]{new ItemStack(output)};
  }

  public AbstractItemRecipe(@Nonnull Material input, @Nonnull ItemStack[] output) {
    this.input = new ItemStack[]{new ItemStack(input)};
    this.output = output;
  }

  public AbstractItemRecipe(@Nonnull ItemStack input, @Nonnull Material output) {
    this.input = new ItemStack[]{input};
    this.output = new ItemStack[]{new ItemStack(output)};
  }

  public AbstractItemRecipe(@Nonnull Material input, @Nonnull ItemStack output) {
    this.input = new ItemStack[]{new ItemStack(input)};
    this.output = new ItemStack[]{output};
  }

  public AbstractItemRecipe(@Nonnull ItemStack input1, ItemStack input2, @Nonnull ItemStack output1, ItemStack output2) {
    this.input = new ItemStack[]{input1, input2};
    this.output = new ItemStack[]{output1, output2};
  }

  public AbstractItemRecipe(@Nonnull Material input1, Material input2, @Nonnull Material output1, Material output2) {
    this.input = new ItemStack[]{new ItemStack(input1), (input2 == null) ? null : new ItemStack(input2)};
    this.output = new ItemStack[]{new ItemStack(output1), (output2 == null) ? null : new ItemStack(output2)};
  }

  public AbstractItemRecipe(@Nonnull ItemStack input1, ItemStack input2, @Nonnull Material output1, Material output2) {
    this.input = new ItemStack[]{input1, input2};
    this.output = new ItemStack[]{new ItemStack(output1), (output2 == null) ? null : new ItemStack(output2)};
  }

  public AbstractItemRecipe(@Nonnull Material input1, Material input2, @Nonnull ItemStack output1, ItemStack output2) {
    this.input = new ItemStack[]{new ItemStack(input1), (input2 == null) ? null : new ItemStack(input2)};
    this.output = new ItemStack[]{output1, output2};
  }

}
