package com.ag.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class ArraylistDemo1 {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>() ;
		
		arrayList.add("Alok");
		arrayList.add("Ravi");
		arrayList.add("Shailendra");
		arrayList.add("Rahul");
		arrayList.add("Dinesh");
		arrayList.add("Pradeep");
		arrayList.add(10);
		arrayList.add(20);
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}