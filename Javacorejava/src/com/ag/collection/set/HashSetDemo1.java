package com.ag.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<>();
		
		s1.add(15);
		s1.add(6);
		s1.add(1);
		s1.add(20);
		s1.add(20);
		s1.add(null);
		
		System.out.println("sze :"+ s1.size());             // 5
		System.out.println(s1);                             // [null,  1 , 20 , 6 , 15 ]              
		//s.remove(15);
		System.out.println("15 Removed "+ s1.remove(15));   // 15 Removed: true
		System.out.println(s1);                             // [   null ,  1  , 20 , 6  ]
		System.out.println(s1.contains(10));                // false
		System.out.println(s1.contains(15));                // true
		s1.clear();
		System.out.println(s1);                             //[  ]
		System.out.println(s1.isEmpty());                   // true
		System.out.println();
		
	}
}
