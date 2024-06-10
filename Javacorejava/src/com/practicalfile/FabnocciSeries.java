package com.practicalfile;

public class FabnocciSeries {
	
	public static void main(String[] args) {
		
		
		int n1=0 , n2= 1  ,n3 ;
		
		int number = 10;
		
		for(int i =1 ; i<=number ; i++) {
			
			n3 = n1+n2 ;
			n1 = n2 ;
			n2 = n3 ;			
			
			System.out.print(n3+ " ");
		}
  }
}      // o/p = 1 2 3 5 8 13 21 34 55 89 