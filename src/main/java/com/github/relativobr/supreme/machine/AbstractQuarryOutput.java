package com.github.relativobr.supreme.machine;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class AbstractQuarryOutput {

  List<AbstractQuarryOutputItem> outputItems;

}
