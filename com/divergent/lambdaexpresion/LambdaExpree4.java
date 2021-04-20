package com.divergent.lambdaexpresion;

/**
 * More Than One Parameter Pass In Mathod
 * @author Divergent
 *
 */

interface Addable{
	public int add(int a,int b);
}
public class LambdaExpree4 {

	public static void main(String[] args) {
		Addable addable = (a,b)->(a+b);
		System.out.println(addable.add(15, 20));
		
		Addable addable2 = (a,b)->{
			return (a+b);
		};
		System.out.println(addable2.add(85, 85));
	}

}
