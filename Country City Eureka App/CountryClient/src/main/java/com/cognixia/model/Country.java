package com.cognixia.model;

public class Country {
	
	private String countryName;
	private String capital;
	private String population;
	private String language;
	
	public Country () {
		
	}

	public Country(String countryName, String capital, String population, String language) {
		super();
		this.countryName = countryName;
		this.capital = capital;
		this.population = population;
		this.language = language;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	// Write as HTML table data
	@Override
	public String toString() {
		return "<tr><td>" + countryName + "</td><td>" + capital + "</td><td>" + population
				+ "</td><td>" + language + "</td><tr>";
	}

}
