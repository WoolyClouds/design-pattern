package com.wooly.designpattern._01_Creational_Pattern._05_Prototype;

import lombok.Data;

@Data
public class TempInnerModel {
	private String code;

	public TempInnerModel(String code) {
		this.code = code;
	}
}
