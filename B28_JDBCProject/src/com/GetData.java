package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class GetData {
	
	public static void main(String[] args) {
		try {
			Connection connection =MyConnection.getConnection();
			
			String sql="{call get_single_student(?)}";
			CallableStatement cs=connection.prepareCall(sql);
			cs.setInt(1,102);
			
			ResultSet rs = cs.executeQuery();
			
			while (rs.next()) {
				System.out.println("Student Id:"+rs.getInt(1));
				System.out.println("Student name:"+rs.getString("name"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
