package com.classmgtsystem.controller;

import java.util.Scanner;

import com.classmgtsystem.service.ServiceImpl;
import com.classmgtsystem.service.Services;

public class HomeController {
	
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Services s=new ServiceImpl();
		boolean flag=true;
		
		while(flag) {
			
			System.out.println("App Started");
			System.out.println("1 . addCourse");
			System.out.println("2 . displayCourse");
			System.out.println("3 . addFaculty");
			System.out.println("4 . displayFaculty");
			System.out.println("5 . addBatch");
			System.out.println("6 . displayBatch");
			System.out.println("7 . addStudent");
			System.out.println("8 . displayStudent");
			System.out.println("9 . Exist app");
			
			int choice= sc.nextInt();
			
			switch (choice) {
			case 1:
				s.addCourse();
				break;
				
			case 2:
				s.displayCourse();;
				break;
				
			case 3:
				s.addFaculty();
				break;
				
			case 4:
				s.displayFaculty();
				break;
				
			case 5:
				s.addBatch();
				break;
				
			case 6:
				s.displayBatch();
				break;
				
			case 7:
				s.addStudent();
				break;
				
			case 8:
				s.displayStudent();
				break;
				
			case 9:
				flag= false;
				break;
				
			default:
				System.out.println("Invalid input !!");
				break;
			}
			
			
		}
		
	}

}


