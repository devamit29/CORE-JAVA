package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetExample {
	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<>();//create map
		
		map.put(101, "abc");
		map.put(102,"ac");
		map.put(103, "ab");
		map.put(104,"xyz" );
		map.put(105,"pqr");
		//entrySet() :return both list of keys and values :Set(Map.Entry<>)--format
		//values() :return only list of values
		
		Set<Map.Entry<Integer,String>>sets=map.entrySet();
		Iterator<Map.Entry<Integer,String>>itr=sets.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,String>enteries=itr.next();
			System.out.println(enteries.getKey()+" "+enteries.getValue());
		}
	}

}
