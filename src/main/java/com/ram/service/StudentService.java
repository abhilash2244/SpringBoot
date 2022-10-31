package com.ram.service;

public class StudentService {
	public static String primeNumbers(int num1) {
		System.out.println("Student service prime number");

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
		System.out.println(primeNumbers);
		return primeNumbers;

	}
}
