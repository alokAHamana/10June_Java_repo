package com.ag.collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCustom {            // custom sorting by Studenta class in alphbet order
	
	public static void main(String[] args) {
		
		TreeMap<Studenta,String> treeMap = new TreeMap<Studenta,String>();
		
		treeMap.put(new Studenta(102,"Alok"),"MaaaaaaaaaP");
		treeMap.put(new Studenta(101,"Hari"),"UaaaaaaaaaaaP");
		treeMap.put(new Studenta(103,"Ram"),"MaaaaaaaaaaP");
		
		Set set = treeMap.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			     // agar mujhe sirf  key chahiye  ya sirf value chahiye to ye step likhna hoga
			Map.Entry<Studenta, String> entry = (Map.Entry<Studenta, String>)itr.next();
			
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
		
		System.out.println("By using Advance for each");
	
	treeMap.forEach((key, value)->{System.out.println(key+" "+value);});
	
	}
}
