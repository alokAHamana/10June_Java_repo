package com.ag.collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 { // Natural Sorting in Integer

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();

		hashMap.put(102, "Hari");
		hashMap.put(101, "Alok");

		Set set = hashMap.entrySet();

		Iterator itr = set.iterator(); // Map mein Iterate Set ke through object bana ke krte hai

		while (itr.hasNext()) {

			Map.Entry<Integer, String> entrys = (Map.Entry<Integer, String>) itr.next();

			System.out.println(entrys.getKey() + " " + entrys.getValue());
		}

		System.out.println("Iterate Map Using for each");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		System.out.println("=============advace for each==============");
		hashMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}
}