package com.divergent.lambdaexpresion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpree9 {

	public static void main(String[] args) {
		List<Product1> list = new ArrayList<Product1>();

		list.add(new Product1(101, "Hp Laptop", 52000f));
		list.add(new Product1(102, "Dell", 36000f));
		list.add(new Product1(103, "Mouse", 25000f));
		list.add(new Product1(101, "Hp Laptop", 2000f));
		list.add(new Product1(102, "Dell", 360f));
		list.add(new Product1(103, "Mouse", 20000f));

		Stream<Product1> stream = list.stream().filter(p -> p.price >= 20000f);

		stream.forEach(product1 -> System.out.println(product1.id + " " + product1.name + " " + product1.price));
	}

}
