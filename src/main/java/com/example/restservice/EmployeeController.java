package com.example.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

	@GetMapping("/employee")
	
	public Employee  getEmployeesDetails(String empName, String empNumber, String empMailId) {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Number : " + empNumber);
		System.out.println("Employee Mail-Id : " + empMailId);

		Employee employee = new Employee(empName, empNumber, empMailId);
		return employee;

	}

	@GetMapping("/employees")
	
	public ArrayList<Employee> getAllEmployeesDetails() {
		
		System.out.print("Getting All Employees Details");
		Employee employee1 = new Employee("Gokul", "7003", "goku123@gmail.com");
		Employee employee2 = new Employee("Mohan", "7890", "mdmohan@gmail.com");
		Employee employee3 = new Employee("Ananth", "7657", "ananth707@outlook.com");

		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		
		employeesList.add(employee1);
		employeesList.add(employee2);
		employeesList.add(employee3);

		return employeesList;
	}

}
