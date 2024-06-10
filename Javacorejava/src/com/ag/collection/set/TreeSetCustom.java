package com.ag.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCustom {         // custom Sorting by Student class
	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>();
		
		treeSet.add(new Student(112, "Abcc"));
		treeSet.add(new Student(111, "Bbbb"));
		treeSet.add(new Student(115, "eeeee"));
		treeSet.add(new Student(114, "ccccccc"));
		treeSet.add(new Student(113, "ddddd"));

	  Iterator<Student> itr = treeSet.iterator();
	  
	  while(itr.hasNext()) {
		  
		  System.out.println(itr.next());
		  
	  }
	}

}
