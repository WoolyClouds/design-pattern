package com.wooly.designpattern._01_Creational_Pattern._02_Factory_method;

public interface TeacherFactory {

	default Teacher createTeacher(String subject) {
		validate(subject);
		prepare(subject);
		Teacher teacher = insertTeacher(subject);
		createResult(teacher);
		return teacher;
	}

	Teacher insertTeacher(String subject);

	void createResult(Teacher teacher);

	private void validate(String subject) {
		if (subject.isBlank()
				&& !"Math".equals(subject)
				&& !"Science".equals(subject)
				&& !"Social".equals(subject)) {
			throw new IllegalArgumentException("subject error!");
		}
	}

	private void prepare(String subject) {
		System.out.println(subject + " 선생님 생성 준비중...");
	}

}
