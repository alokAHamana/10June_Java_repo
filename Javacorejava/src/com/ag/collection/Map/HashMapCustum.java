package com.ag.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCustum {
	
	public static void main(String[] args) {
		
		HashMap<Studenta,String> hashMap = new HashMap<>();
		
		hashMap.put(new Studenta(11,"AA"), "Bppp");
		hashMap.put(new Studenta(12,"BB"), "App");
		hashMap.put(new Studenta(13,"CC"), "Delhi");
		hashMap.put(new Studenta(13, "DD"), "GG");
		hashMap.put(new Studenta(13, "EE"), "Cpp");
		
		Set set = hashMap.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {

			while (itr.hasNext()) {

				Map.Entry<Integer, String> entrys = (Map.Entry<Integer, String>) itr.next();

				System.out.println(entrys.getKey() + " " + entrys.getValue());
			}

	 System.out.println("====Iterate Map Using for each======");

			for (Map.Entry<Studenta, String> entry : hashMap.entrySet()) {

				System.out.println(entry.getKey() + " " + entry.getValue());
				
       System.out.println("===========For each Advance======");
				
				hashMap.forEach((key, value)->{System.out.println(key+" "+value);});
			}

			}
		}
	}
