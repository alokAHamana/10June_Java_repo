package com.OOPS.demo;

public class Overloading_polymorphism {
	
	public void m1() {
		System.out.println("Zero argument");
	}
	public void m1(String messege) {
		System.out.println(messege);
	}
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Overloading_polymorphism  ovvr = new Overloading_polymorphism();
		
		ovvr.m1("string method");
		ovvr.m1(1001);
		ovvr.m1();
	}
}
