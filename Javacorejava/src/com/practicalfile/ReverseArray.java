package com.practicalfile;

public class ReverseArray {
	  
	 private static void printReverseArray() {
		
		int[] array = {1,2,3,4,5,56,17};
		
		for(int i= array.length; i>=1 ; i--) {
			
			System.out.print( i +" , ");   }
		
	 }
			public static void  main(String[] args) {
				printReverseArray();   }
	
}	       
                                                  // o/p=    7 , 6 , 5 , 4 , 3 , 2 , 1 


