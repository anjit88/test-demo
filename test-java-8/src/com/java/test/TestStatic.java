package com.java.test;

public class TestStatic {

	public void test(){
		
		System.out.println("test.....");
		demo();
	}
	
	public static String d() throws Exception{
		
		throw new Exception();
	}
	
	public static void demo(){
		
		try{
			System.out.println("demo A.......");
			
		}catch(ArithmeticException e){
			System.out.println("demo B.......");
		}
		finally{
			System.out.println("demo C.......");
		}
		System.out.println("demo D.......");
	}
	
	public static void main(String[] args) {
		
		TestStatic t = new TestStatic();
		t.test();
	}
}
