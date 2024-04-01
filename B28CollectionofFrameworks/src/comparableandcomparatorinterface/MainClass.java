package comparableandcomparatorinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Student s=new Student(11, "Vishal","Pune");
		Student s1=new Student(21, "Amol","Ahmednagar");
		Student s2=new Student(55, "Ajas","Nagpur");
		Student s3=new Student(110, "Ajay","Pcmc");
		Student s4=new Student(1, "Santosh","Mumbai");
		List<Student>listOfStudent=new ArrayList<>();
		listOfStudent.add(s);
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		System.out.println("---before sorting---");
		for(Student student:listOfStudent) {
			System.out.println(student.sid+" "+student.name+" "+student.address);
		}
		//1 11 21 55 110
		Collections.sort(listOfStudent);
		System.out.println("---after sorting---");
		for(Student student:listOfStudent) {
			System.out.println(student.sid+" "+student.name+" "+student.address);
		
		}
	}
		

}
	
