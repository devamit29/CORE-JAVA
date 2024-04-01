package com.studentmgtsystem;

import java.util.List;
public class University {
	public static void main(String[] args) {
		College college=new College();
		
		List<Student>listOfstudent=college.addStudentDetails();
		System.out.println("---for each loop---");
		
		for (Student s : listOfstudent) {
			System.out.println(s.id+" "+s.name+" "+s.address);
		}
	}

	
}
