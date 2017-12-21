package com.java.thread.exp;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String str[]) {

		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY = 5;
		Thread tProducer = new Thread(new Produser(taskQueue, MAX_CAPACITY), "Producer");
		Thread tConsumer = new Thread(new Comsumer(taskQueue), "Consumer");
		tProducer.start();
		tConsumer.start();
	}
}
