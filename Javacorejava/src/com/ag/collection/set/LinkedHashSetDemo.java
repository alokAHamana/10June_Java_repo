package com.ag.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> linkedHashSet = new LinkedHashSet();
		 
		linkedHashSet.add(10);
		linkedHashSet.add(15);
		linkedHashSet.add(20);
		linkedHashSet.add(10);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		
		Iterator itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}
}      /* o/p- 10              //insertionorder is preserved
               15              //duplicate are not allowed
               20              // null insertion is preserved only once
               null
       */
