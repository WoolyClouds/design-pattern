package com.wooly.designpattern._01_Creational_Patterns._01_Singleton;

import java.io.Serializable;

/**
 * static inner 클래스 홀더
 * --> lazy initialization
 * 실제 인스턴스를 호출 할 때 메모리 할당이 되는 방식
 * ★ 권장하는 방법 중 하나
 */
public class Settings4 implements Serializable {
	private Settings4() {
	}

	/**inner class**/
	private static class Holder {
		private static final Settings4 INSTANCE = new Settings4();
	}

	public static Settings4 getInstance() {
		return Holder.INSTANCE;
	}


	protected Object readResolve() { //--> 역직렬화 대응방안
		return getInstance();
	}
}
