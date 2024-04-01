package com.abstractions;

public class OracleDatabase implements Database {
	
	@Override
	public void commit() {
		System.out.println("Oracle commit");
		
	}
	
	@Override
	public void rollback() {
		System.out.println("Oracle rollback");
		
	}
	
	public static void main(String[] args) {
		//loose coupling support
		Database database=new OracleDatabase();
		database.commit();
		database.rollback();
		
		//tide coupling support
		OracleDatabase database2=new OracleDatabase();
		database2.commit();
		database2.rollback();
	}

}
