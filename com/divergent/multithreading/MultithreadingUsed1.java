package com.divergent.multithreading;

public class MultithreadingUsed1 extends Thread {
	
	public void run() {
		System.out.println("Thread running");
	}
	
	public static void main(String[] args) {
		MultithreadingUsed1 multithreadingUsed1  = new MultithreadingUsed1();
		multithreadingUsed1.start();
	}

}
