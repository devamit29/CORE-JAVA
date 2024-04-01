package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		//List :--->>>AL,LL,Vector
		List al=new ArrayList<>();//indirect
	//	ArrayList a12=new ArrayList<>();
		
		al.add(10);//0    index=0 , length of size =1
		al.add(20);//1
		al.add(30);//2
		al.add(40);//3
		al.add(50);//4
		al.add(20);
		al.add(50);
		al.add(null);
		al.add(null);
		al.add("abc");
		al.add('J');
		
		System.out.println(al);
		System.out.println("list of size : "+al.size());
		System.out.println(al.get(3));///40//Object
		System.out.println(al.get(4));//50
		System.out.println(al.isEmpty());//false
		System.out.println(al.contains(10));//true
		System.out.println(al.contains(100));//false
		al.remove(2);
		System.out.println(al);
	}

}
