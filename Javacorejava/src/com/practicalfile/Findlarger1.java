package com.practicalfile;

public class Findlarger1 {

	public static void main(String[] args) {
		
		int a=11,b=22,c=33;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}else {
				System.out.println("c is greater");
			}
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
			}
		}
				
}

