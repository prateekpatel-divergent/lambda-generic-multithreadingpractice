package com.divergent.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericUsed7 {

	private static Double add(List<? extends Number> num) {
		double sum = 0.0;
		for(Number number : num) {
			sum = sum + number.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		System.out.println("displaying the sum : "+add(list));
		
		List<Double> list1 = new ArrayList<>();
		list1.add(30.0);
		list1.add(40.0);
		System.out.println("Displaying the sum : "+add(list1));
	}

}
