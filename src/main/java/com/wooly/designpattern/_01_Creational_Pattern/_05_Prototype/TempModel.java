package com.wooly.designpattern._01_Creational_Pattern._05_Prototype;

import lombok.Data;

@Data
public class TempModel implements Cloneable {
	private String id;
	private String name;
	private TempInnerModel tempInnerModel;


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}



