package com.abstractions;

public class MySql implements Database {
	
	@Override
	public void commit() {
	System.out.println("mysql commit");
	}
	@Override
	public void rollback() {
		System.out.println("mysql rollback");
	}
	
	public void m3() {
		System.out.println("mySql class own method");
	}
public static void main(String[] args) {
	Database database=new MySql();
	database.commit();
	database.rollback();
	//database.m3();//indirect object are called only interface data

	MySql mySql=new MySql();
	mySql.commit();
	mySql.rollback();
	mySql.m3();//called implement data & own data
	}

}
