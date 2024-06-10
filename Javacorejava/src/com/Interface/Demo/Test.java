package com.Interface.Demo;

public class Test implements interfDemo1{
		
		@Override
		public void m1() {
			
			System.out.println("m1 methodsssss");
		}
	   
		@Override
	   public void m2() {
		   
		   System.out.println("m2 methoddsss");
		}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
	}

}
