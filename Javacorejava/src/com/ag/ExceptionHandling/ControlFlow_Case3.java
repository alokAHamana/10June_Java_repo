package com.ag.ExceptionHandling;

public class ControlFlow_Case3 {   // case3  if exception not matched

	public static void main(String[] args) {
		
		try {

			System.out.println("State 1");
			System.out.println(10/0);
			System.out.println("state 3");
		} catch (NullPointerException noe) {
			System.out.println("State 4");
		}
		System.out.println("State 5...");
	}
}
