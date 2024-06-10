package com.ag.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {

	    public static void main(String[] args) {
	        
	        Set<String> linkedHashSet = new LinkedHashSet<String>();
	        
	        
	        linkedHashSet.add("B");
	        linkedHashSet.add("C");
	        linkedHashSet.add("A");
	        linkedHashSet.add("E");
	        linkedHashSet.add("F");
	        linkedHashSet.add("A");
	        linkedHashSet.add(null);
	        linkedHashSet.add(null);
	        
	        Iterator<String> itr = linkedHashSet.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        

	    }

	}

