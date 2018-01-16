package com.au.Spring;

public class Employee {

private int id;
	
	public Employee(int i, String string, int j) {
		this.id=i;
		this.name=string;
		this.age = j;
	}
	public Employee() {}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private int age;

}
