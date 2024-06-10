package com.practicalfile;
import java.util.Arrays;

public class SortingDataAscending {
	
	public  void sortdataAscending() {
		
		int[] arr = {5,6,111,8,9,2,4,7,1,22,33,88,66};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
		SortingDataAscending sortt = new SortingDataAscending();
		
		    sortt.sortdataAscending();
	}

}         //o/p = [1, 2, 4, 5, 6, 7, 8, 9, 22, 33, 66, 88,111]

