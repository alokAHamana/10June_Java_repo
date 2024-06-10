package com.practicalfile;

public class ArrayReverseOrder {

public static void main(String[] args) {
	   printReverseArray();   }
   
 private static void printReverseArray() {
	
	int[] array = new int[]{5,4,9,8,6,77,4,55,66,45,65};
	
	for(int i= array.length; i<=0 ; i++) {
		
		System.out.print( i +" , ");
		
	}
}
         // output = 15 , 14 , 13 , 12 , 11 , 10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 0 

}