package com;

import java.sql.CallableStatement;
import java.sql.Connection;

public class InsertData {
	
	public static void main(String[] args) {
		 try {
			Connection connection=MyConnection.getConnection();
			String sql=" ";
			CallableStatement cs=connection.prepareCall(sql);
			cs.execute();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
