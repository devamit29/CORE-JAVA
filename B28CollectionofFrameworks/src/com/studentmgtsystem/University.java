package com.studentmgtsystem;

import java.util.List;

public class University {
	public static void main(String[] args) {
		College college=new College();
		List<Student>listOfStudent=college.addStudentDetails();
		
		for(Student s:listOfStudent) {
			System.out.println(s);
		}
	}

}
