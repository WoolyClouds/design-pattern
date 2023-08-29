package com.wooly.designpattern._01_Creational_Pattern._05_Prototype;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		TempModel tempModel = new TempModel();
		tempModel.setId("111");
		tempModel.setName("aaa");
		tempModel.setTempInnerModel(new TempInnerModel("a1a1a1"));

		/**
		 * 똑같은 인스턴스를 하나 더 만들고 싶을 때
		 */
		TempModel tempModelClone = (TempModel) tempModel.clone();

		System.out.println(tempModel == tempModelClone);
		System.out.println(tempModel.equals(tempModelClone));
		System.out.println(tempModel.getClass() == tempModelClone.getClass());
		
		// 기본적으로 java는 얕은 복사를 처리하기 때문에 내부 참조 객체는 얕은복사로 주소가 같음
		System.out.println(tempModel.getTempInnerModel() == tempModelClone.getTempInnerModel());
		// 이것까지 깊은 복사를 처리하려면 TempModel 객체 내 오버라이드된 clone() 메소드 내부에 직접 인스턴스를 생성하여 값을 넣는 로직을 구현해야 함 
		
		
	}
}
