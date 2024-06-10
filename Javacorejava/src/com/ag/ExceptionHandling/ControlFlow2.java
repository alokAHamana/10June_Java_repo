package com.ag.ExceptionHandling;

public class ControlFlow2 {   // case 2: if there is Exception

	public static void main(String[] args) {
		
	
	try {

		System.out.println("State 1");
		System.out.println(10/0);
		System.out.println("state 3");
	} catch (Exception e) {
		System.out.println("State 4");
	}
	System.out.println("State 5...");
}
}
