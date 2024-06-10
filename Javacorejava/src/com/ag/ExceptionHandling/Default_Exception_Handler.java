package com.ag.ExceptionHandling;

public class Default_Exception_Handler {
	
	public static void main(String[] args) {
		
		System.out.println(10/0);
	}
}
	
	// internally it use  PRINT STACK TRACE  method
   //  default handler shows ->  Name ,discription and stack(location ) 

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * com.ag.ExceptionHandling.Default_Exception_Handler.main(
 * Default_Exception_Handler.java:7)
 */