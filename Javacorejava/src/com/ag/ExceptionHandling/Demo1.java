package com.ag.ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) {

		try {
			System.out.println("try block ");
		} 
		catch (Exception e) {
			System.out.println("catch block"); // this will execute only when there is exception in try block
		}
		finally {
			System.out.println("finally block");
		}
	}
}   /*
	 * try block 
	 * finally block
	 */
