package com.ram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Student;
import com.ram.service.StudentService;

@RestController
@RequestMapping(value = "api/v1/getstudents")
public class StudentContoroller {

	private StudentService studentService;
	
	@Autowired
	public StudentContoroller(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getStudents() {
		return StudentService.getStudents();
	}
	
	@PostMapping
	public void registerStudent(@RequestBody Student student) {
		StudentService.addNewStudent(student);
	}

}
