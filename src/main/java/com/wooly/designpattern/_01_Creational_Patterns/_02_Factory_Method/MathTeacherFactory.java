package com.wooly.designpattern._01_Creational_Patterns._02_Factory_Method;

public class MathTeacherFactory extends DefaultTeacherFactory {

	@Override
	public Teacher insertTeacher(String subject) {
		return new MathTeacher(subject);
	}

}
