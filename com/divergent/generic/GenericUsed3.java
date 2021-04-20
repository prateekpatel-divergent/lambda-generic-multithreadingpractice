package com.divergent.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericUsed3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Ramu");
		list.add("Shamu");
		
		String str = list.get(2);
		System.out.println(str);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
