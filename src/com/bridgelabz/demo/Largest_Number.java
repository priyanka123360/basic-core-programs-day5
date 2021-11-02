package com.bridgelabz.demo;

import java.util.Scanner;

public class Largest_Number {
	public static void main(String[] args) {
		int a, b, c, largest_number, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		a = sc.nextInt();
		System.out.println("Enter the second number : ");
		b = sc.nextInt();
		System.out.println("Enter the third number : ");
		c = sc.nextInt();

		temp = a > b ? a : b;

		largest_number = c > temp ? c : temp;

		System.out.println("The largest number is :  " + largest_number);
	}
}
