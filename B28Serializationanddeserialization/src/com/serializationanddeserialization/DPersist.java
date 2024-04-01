package com.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DPersist {
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));
		
		Employee e=(Employee) in.readObject();//Object
		Employee e2=(Employee) in.readObject();
		System.out.println(e.eid+" "+e.ename+" "+e.address);
		System.out.println(e2.eid+" "+e2.ename+" "+e2.address);
		in.close();
	}

}
