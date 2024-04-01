package com.controller;

import java.util.Scanner;

import com.service.UserService;
import com.serviceimpl.UserServiceImpl;

public class AdminController {
	public static void main(String[] args) {
    	 System.out.println("***User management system application started***");
    	 
    	 UserService us=new UserServiceImpl();
    	 boolean flag=true;
    	 do {	 
    	 System.out.println("***MENU***");
    	 System.out.println("1.Add User");
    	 System.out.println("2.Display User");
    	 System.out.println("3.Update User");
    	 System.out.println("4.Delete User");
    	 System.out.println("5.Exit The application");
    	 
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Choose option from above:");
    	 int ch=sc.nextInt();
    	 switch (ch) {
    	 case 1:
    		 us.addUser();
    	     break;
    	 case 2:
    		 us.displayUsers();
    	     break;
    	 case 3:
    		 us.updateUser();
    	     break;
    	 case 4:
    		 us.deleteUser();
    	     break;
    	 case 5:
    		 flag=false;
    		 break;
    	 
    	 default:
    	 System.out.println("***Invalid choice***");
    	 break;
    	 }
    	 
	}while (flag);
    	
	}
}
