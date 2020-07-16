package com.cognixia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.CountryService;


@RestController
public class CountryController {
@Autowired
CountryService coS;

	@Value("${server.port}")
	private int port;

	@GetMapping("/countries")
	public String displayCountries() {
		return coS.printCountries();
	}
}
