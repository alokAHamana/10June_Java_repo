package com.ControlFlow;

public class StaticFlowControl {
	
	static int x= 10;
	static 
	{
	m1();
	System.out.println("FSB");
	}
	public static void main(String[] args) {
		System.out.println("main");
		m1();
	}
	public static void m1() {
		System.out.println(y);
	}
	static
	{
		System.out.println("SSB");
	}
	
	static int y= 20;
}
