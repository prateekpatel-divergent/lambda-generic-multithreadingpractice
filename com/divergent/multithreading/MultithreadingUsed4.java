package com.divergent.multithreading;

public class MultithreadingUsed4 extends Thread {

	public void run() {
		System.out.println("Thread running..");
	}
	public static void main(String[] args) {
		MultithreadingUsed4 used4 = new MultithreadingUsed4();
		used4.start();
		used4.run();
	}

}
