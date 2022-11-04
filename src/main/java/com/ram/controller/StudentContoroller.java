package com.ram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Student;
import com.ram.service.StudentService;

@RestController
public class StudentContoroller {

	private StudentService studentService;
	
	@Autowired
	public StudentContoroller(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping(value = "api/v1/getstudents")
	public List<Student> getStudents() {
		return StudentService.getStudents();
	}

}
