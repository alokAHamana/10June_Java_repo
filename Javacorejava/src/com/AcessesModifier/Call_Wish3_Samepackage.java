 package com.AcessesModifier;

public class Call_Wish3_Samepackage {       // no import is required in same package if we call 
	                                        //  method by Class name
	public static void main(String[] args) {
		
		System.out.println("main ");
		
		Wish3 w = new Wish3();         // Wish3 class main messege method se Static hta denge 
		                               // to is class mein call karne ke liye Object bana padega 
		
		w.messege();
		
	}

}   
