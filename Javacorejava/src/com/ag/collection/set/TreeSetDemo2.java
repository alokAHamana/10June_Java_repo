package com.ag.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2 {    //byDefault Natural Sorting  of Integer

 public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet();
		
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(1);
		
	 System.out.println(treeSet);
	 
	 
	 System.out.println("Iterate by Iterator");
	 
	 Iterator itr = treeSet.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
  }
}
