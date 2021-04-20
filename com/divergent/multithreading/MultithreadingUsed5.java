package com.divergent.multithreading;

public class MultithreadingUsed5 extends Thread{

	public void run() {
		for(int i = 0; i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MultithreadingUsed5 used5= new MultithreadingUsed5();
		MultithreadingUsed5 used52 = new MultithreadingUsed5();
		used5.run();
		used52.run();
	}

}
