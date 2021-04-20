package com.divergent.lambdaexpresion;

import java.util.ArrayList;
import java.util.List;

/**
 * In Which we can Itreate Arraylist by froEach Loop
 * @author Divergent
 *
 */
public class LambdaExpree5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Ram");
		list.add("Ritu");
		list.add("Reena");
		list.forEach((n) -> System.out.println(n));
	}

}
