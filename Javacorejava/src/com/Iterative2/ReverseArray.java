package com.Iterative2;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50,60,70,80};
		
		for(int i =arr.length-1 ; i>=0 ; i--) {    // i ki value 8-1 = 7 hogi// - 1 islye 
			                   // kiya h kyunki lenth 8 hai index print kara rahe hai bo 7 hai
			
			System.out.println(arr[i]);   //  ya ham index print kara rahe hai peche se
		}
	}

}
