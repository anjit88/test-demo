package com.java.thread.exp1;

public class Credit implements Runnable {

	private Acount acount;

	public Credit(Acount acount) {
		super();
		this.acount = acount;
	}

	public void credit(int amount) {

		synchronized (acount) {
			int a = acount.getAmount();
			a = a + amount;
			acount.setAmount(a);
			
			System.out.println("Total :"+acount.getAmount());
		}
	}

	@Override
	public void run() {
		credit(acount.getAmount());
	}

}
