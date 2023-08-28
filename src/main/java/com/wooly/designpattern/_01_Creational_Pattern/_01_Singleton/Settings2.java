package com.wooly.designpattern._01_Creational_Pattern._01_Singleton;

/**
 * sychronized를 이용한 동시성 처리
 */
//public class Settings2 {
//
//	private static Settings2 instance;
//
//	private Settings2() { }
//
//	public static synchronized Settings2 getInstance() {
//		if (instance == null) {
//			instance = new Settings2();
//		}
//
//		return instance;
//	}
//}

/**
 * 하기 이른 초기화를 사용
 */
public class Settings2 {

	private static final Settings2 INSTANCE = new Settings2(); // 미리 인스턴스를 생성해서 이른 초기화

	private Settings2() { }

	public static synchronized Settings2 getInstance() {
		return INSTANCE;
	}
}

/**
 *
 */