package com.java.thread.exp;

public class Custumber {

	int amount =10;
	
	public synchronized void deposit(int d){
		
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}
	public synchronized void withdraw(int w){
		
		System.out.println("going to withdraw...");  
		  
		if(this.amount<amount){  
		System.out.println("Less balance; waiting for deposit...");  
		try{wait();}catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...");  
		
	}
	
	public static void main(String[] args) {
		
		Custumber a = new Custumber();
		new Thread(){
			public void run(){a.deposit(15000);}  
		}.start();
		new Thread(){
			public void run(){a.withdraw(15000);}  
		}.start();
	}
}
