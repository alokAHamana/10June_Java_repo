package com.practicalfile;

public class TestModal {

	public static void main(String[] args) {
	
		StudentModal[] students = new StudentModal[5];
		
		students[0]= new StudentModal(1111, 25 , "Alok" , "Mpct");
		
		students[1] = new StudentModal(2222, 20 , "Ram" , "Xyz");
		
		students[2] = new StudentModal(3333, 21 , "Shyam" , "abcd");
		
		students[3] = new StudentModal(4444 , 22 , "Abhi", "Jiwaji Uni");
		
		students[4] = new StudentModal(5555 , 23 , "Yash" , "Itm");
		
		for(StudentModal Modal : students) {
			
			System.out.println(Modal);
			
		}
		}
	}