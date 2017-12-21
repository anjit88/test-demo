package com.java.thread.exp;

import java.util.List;

public class Produser implements Runnable {

	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;

	public Produser(List<Integer> sharedQueue, int size) {
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = size;
	}

	public void produse(int i) throws InterruptedException {

		synchronized (taskQueue) {

			while (taskQueue.size() == MAX_CAPACITY) {

				System.out.println(
						"Queue is full :" + Thread.currentThread().getName() + " Size of list is " + taskQueue.size());
				taskQueue.wait();
			}
			taskQueue.add(i);
			System.out.println("Produse : " + i);
			Thread.sleep(1000);
			taskQueue.notifyAll();
		}
	}

	@Override
	public void run() {

		int count = 0;
		while (true) {

			try {

				produse(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
