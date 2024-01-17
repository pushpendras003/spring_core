package com.springcore;

public class Students {
	public int studentId;
	public String name;
	public String city;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", name=" + name + ", city=" + city + "]";
	}
	
}
