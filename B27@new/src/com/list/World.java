package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class World {
      public List<List<String>> addCountryDetails()
      {
    	  //INDIA :Odisha-->>city,chhattisgarh-->>city
    	  //USA : usastate1-->>city,usastate2-->>city
    	  
    	  public List<List<String>> addCountryDetails()
    		{
    			//INDIA : mah--->>pune,mubai,nagpur,Guj:-->>>surat,vapi,gandhinagar
    			List<String>Odisha=new ArrayList<>();
    			Odisha.add("Bhubaneswar");
    			Odisha.add("Cuttack");
    			Odisha.add("Sambalpur");
    			
    			List<String> Chhattisgarh = new ArrayList<>();
    			Chhattisgarh.add("Surat");
    			Chhattisgarh.add("Vapi");
    			Chhattisgarh.add("Gandhinagar");
    			
    			List<List<String>>india=new ArrayList<>();
    			india.add(Odisha);
    			india.add(Chhattisgarh);
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
}
