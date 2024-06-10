package com.ag.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCustumSort {
	
	public static void main(String[] args) {
		
		HashMap<Employ,String> hashMap = new HashMap<>();
		
		hashMap.put(new Employ(13,"CC"), "Delhi");
		hashMap.put(new Employ(12,"EE"), "Andra");
		hashMap.put(new Employ(11,"AA"), "Delhi");
		hashMap.put(new Employ(13,"DD"), "GUjrat");
		hashMap.put(new Employ(13,"AA"), "Chatisgarh");
		
		Set set = hashMap.entrySet();
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {

				Map.Entry<Integer, String> entrys = (Map.Entry<Integer, String>) itr.next();

				System.out.println(entrys.getKey() + " " + entrys.getValue());
			}
	}
}
//	Employ [id=11, name=AA] Delhi
//	Employ [id=12, name=EE] Andra
//	Employ [id=13, name=CC] Delhi
//	Employ [id=13, name=DD] GUjrat
//	Employ [id=13, name=AA] Chatisgarh
