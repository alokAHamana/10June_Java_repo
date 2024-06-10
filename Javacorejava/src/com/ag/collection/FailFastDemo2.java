package com.ag.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo2 {
	public static void main(String[] args) {
		ArrayList <Integer> ar = new ArrayList<>();
		         //index[  ]
		ar.add(1);    // 0           
		ar.add(2);    // 1           
		ar.add(3);    // 2               
		ar.add(4);    // 3        
		ar.add(5);    // 4         

		Iterator<Integer> itr = ar.iterator();
		
		while(itr.hasNext()) {
			 if(itr.next()==2) {       // yaha jab hme value=2 mile jaye gi to      
				 ar.remove(3);         // hme inde[3] jo 4 hai use remove kr denge
			 }
			 System.out.println(3);
		}
}    /*        [1, 2, 3, 4, 5]
	           [1, 2, 3, 5]
			Exception in thread "main" java.util.ConcurrentModificationException
				at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
				at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
				at com.ag.collection.FailFastDemo2.main(FailFastDemo2.java:20)
             */
}

