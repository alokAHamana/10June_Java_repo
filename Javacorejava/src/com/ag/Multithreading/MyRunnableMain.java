package com.ag.Multithreading;

public class MyRunnableMain {
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		
		Thread thread = new Thread(mr);
		
		thread.start();
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("Main thread");
		}
	}

}
