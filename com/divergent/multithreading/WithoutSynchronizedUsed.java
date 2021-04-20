package com.divergent.multithreading;

class Table{
	synchronized void printTable(int n) {
		for(int i = 1; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(100);
	}
}
public class WithoutSynchronizedUsed {

	public static void main(String[] args) {
		Table table = new Table();
		MyThread1 thread1 = new MyThread1(table);
		MyThread2 thread2 = new MyThread2(table);
		thread1.start();
		thread2.start();
	}

}
