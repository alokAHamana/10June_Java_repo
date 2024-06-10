package com.agkg.RegularExp;

import java.util.regex.Pattern;

public class RegularExpDemo3 {        //PatternSplit Method

	public static void main(String[] args) {

		Pattern p =Pattern.compile(" ");
		
		String[] strArray = p.split("Durga Software Solution");
		
		for(String s: strArray) {
			
			System.out.println(s);
		}
	}

}
