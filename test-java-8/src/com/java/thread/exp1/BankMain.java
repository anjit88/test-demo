package com.java.thread.exp1;

public class BankMain {

	public static void main(String[] args) {

		Acount c = new Acount();
		c.setAcNo(11111);
		c.setAcNo(100);

		Acount d = new Acount();
		d.setAcNo(11111);
		d.setAcNo(50);

		Credit cr = new Credit(c);
		Debit dr = new Debit(d);

		Thread t1 = new Thread(cr);
		Thread t2 = new Thread(dr);
		
		t2.start();
		t1.start();
	}
}
