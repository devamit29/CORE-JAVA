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
			
			Map<String,Map<String,List<String>>>world=new HashMap<>();
			world.put("INDIA", india);
			world.put("USA", usa);
			return world;
			
		}
		public static void main(String[] args) {
			World world=new World();
			Map<String,Map<String,List<String>>>globe=world.addCountryDetails();
			System.out.println(globe);//List of all country>state>cities
			Set<String>countryList=globe.keySet();
			System.out.println(countryList); //USA,INDIA
			
			System.out.println("---using iterator interface---");
			Iterator<String>itr=countryList.iterator();
			while(itr.hasNext()) {
				String country=itr.next();
				System.out.println(country);
				
				Map<String, List<String>>State=globe.get(country);
				Set<String>stateList=State.keySet();
				Iterator<String>itr2=stateList.iterator();
				while(itr2.hasNext()) {
					System.out.println(itr2.next());
					String state=itr2.next();
					System.out.println(state);
					
					Map<String, List<String>>city=globe.get(country);
					Set<String>cityList=city.keySet();
					Iterator<String>itr3=cityList.iterator();
					while(itr3.hasNext()) {
						System.out.println(itr3.next());
					}
					
				}
			}
				}
			
		}

	



