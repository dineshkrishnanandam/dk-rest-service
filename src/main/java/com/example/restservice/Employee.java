package com.example.restservice;

public class Employee {

	private String empName;

	private String empNumber;

	private String empMailId;

	public Employee(String empName, String empNumber, String empMailId) {
		super();
		this.empName = empName;
		this.empNumber = empNumber;
		this.empMailId = empMailId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpMailId() {
		return empMailId;
	}

	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

}
