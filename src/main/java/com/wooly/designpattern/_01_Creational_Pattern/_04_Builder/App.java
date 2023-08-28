package com.wooly.designpattern._01_Creational_Pattern._04_Builder;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		TempBuilder alice = TempBuilder.builder()
				.name("alice")
				.age(20)
				.gender("female")
				.build();

		TempBuilder bob = TempBuilder.builder()
				.name("bob")
				.gender("male")
				.more("aaa")
				.more("bbb")
				.more("ccc")
				.build();

		System.out.println(alice);
		System.out.println(bob);


		TourDirector director = new TourDirector(new DefaultTourBuilder());
		TourPlan tourPlan1 = director.cancunTrip();
		System.out.println(tourPlan1);
		TourPlan tourPlan2 = director.longBeachTrip();
		System.out.println(tourPlan2);


		List<String> list = new ArrayList<>();
		list.add("lom1");
		list.add("lom2");
		list.add("lom3");
		LombokBuilder lombokBuilder = LombokBuilder.builder()
				.str("lombok")
				.i(123)
				.list("list1")
				.list("list2")
				.list("list3")
				.build();
		System.out.println(lombokBuilder);
	}
}
