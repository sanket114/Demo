package SynchronizedBlock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
 
class Student implements Comparable<Student> {
			 String id;
			 String name;
			 
			public Student(String id, String name) {
				super();
				this.id = id;
				this.name = name;
			}
			
			
			@Override
			public String toString() {
				return "\n\t\tStudent [id=" + id + ", name=" + name + "]";
			}
			
			//@Override
			public int compareTo(Student o) {
				// TODO Auto-generated method stub
				return id.compareTo(o.id);
			}

}

 
public class TestSynchronized {

		public static void main(String[] args) throws InterruptedException {
			BlockingQueue<Student> lstudent=new ArrayBlockingQueue<Student>(6);
			SynchronousQueue<Student> lstudentempty=new SynchronousQueue<Student>();
			
			Student s1=new Student("1234", "sanket");
			Student s2=new Student("1235", "sagar");
			Student s3=new Student("1233", "suhas");
			Student s4=new Student("1232", "nikhil");
			Student s5=new Student("1232", "gaurav");
			lstudent.put(s1);
			lstudent.put(s2);
			lstudent.put(s3);
			lstudent.put(s4);
			lstudent.put(s5);
		
			
			Producer producer=new Producer(lstudent,lstudentempty,"Producer");
			Consumer consumer=new Consumer(lstudentempty,"Consumer");
			producer.start();
			consumer.start();
		}

}

class Producer extends Thread{
	BlockingQueue<Student> list1;
	SynchronousQueue<Student> list2;
	int count;
			public Producer(BlockingQueue<Student> lstudent, SynchronousQueue<Student> lstudentempty, String string) {
		list1=lstudent;
		list2=lstudentempty;
	}

			@Override
			public void run() {
				
				for(int i=0;i<=5;i++) {
				for (Student student : list1) {
					try {
						list2.put(student);
						list1.take();
						//System.out.println(list2);
					}
				catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
					System.out.println("produce \t" +list2);
				}	
			
			}
			}
	

}
class Consumer extends Thread{
	
	SynchronousQueue<Student> list2=null;
	Student ss;
				public Consumer( SynchronousQueue<Student> lstudentempty, String string) {
				
				list2=lstudentempty;
	}

				@Override
				public void run() {
				
					while(true) {
						try {
							TimeUnit.SECONDS.sleep(2);
							
							 ss=list2.take();
							//System.out.println("after removing  \t"+ss);
							
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						System.out.println("after removing  \t"+ss);
						}
					
				}	
}