package com.practicalfile;

public class StudentModal {
	
	private int id ;
	private int age;
	private String name;
	private String collegeName;
	
	StudentModal(int id, int age, String name , String collegeName){
		
		this.id = id;
		this.age =age;
		this.name = name;
		this.collegeName =collegeName ;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	
}
