package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		
		//HasSet LinkedHashset TreeSet
		Set<Integer>set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(10);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		System.out.println(set.contains(40));
		//System.out.println(set.remove(20));
		
		System.out.println("---using iterator interface---");
		
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---for each loop---");
		for(Integer i:set)
		{
			System.out.println(i);
		}
		System.out.println("---LinkedhashSet---");
		
		Set<Integer> set2=new LinkedHashSet<>();
		set2.add(20);
		set2.add(50);
		set2.add(70);
		set2.add(50);
		set2.add(70);
		set2.add(80);
		set2.add(null);
		
		System.out.println(set2);
		System.out.println("----TreeSet----");
		
		Set<Integer>set3=new TreeSet<>();
		
		set3.add(100);
		set3.add(10);
		set3.add(50);
		set3.add(20);
		set3.add(90);
		set3.add(20);
		set3.add(90);
		//set3.add(null);
		
		System.out.println(set3);
	}

}
