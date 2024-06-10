package com.agkg.RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpDemo2 {
	
	public static void main(String[] args) {
		
		String x = "[0-9a-z]";
		
		Pattern p =Pattern.compile(x);
		
		Matcher m = p.matcher("a3b@c4z#");
		
		while(m.find()) {
			
			System.out.println(m.start()+" "+m.group());
		}
		
	}

}
