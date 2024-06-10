package com.ag.ExceptionHandling;

public class Try_CatchDemo1 {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
		
		  System.out.println(10/2);
		  
		}
		  System.out.println("hi....");
	}
	
}
