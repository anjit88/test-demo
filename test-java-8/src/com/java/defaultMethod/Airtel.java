package com.java.defaultMethod;

public class Airtel implements SelarProvider {

	@Override
	public String msgService() {

		System.out.println("Airtel Service method..!");
		return "Airtel";
	}

	@Override
	public void ThreeGService() {
		
		System.out.println("Airtel Change 3G Service method...........");
	}

}
