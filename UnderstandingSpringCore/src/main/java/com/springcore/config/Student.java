package com.springcore.config;

import org.springframework.stereotype.Component;


public class Student {
	Address cityName;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Address cityName) {
		super();
		this.cityName = cityName;
	}

	public void getStudent() {
		System.out.println("I am studying"+" "+cityName);
	}

}
