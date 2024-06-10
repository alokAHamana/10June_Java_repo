package com.alokjava1;

public class Test1 {


	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		Test1 t = new Test1();
		
		t.add(10,20);
	}
	public void add(int a,int b) {
		
		int sum = a+b;
		
		System.out.println(sum);
	}
			
	}

