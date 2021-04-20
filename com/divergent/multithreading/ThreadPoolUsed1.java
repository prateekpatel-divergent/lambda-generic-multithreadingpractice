package com.divergent.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUsed1 {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThreadUsed(""+i);
			service.execute(worker);
		}
		service.shutdown();
		while(!service.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}

}
