package com.springcore.autowiring;

public class Address {
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String city;

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

	public Address(String city) {
		super();
		this.city = city;
	}
	
}
