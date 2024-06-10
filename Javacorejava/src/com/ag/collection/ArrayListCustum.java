package com.ag.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCustum {

	public static void main(String[] args) {
		
		ArrayList<StudentCustum> arrayList = new ArrayList<StudentCustum>();
	
		
		arrayList.add(new StudentCustum(101, "Alok"));
		arrayList.add(new StudentCustum(102, "Amit"));
		arrayList.add(new StudentCustum(103, "Ravi"));
		arrayList.add(new StudentCustum(102, "Ramu"));
		arrayList.add(new StudentCustum(102, "Rahul"));
		arrayList.add(new StudentCustum(102, "Anav"));
		
		Iterator<StudentCustum> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterate using for Each----------");
		for(StudentCustum ss:arrayList) {
			
			System.out.println(ss);
		}
	}	
}
     /* o/p=  Stuent[id = 101, name=Alok]
              Stuent[id = 102, name=Amit]
              Stuent[id = 103, name=Ravi]
              Stuent[id = 102, name=Ramu]
              Stuent[id = 102, name=Rahul]
              Stuent[id = 102, name=Anav]   */


