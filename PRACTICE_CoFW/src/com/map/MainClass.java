package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<>();
		map.put(101, "Sudhir");
		map.put(102, "Vishal");
		map.put(109, "Kajal");
		map.put(110, "Seema");
		map.put(107, "Dhananjay");
		map.put(112, "Amit");
		
		System.out.println(map);
		//keySet() ,entrySet() , value()
		Set<Integer>keys=map.keySet();
		System.out.println(keys);
		
		System.out.println("---using iterator interface----");
		
		Iterator<Integer>itr=keys.iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			System.out.println(key+" "+map.get(key));
		}
		System.out.println("---for each loop---");
		for(Integer i :keys) {
			System.out.println(i+" "+map.get(i));
		}
				
	}

}
