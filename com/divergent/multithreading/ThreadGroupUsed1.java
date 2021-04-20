package com.divergent.multithreading;

public class ThreadGroupUsed1 implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadGroupUsed1 used1 = new ThreadGroupUsed1();
		ThreadGroup group = new ThreadGroup("Parent ThreadGroup");
		
		Thread t1 = new Thread(group, used1, "one");
		t1.start();
		
		Thread t2 = new Thread(group, used1, "two");
		t2.start();
		
		Thread t3 =  new Thread(group, used1 , "three");
		t3.start();
		
		System.out.println("Thread Group Name : "+group.getName());
		group.list();
	}

}
