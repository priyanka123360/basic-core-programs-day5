package com.bridgelabz.demo;

import java.util.Scanner;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		System.out.println("Enter an Alphabet :  ");
		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(" is vowel" + ch);
		else
			System.out.println(" is consonant" + ch);

	}
}
