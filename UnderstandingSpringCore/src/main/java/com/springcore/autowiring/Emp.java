package com.springcore.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("ad2")
	private Address ad;

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public Emp(Address ad) {
		super();
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Emp [ad=" + ad + "]";
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
