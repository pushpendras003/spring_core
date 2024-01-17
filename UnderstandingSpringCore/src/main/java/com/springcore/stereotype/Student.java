package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class Student {
	
	
	@Value("Pushpendra")
	private String name;
	@Value("1")
	private int id;
	@Value("#{temp}")
	private List<String> subjects;
	@Value("#{8>7}")
	boolean isGood;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int sqt;
	@Value("#{T(java.lang.Math).PI}")
	private double v;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, List<String> subjects) {
		super();
		this.name = name;
		this.id = id;
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subjects=" + subjects + ", isGood=" + isGood + ", sqt=" + sqt
				+ ", v=" + v + "]";
	} 

}
