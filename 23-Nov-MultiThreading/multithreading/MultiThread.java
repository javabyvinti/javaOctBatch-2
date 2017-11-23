package com.bmpl.multithreading;

public class MultiThread extends Thread{

	@Override
	public void run(){
		for(int i = 1; i<=5; i++){
			try {
				System.out.println(Thread.currentThread().getName() + " = " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		MultiThread t1 = new MultiThread();
		MultiThread t2 = new MultiThread();
		t1.start();
		t1.setName("First");
		t1.setPriority(MAX_PRIORITY);
		t2.start();
		t2.setName("Second");
		t2.setPriority(MIN_PRIORITY);
	}
}