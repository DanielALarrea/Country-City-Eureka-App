package com.cognixia.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	// Create Country objects and return a List
	public List<Country> initCountries() {
		List<Country> countryList = new ArrayList<Country>();
		
		countryList.add(new Country("France", "Paris", "66,990,000", "French"));
		countryList.add(new Country("Spain", "Madrid", "46,940,000", "Spanish"));
		countryList.add(new Country("Germany", "Berlin", "83,020,000", "German"));
		countryList.add(new Country("USA", "Washington D.C.", "328,200,000", "English"));
		
		return countryList;
	}
	
	// Print all Countries
	public String printCountries() {
		String allCountries = "";
		List<Country> countryList = initCountries();
		allCountries += "<table border=1  style= \"border-collapse:collapse\"><tr>"
				+ "<th>Name</th>"
				+ "<th>Capital</th>"
				+ "<th>Population</th>"
				+ "<th>Primary Language</th>"
				+ "</tr>";
		for (Country co: countryList) {
			allCountries += co;
		}
		allCountries += "</table>";
		
		return allCountries;
	}

}
