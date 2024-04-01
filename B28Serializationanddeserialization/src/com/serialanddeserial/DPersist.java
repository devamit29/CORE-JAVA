package com.serialanddeserial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DPersist {
	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException{
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("Output12.txt"));
		Student s=(Student) in.readObject();
		
		
		Address adr=(Address) in.readObject();
		
		
		System.out.println(s.sid+" "+s.sname);
		System.out.println(adr.aid+" "+adr.ladr+" "+adr.padr);
		in.close();
		
	}

}
