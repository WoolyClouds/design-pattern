package com.wooly.designpattern._01_Creational_Pattern._02_Factory_Method;

public abstract class DefaultTeacherFactory implements TeacherFactory {

	@Override
	public void createResult(Teacher teacher) {
		System.out.println("================");
		System.out.println("name : " + teacher.getName());
		System.out.println("gender : " + teacher.getGender());
		System.out.println("subject : " + teacher.getSubject());
		System.out.println("으로 선생님이 생성 및 등록되었습니다.");
		System.out.println("================");
	}
}
