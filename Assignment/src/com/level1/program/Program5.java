package com.level1.program;

public class Program5 {

	public static void main(String[] args) {
		int i;
		int factorial = 1;
		int number = 5;
		
		for (i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is: " + factorial);

	}

}
