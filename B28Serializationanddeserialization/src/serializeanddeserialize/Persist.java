package serializeanddeserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		Child c = new Child(15, "Lav");
		Child c1 = new Child(16, "Ganesh");

		Parent p = new Parent(100, "Ram");
		Parent p1 = new Parent(101, "Shiv");

		FileOutputStream fout = new FileOutputStream("output123 txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(c);
		out.writeObject(c1);
		out.writeObject(p);
		out.writeObject(p1);
		out.close();
		System.out.println("successful");

	}

}
