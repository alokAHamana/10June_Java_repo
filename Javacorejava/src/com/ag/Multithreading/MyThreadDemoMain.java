package com.ag.Multithreading;

public class MyThreadDemoMain {

	public static void main(String[] args) {
		
		MyThreadDemo1 th = new MyThreadDemo1();
		
		th.start();       // yahan direct run use nhi karengye  varna thread nhi banega
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("Main Thread ");
		}
	}
}
