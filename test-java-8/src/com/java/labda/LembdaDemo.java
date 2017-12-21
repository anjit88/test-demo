package com.java.labda;

public class LembdaDemo {

	public static void main(String str[]) {

		/*LambdaTest l = new LambdaTest() {//this is anonymous class
			@Override
			public void show() {
				System.out.println("lambda Demo Show method...");

			}
		};
		l.show();*/
		
		LambdaTest l;
		l = (int val)->{
			System.out.println("LambdaTest Show method..."+10);
		};
		l.show(10);
	}

}
