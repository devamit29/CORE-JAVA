 package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {
	public static void main(String[] args) {
		//jdbc :checked exception
		try {
			
			//step 1 :load the driver or register driver class--my sql
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2:create the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28", "root", "root");//URL Username Password
			
			//step 3:to build sql query
			String sql="insert into student values(101,'Amit','Pune')";
			
			//step 4:create statement
			Statement smt=connection.createStatement();
			
			//step 5:execute sql
			smt.execute(sql);
			
			//step 6:to close connection
			connection.close();
			System.out.println("record inserted!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
