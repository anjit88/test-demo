package com.java.labda;

public class Greeter {

	public static void main(String str[]) {

		Thread th;
		Thread th1;
		th = new Thread(() -> System.out.println("this is a child thread 1"));
		th = new Thread(() -> System.out.println("this is a child thread 2"));
		th = new Thread(() -> System.out.println("this is a child thread 3"));
		th1 = new Thread(() -> System.out.println("this is a child thread 4"));

		th.start();
		th1.start();
		System.out.println("Main method..");

	}

}
