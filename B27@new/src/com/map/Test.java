package com.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		// HashMap //LinkedHashMap--key ,//Treemap : k-v
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "abc");
		map.put(12, "xyz");
		map.put(13, "pqr");
		map.put(13, "pqra");
		map.put(14, "pqra");
		map.put(15, "pqra");
		map.put(null, "hhh");
		// map.put(null, "hhhh");
		System.out.println(map);

		System.out.println(map.size());
		System.out.println(map.get(10));// abc
		System.out.println(map.get(15));
		System.out.println(map.get(null));
		System.out.println(map.containsKey(15));
		System.out.println(map.containsValue("abc"));

		System.out.println("HashMap LinkedHashMap TreeMap");
		Map<Integer, String> map2 = new LinkedHashMap();
		map2.put(10, "abc");
		map2.put(12, "xyz");
		map2.put(13, "pqr");
		map2.put(13, "pqra");
		map2.put(14, "pqra");
		map2.put(15, "pqra");
		map2.put(null, "hhh");

		Map<Integer, String> map3 = new TreeMap<>();
		map3.put(14, "pqra");
		map3.put(15, "pqra");
		map3.put(12, "xyz");
		map3.put(13, "pqr");
		map3.put(13, "pqra");
		map3.put(10, "abc");
//		map3.put(null, "hhh");

		System.out.println("HashMap :" + map);
		System.out.println("LinkedhashMap :" + map2);
		System.out.println("TreeMap :" + map3);
	}



}
