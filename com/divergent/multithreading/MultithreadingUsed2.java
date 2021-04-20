package com.divergent.multithreading;

public class MultithreadingUsed2 implements Runnable{

	public void run() {
		System.out.println("Thread runinng..");
	}
	public static void main(String[] args) {
		MultithreadingUsed2 used2 = new MultithreadingUsed2();
		Thread thread  = new Thread(used2);
		thread.start();
	}

}
