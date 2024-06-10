package com.operators;

public class conditionalOperator {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		int x=(a>b)?40:50;
		
		System.out.println(x);                       //50
		
		int y=(a>50)?777: (b>100)?888:999;
		
		System.out.println(y);                        //999
		
		
	}
}
