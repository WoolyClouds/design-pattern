package com.wooly.designpattern._02_Structural_Patterns._01_Adapter;

public class _2_ClassAdapter {
}



class C_Service {

	void specificMethod(int specialData) {
		System.out.println("기존 서비스 기능 호출 + " + specialData);
	}
}

// Client Interface : 클라이언트가 접근해서 사용할 고수준의 어댑터 모듈
interface C_Target {
	void method(int data);
}

// Adapter : Adaptee 서비스를 클라이언트에서 사용하게 할 수 있도록 호환 처리 해주는 어댑터
class C_Adapter extends C_Service implements C_Target {

	// 어댑터의 메소드가 호출되면, 부모 클래스 Adaptee의 메소드를 호출
	public void method(int data) {
		specificMethod(data);
	}
}

class C_Client {
	public static void main(String[] args) {
		// 1. 어댑터 생성
		C_Target adapter = new C_Adapter();

		// 2. 인터페이스의 스펙에 따라 메소드를 실행하면 기존 서비스의 메소드가 실행된다.
		adapter.method(1);
	}
}