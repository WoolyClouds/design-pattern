package com.wooly.designpattern._01_Creational_Patterns._04_Builder;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class LombokBuilder {
	private String str;
	private int i;
	@Singular("list")
	private List<String> list;
}
