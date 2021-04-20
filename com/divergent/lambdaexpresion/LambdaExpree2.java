package com.divergent.lambdaexpresion;

/**
 * Return Type Datatype
 * 
 * @author Divergent
 *
 */

interface Sayable {
	public String say();
}

public class LambdaExpree2 {

	public static void main(String[] args) {
		Sayable sayable = () -> {
			return "This is Sayable Interface";
		};
		System.out.println(sayable.say());
	}

}
