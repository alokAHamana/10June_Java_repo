package com.operators;

public class BitwiseOprator {

	public static void main(String[]args) {
		
	//  And oprator;	
	int a=10;                    //1010
	int b=12;                    //1100
	                           //        and opr
	int c = a&b;                 //1000=8
	
	System.out.println(c);                                  //8ans
		
	// OR oprator;
	int x =10;                 //1010
	int y = 12;                //1100
	
	int z =x|y;                //1110      
	
	System.out.println(z);                                     //14ans
	}
	
}
