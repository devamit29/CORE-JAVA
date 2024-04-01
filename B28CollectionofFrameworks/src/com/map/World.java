package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class World {

	public Map<String, Map<String, List<String>>> addCountryDetails() {
		
		List<String>maharashtra=new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("nashik");
		maharashtra.add("mumbai");
		
		List<String>gujarat=new ArrayList<>();
		gujarat.add("surat");
		gujarat.add("vapi");
		gujarat.add("gandhinagr");
		//india : mah , guj
		
		Map<String,List<String>>india=new HashMap<>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJARAT", gujarat);
		
		List<String>california=new ArrayList<>();
		california.add("los angeles");
		california.add("san diego");
		california.add("san jose");
		
		
		List<String>texas=new ArrayList<>();
		texas.add("houston");
		texas.add("dallas");
		texas.add("san antonio");
		
		Map<String, List<String>>usa=new HashMap<>();
		usa.put("CALIFORNIA", california);
		usa.put("TEXAS", texas);
		
		Map<String,Map<String,List<String>>>WORLD=new HashMap<>();
		WORLD.put("INDIA", india);
		WORLD.put("USA", usa);
		return WORLD;
		
	}

	public static void main(String[] args) {
		World world = new World();
		Map<String, Map<String, List<String>>> GLOBE = world.addCountryDetails();
		System.out.println(GLOBE);
		Set<String> Country = GLOBE.keySet();
		System.out.println(Country);
		System.out.println("---iterator interfaces---");
		Iterator<String> itr = Country.iterator();
		while (itr.hasNext()) {
			String country = itr.next();
			System.out.println(country);
			Map<String, List<String>> countryMap = GLOBE.get(country);
			Set<String> State = countryMap.keySet();
			//System.out.println(State);
			Iterator<String> itr2 = State.iterator();
			while (itr2.hasNext()) {
				String state = itr2.next();
				System.out.println(state);
				
				List<String> cityList = countryMap.get(state);
				Iterator<String> itr3 = cityList.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);

				}

			}
			System.out.println("---for each loop---");
			for(String countryName :Country) {
				System.out.println(countryName);
				Map<String,List<String>>countrymap=GLOBE.get(countryName);
				Set<String> statesset=countrymap.keySet();
				for(String stateName:statesset) {
					System.out.println(stateName);
					List<String> citylist=countrymap.get(stateName);
					for(String city:citylist) {
						System.out.println(city);
					}
					
				}
				
			}

		}

	}

}
