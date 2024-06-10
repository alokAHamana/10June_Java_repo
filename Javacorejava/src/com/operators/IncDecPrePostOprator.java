package com.operators;

public class IncDecPrePostOprator {

	public static void main(String[]args) {
		
		int a= 10;
		
		//  Post Pre Increment
		
		System.out.println(a++);    // 10        -> (11)
		System.out.println(++a);    // 12
		
		// post pre Dcrement         yaha tak   a = 12   ho gya
		
		System.out.println(a--);       //12        ->(11)
		System.out.println(--a);       //10
	}
}
