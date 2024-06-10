package com.ag.collection.Map;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapDemo1 {             //   Natural Sorting
	public static void main(String[] args) {
		
	TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
	
	treeMap.put(102,"Aa");
	treeMap.put(101, "cc");
	treeMap.put(105, "Dd");
	treeMap.put(103, null);
	treeMap.put(104, null);
	
	Set set = treeMap.entrySet();
	
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	System.out.println(" By Advance for Each");
	treeMap.forEach((key, value)->{System.out.println(key+" "+value);});
	
	
	
	}

}
