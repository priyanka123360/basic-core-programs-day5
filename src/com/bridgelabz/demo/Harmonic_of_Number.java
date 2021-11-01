package com.bridgelabz.demo;

import java.util.Scanner;

public class Harmonic_of_Number {

	public static void main(String[] args) {
		double sum = 0;
		double harmonic = 0;
		System.out.println("Enter The Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + (1 / i);
			harmonic = sum;
		}
		System.out.println("Harmonic of Number : " + harmonic);
	}

}
