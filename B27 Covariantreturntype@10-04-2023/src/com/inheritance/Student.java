package com.inheritance;

public class Student {
	
	int id;
	String name;
	String address;
	
	@Override
	public String toString() {
		return name + " " + id +" "+ address;
				
	}

}
