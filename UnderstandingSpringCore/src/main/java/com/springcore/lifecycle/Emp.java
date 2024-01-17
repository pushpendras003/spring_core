package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {

	private int id;
	private String name;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@PostConstruct
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("post initialization");

	}
	@PreDestroy
	private void destroy() {
		// TODO Auto-generated method stub
		System.out.println("pre destroy");
	}
	
}
