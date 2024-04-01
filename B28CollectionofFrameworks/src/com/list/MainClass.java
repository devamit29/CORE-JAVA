package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainClass {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(101);// 0
		al.add(102);// 1
		al.add(103);
		al.add(104);
		al.add(105);

		System.out.println(al);

		System.out.println("---iterator interface---");

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		System.out.println("---for each loop---");
		for (Integer i2 : al) {
			System.out.println(i2);
		}
		List<String> al2 = new ArrayList<>();
		al2.add("abc");
		al2.add("xyz");
		al2.add("pqr");
		al2.add("kkk");

		Iterator<String> itr2 = al2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("---for each loop---");
		for (String s : al2) {
			System.out.println(s);
		}

		List<String> al3 = new LinkedList<>();
		al3.add("jj");
		al3.add("kk");
		al3.add("gg");
		System.out.println(al3);
		for (String s5 : al3) {
			System.out.println(s5);
		}

		int n=7;
		Vector<Integer> v = new Vector<Integer>(n);// growable array
		
		for(int i=12;i<=n;i++) {
			v.add(i);
			System.out.println(v);
		}
			

	}

}
