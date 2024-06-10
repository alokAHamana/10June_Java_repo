package com.ag.collection;
import java.util.*;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList() ;
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(35);
		
		// converting array to list - in this we can not perform collection method
		
		List<Integer> arrayList2 = Arrays.asList(100,200,300);
		
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		System.out.println(arrayList2);
	}

}
