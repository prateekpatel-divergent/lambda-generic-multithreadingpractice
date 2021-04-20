package com.divergent.lambdaexpresion;

public class LambdaExpree7 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread1 is running");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Runnable runnable2 = ()->{
			System.out.println("Thread2 is running");
		};
		
		Thread t2 = new Thread(runnable2);
		t2.start();
	}

}
 