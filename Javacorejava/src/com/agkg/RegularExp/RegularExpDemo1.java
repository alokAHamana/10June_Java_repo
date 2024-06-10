package com.agkg.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo1 {

	public static void main(String[] args) {

	
		Pattern p = Pattern.compile("ab");
		
		Matcher m = p.matcher("abbbabbcddab");
		
		while(m.find()) {
			
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
   }
}
/*
 * 0  2 ab 
 * 4  6 ab 
 * 10 12 ab
 */