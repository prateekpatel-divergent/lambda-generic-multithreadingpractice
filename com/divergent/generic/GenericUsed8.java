package com.divergent.generic;

import java.util.Arrays;
import java.util.List;

public class GenericUsed8 {

	public static void display(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println("Displaying  the Integer values");
		display(list);

		List<String> list2 = Arrays.asList("One", "Two", "Three");
		System.out.println("Displaying the String values");
		display(list2);

	}

}
