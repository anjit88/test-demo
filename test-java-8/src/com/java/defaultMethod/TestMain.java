package com.java.defaultMethod;

public class TestMain {

	public static void main(String[] args) {

		SelarProvider airtel = new Airtel();
		SelarProvider idea = new Idea();

		airtel.msgService();
		idea.msgService();
		
		airtel.ThreeGService();
		idea.ThreeGService();
		/*System.out.println("airtel===" + );*/

		

	}
}
