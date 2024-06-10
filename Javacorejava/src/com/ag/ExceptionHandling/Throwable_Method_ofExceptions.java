package com.ag.ExceptionHandling;

public class Throwable_Method_ofExceptions {

	public static void main(String[] args) {

		try {

			System.out.println(10 / 0);

		} catch (ArithmeticException ae) {

			System.out.println("Print stack method ...shows...name ,discription,stack or location");
			ae.printStackTrace();

			System.out.println("to String Method ...shows...name and discription");
			System.out.println(ae.toString());

			System.out.println("get messege Method... shows... only discription");
			System.out.println(ae.getMessage());
		}
	}
}