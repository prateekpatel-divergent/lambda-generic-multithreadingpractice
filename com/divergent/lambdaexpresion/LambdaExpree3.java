package com.divergent.lambdaexpresion;

/**
 * Parameter Return Type Method
 * @author Divergent
 *
 */

interface Sayable1{
	public String say(String name); 
}
public class LambdaExpree3 {

	public static void main(String[] args) {
		Sayable1 sayable1 = (name)->{
			return "Hello "+name; 
		};
		System.out.println(sayable1.say("Samu"));
	}

}
