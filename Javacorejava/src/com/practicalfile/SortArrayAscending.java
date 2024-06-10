package com.practicalfile;

import java.util.Arrays;

public class SortArrayAscending {

	public static void arraySort() {

		int[] arry = {5,4,9,6,7,2,6,3,8,55,66,48,56,};
		
		Arrays.sort(arry);
		System.out.println(Arrays.toString(arry));
		}
		
      public static void main(String[] args) {
    	  
    	  arraySort();
	}

}               //o/p = [2, 3, 4, 5, 6, 6, 7, 8, 9, 48, 55, 56, 66]

