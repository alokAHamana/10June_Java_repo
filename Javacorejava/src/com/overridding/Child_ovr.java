package com.overridding;

public class Child_ovr extends Parent_ovr {
	
	//@Override              // agar parent or child ke method static bana diye to 
	                         //  overridding nhi hogi , method hiding hogi;
	   public void m1() {
		
		System.out.println("Child method");
	}

	
}
