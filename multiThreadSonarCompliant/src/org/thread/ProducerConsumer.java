
package org.thread;



public class ProducerConsumer{
	
	

	public static void main(String[] arg) {
		ProdCons pc = new ProdCons();
		Thread t1 = new Thread(()-> {
			try {
					pc.produce();
				} catch (Exception e) {
					Thread.currentThread().interrupt();
				}
			});
		
		Thread t2 = new Thread(()-> {

				try {
					pc.consumer();
				} catch (Exception e) {
					
					Thread.currentThread().interrupt();
				}

			
		});

		t1.start();
		t2.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();

		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
