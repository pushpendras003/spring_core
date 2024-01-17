package com.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.springcore.config")
public class Config {
	
	@Bean(name= {"address"})
	public Address getAdd() {
		Address ad=new Address();
		return ad;
	}

	@Bean(name = {"student","stu"})
	public Student studentBean() {
		Student v=new Student(getAdd());
		return v;
	}
	
	
}
