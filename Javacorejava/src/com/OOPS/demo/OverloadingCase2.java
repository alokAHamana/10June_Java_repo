package com.OOPS.demo;

public class OverloadingCase2 {
	
	public void m1(Object obj) {             // parent argument
		
		System.out.println("object version - PARENT");
	}
    public void m1(String str) {                      // child argument
    	System.out.println("string version - CHILD");
    }
    
    public static void main(String[] args) {
		
    	OverloadingCase2  ov = new OverloadingCase2();
    	
    	ov.m1(new Object());
    	ov.m1("alok");                  // dono method me ja skta h lekin child ko priority dengye
    	ov.m1(null);                  //     same region
	}
}
