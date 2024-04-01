package com.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
	
	public List<List<String>> addCountry()
	{
		List<String>maharastra=new ArrayList<String>();
		maharastra.add("pune");
		maharastra.add("mumbai");
		maharastra.add("nagpur");
		
		List<String>gujarat=new ArrayList<>();
		gujarat.add("surat");
		gujarat.add("vapi");
		gujarat.add("gandhinagar");
		
		List<List<String>>india=new ArrayList<List<String>>();
		india.add(maharastra);
		india.add(gujarat);
		return india;
	}
	public static void main(String[] args) {
		Country country=new Country();
		List<List<String>>india=country.addCountry();
		System.out.println(india);
		System.out.println("---using iterator---");
		Iterator<List<String>>itr=india.iterator();
		while(itr.hasNext()) {
			List<String>stateList=itr.next();
			System.out.println(stateList);
			Iterator<String>itr2=stateList.iterator();
			while(itr2.hasNext()) {
				String cityName=itr2.next();
				System.out.println(cityName);
			}
			
		}
		System.out.println("----for each-----");
		for(List<String>stateList:india) {
			for(String cities:stateList) {
				System.out.println(cities);
			}
		}
	}
	

}
