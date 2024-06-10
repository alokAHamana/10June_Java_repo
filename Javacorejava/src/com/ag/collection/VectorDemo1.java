package com.ag.collection;

import java.util.Enumeration;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector<Integer> vtr = new Vector<Integer>() ;
		
		vtr.add(10);
		vtr.add(15);
		vtr.add(null);
		vtr.add(20);
		
		Enumeration<Integer> en = vtr.elements();
		
		while(en.hasMoreElements()) {
		
		System.out.println(en.nextElement());
		}		
	
	//for(Integer i:vtr) {
		
		//System.out.println(i);  }
	
	
	}
}
