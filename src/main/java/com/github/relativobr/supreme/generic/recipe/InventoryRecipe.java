package com.github.relativobr.supreme.generic.recipe;

import lombok.Getter;

@Getter
public final class InventoryRecipe {


  //CRAFT INPUT SIZE 1
  public static final int[] ALL_INV = {
      0, 1, 2, 3, 4, 5, 6, 7, 8,
      9, 10, 11, 12, 13, 14, 15, 16, 17,
      18, 19, 20, 21, 22, 23, 24, 25, 26,
      27, 28, 29, 30, 31, 32, 33, 34, 35,
      36, 37, 38, 39, 40, 41, 42, 43, 44,
      45, 46, 47, 48, 49, 50, 51, 52, 53
  };
  public static final int[] NO_INV = {};

  //template chest
  //0,   1,  2,  3,  4,  5,  6,  7,  8
  //9,  10, 11, 12, 13, 14, 15, 16, 17
  //18, 19, 20, 21, 22, 23, 24, 25, 26
  //27, 28, 29, 30, 31, 32, 33, 34, 35
  //36, 37, 38, 39, 40, 41, 42, 43, 44
  //45, 46, 47, 48, 49, 50, 51, 52, 53


  //CRAFT INPUT SIZE 1
  public static final int[] SIMPLE_BORDER = {
      0, 1, 2, 3, 4, 5, 6, 7, 8,
      12, 13, 14,
      21, 23,
      30, 31, 32,
      36, 37, 38, 39, 40, 41, 42, 43, 44
  };
  public static final int SIMPLE_STATUS_SLOT = 22;
  public static final int[] SIMPLE_INPUT = {19};
  public static final int[] SIMPLE_INPUT_BORDER = {
      9, 10, 11,
      18,     20,
      27, 28, 29
  };
  public static final int[] SIMPLE_OUTPUT = {25};
  public static final int[] SIMPLE_OUTPUT_BORDER = {
      15, 16, 17,
      24,     26,
      33, 34, 35
  };


  //CRAFT INPUT SIZE 2
  public static final int[] DOUBLE_BORDER = {
      0, 1, 2, 3, 4, 5, 6, 7, 8,
      13, 14,
      23,
      31, 32,
      36, 37, 38, 39, 40, 41, 42, 43, 44
  };
  public static final int DOUBLE_STATUS_SLOT = 22;
  public static final int[] DOUBLE_INPUT = {19, 20};
  public static final int[] DOUBLE_INPUT_BORDER = {
      9, 10, 11, 12,
      18, 21,
      27, 28, 29, 30
  };
  public static final int[] DOUBLE_OUTPUT = {25};
  public static final int[] DOUBLE_OUTPUT_BORDER = {
      15, 16, 17,
      24, 26,
      33, 34, 35
  };


  //CRAFT INPUT SIZE 3
  public static final int[] TRIPLE_BORDER = {
      0, 1, 2, 3, 4, 5, 6, 7, 8,
      14,
      32,
      36, 37, 38, 39, 40, 41, 42, 43, 44
  };
  public static final int TRIPLE_STATUS_SLOT = 23;
  public static final int[] TRIPLE_INPUT = {19, 20, 21};
  public static final int[] TRIPLE_INPUT_BORDER = {
      9, 10, 11, 12, 13,
      18, 22,
      27, 28, 29, 30, 31
  };
  public static final int[] TRIPLE_OUTPUT = {25};
  public static final int[] TRIPLE_OUTPUT_BORDER = {
      15, 16, 17,
      24, 26,
      33, 34, 35
  };


  //CRAFT INPUT SIZE 9 (3X3)
  public static final int[] MEDIUM_BORDER = {
      5, 6, 7, 8,
      14,
      32,
      41, 42, 43, 44
  };
  public static final int MEDIUM_STATUS_SLOT = 23;
  public static final int[] MEDIUM_INPUT = {
      10, 11, 12,
      19, 20, 21,
      28, 29, 30
  };
  public static final int[] MEDIUM_INPUT_BORDER = {
      0,  1,  2,  3,  4,
      9,             13,
      18,            22,
      27,            31,
      36, 37, 38, 39, 40
  };
  public static final int[] MEDIUM_OUTPUT = {25};
  public static final int[] MEDIUM_OUTPUT_BORDER = {
      15, 16, 17,
      24,     26,
      33, 34, 35
  };


  //CRAFT OUTPUT SIZE 9 (3X3)
  public static final int[] INVERT_MEDIUM_BORDER = {
      0,   1,  2,  3,
                  12,
                  30,
      36, 37, 38, 39
  };
  public static final int INVERT_MEDIUM_STATUS_SLOT = 21;
  public static final int[] INVERT_MEDIUM_INPUT = {
      19
  };
  public static final int[] INVERT_MEDIUM_INPUT_BORDER = {
      9,  10, 11,
      18,      20,
      27, 28, 29
  };
  public static final int[] INVERT_MEDIUM_OUTPUT = {
      14, 15, 16,
      23, 24, 25,
      32, 33, 34
  };
  public static final int[] INVERT_MEDIUM_OUTPUT_BORDER = {
      4,  5,  6,  7,  8,
      13,              17,
      22,              26,
      31,              35,
      40, 41, 42, 43, 44
  };


