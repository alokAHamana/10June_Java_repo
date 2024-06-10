package com.ag.ExceptionHandling;

public class Demo2 {
	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println("catch bolk");
		}
		finally {
			System.out.println("finally block");
		}
	}
}
//try block
//catch bolk
//finally block
