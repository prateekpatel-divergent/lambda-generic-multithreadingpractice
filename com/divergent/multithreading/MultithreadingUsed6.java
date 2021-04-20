package com.divergent.multithreading;

public class MultithreadingUsed6 extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		MultithreadingUsed6 t1 = new MultithreadingUsed6();
		MultithreadingUsed6 t2 = new MultithreadingUsed6();
		MultithreadingUsed6 t3 = new MultithreadingUsed6();

		t1.start();
		try {
			t1.join(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
