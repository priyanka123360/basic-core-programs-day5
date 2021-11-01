package com.bridgelabz.demo;

import java.util.Scanner;

public class Power_of_two {
	public static void main(String[] args) {
		System.out.println("Enter power value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * 2;

			System.out.println("The Power of Two is : " + result);
		}
	}
}
