package com.example.restservice;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController2 {
//	ArrayList<Student> studentDatabase = new ArrayList<Student>();

//	CollegeDatabase collegeDatabase = new CollegeDatabase();
	@Autowired
	CollegeDatabase collegeDatabase;

	@GetMapping("/students2")
	public ArrayList<Student> getAllStudentsInfo() {

		System.out.print("Getting All Students Info");

		return collegeDatabase.getStudentList();
	}

	@PostMapping("/addstudent2")
	public Student createStudent(@RequestBody Student s) {
		System.out.println("...CreateStudent... ");

		collegeDatabase.getStudentList().add(s);
		System.out.println("Name: " + s.getName());
		System.out.println("RollNumber: " + s.getRollNumber());
		System.out.println("Age : " + s.getAge());

		return s;

	}

	@PostMapping("/addstudents2")
	public ArrayList<Student> createStudents(@RequestBody ArrayList<Student> studentsList) {
		System.out.println("...CreateStudents... ");

		collegeDatabase.getStudentList().addAll(studentsList);

		return collegeDatabase.getStudentList();

	}

	@GetMapping("/student2")
	public Student findStudentByRollNumber(String rollNumber) {
		System.out.print("Finding the Student that has a Roll Info");

		for (Student s : collegeDatabase.getStudentList()) {
			String rn = s.getRollNumber();
			if (rn.equals(rollNumber)) {
				return s;
			}

		}
		throw new RuntimeException("Unable to find the student for the rollnumber  ");

//		return studentList;
	}
}
