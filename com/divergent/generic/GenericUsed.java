package com.divergent.generic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class GenericUsed {

	public static void drawShapes(List<? extends Shape> lists) {
		for (Shape s : lists) {
			s.draw();
		}
	}

	public static void main(String[] args) {
		List<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(new Rectangle());

		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle());
		circles.add(new Circle());

		drawShapes(rectangles);
		drawShapes(circles);
	}

}
