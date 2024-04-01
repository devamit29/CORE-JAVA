package com.studentmgtsystem;

import java.util.List;

public class University {
	public static void main(String[] args) {
		College college=new College();
		
		List<Student>listOfStudent=college.addStundentDetails();
		System.out.println("---for each loop---");
		
		for (Student s:listOfStudent) {
			System.out.println(s.id+" "+s.name+" "+s.address);
		}
	}

}
