package com.ag.collection.Map;

public class Studenta implements Comparable<Studenta>{
	
	private int id;
	private String name;
	
	public Studenta(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		 
		return "Studenta [id=" + id + ", name=" + name + "]";
	}	
	
	
	@Override
	public int compareTo(Studenta s) {
		//return this.name.compareTo(s.name);
		
		if(this.id<s.id) {
			return -1;
		}else if(this.id>s.id) {
			return 1;
		}else {
			return 0;
			
		}
	}
}	
	

