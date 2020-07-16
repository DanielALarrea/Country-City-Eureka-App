package com.cognixia.model;

public class City {
	
	private String cityName;
	private String countryName;
	private String population;

	public City () {
		
	}

	public City(String cityName, String countryName, String population) {
		super();
		this.cityName = cityName;
		this.countryName = countryName;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	// Write as HTML table data
	@Override
	public String toString() {
		return "<tr><td>" + cityName + "</td><td>" + countryName + "</td><td>" + population + "</td><tr>";
	}

}
