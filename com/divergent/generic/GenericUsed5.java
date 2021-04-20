package com.divergent.generic;

class MyGen<T> {
	T obj;
	void add(T obj){
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class GenericUsed5 {

	public static void main(String[] args) {
		MyGen<Integer> gen = new MyGen<>();	
		gen.add(10);
		gen.add(20);
		
		System.out.println(gen.get());
	}

}
