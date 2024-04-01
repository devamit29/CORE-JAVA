package com.pspractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28_exponent","root","root");
			String sql="Update student set sname =? where sid =?";
			PreparedStatement ps=connection.prepareStatement(sql); 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student name for update");
			String updatedName=sc.next();
			System.out.println("Enter student id for update");
			int updatedId=sc.nextInt();
			 
			ps.setString(1, updatedName);
			ps.setInt(2, updatedId);
			
			ps.executeUpdate();
			System.out.println("records updated successfully!!!");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
