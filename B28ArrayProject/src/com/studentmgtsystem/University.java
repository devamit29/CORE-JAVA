package com.studentmgtsystem;

public class University {
	public static void main(String[] args) {
		College college=new College();
		Student[] studentArray=college.addStudentDetails();
		System.out.println("---for each loop----");
		
		for(Student s:studentArray)
		{
			System.out.println(s.id+" "+s.name+" "+s.address);
		}
	}

}
