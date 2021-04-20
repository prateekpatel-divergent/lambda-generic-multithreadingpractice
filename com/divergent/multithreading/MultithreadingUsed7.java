package com.divergent.multithreading;

public class MultithreadingUsed7 extends Thread{

	public void run() {
		System.out.println("Running..");
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MultithreadingUsed7 t1 = new MultithreadingUsed7();
		MultithreadingUsed7 t2 = new MultithreadingUsed7();
		System.out.println("T1 name : "+t1.getName());
		System.out.println("T2 name : "+t2.getName());
		System.out.println("id of t1 "+t1.getId());
		t1.start();
		
		t2.start();
		t1.setName("Patel");
		System.out.println("After change : "+t1.getName());
	}

}
