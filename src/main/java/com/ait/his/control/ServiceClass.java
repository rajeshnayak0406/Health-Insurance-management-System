package com.ait.his.control;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	public String getsatename(String ssn) {
		
		HashMap<String, String> hs= new HashMap<>();
		hs.put("001,002", "New Hampshire");
		hs.put("004–007","Maine");
		hs.put("008–009", "Vermont");
		hs.put("010–034", "Massachusetts");
		hs.put("035–039", "	Rhode Island");
		hs.put("040–049", "Connecticut");
		
		
		
		hs.put("050–134", "New York");
		hs.put("135–158","New Jersey");
		hs.put("159–211", "Pennsylvania");
		hs.put("212–220", "Maryland");
		hs.put("221–222", "	Delaware");
		hs.put("223–231", "	Virginia");
		
		
		hs.put("232–236", "West Virginia");
		hs.put("237–246","North Carolina");
		hs.put("247–251", "South Carolina");
		hs.put("252–260", "Georgia");
		hs.put("261–267", "	Florida");
		hs.put("268–302", "Ohio");
		
		hs.put("303–317", "Indiana");
		hs.put("318–361","Illinois");
		hs.put("362–386", "Michigan");
		hs.put("387–399", "Wisconsin");
		hs.put("400–407", "	Kentucky");
		hs.put("408–415", "Tennessee");
		
		hs.put("416–424", "Alabama");
		hs.put("425–428","Mississippi");
		hs.put("429–432", "Arkansas");
		hs.put("433–439", "Louisiana");
		hs.put("440–448", "Oklahoma");
		hs.put("449–467", "Texas");
		
		hs.put("468–477", "Minnesota");
		hs.put("478–485","Iowa");
		hs.put("486–500", "Missouri");
		hs.put("501–502", "North Dakota");
		hs.put("503–504", "South Dakota");
		hs.put("505–508", "Nebraska");
		
		hs.put("509–515", "Kansas");
		hs.put("516–517","Montana");
		hs.put("518–519", "Idaho");
		hs.put("520", "Wyoming");
		hs.put("521–524", "	Colorado");
		hs.put("525-585", "New Mexico");
		
		hs.put("526–527", "Alaska");
		hs.put("575–576","Hawaii");
		hs.put("577–579", "District of Columbia");
		hs.put("580", "U.S. Virgin Islands");
		hs.put("580–584", "	Puerto Rico");
		hs.put("586", "Pacific Ocean territories");
		
		
		hs.put("700–728", "Railroad Retirement Board ");
		hs.put("729–730","Enumeration at entry");
		hs.put("750-751", "Hawaii");
		hs.put("752-755", "Mississippi");
		
		hs.put("756-763","Tennessee");
		hs.put("764-765", "Arizona");
		hs.put("766-772", "Florida");
		
		
		
		
		
		System.out.println(hs);
		
		
	   if(hs.containsKey(ssn)) 
	   {
		   return hs.get(ssn);
	   }
		else {
			return "SSN no is not available";
		}
		
		
		
		
		
		
		
		
		
		
	}

}
