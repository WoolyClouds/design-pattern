package com.wooly.designpattern._01_Creational_Pattern._01_Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
		Settings1 settings1_1 = Settings1.getInstance();
		Settings1 settings1_2 = Settings1.getInstance();
		System.out.println(settings1_1 == settings1_2);

		/**
		 * 싱글톤 깨뜨리기 첫번쨰 - 리플랙션
		 * 리플랙션을 사용하여 싱글톤으로 구현된 객체를 새롭게 인스턴스 할당하기
		 */
		Settings4 settings4_1 = Settings4.getInstance();
		Constructor<Settings4> declaredConstructor = Settings4.class.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		Settings4 settings4_2 = declaredConstructor.newInstance();
		System.out.println(settings4_1 == settings4_2);


		/**
		 * 싱글톤 깨뜨리기 첫번쨰 - 직렬화 & 역직렬화 사용하기
		 * * 해당 객체는 Serializable 을 implements 하고 있어야 함
		 * * 안쓰임 ㅎ;
		 */
		Settings4 setting4_3 = Settings4.getInstance();
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
			out.writeObject(setting4_3);
		} //--> 직렬화

		Settings4 settings4_4 = null;
		try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
			settings4_4 = (Settings4) in.readObject();
		}
		System.out.println(setting4_3 == settings4_4);


		/**
		 * Enum은 리플렉션으로 안뚫림 (직렬화 역직렬화로도)
		 * 내부에서 방어하는 로직이 있음
		 * 하지만 로딩하는 순간 이미 만들어져 있다는 단점이 있음.
		 * 하지만 이 단점이 크게 문제가 되지 않는다면 가장 완벽한 방법 중 하나.
		 * + 상속 안됨 (enum은 enum만 상속)
		 */
		Settings5 settings5_1 = Settings5.INSTANCE;
		Settings5 settings5_2 = null;
		Constructor<?>[] declaredConstructors = Settings5.class.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			constructor.setAccessible(true);
			settings5_2 = (Settings5) constructor.newInstance("INSTANCE");
		}
		System.out.println(settings5_1 == settings5_2);

	}

}
