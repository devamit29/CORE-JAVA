package com.serialanddeserial;

import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) throws IOException {
		// creating the object
		Address adr = new Address(21, "BBSR", "SBP");
		
		Student s = new Student(2050, "Amit", adr);
		
		// creating stream and writing the
		FileOutputStream fout = new FileOutputStream("output12.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s);
		out.writeObject(adr);
		
		// closing the stream
		out.close();
		System.out.println("successful!!!!!");

	}

}
