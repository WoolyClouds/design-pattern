package com.wooly.designpattern._01_Creational_Pattern._01_Singleton;

/**
 * double-checked locking
 */
public class Settings3 {

	private static volatile Settings3 INSTANCE;

	private Settings3() {
	}

	/**
	 * 먼저 instance의 생성 유무 판별로 매번 synchronized 를 처리할 필요가 없다
	 */
	public static Settings3 getInstance() {
		if (INSTANCE == null) {
			synchronized (Settings3.class) {
				if (INSTANCE == null) {
					INSTANCE = new Settings3();
				}
			}
		}

		return INSTANCE;
	}
}
