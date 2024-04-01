package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparableandcomparator.SortByStudentUsingId;
import comparableandcomparator.SortByStudentUsingName;

public class Test {
	
	public static void main(String[] args) {
		Student s1=new Student(110,"Kamal",2050);
		Student s2=new Student(105,"Rajat",2048);
		Student s3=new Student(211,"Subrat",2000);
		Student s4=new Student(180,"Ranjan",2030);
		Student s5=new Student(107,"Puran",2020);
		Student s6=new Student(138,"Milu",2058);
		
		List<Student>listOfStudent=new ArrayList<>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);
		listOfStudent.add(s6);
		
		System.out.println("---before sorting----");
		for ( Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
		}
		System.out.println("---sort student using student id---");
		Collections.sort(listOfStudent,new SortById());
		for (Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
		}
		
	}

}
