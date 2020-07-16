package com.cognixia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CityService {
	
	// Create City objects and return a list
	public List<City> initCities() {
		List<City> cityList = new ArrayList<City>();
		
		cityList.add(new City("Paris", "France", "2,148,000"));
		cityList.add(new City("Nice", "France", "340,000"));
		cityList.add(new City("Bordeaux", "France", "240,000"));
		cityList.add(new City("Madrid", "Spain", "6,642,000"));
		cityList.add(new City("Barcelona", "Spain", "1,600,000"));
		cityList.add(new City("Granada", "Spain", "240,000"));
		cityList.add(new City("Berlin", "Germany", "3,769,000"));
		cityList.add(new City("Munich", "Germany", "1,472,000"));
		cityList.add(new City("Hamburg", "Germany", "1,900,000"));
		cityList.add(new City("Washington D.C.", "USA", "705,749"));
		cityList.add(new City("Seattle", "USA", "744,955"));
		cityList.add(new City("Houston", "USA", "2,326,000"));
		
		return cityList;
	}
	
	// Print all Cities
	public String printAllCities() {
		String allCities = "";
		List<City> cityList = initCities();
		
		String tableHeader = "<table border=1 style= \"border-collapse:collapse\"><tr>"
				+ "<th>City Name</th>"
				+ "<th>Country Name</th>"
				+ "<th>Population</th>"
				+ "</tr>";
		
		allCities += tableHeader;
		for (City ci: cityList) {
			allCities += ci;
		}
		
		allCities+= "</table>";
		
		return allCities;
	}
	
	// Print all Cities for a given Country
	public String printCitiesByCountry(String countryName) {
		String allCitiesOfCountry = "";
		List<City> cityList = initCities();
		
		if(getUSA(countryName)) {
			countryName = "usa";
		}
		
		String tableHeader = "<table border=1 style= \"border-collapse:collapse\"><tr>"
				+ "<th>City Name</th>"
				+ "<th>Country Name</th>"
				+ "<th>Population</th>"
				+ "</tr>";
		
		allCitiesOfCountry += tableHeader;
		for (City ci: cityList) {
			if(ci.getCountryName().equalsIgnoreCase(countryName)) {
				allCitiesOfCountry += ci;
			}
		}
		
		allCitiesOfCountry += "</table>";
		
		// Checks if the table string is an empty table
		if(allCitiesOfCountry.equals(tableHeader + "</table>")) {
			allCitiesOfCountry = "Invalid country name. Please enter a valid country name.";
		}
		
		return allCitiesOfCountry;
	}
	
	// Check if the given string is a form of writing USA
	private boolean getUSA(String formOfUSA) {
		boolean isUSA = false;
		
		if(formOfUSA.equalsIgnoreCase("unitedstates") || formOfUSA.equalsIgnoreCase("us") || formOfUSA.equalsIgnoreCase("united states")
			|| formOfUSA.equalsIgnoreCase("unitedstatesofamerica") || formOfUSA.equalsIgnoreCase("united states of america")) {
			isUSA = true;
		}
		
		return isUSA;
	}
}
