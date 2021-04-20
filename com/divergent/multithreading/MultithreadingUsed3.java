package com.divergent.multithreading;

public class MultithreadingUsed3 extends Thread{

	public void run() {
		for(int i = 0;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MultithreadingUsed3 used3 = new MultithreadingUsed3();
		MultithreadingUsed3 used32 = new MultithreadingUsed3();
		used3.start();
		used32.start();
	}

}
