package com.divergent.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Type Casting is not Required
 * @author Divergent
 *
 */
public class GenericUsed2 {

	public static void main(String[] args) {

		/**
		 * Without Generic
		 */
		List list = new ArrayList();
		list.add(10);
		list.add("Hello");
		String str = (String) list.get(1); // Type Casting Required for type coversion
		
		/**
		 * With Generic
		 */
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Hello");
		String str1 = list2.get(0);
	}

}
