package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;



public class GetAllData {
	public static void main(String[] args) {
		try {
			Connection connection=MyConnection.getConnection();
			String sql="{call get_all_student()}";
			
			CallableStatement cs=connection.prepareCall(sql);
			ResultSet rs=cs.executeQuery();
			while (rs.next()) {
				System.out.println("Student Id:"+rs.getInt(1));
				System.out.println("Student name:"+rs.getString(2));
				System.out.println("---------------------");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
