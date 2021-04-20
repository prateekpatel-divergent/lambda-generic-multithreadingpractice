package com.divergent.multithreading;

public class MultiUsed9 extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		}else {
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args) {
		MultiUsed9 multiUsed9 = new MultiUsed9();
		MultiUsed9 multiUsed91 = new MultiUsed9();
		MultiUsed9 multiUsed92 = new MultiUsed9();
		
		multiUsed9.setDaemon(true);
		multiUsed9.start();
		multiUsed91.start();
		multiUsed92.start();
	}

}
