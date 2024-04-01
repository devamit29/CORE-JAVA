package serializeanddeserialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DPersist {
	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("output123 txt"));
		Child c=(Child) in.readObject();
		Child c1=(Child) in.readObject();
		
		Parent p=(Parent) in.readObject();
		Parent p1=(Parent) in.readObject();
		
		System.out.println(c.cid+" "+c.childName);
		System.out.println(c1.cid+" "+c1.childName);
		System.out.println(p.eid+" "+p.parentName);
		System.out.println(p1.eid+" "+p1.parentName);
		
		in.close();
	}

}
