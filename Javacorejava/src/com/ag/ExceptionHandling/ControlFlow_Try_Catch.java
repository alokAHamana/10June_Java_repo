package com.ag.ExceptionHandling;

public class ControlFlow_Try_Catch {   //case 1 : if there is no Exception

	public static void main(String[] args) {

		try {

			System.out.println("State 1");
			System.out.println("State 2");
			System.out.println("state 3");
		} catch (Exception e) {
			System.out.println("State 4");
		}
		System.out.println("State 5...");
	}
}
