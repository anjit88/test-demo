package com.java.stream.api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String str[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		/*list.forEach(i -> System.out.println(i));*/
		/*Consumer<Integer> consummer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println("i==" + t);
			}
		};
		list.forEach(consummer);*/
		
		Consumer<Integer> consummer = i->System.out.println("i=="+i);
		list.forEach(consummer);
		
		
		Map<Integer, Integer> map = new HashMap<>();
		
	}

}
