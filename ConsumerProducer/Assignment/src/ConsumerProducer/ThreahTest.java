package ConsumerProducer;

import java.util.ArrayList;
import java.util.List;

public class ThreahTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     List l = new ArrayList();
		        int sizeofque = 10;
		        Producer prod= new Producer(l, sizeofque);
		        Consumer cons=new Consumer(l, sizeofque);
		        Thread prodThread = new Thread(prod, "Producer");
		        
		        Thread consThread = new Thread(cons, "Consumer");
		        
		       prodThread.start();
		      
		       consThread.start();
		      
		    }
		}

		