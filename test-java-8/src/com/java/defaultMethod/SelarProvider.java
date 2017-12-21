package com.java.defaultMethod;

public interface SelarProvider {

	public String msgService();

	public default void ThreeGService() {

		Airtel a = new Airtel();
		for (int i = 0; i < 10; i++) {
			System.out.println("i==" + i);
		}
		System.out.println("######################################");
		a.ThreeGService();
		/*System.out.println("a==" +);*/
	}
}
