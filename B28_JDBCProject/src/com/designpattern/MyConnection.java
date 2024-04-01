package com.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MyConnection {
	private static Connection connection=null;
	
	private MyConnection()
	{
		
	}
	public static Connection getConnection()
	{
		try {
			//Class.forName("com.mysql.jdbc.Driver.class");
			//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28_exponent", "root", "root");
			Connection connection=MyConnection.getConnection();
			String sql="insert into student values(?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			Scanner sc=new Scanner("System.in");
			System.out.println("Enter student id");
			int studentId=sc.nextInt();
			System.out.println("Enter student name");
			String sname=sc.next();
			System.out.println("Enter student address");
			String address=sc.next();
			ps.setInt(1, studentId);
			ps.setString(2, sname);
			ps.setString(3, address);
			ps.execute();
			System.out.println("Records inserted...!!!");
			//connection.close();
			sc.close();
			
			if (connection==null) {
				Class.forName("com.mysql.jdbc.Driver.class");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28_exponent", "root", "root");
				return connection;
			}
				
			}catch (Exception e) {
				e.printStackTrace();
				
			}
			return connection;
			
		
	}

}
