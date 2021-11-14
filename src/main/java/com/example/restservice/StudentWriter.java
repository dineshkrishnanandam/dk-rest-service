package com.example.restservice;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {

	public static void main(String[] args) throws IOException {

//		char a = 'd';
		FileWriter fileWriter = new FileWriter("D:\\project\\names4.txt", true);
//		fileWriter.write(a);
//		fileWriter.write("\n");
		fileWriter.write("Kumaran3, 3001, 18");
		fileWriter.write("\n");
		fileWriter.write("Jeeva3, 3002, 12");
		fileWriter.write("\n");

		fileWriter.close();
		System.out.print("I am done copying ");

	}

}
