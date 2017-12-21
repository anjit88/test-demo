package com.java.test;

public class TestThread extends Thread{

	@Override
	public void run() {
		System.out.println("Run.....!");
	}

	public static void main(String str[]){
		
		TestThread t = new TestThread();
		t.start();
	}
	
	
}
