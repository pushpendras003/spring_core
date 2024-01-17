package com.springcore.config;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	@Value("Varanasi")
	public String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
}
