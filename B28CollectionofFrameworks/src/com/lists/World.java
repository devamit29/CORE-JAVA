package com.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
	public List<List<List<String>>> addCountryDetails() {
		List<String> maharastra = new ArrayList<String>();
		maharastra.add("pune");
		maharastra.add("mumbai");
		maharastra.add("nagpur");

		List<String> gujarat = new ArrayList<>();
		gujarat.add("surat");
		gujarat.add("vapi");
		gujarat.add("gandhinagar");

		List<String> usastate1 = new ArrayList<>();
		usastate1.add("NewYork");
		usastate1.add("LosAngeles");
		usastate1.add("Chicago");

		List<String> usastate2 = new ArrayList<>();
		usastate1.add("Boston");
		usastate1.add("Houston");
		usastate1.add("Phoenix");

		List<List<String>> india = new ArrayList<>();
		india.add(maharastra);
		india.add(gujarat);

		List<List<String>> usa = new ArrayList<>();
		usa.add(usastate1);
		usa.add(usastate2);

		List<List<List<String>>> world = new ArrayList<>();
		world.add(india);
		world.add(usa);

		return world;
	}

	public static void main(String[] args) {
		World world = new World();
		List<List<List<String>>>Globe=world.addCountryDetails();
		System.out.println(Globe);
		System.out.println("---using iterator----");
		Iterator<List<List<String>>>itr=Globe.iterator();
		while(itr.hasNext())
		{
			List<List<String>>countryList=itr.next();
			System.out.println(countryList);
			
			Iterator<List<String>>itr2=countryList.iterator();
			while(itr2.hasNext())
			{
				List<String> stateList=itr2.next();
				
				System.out.println(stateList);
				
				Iterator<String>itr3=stateList.iterator();
				
				while(itr3.hasNext()) {
					String cityList=itr3.next();
					
					System.out.println(cityList);
				}
				
			}
			
		}
		System.out.println("---using for each loop---");
		System.out.println();
		
		for (List<List<String>>countryList : Globe){
			for(List<String>stateList : countryList) {
				for(String cityList : stateList) {
					System.out.println(cityList);
				}
			}
		}
		

	}
}
