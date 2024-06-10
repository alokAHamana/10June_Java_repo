package com.ag.Multithreading;

public class ThreadNameChange {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());   // yahan default main thread ayegi
		
		Thread.currentThread().setName("Alok---Thread");   // thread ka name custumised kr diya
		
		System.out.println(Thread.currentThread().getName());
	}

}
