package com.java.defaultMethod;

public class Idea implements SelarProvider {

	@Override
	public String msgService() {

		System.out.println("Idea msg Service method.. ");

		return "Idea";
	}

}
