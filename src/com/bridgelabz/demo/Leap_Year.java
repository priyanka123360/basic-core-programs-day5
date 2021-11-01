package com.bridgelabz.demo;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {

		System.out.println("Enter an Year :: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year <= 9999 & year >= 1000) {
			System.out.println("Year is Four Digit Number");
		} else {
			System.out.println("Please Enter Four Digit Number");
		}

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Specified year is a leap year");
		} else {
			System.out.println("Specified year is not a leap year");
		}
	}

}