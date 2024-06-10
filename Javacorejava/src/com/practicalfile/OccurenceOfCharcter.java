package com.practicalfile;
import java.util.HashMap;

public class OccurenceOfCharcter {

	    public static void main(String[] args) {
	        String str = "Alok@Ahamana";

	        HashMap<Character, Integer> map = new HashMap<>();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            } else {
	                map.put(ch, 1);
	            }
	        }

	        System.out.println("Character Counts:");
	        for (Character ch : map.keySet()) {
	            System.out.println(ch + " : " + map.get(ch));
	        }
	    }
	}
