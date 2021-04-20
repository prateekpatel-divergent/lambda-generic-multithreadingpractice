package com.divergent.lambdaexpresion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpree8 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(101, "Hp Laptop", 52000f));
		list.add(new Product(102, "Dell", 36000f));
		list.add(new Product(103, "Mouse", 250f));
		
		System.out.println("Sorting basis of name");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product product : list) {
			System.out.println(product.id+" "+product.name+" "+product.price);
		}
	}

}
