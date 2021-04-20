package com.divergent.lambdaexpresion;
/**
 * Without Lambda Expression
 * @author Divergent
 *
 */

interface Drawable{
	public void draw();
}
public class LambdaExpree {

	public static void main(String[] args) {
		int width = 10;
		
		Drawable drawable = new Drawable() {
			
			@Override
			public void draw() {
				System.out.println("Drawing "+width);
			}
		};
		drawable.draw();
	}

}
