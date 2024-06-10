package com.practicalfile;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo1 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(101);
		arrayList.add(111);
		arrayList.add(222);
		arrayList.add(444);
		arrayList.add(222);

		Iterator<Integer> itr = arrayList.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("iterate through for each");
		for(int i : arrayList) {
			System.out.println(i);
		}
		System.out.println("iterate through advance for Each");
		
		arrayList.forEach((list)->{System.out.println(list);});

	}
}
