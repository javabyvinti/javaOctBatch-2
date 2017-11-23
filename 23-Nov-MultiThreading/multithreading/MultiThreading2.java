package com.bmpl.multithreading;

//implement Runnable interface

public class MultiThreading2 extends Thread implements Runnable{

	public static void main(String[] args) {
		MultiThreading2 obj = new MultiThreading2();
		Thread thread = new Thread(obj);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Thread through Runnable" + Thread.currentThread().getName());
		
	}

}
