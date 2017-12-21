package com.java.labda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListeExample1 {

	public static void main(String str[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/* external iteration */
		/*for (Integer a : list) {
			System.out.println("a==" + a);
		}*/
		
		/* internal iteration */
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("t==" + t);

			}
		});
		list.forEach(((Integer value)-> System.out.println("value==" + value)));
		
		list.forEach((value)-> System.out.println("next examp==="+value));
	}

}
