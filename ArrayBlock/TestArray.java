package ArrayBlock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
 class Student {
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
			/*public int compareTo(Student o) {
				// TODO Auto-generated method stub
				return id.compareTo(o.id);
			}*/

}

 
public class TestArray {

		public static void main(String[] args) {
			BlockingQueue<Student> lstudent=new ArrayBlockingQueue(5);
			BlockingQueue<Student> lstudentempty=new ArrayBlockingQueue(2,true);
			
			Student s1=new Student("1234", "sanket");
			Student s2=new Student("1235", "sagar");
			Student s3=new Student("1233", "suhas");
			Student s4=new Student("1232", "nikhil");
			Student s5=new Student("1232", "gaurav");
			lstudent.add(s1);
			lstudent.add(s2);
			lstudent.add(s3);
			lstudent.add(s4);
			lstudent.add(s5);
		
			
			Producer producer=new Producer(lstudent,lstudentempty,"Producer");
			Consumer consumer=new Consumer(lstudent,lstudentempty,"Consumer");
			producer.start();
			consumer.start();
		}

}

class Producer extends Thread{
	BlockingQueue<Student> list1;
	BlockingQueue<Student> list2;
	int count;
			public Producer(BlockingQueue<Student> lstudent, BlockingQueue<Student> lstudentempty, String string) {
		list1=lstudent;
		list2=lstudentempty;
	}

			@Override
			public void run() {
				
				for(int i=0;i<=5;i++) {
				for (Student student : list1) {
					try {
						list2.put(student);
						
						list1.remove();
						//System.out.println(list1);
					}
				catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("produce \t"+list2);
					
			}
			}
			}
	

}
class Consumer extends Thread{
	
	BlockingQueue<Student> list2;
	Student ss;
				public Consumer(BlockingQueue<Student> lstudent, BlockingQueue<Student> lstudentempty, String string) {
				
				list2=lstudentempty;
	}

				@Override
				public void run() {
				
					for(int i=0;i<5;i++) {
						try {
							TimeUnit.SECONDS.sleep(1);
							
							 ss=list2.take();
							System.out.println("after removing  \t"+ss);
							
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						//System.out.println("after removing  \t"+ss);
						}
					
				}	
}