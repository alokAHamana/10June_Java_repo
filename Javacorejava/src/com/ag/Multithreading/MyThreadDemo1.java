package com.ag.Multithreading;

public class MyThreadDemo1 extends Thread  {
	

	@Override 
	public void run() {
		
		for (int i=0; i<=10; i++) {
			
			System.out.println("Child thread");
		}
	}
	
}
