package com.bridgelabz.demo;

import java.util.Scanner;

public class Quotient_and_Remainder {
	public static void main(String[] args) {
		System.out.println("Enter the value for Dividend : and Divisor : ");
		Scanner sc = new Scanner(System.in);
		double dividend = sc.nextInt();
		double divisor = sc.nextInt();
		double quotient = dividend / divisor;
		double remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);

	}

}
