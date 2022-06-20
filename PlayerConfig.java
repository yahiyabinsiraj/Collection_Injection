package com.wipro.SpringDemo.players;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import java.util.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.wipro.SpringDemo.players")
public class PlayerConfig {

	@Bean
	@Scope("singleton")
	public HashMap<String, String> countryDetails() {
		HashMap<String, String> countryDetails = new HashMap<>();
		return countryDetails;
	}
}


