package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		Student s1=new Student(101,"Amit",50);
		Student s2=new Student(205,"Amar",65);
		Student s3=new Student(125,"Akshya",45);
		Student s4=new Student(110,"Subhajit",14);
		Student s5=new Student(310,"Vishal",11);
		Student s6=new Student(155,"Sagar",31);
		
		List<Student>listOfStudent=new ArrayList<>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);
		listOfStudent.add(s6);
		
		System.out.println("---before sorting----");
		for (Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
			
		}
		System.out.println("---sort student using student id---");
		Collections.sort(listOfStudent,new SortByStudentUsingId() );
		for (Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
			
		}
		System.out.println("---sort student using student name---");
		Collections.sort(listOfStudent,new SortByStudentUsingName());
		for (Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
		}
		System.out.println("---sort student using student rollNo---");
		Collections.sort(listOfStudent,new SortByStudentUsingRollNo());
		for (Student student : listOfStudent) {
			System.out.println(student.id+" "+student.name+" "+student.rollNo);
		}
	}

}
