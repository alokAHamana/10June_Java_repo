package com.practicalfile;

public class ReverseString {

	
	public static void reverseName() {
		
		String str = "Alok_Ahamana";
		
		String reverse = " ";
		
		for(int i= str.length()-1; i>=0 ; i--) {
			
			reverse = reverse + str.charAt(i);}
			System.out.println(reverse);
		}
	
	
	public static void main(String[] args) {
		
		   reverseName();
	}
}
