package com.list;

import java.util.List;

public class Country {
	
	public void addCountryDetails()
	{
		//INDIA:mah--->>pune,mumbai,nagpur, Guj--->>surat,vapi,gandhinagar
		List<String>maharashtra = new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nagpur");
		
		List<String>gujrat=new ArrayList<>();
		gujrat.add("surat");
		gujrat.add("vapi");
		gujrat.add("gandhinagar");
		
		List<String>india =new ArrayList<>();
		india.add(maharashtra);
		india.add(gujrat);
		return india;
		
		
	}
   public static void main(String[] args) {
	Country country=new Country();
	List<List<String>> india=country.addCountryDetails();
	System.out.println("---using iterator interface---");
	
	Iterator<List<String>> itr=india.iterartor();
}
}
