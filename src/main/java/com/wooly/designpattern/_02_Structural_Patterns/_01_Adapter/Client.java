package com.wooly.designpattern._02_Structural_Patterns._01_Adapter;

public class Client {
	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee); //클라이언트에서 어댑터 사용
		target.doSomething();

	}
}
