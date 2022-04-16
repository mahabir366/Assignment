package com.level1.program;

public class Program4 {

	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;

		System.out.println("Original Number: " + num);

		
		while (num != 0) {

			
			int digit = num % 10;
			rev = rev * 10 + digit;

			
			num = num/10;
		}

		System.out.println("Reversed Number: " + rev);

	}

}
