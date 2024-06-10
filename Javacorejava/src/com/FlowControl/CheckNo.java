package com.FlowControl;

public class CheckNo {

	public static void main(String[] args) {
		
		CheckNo c = new CheckNo();
		
		c.checknoPostORNeg();
	}
	
	public void checknoPostORNeg() {
		
		int a= 2;
		
		if(a<0) {
			System.out.println("No is neg");
		
		}else {
			System.out.println("No is postive");
		}
		
	}
	
	   
}
