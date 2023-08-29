package com.wooly.designpattern._01_Creational_Patterns._01_Singleton;

/**
 * private 생성자에 static 메소드
 */
public class Settings1 {

	private static Settings1 INSTANCE;

	private Settings1() {
	}

	public static Settings1 getInstance() {
		//return new Settings(); --> new로 새로운 인스턴스를 반환해버리면 매번 새롭게 할당하여 반환하기 떄문에 싱글턴 X
		if (INSTANCE == null) {
			INSTANCE = new Settings1();
		}
		return INSTANCE;
	}
}

/**
 * 문제점
 * 실제 어플리케이션에서는 멀티 쓰레드 환경이 대부분.
 * 이 구조는 멀티쓰레드 환경에서 안전하지 않다.
 * 멀티쓰레드 환경에서는 동시성의 문제로 쓰레드들이 분기 true를 동시에 타 새로운 인스턴스를 생성하기 떄문
 */
