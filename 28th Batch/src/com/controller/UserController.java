package com.controller;
 import com.service.*;
public class UserController {

	public static void main(String[] args) {
		System.out.println("main method");
		
		UserService u = new UserService();
		
		System.out.println(u.uid);
		System.out.println(u.name);
		u.m2();
	}

}
