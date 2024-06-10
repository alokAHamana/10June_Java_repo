package com.SwitchDemo;

public class SwitchVowel {

	public static void main(String[] args) {

		//SwitchVowel V = new SwitchVowel();
		//V.vowelornot('g') ;                                   //    { for instance method }
		
		vowelornot('g');
	}
	private static void vowelornot (char ch) {	
		//char ch = 'g';
	
	switch (ch) {
	
	case 'a':
		System.out.println("vowel");
		break;
	case 'e':
	    System.out.println("vowel");
	    break;
	case 'i':
		System.out.println("vowel");
	    break;
	case 'o':
		System.out.println("vowel");
	    break;
	    default:
	    	System.out.println("default");
	
	}
  }
}                         //output = default