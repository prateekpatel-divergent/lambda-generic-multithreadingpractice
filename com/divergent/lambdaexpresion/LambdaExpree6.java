package com.divergent.lambdaexpresion;

/**
 * Double Statement In Method
 * @author Divergent
 *
 */

interface Sayable6{
	public String say(String message);
}
public class LambdaExpree6 {

	public static void main(String[] args) {
		Sayable6 sayable6 = (name)->{
			String str1 = "I would like to say, ";
			String str2 = str1 + name;
			return str2;
		};
		System.out.println(sayable6.say("time is precious." ));
	}

}
