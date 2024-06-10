package com.OOPS.demo;

public class OverloadingCase3 {
	
	public static void m1(StringBuffer sb) {
		
		System.out.println("StringBuffer arrgument");
	}
	public static void m1(String str) {
		System.out.println("String version");
	}
	
	public static void main(String[] args) {
		m1(new StringBuffer("durga"));
		m1("durga");
		//m1(null);        // C.E   ambiguity problem
	}
}
