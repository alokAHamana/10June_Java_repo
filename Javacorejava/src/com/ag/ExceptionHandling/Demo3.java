package com.ag.ExceptionHandling;

public class Demo3 {
	public static void main(String[] args) {   // ABNORMALLY terminate  b/c excepton not matched
		try {
			System.out.println("TRY BLOCK");
			System.out.println(10/0);
		}catch(NullPointerException  npe) {
			System.out.println("CATCH BLOCK");
		}
		finally {
			System.out.println("FINALLY BLOCK");
		}
}	}
//TRY BLOCK
//FINALLY BLOCK

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.ag.ExceptionHandling.Demo3.main(Demo3.java:7)
