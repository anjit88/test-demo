package com.java.thread.exp1;

public class Debit implements Runnable{

	private Acount acount;

	public Debit(Acount acount) {
		super();
		this.acount = acount;
	}

	public int debit(int amount) {

		synchronized (acount) {

			if (acount.getAmount() <= 10) {
				System.out.println("You have  insufficient bilance : " + acount.getAmount());
				return 0;
			} else {
				return acount.getAmount() - amount;
			}
		}

	}

	@Override
	public void run() {
		debit(acount.getAmount());
		
	}
}
