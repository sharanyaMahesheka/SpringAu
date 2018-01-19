package org.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class ExecutorExample {
	private  static final Logger LOGGER = Logger.getLogger(ExecutorExample.class.getName());
	
	public static void main(String[] args) {
	        ExecutorService executor = Executors.newFixedThreadPool(5);
	       for (int i = 0; i < 10; i++) {
	            Runnable worker = new WorkerThread("" + i);
	            executor.execute(worker);
	          }
	        executor.shutdown();
	        while (!executor.isTerminated()) {
	       	 LOGGER.info("Finished all threads");
	        }
	    }
}
