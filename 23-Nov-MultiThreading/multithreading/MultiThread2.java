package com.bmpl.multithreading;

public class MultiThread2 extends Thread{

	void data(){
		System.out.println("Thread data");
	}
	
	@Override
	public void run() {
		//super.run();
		data();
		System.out.println("Current Thread " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		MultiThread2 t1 = new MultiThread2();
		MultiThread2 t2 = new MultiThread2();
		t1.start();
		t2.start();
	}

}
