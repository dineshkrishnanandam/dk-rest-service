package com.example.restservice;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class CollegeDatabase {
	
		private ArrayList<Student> studentList = new ArrayList<>();

		public ArrayList<Student> getStudentList() {
			return studentList;
		}
		
		
		
	
}
