package com.alokjava1;

public class Student {
int id;
String name;
public Student(int id,String name) {
	this.id= id;
	this.name= name;
	
}

public static void main(String[] args) {
	
	Student s1= new Student(102,"Alok");
	System.out.println(s1.id);
	System.out.println(s1.name);
}
}
