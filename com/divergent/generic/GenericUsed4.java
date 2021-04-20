package com.divergent.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericUsed4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Rahul");
		map.put(2, "Ramu");
		map.put(3, "Ravi");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
