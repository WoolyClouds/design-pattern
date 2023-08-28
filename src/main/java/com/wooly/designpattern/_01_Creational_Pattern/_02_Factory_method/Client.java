package com.wooly.designpattern._01_Creational_Pattern._02_Factory_method;

public class Client {
	public static void main(String[] args) {
		Teacher mathTeacher = new MathTeacherFactory().createTeacher("Math");
		Teacher scienceTeacher = new ScienceTeacherFatory().createTeacher("Math");
	}
}
