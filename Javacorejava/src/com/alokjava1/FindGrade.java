package com.alokjava1;

public class FindGrade {

	public static void main(String[] args) {
		
		FindGrade g = new FindGrade();
		
		g.grade(85);    }
	
	private  void grade(int number) {
			
	if(number>85) {
		System.out.println("grade A");
		
	}else if(number>75) {
		System.out.println("grade  B");
	}else if(number>65) {
		System.out.println("grade  C");
	}else if(number>40) {
		System.out.println("grade  D");
	}else if (number>33) {
		System.out.println("grade  fail");           //grade B
	}
	}
}
