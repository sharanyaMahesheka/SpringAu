package org.thread;

import java.util.LinkedList;
import java.util.logging.Logger;

public class ProdCons  {

	LinkedList<Integer> list =  new LinkedList<>();
	int capacity = 10;
	boolean flag=true;
	private  static final Logger LOGGER = Logger.getLogger(ProdCons.class.getName());
	public void produce ()  {
		int value = 0;
		
		while(flag)
		{
			synchronized(this)
			{
				while(list.size()==capacity)
					try {
						wait();
					}
					catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}

				list.add(value++);
				String info = "Producer produced"+ value;
				LOGGER.info(info);
				
				
			}
		}
	}
	
	public void consumer() {
		while(flag)
		{
			synchronized(this)
			{
				while(list.isEmpty())
					try {
						wait();
					}
					catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				String info = "Consumer consumed"+list.removeFirst();
				LOGGER.info(info);
								
			}
		}
	}
}
