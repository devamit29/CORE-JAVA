package com.map;

import java.util.HashMap;
import java.util.Map;

public class WorldWithAllMap {
	public Map<String, Map<String, Map<String, String>>> addCountryDetails() {
		Map<String, String> maharashtra = new HashMap<>();
		maharashtra.put("PUNE", "pune");
		maharashtra.put("MUMBAI", "mumbai");

		Map<String, String> gujarat = new HashMap<>();
		gujarat.put("VAPI", "vapi");
		gujarat.put("SURAT", "surat");

		Map<String, Map<String, String>> india = new HashMap<>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJARAT", gujarat);

		Map<String, Map<String, Map<String, String>>> world = new HashMap<>();
		return world;

	}

     public static void main(String[] args) {
    	 
     }
	
}