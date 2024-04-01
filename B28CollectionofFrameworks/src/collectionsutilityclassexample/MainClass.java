package collectionsutilityclassexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<String>names =new ArrayList<>();
		Collections.addAll(names, "Amit","Vishal","Vinod","Vikas","Vijay","Test","Demo","Etest");
		System.out.println(names);
		
		//ascending sort a-z
		Collections.sort(names);
		System.out.println("---after sorting----");
		System.out.println(names);
		
		//shuffle
		System.out.println("---shuffle----");
		Collections.shuffle(names);
		System.out.println(names);
		
		//unmodify
		names=Collections.unmodifiableList(names);
		//names.add("pune");//UnsupportedException
		System.out.println(names);
		
		//Collections.unmodifiableSet(null)
		//Collections.unmodifiableMap(null)
	
		//Collections.synchronizedList(names);
		//Collections.synchronizedSet(null);
		//Collections.synchronizedMap(null);
		
	     
		
		
	}

}
