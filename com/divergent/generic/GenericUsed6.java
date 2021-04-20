package com.divergent.generic;

public class GenericUsed6 {

	public static<E> void printArray(E[] elements) {
		for(E element : elements) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray = {'P','R','A','T','E','E','K'};
		
		System.out.println("Printing Integer Arrays");
		printArray(intArray);
		
		System.out.println("Printing Character Arrays");
		printArray(charArray);
	}

}
