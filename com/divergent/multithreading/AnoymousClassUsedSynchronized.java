package com.divergent.multithreading;

class Table1{
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
public class AnoymousClassUsedSynchronized {

	public static void main(String[] args) {
		final Table1 table = new Table1();
		
		Thread thread = new Thread() {
			public void run() {
				table.printTable(5);
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				table.printTable(100);
			}
		};
		
		thread.start();
		thread2.start();
	}

}
