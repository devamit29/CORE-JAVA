package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecords {
	public static void main(String[] args) {
		System.out.println("---create table example---");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root", "root");
			String sql="update employee set name='Nitin' where eid=104";
			Statement smt=connection.createStatement();
			int updateRecordCount=smt.executeUpdate(sql);
			System.out.println("records updated count:"+updateRecordCount);
			connection.close();
			System.out.println("records inserted...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
