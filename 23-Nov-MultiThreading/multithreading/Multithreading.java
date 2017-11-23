package com.bmpl.multithreading;

// 2 ways
// work with Thread class --> extends
// Runnable interface --> implements

public class Multithreading extends Thread{

	public void print(){
		
	}
	
	@Override
	public void run(){
		System.out.println("Thread is running " + 
	Thread.currentThread().getName() + 
	" Thread Priority = " + Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Multithreading obj = new Multithreading();
		obj.setName("My Thread");
		obj.setPriority(Thread.MIN_PRIORITY);
		obj.start();// thread start-->call start()
		//Default priority - 5 --> Norm priro, 10 max, 1 min
		//obj.run();// 

	}

}
