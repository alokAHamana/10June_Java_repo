package com.ag.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo3 {

	public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        
	        // Get an iterator to the ArrayList
	        Iterator<Integer> iterator = numbers.iterator();

	        while (iterator.hasNext()) {
	            Integer number = iterator.next();
	            numbers.add(5);
	            numbers.remove(2);
	            System.out.println(number);
	            
	            // Attempt to add an element during iteration
	            // This will throw a ConcurrentModificationException
	        }
	    }
	}
