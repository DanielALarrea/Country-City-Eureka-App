package com.cognixia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.CityService;


@RestController
public class CityController {
	@Autowired
	CityService ciS;

	@Value("${server.port}")
	private int port;

	@GetMapping("/cities")
	public String displayAllCities() {
		return ciS.printAllCities();
	}
	
	@GetMapping("/cities/{countryName}")
	public String displayCitiesByCountry(@PathVariable String countryName) {
		return ciS.printCitiesByCountry(countryName);
	}
}
