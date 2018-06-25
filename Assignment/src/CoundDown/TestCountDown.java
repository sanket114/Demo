package CoundDown;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;

public class TestCountDown {

	
public static void main(String[] args) throws InterruptedException {
	BlockingQueue<Student> queueblock=new ArrayBlockingQueue<>(5);
	BlockingQueue<Student> queueEmpty1=new ArrayBlockingQueue<>(5);
	BlockingQueue<Student> queueEmpty2=new ArrayBlockingQueue<>(5);
	BlockingQueue<Student> queueEmpty3=new ArrayBlockingQueue<>(5);
	CountDownLatch countDown=new CountDownLatch(2);
	CountDownLatch countDown2=new CountDownLatch(2);
	Student s1=new Student(123, "Sanket1");
	Student s2=new Student(124, "Sanket2");
	Student s3=new Student(125, "Sanke3");
	Student s4=new Student(126, "Sanket4");
	Student s5=new Student(127, "Sanket5");
	
	queueblock.put(s1);
	queueblock.put(s2);
	queueblock.put(s3);
	queueblock.put(s4);
	queueblock.put(s5);
	
	
	
	Producer1 p1=new Producer1(queueblock,queueEmpty2,"producer1",countDown);
	Producer2 p2=new Producer2(queueblock,queueEmpty3,"producer2",countDown);
	Consumer1 c1=new Consumer1(queueEmpty2,"Comsumer1",countDown2);
	Consumer2 c2=new Consumer2(queueEmpty3,"Comsumer2",countDown2);
	
	p1.start();
	p1.join();
	
	p2.start();
	p2.join();
	
	
	
	countDown.await();
	System.out.println("prodcers tasks completed "+countDown);
	
	c1.start();
	
	c2.start();
	
	
	
	
	
	
	//c1.start();
	countDown2.await();
    System.out.println("main thread completed");
	
	
}
}

class Producer1 extends Thread{
	BlockingQueue<Student>s1;
	BlockingQueue<Student>s2;
	CountDownLatch countDown;
	Producer2 p3;
	public Producer1(BlockingQueue<Student> s1, BlockingQueue<Student> queueblock, String string, CountDownLatch countDown) {
		super(string);
		this.s1 = s1;
		this.s2=queueblock;
		 this.countDown=countDown;
	}

	@Override
	public void run() {
		
		
		for (Student student : s1) {
			try {
				sleep(1000);
				s2.put(student);
				//s1.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"   "+student);
			
		}
		countDown.countDown();
		System.out.println("Prodcer1 completed ---"+countDown);
		
	}
	
	
}

class Producer2 extends Thread{
	BlockingQueue<Student>s1;
	BlockingQueue<Student>s2;
	CountDownLatch countDown;
	public Producer2(BlockingQueue<Student> s1, BlockingQueue<Student> queueblock, String string,CountDownLatch countDown) {
		super(string);
		this.s1 = s1;
		this.s2=queueblock;
		 this.countDown=countDown;
	}

	@Override
	public void run() {
		
		
		for (Student student : s1) {
			try {
			
				sleep(1000);
				s2.put(student);
				//s1.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"   "+student);	
		}
		
		System.out.println(" contdown val b4 **********"+countDown);
		countDown.countDown();
		System.out.println("Prodcer2 completed---"+countDown);
		
	}
	
	
}

class  Consumer1 extends Thread{
BlockingQueue<Student>s1;

	
	Student ss;
	CountDownLatch countDown;
	public Consumer1(BlockingQueue<Student> s1, String string, CountDownLatch countDown) {
		super(string);
		this.s1 = s1;
		this.countDown=countDown;
	}	

	public void run() {
		
		System.out.println("Now Consming elementss***********");
		while(true){
			
		Student ss = null;
		try {
			sleep(1000);
			ss = s1.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consumer1    "+ss);
		//System.out.println(Thread.currentThread().getName()+"   "+ss);
		countDown.countDown();
	}}
	
}

class  Consumer2 extends Thread{
	BlockingQueue<Student>s1;

	
	Student ss;
	CountDownLatch countDown;
	public Consumer2(BlockingQueue<Student> s1, String string, CountDownLatch countDown) {
		super(string);
		this.s1 = s1;
		this.countDown=countDown;
	}	

	public void run() {
		
		System.out.println("Now Consming elementss***********");
		while(true){
			
		Student ss = null;
		try {
			sleep(1000);
			ss = s1.take();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consumer2    "+ss);
		//System.out.println(Thread.currentThread().getName()+"   "+ss);
		countDown.countDown();
	}}
	
}
class Student{
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}