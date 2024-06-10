package com.ag.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {          // byDefault Natural Sorting ho rhi hai by 

public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet();
		
		treeSet.add("Bb");
		treeSet.add("Cc");
		treeSet.add("Aa");
		
	 System.out.println(treeSet);
	 
	 System.out.println("Iterate by Iterator");
	 
	 Iterator itr = treeSet.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	  }
	}

