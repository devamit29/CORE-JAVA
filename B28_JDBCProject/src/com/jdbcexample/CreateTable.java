package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		System.out.println("---create table example---");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root", "root");
			String sql="create table employee(eid int(10),name varchar(100))";
			Statement smt=connection.createStatement();
			smt.execute(sql);
			connection.close();
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
