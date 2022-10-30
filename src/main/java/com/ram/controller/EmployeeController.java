package com.ram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;


@RestController
public class EmployeeController {

	@GetMapping(value = "/home")  
	public String home () {
		return "Hello world1";
	}
	
	
	@PostMapping(value = "/login")  
	public String postData(@RequestBody Employee data) {
		System.out.println(data);
		System.out.println(data.getEmpName());
		System.out.println(data.getEid());

		if(data.getEid() == "438") {
			return " , login succeeded";
		}else {
			return " , login failed";
		}
			
	}
	
}
