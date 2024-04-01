package com.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SelectRecords {
public static void main(String[] args) {
	System.out.println("--create table example---");
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root","root");
		String sql="Select * from employee where eid=104"	;
		Statement smt=connection.createStatement();
		ResultSet rs=smt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("name"));
		}
		connection.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
