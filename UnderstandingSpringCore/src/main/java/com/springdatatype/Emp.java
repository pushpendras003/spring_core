package com.springdatatype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	public String name;
	public List<Integer> phone;
	public Set<String> address;
	public Map<String, String> task;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phone=" + phone + ", address=" + address + ", task=" + task + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhone() {
		return phone;
	}
	public void setPhone(List<Integer> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getTask() {
		return task;
	}
	public void setTask(Map<String, String> task) {
		this.task = task;
	}
	

}
