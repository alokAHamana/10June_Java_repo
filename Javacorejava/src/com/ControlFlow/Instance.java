package com.ControlFlow;

public class Instance {
	int x= 10;                               // 3               9
	
	{                                        // 4               
		m1();                                //                 10
		System.out.println("FIIB");          //                  12
	}

	Instance()                              // 5                 15
	{
	System.out.println("constructor");	
	}
	public static void main(String[] args) {   //  1
		Instance p = new Instance();            // 2
		System.out.println("main method");
		p.m1();
	}
	
	public void m1() {                      // 6               11
		System.out.println(y);
	}
	{                                       // 7               13
		System.out.println("SIIB");
	}
	int y = 20;                             // 8                14
	
}         //  print - 1-instance method ,2- instance block, 3- constructor ,4 - main
          //              SIIB                FIIB

