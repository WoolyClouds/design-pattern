package com.wooly.designpattern._01_Creational_Patterns._01_Singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		String temp1 = applicationContext.getBean("temp", String.class);
		String temp2 = applicationContext.getBean("temp", String.class);
		System.out.println(temp1 == temp2);
	}
}
