package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Set<Integer>set=new HashSet<>();
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(103);
		set.add(104);
		set.add(null);
		set.add(null);//no duplicate value
		System.out.println(set);//[null,101,102,103,104]
		System.out.println(set.size());//5
		System.out.println(set.contains(104));//true
		System.out.println(set.isEmpty());//false
		
		set.remove(101);
		System.out.println(set);//[null,102,103,104]
		
		System.out.println("---iterator interface---");
		
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			System.out.println(i);
		}
		
		for(Integer k:set) {
			System.out.println(k);
		}
		System.out.println("----LinkedHashSet---");
		
		Set<Integer>set2=new LinkedHashSet<>();
		set2.add(55);
		set2.add(66);
		set2.add(77);
		set2.add(77);
		set2.add(null);
		System.out.println(set2);//[55,66,77,null]
		
		System.out.println("---Treeset----");
		
		Set<Integer>set3=new TreeSet<Integer>();
		set3.add(90);
		set3.add(10);
		set3.add(70);
		set3.add(80);
		set3.add(5);
		System.out.println(set3);//[5,10,70,80,90]//elements sorting in ascending order
		
		//HashSet=>no duplicate,one null element
		//LinkedHashSet=>insertion order maintain,no duplicate,one null elements
		//TreeSet=>no duplicate,sort ascending order(integer),abcdc,doesn't support null elements
		
	}

}
