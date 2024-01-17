package com.springcore.ci;

public class Details {
	public int id;
	public String name;
	public Certi certi;
	public Details(int id, String name, Certi certi) {
		this.id = id;
		this.name = name;
		this.certi=certi;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+":"+this.id+"["+this.certi.name+"]";
	}
	
	

}
