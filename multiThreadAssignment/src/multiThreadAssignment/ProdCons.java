package multiThreadAssignment;

import java.util.LinkedList;

public class ProdCons {

	LinkedList<Integer> list =  new LinkedList<Integer>();
	int capacity = 10;
	
	public void produce () throws Exception {
		int value = 0;
		while(true)
		{
			synchronized(this)
			{
				while(list.size()==capacity)
					wait();
				System.out.println("Producer produced" + value);
				list.add(value++);
				notify();
				 Thread.sleep(1000);
			}
		}
	}
	
	public void consumer() throws Exception{
		while(true)
		{
			synchronized(this)
			{
				while(list.isEmpty())
					wait();
				System.out.println("Consumer consumed"+list.removeFirst());
				notify();
				 Thread.sleep(1000);
				
			}
		}
	}
}
