package com.wooly.designpattern._01_Creational_Pattern._02_Factory_method;

public class ScienceTeacherFatory extends DefaultTeacherFactory {
	@Override
	public Teacher insertTeacher(String subject) {
		return new ScienceTeacher(subject);
	}
}
