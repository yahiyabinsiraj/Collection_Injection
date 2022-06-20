package com.wipro.SpringDemo.players;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Country {
	
	@Autowired
	public HashMap<String, String> countryDetails;
	public String countryId;
	public String countryName;
	
	public void setCountryName(String key) {
		this.countryName = this.countryDetails.get(key);
	}
	public String getCountryId() {
		return this.countryId;
	}
	public String getCountryName() {
		return this.countryName;
	}
	public void setCountryDetails(String key, String value) {
		this.countryDetails.put(key,value);
	}
	

}
