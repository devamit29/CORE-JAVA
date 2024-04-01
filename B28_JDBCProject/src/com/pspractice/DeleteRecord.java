package com.pspractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b28_exponent", "root", "root");
			String sql="Delete  from student where sid= ?";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter student id");
			int sid=sc.nextInt();
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1, sid);
			ps.executeUpdate();
			System.out.println("record successfully deleted");
			connection.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
