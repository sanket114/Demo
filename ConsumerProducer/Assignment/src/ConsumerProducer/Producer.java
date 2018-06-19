package ConsumerProducer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread{
List l;
int size;
String[] l1={"sanket","yogesh","akshu","nikhil","garav1","abhi","swapnil","abhya","rahul","datta","gaurav","ninad","suhas","ajinkya","sank","yog","aks","nik","ga","ab","swap","abh","ra","da","gau","nina","suh","aji"};
	public Producer(List l, int sizeofque) {
		this.l=l;
		size=sizeofque;
	}
	@Override
	public  void run() {
        for (int i = 0; i < 28; i++) {
        	try {
        	synchronized (l) {
    			
                l.add(l1[i]);
                System.out.println("Produced: " + l1[i]);
                l.wait(100);
                 l.notify();
            }
            	while (l.size() == size) {
                    synchronized (l) {
                        System.out.println("Queue  size is  "+ l.size()+"  " + Thread.currentThread().getName() + " is waiting ");

                        
							l.wait(5000);
						}
                    }
                
        		} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
              
        		
			

        }


}

	
	}