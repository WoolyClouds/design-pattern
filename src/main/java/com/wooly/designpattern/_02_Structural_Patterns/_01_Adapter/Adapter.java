package com.wooly.designpattern._02_Structural_Patterns._01_Adapter;

public class Adapter implements Target {
	private final Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void doSomething() {
		adaptee.doAction();
	}

}
