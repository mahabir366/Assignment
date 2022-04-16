package com.level2.program;

public class Program2 {

	public static void main(String[] args) {
		int count = 0;
		int n = 0;
		int i = 1;
		int j = 1;

		while (n < 574) {
			j = 1;
			count = 0;
			while (j <= i) {
				if (i % j == 0)
					count++;
				j++;
			}
			if (count == 2) {
				System.out.printf("%d ", i);
				n++;
			}
			i++;
		}

	}

}
