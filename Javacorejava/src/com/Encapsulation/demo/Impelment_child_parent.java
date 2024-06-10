package com.Encapsulation.demo;

public class Impelment_child_parent {
	
	public static void main(String[] args) {
		
	// case 1:
		Parent p1 = new Parent();
		p1.m1();
		//p1.m2();  CE - parent ke obj ref se child ke method ko call nhi kr skte

	//case 2:
		Child c1 = new Child();
		c1.m1();             // child ke ref se parent ke method ko call kr skte hai
		c1.m2();
		
	//case 3:
		Parent p2 = new Child();
		p2.m1();
		//p2.m2();        // parent ke ref se child ko call ke method call nhi kr skte
		
	//case 4:    NOT POSSIBLE 
		//Child c2 = new Parent();
		
	
	}

}
