package com.practicalfile;

public class OccurenceOfCharacter1 {
	
	    public static void main(String[] args) {
	        
	    	String string = "Alok Ahamana123";
	        int[] charCounts = new int[256];  // Assumes ASCII characters

	        // Count each character's occurrences
	        for (char ch : string.toCharArray()) {
	            charCounts[ch]++;
	        }

	        // Print characters and their counts
	        System.out.println("Character Counts:");
	        for (int i = 0; i < 256; i++) {
	            if (charCounts[i] > 0) {
	                System.out.println((char) i + " : " + charCounts[i]);
	            }
	        }
	    }
	}
