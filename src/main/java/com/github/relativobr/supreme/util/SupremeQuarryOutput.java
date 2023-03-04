package com.github.relativobr.supreme.util;

import java.util.List;

import com.github.relativobr.supreme.machine.AbstractQuarryOutputItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class SupremeQuarryOutput {

  List<AbstractQuarryOutputItem> outputItems;

}
