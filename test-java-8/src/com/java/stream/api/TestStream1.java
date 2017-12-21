package com.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class TestStream1 {

	public static void main(String str[]) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			list.add(i);
		}
		//list.stream().forEach(System.out::println);

		/* this method do paraller proocess if your system hai more processor */
		//list.parallelStream().forEach(System.out::println);

		list.stream().filter(f -> {

			System.out.println("f===" +f);
			return true;
		}).findAny();

	}

}
