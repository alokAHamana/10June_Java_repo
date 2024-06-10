package com.ag.collection.Map;

import java.util.Objects;

public class Employ {

	private int id;
	private String name;
	
	public Employ(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Employ [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);}
	
	//@Override
	public int compareTo(Employ e1) {
		//return this.name.compareTo(e1.name);
		
		if(this.id>e1.id) {
			return -1;
		}else if(this.id>e1.id) {
			return 1;
		}else {
			return 0;
		
		}
	}
}