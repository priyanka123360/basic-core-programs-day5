package com.bridgelabz.demo;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Enter two numbers : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Numbers before swapping : " + num1  + num2);
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Numbers after swapping : " + num1 + num2);
	}

}
