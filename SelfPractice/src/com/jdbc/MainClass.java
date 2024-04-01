package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {
	
	public static void main(String[] args) {
		//jdbc :checked exception throws
		try {
			//step 1:load the driver or register the driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2:create the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root","root");
			
			//step 3:to bulid query
			String sql="insert into student values(102,'Amar','Pune')";
			
			//step 4 :create statement
			Statement smt=connection.createStatement();
			
			//step 5 :execute sql
			smt.execute(sql);
			
			//step 6:close the connection
			connection.close();
			System.out.println("record inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
