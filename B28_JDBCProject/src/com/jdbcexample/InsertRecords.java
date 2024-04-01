package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecords {
	public static void main(String[] args) {
		System.out.println("---create table example---");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root", "root");
			
			Statement smt=connection.createStatement();
			smt.execute("insert into employee values(104,'Prathamesh')");
			connection.close();
			System.out.println("records inserted...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