  //CRAFT INPUT SIZE 36 (6x6)
  public static final int[] LARGE_BORDER = {
      6, 7, 8,
      16, 17,
      24, 25, 26
  };
  public static final int LARGE_STATUS_SLOT = 15;
  public static final int[] LARGE_INPUT = {
      0, 1, 2, 3, 4, 5,
      9, 10, 11, 12, 13, 14,
      18, 19, 20, 21, 22, 23,
      27, 28, 29, 30, 31, 32,
      36, 37, 38, 39, 40, 41,
      45, 46, 47, 48, 49, 50
  };
  public static final int[] LARGE_INPUT_BORDER = {};
  public static final int[] LARGE_OUTPUT = {
      43
  };
  public static final int[] LARGE_OUTPUT_BORDER = {
      33, 34, 35,
      42,   44,
      51, 52, 53
  };

  //CRAFT OUTPUT SIZE 36 (6x6)
  public static final int[] INVERT_LARGE_BORDER = {
     27, 28,29,
     36,    38,
     45, 46,47
  };
  public static final int INVERT_LARGE_STATUS_SLOT = 37;
  public static final int[] INVERT_LARGE_INPUT = {
      10
  };
  public static final int[] INVERT_LARGE_INPUT_BORDER = {
      0,  1, 2,
      9,     11,
      18, 19,20,

  };
  public static final int[] INVERT_LARGE_OUTPUT = {
      3,  4,  5,  6,  7,  8,
      12, 13, 14, 15, 16, 17,
      21, 22, 23, 24, 25, 26,
      30, 31, 32, 33, 34, 35,
      39, 40, 41, 42, 43, 44,
      48, 49, 50, 51, 52, 53
  };
  public static final int[] INVERT_LARGE_OUTPUT_BORDER = {};

  //CRAFT QUARRY MACHINE
  public static final int[] QUARRY_BORDER = {
      0, 1, 2, 3, 4, 5, 6,
      9, 10,
      18, 19,
      27, 28,
      36, 37, 38, 39, 40, 41, 42,
  };
  public static final int QUARRY_STATUS = 23;
  public static final int QUARRY_BUTTON = 21;
  public static final int[] QUARRY_INPUT_BORDER = {
      11, 12, 13, 14, 15,
      20, 22, 24,
      29, 30, 31, 32, 33,
  };
  public static final int[] QUARRY_OUTPUT = {
      17,
      26,
      35,
  };
  public static final int[] QUARRY_OUTPUT_BORDER = {
      7, 8,
      16,
      25,
      34,
      43, 44,
  };


  //techrobotic
  public static final int[] TECH_ROBOTIC_BORDER = new int[] {
      3,  4,  5,  6,  7,  8,
      12,  13, 14, 15, 16, 17,
      21,     23, 24, 25, 26,
      27, 28, 29, 30,     32,
      36, 37, 38, 39,     41,
      45, 46, 47, 48, 49, 50
  };
  public static final int[] TECH_ROBOTIC_BORDER_IN = new int[] {
      0,   1,  2,
      9,      11,
      18, 19, 20
  };
  public static final int[] TECH_ROBOTIC_BORDER_OUT = new int[] {
      33, 34, 35,
      42,     44,
      51, 52, 53
  };
  public static final int[] TECH_ROBOTIC_PROGRESS_BAR_SLOT = new int[] {
      22,
      31,
      40
  };
  public static final int[] TECH_ROBOTIC_INPUT_SLOTS = new int[] {
      10
  };
  public static final int[] TECH_ROBOTIC_OUTPUT_SLOTS = new int[] {
      43
  };

  //techgerator
  public static final int[] TECH_GENERATOR_BORDER = new int[] {
      27, 28, 29,
      36,     38,
      45, 46, 47
  };
  public static final int[] TECH_GENERATOR_BORDER_IN = new int[] {
      0,   1,  2,  3,  4,  5,  6,  7,  8,
      9,       11, 12,                17,
      18, 19, 20, 21, 22, 23, 24, 25, 26
  };
  public static final int[] TECH_GENERATOR_BORDER_OUT = new int[] {
      30, 31, 32, 33, 34, 35,
      39,
      48,
  };
  public static final int[] TECH_GENERATOR_PROGRESS_BAR_SLOT = new int[] {
      37
  };
  public static final int[] TECH_GENERATOR_INPUT_SLOTS = new int[] {
      10,13, 14, 15, 16

  };
  public static final int[] TECH_GENERATOR_OUTPUT_SLOTS = new int[] {
      40, 41, 42, 43, 44,
      49, 50, 51, 52, 53
  };

  //techmutation
  public static final int[] TECH_MUTATION_BORDER = new int[] {
      0,                               8,
      9,                              17,
      18,                             26,
      27, 28, 29,  33, 34, 35,
      36, 37, 38,  42, 43, 44,
      45, 46, 47,  51, 52, 53
  };

  public static final int[] TECH_MUTATION_BORDER_IN = new int[] {
      1,  2,  3,      5,  6,  7,
      10,     12,     14,     16,
      19, 20, 21,     23, 24, 25
  };
  public static final int[] TECH_MUTATION_BORDER_OUT = new int[] {
      30, 31, 32,
      39,     41,
      48, 49, 50

  };
  public static final int[] TECH_MUTATION_PROGRESS_BAR_SLOT = new int[] {
      4,
      13,
      22
  };
  public static final int[] TECH_MUTATION_INPUT_SLOTS = new int[] {
      11,15
  };
  public static final int[] TECH_MUTATION_OUTPUT_SLOTS = new int[] {
      40
  };
}
