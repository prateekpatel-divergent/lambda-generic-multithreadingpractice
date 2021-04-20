package com.divergent.generic;

import java.util.Arrays;
import java.util.List;

public class GenericUsed9 {

	public static void addNumbers(List<? super Integer> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		System.out.println("Displaying the Integer Number");
		addNumbers(list);

		List<Number> list1 = Arrays.asList(1.0, 2.0, 3.0);
		System.out.println("Displaying the Number");
		addNumbers(list1);
	}

}
