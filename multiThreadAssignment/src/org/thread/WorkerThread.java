package org.thread;

import java.util.logging.Logger;

public class WorkerThread implements Runnable{

	 private String command;
	 private  static final Logger LOGGER = Logger.getLogger(WorkerThread.class.getName());
	    
	    public WorkerThread(String s){
	        this.command=s;
	    }

	    @Override
	    public void run() {
		   String info = Thread.currentThread().getName()+" Start. Command = "+command;
		   LOGGER.info(info);
	        processCommand();
	        String info1 = Thread.currentThread().getName()+" End.";
		   LOGGER.info(info1);
	 
	    }

	    private void processCommand() {
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	       	 Thread.currentThread().interrupt();
	        }
	    }

	    @Override
	    public String toString(){
	        return this.command;
	    }
}
