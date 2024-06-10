package com.Iterative2;

public class LabelBreak {

	public static void main(String[] args) {

		int i= 10;
		
		l1:
		{
			System.out.println("hello");
			
			if(i==10) 
				
				break l1;
				
				System.out.println("Hi");
		}
			
			System.out.println("End");
			
	}
}         // o/p  =  hello   , End


