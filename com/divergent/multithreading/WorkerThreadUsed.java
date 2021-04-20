package com.divergent.multithreading;

public class WorkerThreadUsed implements Runnable {
	
	private String message;

	public WorkerThreadUsed(String message) {
		this.message = message;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Start)Message"+message);
		processmessage();
		System.out.println(Thread.currentThread().getName()+"(End).");
	}
	
	private void  processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
