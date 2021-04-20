package com.divergent.multithreading;

public class MultiUsed8 extends Thread{

	public void run() {
		System.out.println("running thread name is "+Thread.currentThread().getName());
		System.out.println("running thread priority is "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MultiUsed8 t1 = new MultiUsed8();
		MultiUsed8 t2 = new MultiUsed8();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
