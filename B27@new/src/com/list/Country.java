package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Country {
	
	public List<List<String>> addCountryDetails()
	{
		//INDIA : mah--->>pune,mubai,nagpur,Guj:-->>>surat,vapi,gandhinagar
		List<String> maharashtra=new ArrayList<>();
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		maharashtra.add("Mumbai");
		
		List<String> gujrat = new ArrayList<>();
		gujrat.add("Surat");
		gujrat.add("Vapi");
		gujrat.add("Gandhinagar");
		
		List<List<String>>india=new ArrayList<>();
		india.add(maharashtra);
		india.add(gujrat);
		return india;
		
	}
	public static void main(String[] args) {
		Country country=new Country();
		List<List<String>>india=country.addCountryDetails();
		System.out.println(india);
		
		System.out.println("---using iterator interface---");
		
		Iterator<List<String>>itr=india.iterator();
		while(itr.hasNext())
		{
			List<String>stateList=itr.next();
			System.out.println(stateList);
			Iterator<String>itr2=stateList.iterator();
			while(itr2.hasNext()) {
				String city=itr2.next();
				System.out.println(city);
			}
		}
		System.out.println("---for each loop---");
		for(List<String>stateList : india) {
			for (String cities : stateList) {
				System.out.println(cities);
			}
		}
	}
}
