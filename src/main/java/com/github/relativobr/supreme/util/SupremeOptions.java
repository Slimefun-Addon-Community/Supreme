package com.github.relativobr.supreme.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SupremeOptions {

  boolean autoUpdate;
  boolean useLegacySupremeexpansionItemId;
  String lang;
  int customTickerDelay;
  boolean enableGenerators;
  boolean limitProductionGenerators;
  boolean enableQuarry;
  boolean limitProductionQuarry;
  boolean enableWeapons;
  boolean enableTools;
  boolean enableArmor;
  boolean enableTech;
  boolean customBc;

}
