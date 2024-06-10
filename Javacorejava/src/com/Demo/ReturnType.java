package com.Demo;

public class ReturnType {
	
	public static void main(String[] args) {
	
		//ReturnType t = new ReturnType();    // ye object    
		
		String messege = ReturnType.wish();     // phir yahan obj ke reference se call karna hoga
		
		System.out.println(messege); 
		
	}

	public static String wish() {          // yahan se static hta denge to obj bnana padega
		
		return " call wish method by returnsssss";
	} 
}
