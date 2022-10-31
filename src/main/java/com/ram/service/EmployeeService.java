package com.ram.service;

import com.ram.model.add;

public class EmployeeService {
	public static String initService() {
		System.out.println("in service");
		return "Hello world from service";
	}

	public static String fibanocci(int num) {

		int n1 = 0, n2 = 1, n3, i, count = num;
		String series;
		series = n1 + " " + n2;
		System.out.print(n1 + " " + n2);
		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			series = series + " " + n3;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		return series;
	}

	public static String palindrome(int data) {

		int r, sum = 0, temp;

		int n = data;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			return "palindrome number";
		else
			System.out.println("not palindrome");
			return "not palindrome";

	}
	
	public static int addition(add data) {
		
		System.out.println(data.getA() +data.getB());
		return data.getA() +data.getB(); 
		
		
	}

}
