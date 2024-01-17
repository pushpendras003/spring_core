package com.springcore.ref;

public class A {
	int value;
	B obj;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [value=" + value + ", obj=" + obj + "]";
	}
	

}
