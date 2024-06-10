package com.Project.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurence_of_character {
	
	public static void main(String[] args) {
		
		String name = "ravindra";
		
		String[] strArray  = name.split("");
		
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
		for(String s : strArray) {
			
			if(hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s)+1);
			
		}else {
			hashMap.put(s, 1);
		}
	}

		for(Map.Entry<String,Integer> map : hashMap.entrySet()) {
			
		Entry<String, Integer> entry = null;
		if(entry.getValue()==2) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}}
	}
}


