package com.wooly.designpattern._01_Creational_Patterns._02_Factory_Method;

public class ScienceTeacherFatory extends DefaultTeacherFactory {
	@Override
	public Teacher insertTeacher(String subject) {
		return new ScienceTeacher(subject);
	}
}
