package com.ag.collection;

public class StudentCustum {
	
	int id; 
	String name;

	public StudentCustum( int id, String name) {
	
	this.id = id;
	this.name= name;
	
	}
	
	@Override
	public String toString() {
		
		return "Stuent[id = "+id +", name="+name+"]";
	}

}
