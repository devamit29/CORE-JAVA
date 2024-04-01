package com.serviceimpl;

import java.util.Scanner;

import com.model.User;
import com.service.UserService;

//ctrl+shift+O
public class UserServiceImpl implements UserService {
	int MAX_SIZE = 10;
	User[] userArray = new User[MAX_SIZE];// 0 to 9 index-->String>>default value=null
	Scanner sc = new Scanner(System.in);

	@Override
	public void addUser() {

		System.out.println("add user method called..");
		System.out.println("how many users you want to add ?");
		int n = sc.nextInt();// 2
		for (int i = 0; i < n; i++) {
			User user = new User();
			System.out.println("Enter Id:");
			user.setId(sc.nextInt());

			System.out.println("Enter Name:");
			user.setName(sc.next());

			System.out.println("Enter Email Id:");
			user.setEmail(sc.next());

			userArray[i] = user;
			System.out.println("User added Successfully...");
		}
	}

	@Override
	public void displayUsers() {
		System.out.println("Display user called...");
		for (User user : userArray) {
			if (user != null)
				System.out.println(user);
		}
	}

	@Override
	public void updateUser() {
		System.out.println("Update user called...");
		
	}

	public void deleteUser() {
		System.out.println("Delete user Called...");
		displayUsers();
		// System.out.println("Enter the number of user from above list:");
		// int n=sc.nextInt();//12 13
		// userArray[n-1]=null;
		System.out.println("Enter the user Id which you want to delete:");
		int id_delete = sc.nextInt();

		// by using for loop
		int index = 0;
		for (int i = 0; i < userArray.length; i++) {
			User u = userArray[i];
			if (u != null && u.getId() == id_delete) {
				index = i;
				break;
			}
		}

		userArray[index] = null;
		
		// by using for each loop
		int index1 = 0;
		for (User u : userArray) {

			if (u != null && u.getId() == id_delete) {

				break;
			} else {
				index1++;
			}
		}
		userArray[index1] = null;

	}

}
