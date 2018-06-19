package ConsumerProducer;

import java.util.List;

public class Consumer extends Thread {
	List l;
	int size;
		public Consumer(List l, int sizeofque) {
			this.l=l;
			size=sizeofque;
		}
		@Override
		public  void run() {
			for (int i = 0; i < 28; i++) {
				try {
	            	  while (l.isEmpty()) {
	            		  synchronized (l) {
	      	                System.out.println("Queue is empty " + Thread.currentThread().getName()
	      	                                    + " is waiting , size: " + l.size());
	      	             
	      	                
								l.wait(100);
							} 
	      	            }
	      	        
	            	  synchronized (l) {
	            		  l.notify(); 	      	            
	      	            System.out.println("Consumed: " +l.remove(0));
	            	  }
	      	        Thread.sleep(5000);
	      			        } 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	    }
		
}


}