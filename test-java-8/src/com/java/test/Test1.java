package com.java.test;

import java.util.Scanner;

public class Test1 {

	public void show(String s){
		System.out.println("s=="+s);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value :");
		String s = scan.next();
		Test1 t = new Test1();
		t.show(s);
	}
}
