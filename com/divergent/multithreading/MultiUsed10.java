package com.divergent.multithreading;

public class MultiUsed10 extends Thread{

	public void run() {
		System.out.println("Name :"+Thread.currentThread().getName());
		System.out.println("Daemon : "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		MultiUsed10 used10 = new MultiUsed10();
		MultiUsed10 used102 = new MultiUsed10();
		used10.start();
		used10.setDaemon(true);
		used102.start();
	}

}
