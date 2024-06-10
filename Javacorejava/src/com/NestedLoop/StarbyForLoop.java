package com.NestedLoop;

public class StarbyForLoop {
	
	public static void main(String[] args) {
		
		int i , j;
		
		for(i=0 ; i<5  ;i++) {
			
			for(j=0 ; j<=i ; j++) {
				
				System.out.print("*"); //  yaha print'ln' nhi ayega
			}
			System.out.println();
		}
   }
}       // nested for loop time comlexity badata hai jisse system ka performence kam ho jata hai