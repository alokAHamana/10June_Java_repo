package com.practicalfile;

public class CharacterCount {
	
	    public static void main(String[] args) {
	        final int MAX_CHAR = 256;
	        
	        String str = "Alok Ahamana";

	        int[] count = new int[MAX_CHAR];

	        for (int i = 0; i < str.length(); i++) {
	            count[str.charAt(i)]++;
	        }

	        System.out.println("Character Counts:");
	        for (int i = 0; i < MAX_CHAR; i++) {
	            if (count[i] > 0) {
	                System.out.println((char) i + " : " + count[i]);
	            }
	        }
	    }
	}