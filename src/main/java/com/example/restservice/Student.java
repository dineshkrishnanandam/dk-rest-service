package com.example.restservice;

public class Student {
	
	private String rollNumber;
	private String name;

	private String age;

	public Student() {
		super();
	}

	public Student(String name, String rollNumber, String age) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
