package com.Typecasting;

public class ExplicitTypeCasting {                     //down casting

	public static void main(String[] args) {
		
		int a= 10;                                   //4byte
		
		byte b = (byte)a;                             //1byte
		
		System.out.println(b);     //10
		
		
		double d = 130.123;                                 //8byte
		
		int x = (int)d;                                      //4byte
		
		
		System.out.println(x);              //130
		
		
	}
}
