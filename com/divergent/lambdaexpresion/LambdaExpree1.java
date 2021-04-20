package com.divergent.lambdaexpresion;


/**
 * With Lambda Expression
 * @author Divergent
 *
 */

interface Drawable1{
	public void draw();
}

public class LambdaExpree1 {
	public static void main(String[] args) {
		int width = 10;
		
		Drawable drawable = ()->{
			System.out.println("Drawing "+width);
		};
		drawable.draw();
	}
}
