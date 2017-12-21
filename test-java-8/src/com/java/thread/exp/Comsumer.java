package com.java.thread.exp;

import java.util.List;

public class Comsumer implements Runnable {

	private final List<Integer> taskQueue;

	public Comsumer(List<Integer> taskQueue) {
		this.taskQueue = taskQueue;
	}

	public void comsume() throws InterruptedException {

		synchronized (taskQueue) {

			System.out.println("empty==="+taskQueue.isEmpty()+" Size=="+taskQueue.size());
			
			while (taskQueue.isEmpty()) {

				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size());
				taskQueue.wait();
			}
			Thread.sleep(1000);
			int i = (Integer) taskQueue.remove(0);
			System.out.println("Consumed: " + i);
			taskQueue.notifyAll();
		}
	}

	@Override
	public void run() {
		try {
			comsume();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
