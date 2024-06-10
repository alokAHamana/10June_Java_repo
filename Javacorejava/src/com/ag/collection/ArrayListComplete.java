package com.ag.collection;

import java.util.ArrayList;

public class ArrayListComplete {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList();
		ArrayList<Integer> a2 = new ArrayList();
		
		a.add(10);
		a.add(15);
		a.add(20);
		a.add(55);
		a.add(1,99);
		
		System.out.println(a);                    //[10,99,15,20,55]
		
		a2.add(1);
		a2.add(2);
		a2.addAll(a);
		 
		System.out.println(a2);                 //[1,2,10,99,15,20,55]
		System.out.println(a.get(0));          // 10
		
		a.remove(0);
		System.out.println(a);               //[99,15,20,55]
		a.remove(Integer.valueOf(55));
		System.out.println(a);                //[99,15,20]
		System.out.println(a.contains(50));    //false
	    a.set(0,100);                          //o index ki value update ho jayegi
	    System.out.println(a);                //[100,15,20]
	    a.clear();
	    System.out.println(a);                  //  [    ]
	}
}
