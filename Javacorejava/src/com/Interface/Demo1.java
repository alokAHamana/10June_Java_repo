package com.Interface;

public interface Demo1 {          // normal - method ki body nhi ho sakti

	 void m1();                     //  by default modifier   - public abstract - 
	
	 int a = 123;                     //  by default modifier  - public static final - 
	
	 
	 default void display()            // In java 8 version- with default keyword we can use 
	    {     }                        //    concret method which contain body
       	   
	
	static void m2() 
	    {     }
		
	         
}

