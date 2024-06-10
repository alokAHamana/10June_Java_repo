package com.OOPS.demo;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		Singleton m1 = Singleton.getInstance();
		
		  System.out.println(m1.hashCode());
		
		Singleton m2 = Singleton.getInstance();
		
		  System.out.println(m2.hashCode());
		
	}

}          /*   o/p = 1510467688
                      1510467688     */

