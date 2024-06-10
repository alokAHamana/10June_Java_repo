package com.ag.collection;

public class ArrayCustum {
	
	public static void main(String[] args) {
		
		StudentCustum[] s = new StudentCustum[4];
		
		s[0]= new StudentCustum(101,"anav");
		s[1]= new StudentCustum(102,"bnav");
		s[2]= new StudentCustum(103,"cnav");
		s[3]= new StudentCustum(104,"dnav");
		
		for( StudentCustum sss : s) {
			System.out.println(sss);
		}
	}

}
