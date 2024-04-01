package com.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) throws IOException{
		Employee e=new Employee(101,"Amit","Pune");
		Employee e1=new Employee(102,"Vishal","Pcmc");
		
		FileOutputStream fout=new FileOutputStream("output.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e);
		out.writeObject(e1);
		out.close();
		System.out.println("success!!!");
		
	
		
	}

}
