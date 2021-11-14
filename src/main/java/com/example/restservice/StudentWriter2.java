package com.example.restservice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentWriter2 {

	public static void main(String[] args) throws IOException {

		
		writeStudent("Kumaran4, 3001, 18");
		writeStudent("Jeeva4, 3002, 12");

		

	}

	public static void writeStudent(String s) throws IOException {

		FileWriter fileWriter = new FileWriter("D:\\project\\student.csv", true);
		PrintWriter printWriter = new PrintWriter(fileWriter);

		printWriter.println(s);

		printWriter.close();

	}

}
