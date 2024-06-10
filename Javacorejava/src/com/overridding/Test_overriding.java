package com.overridding;

public class Test_overriding {
	
	public static void main(String[] args) {
		
		Parent_ovr p = new Parent_ovr();
		
		      p.m1();       // parent method
		      
		 Child_ovr c1 = new Child_ovr();
		      
		       c1.m1();         // child method
		       
         Parent_ovr pc = new Child_ovr();
         
               pc.m1();    // child method
                                 // m1 method child ne override kr liya 
                                                      
	}
            // agar parent or child ke method {Static}bane de to {parent method call hota}
}            // fir yaha method hiding concept lagega na ki overriding
