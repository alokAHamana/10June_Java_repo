package com.SwitchDemo;

public class SwitchDemo1 {

	public static void main(String[] args) {
	
		int a=  4 ;
		
		switch (a) {
		
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thursday");
			break;
		
		default:
		System.out.println("Not matched");
		}
	}
		   //output = thursday
}
