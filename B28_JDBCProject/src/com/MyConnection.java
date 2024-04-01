package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	
	private static Connection  connection ;
	
	public static Connection getConnection() throws Exception{
		if (connection==null) {
			System.out.println("Connection created !!");
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch28callable", "root", "root");
			return connection;
			
		}else {
		return connection;
		}
	}
		

}
