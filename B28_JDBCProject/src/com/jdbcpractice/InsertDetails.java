package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDetails {
	
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/exponent","root","root");
			String sql="insert into student values(107,'Bijay','Sambalpur')";
			Statement smt=connection.createStatement();
			smt.execute(sql);
			
			System.out.println("success");
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			connection.close();
			System.out.println();
			
		}
	}

}
