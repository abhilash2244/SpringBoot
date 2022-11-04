package com.ram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.model.Student;
import com.ram.repository.StudentRepo;

@Service
public class StudentService {
	
	private static StudentRepo studentRepo;
	@Autowired
	public StudentService (StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public static List<Student> getStudents(){
//		return List.of(new Student("sanath", "REddy", "sanat@gmail.com", 22));
		
		return studentRepo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String primeNumbers(int num1) {
		int i = 0, j = 0;
		String primeNumbers = "";
		for (i = 1; i <= num1; i++) {
			int counter = 0;
			for (j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		return primeNumbers;

	}
}
