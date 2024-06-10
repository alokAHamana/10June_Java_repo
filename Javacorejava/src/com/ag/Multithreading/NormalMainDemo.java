package com.ag.Multithreading;

public class NormalMainDemo {
	
	public static void main(String[] args) {
		
		NormalChilddemo cd = new NormalChilddemo();
		cd.run();
		
		for(int i= 0 ; i<=8 ; i++) {
			
			System.out.println("Main Normal Thread 8 times");
		}
		
	}

}
