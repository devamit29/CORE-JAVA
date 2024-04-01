package com.classmgtsystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.classmgtsystem.model.Batch;
import com.classmgtsystem.model.Course;
import com.classmgtsystem.model.Faculty;
import com.classmgtsystem.model.Student;

public class ServiceImpl implements Services {
	
	Scanner sc=new Scanner(System.in);
	List<Course>clist=new ArrayList<Course>();
	List<Faculty>flist=new ArrayList<Faculty>();
	List<Batch>blist=new ArrayList<Batch>();
	List<Student>slist=new ArrayList<Student>();

	@Override
	public void addCourse() {
		System.out.println("How many courses do u want to add : ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			Course course=new Course();
			System.out.println("Enter cid : ");
			int cid= sc.nextInt();
			course.setCid(cid);
			
			System.out.println("Enter cname : ");
			String cname=sc.next();
			course.setCname(cname);
			
			clist.add(course);
			
		}
		System.out.println("Inserted !!");
		
	}

	@Override
	public void displayCourse() {
		for(Course c:clist) {
			System.out.println(c);
		}
		
		
	}

	@Override
	public void addFaculty() {
		System.out.println("HOw many faculty do u want to add : ");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			Faculty faculty= new Faculty();
			System.out.println("Enter Fid : ");
			faculty.setFid(sc.nextInt());
			
			System.out.println("Enter fname : ");
			faculty.setFname(sc.next());
			
			System.out.println("Select a course from following : ");
			displayCourse();// display which courses are available
			
			int cid=sc.nextInt();
			
			for(Course course:clist) {
				if(course.getCid()==cid) {
					faculty.setCourse(course);
				}
			}
			
			flist.add(faculty);
		}
		
		
	}

	@Override
	public void displayFaculty() {
		for(Faculty faculty: flist) {
			System.out.println(faculty);
		}
		
		
	}

	@Override
	public void addBatch() {
		
		
	}

	@Override
	public void displayBatch() {
		
		
	}

	@Override
	public void addStudent() {
		
		
	}

	@Override
	public void displayStudent() {
		
		
	}
	

}
