package com.jdbcpra;

import java.sql.Connection;
import java.sql.DriverManager;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs", "root", "root");
			String sql="Create table employee (eid int(10),ename varchar(100)";
			
			
		} catch (Exception e) {
			
		}
	}

}
