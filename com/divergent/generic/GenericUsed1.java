package com.divergent.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericUsed1 {

	public static void main(String[] args) {
		
		/**
		 * Without Generic
		 */
		List list = new ArrayList();
		list.add(10);
		list.add("Hello");
		
		/**
		 * With Generic
		 */
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add("Hello");//Complie Time Error
		
	}

}
