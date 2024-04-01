package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {
	
	public Map<String, List<String>> addCountry() {
		List<String>maharashtra=new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("nashik");
		maharashtra.add("mumbai");
		
		List<String>gujarat=new ArrayList<>();
		gujarat.add("surat");
		gujarat.add("vapi");
		gujarat.add("gandhinagr");
		//india : mah , guj
		
		Map<String, List<String>>india=new HashMap<>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJARAT", gujarat);
		return india;
		
		
	}
	public static void main(String[] args) {
		Country country=new Country();
		Map<String, List<String>>india=country.addCountry();
		System.out.println(india);
		
		Set<String>keys=india.keySet();
		System.out.println(keys);//[GUJARAT,MAHARASHTRA]
		
		System.out.println("---iterator interface---");
		Iterator<String>itr=keys.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println(key);
			
			List<String>stateList=india.get(key);
			
			Iterator<String>itr2=stateList.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("---for each loop----");
		
		for(String stateName:keys) {
			System.out.println(stateName);
			List<String>statelist=india.get(stateName);
			for(String cities :statelist) {
				System.out.println(cities);
			}
					
		}
	}

}
