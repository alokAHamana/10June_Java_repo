package com.Constructor;

public class Student{
	
	private int id;
	private String name;
	{
		System.out.println("instance block");
	}
	
	Student()
	{
           System.out.println("zero param constructor");		
	}
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		
		Student s2 = new Student(101,"alok");
		Student s3 = new Student(102,"ram");

		Student s1 = new Student();
		
		System.out.println(s2.id + " "+ s2.name);
		System.out.println(s3.id + " "+ s3.name);
		
	}
	
	
}