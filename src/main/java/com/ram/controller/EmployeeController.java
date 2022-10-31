package com.ram.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.model.Employee;
import com.ram.service.EmployeeService;
import com.ram.service.StudentService;

@RestController
public class EmployeeController {

	@GetMapping(value = "/home")
	public String home() {
		return EmployeeService.initService();
	}

	@GetMapping(value = "/fibanocci/{num}")
	public String home(@RequestParam int num) {
		System.out.println(num);
		return EmployeeService.fibanocci(num);
	}

	@GetMapping(value = "/primeNumber/{num}")
	public String primeNumbers(@RequestParam int num) {
		System.out.println(num);
		return StudentService.primeNumbers(num);
	}

	@PostMapping(value = "/login")
	public String postData(@RequestBody Employee data) {
		System.out.println(data);
		System.out.println(data.getEmpName());
		System.out.println(data.getEid());

		if (data.getEid() == "438") {
			return " , login succeeded";
		} else {
			return " , login failed";
		}

	}
}
