package com.example.restservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudentInfo(String name, String rollNumber, String age) {
		
		System.out.println("Name: " + name);
		System.out.println("RollNumber: " + rollNumber);
		System.out.println("Age : " + age);

		Student student = new Student(name, rollNumber, age);
		return student;

	}

	@GetMapping("/students")
	public ArrayList<Student> getAllStudentsInfo() {

		System.out.print("Getting All Student Info");
		Student student1 = new Student("Raju", "5001", "33");
		Student student2 = new Student("Gokul", "5006", "23");
		Student student3 = new Student("Dinesh", "5056", "37");
		Student student4 = new Student("Kavin", "5023", "83");
		Student student5 = new Student("Nila", "5046", "13");

		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		return studentList;
	}

	@PostMapping("/student")
	public Student createStudent(@RequestBody Student s) {
		System.out.println("CreateStudent ");

		System.out.println("Name: " + s.getName());
		System.out.println("RollNumber: " + s.getRollNumber());
		System.out.println("Age : " + s.getAge());

		return s;

	}

}
