package com.level1.program;

public class Progam2 {

	public static void main(String[] args) {
		int n = 29;
		int m = n/2;
		boolean condition = false;
		for (int i = 2; i <= m; ++i) {
			
			if (n % i == 0) {
				condition = true;
				break;
			}
		}

		if (!condition)
			System.out.println(n + " is a prime number.");
		else
			System.out.println(n + " is not a prime number.");

	}

}
