package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	
	public static void main(String[] args) {
		//Map : interface
		//
		Map<Integer, String> map=new HashMap<>();
		map.put(101,"xyz");
		map.put(102, "pqr");
		map.put(104, "bcd");
		map.put(105, "abc");
		map.put(105,"abc");//duplicate value not show
		map.put(105, "hhh");//value override
		map.put(null, null);
		map.put(null, "jjj");
		map.put(106, null);
		
		System.out.println(map);
		
		System.out.println(map.size());//6
		System.out.println(map.isEmpty());//false
		System.out.println(map.containsKey(104));//true
		System.out.println(map.containsValue("hhh"));//true
		
		System.out.println(map.get(101));//xyz
		System.out.println(map.get(99));//null
		
		//k-v insertion order maintain --->>>LinkesdhasMap(keys)
		Map<String, Integer>map2=new LinkedHashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);
		map2.put("D", 4);
		map2.put(null, 5);
		System.out.println(map2);
		
		System.out.println("----TreeMap---");
		//k-v //keys ascending sort
		Map<Integer, Integer> map3=new TreeMap<>();
		map3.put(10, 100);
		map3.put(90,10 );
		map3.put(20,200 );
		map3.put(5,1000 );
		map3.put(150,2000 );
		
		System.out.println(map3);
	}
	

}
