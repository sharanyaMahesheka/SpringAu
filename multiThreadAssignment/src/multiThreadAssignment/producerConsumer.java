
package multiThreadAssignment;

public class producerConsumer {

	public static void main(String args[])
	{
		ProdCons pc =  new ProdCons();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
			
				try {
					pc.produce();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
			
				try {
					pc.consumer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		}
	

