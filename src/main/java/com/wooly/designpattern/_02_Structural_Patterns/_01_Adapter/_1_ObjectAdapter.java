package com.wooly.designpattern._02_Structural_Patterns._01_Adapter;

public class _1_ObjectAdapter {
}




class O_Service {

	void specificMethod(int specialData) {
		System.out.println("기존 서비스 기능 호출 + " + specialData);
	}
}

// Client Interface : 클라이언트가 접근해서 사용할 고수준의 어댑터 모듈
interface O_Target {
	void method(int data);
}

// Adapter : Adaptee 서비스를 클라이언트에서 사용하게 할 수 있도록 호환 처리 해주는 어댑터
class O_Adapter implements O_Target {
	O_Service adaptee; // composition으로 Service 객체를 클래스 필드로

	// 어댑터가 인스턴스화되면 호환시킬 기존 서비스를 설정
	O_Adapter(O_Service adaptee) {
		this.adaptee = adaptee;
	}

	// 어댑터의 메소드가 호출되면, Adaptee의 메소드를 호출하도록
	public void method(int data) {
		adaptee.specificMethod(data); // 위임
	}
}

class O_Client {
	public static void main(String[] args) {
		// 1. 어댑터 생성 (기존 서비스를 인자로 받아 호환 작업 처리)
		O_Target adapter = new O_Adapter(new O_Service());

		// 2. Client Interfac의 스펙에 따라 메소드를 실행하면 기존 서비스의 메소드가 실행된다.
		adapter.method(1);
	}
}