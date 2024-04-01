package com.failsafefailfast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Test {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		Iterator<Integer>itr=al.iterator();
		while(itr.hasNext()) {
			//al.add(90);//fail fast
			System.out.println(itr.next());
		}
		System.out.println("---fail safe---");
		//CopyOnWriteArrayList<E>
		//CopyOnWriteArraySet<E>
		//ConcurrentHashMap<K, V>
		
		CopyOnWriteArrayList<Integer>al2=new CopyOnWriteArrayList<>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		System.out.println(al2);
		
		Iterator<Integer>itr2=al2.iterator();
		while(itr2.hasNext()) {
			al2.add(80);
			System.out.println(itr2.next());
		}
		System.out.println(al2);
	}

}
