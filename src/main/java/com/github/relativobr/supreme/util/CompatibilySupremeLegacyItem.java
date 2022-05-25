package com.github.relativobr.supreme.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CompatibilySupremeLegacyItem {

  String newSupremeID;
  String oldSupremeID;

}