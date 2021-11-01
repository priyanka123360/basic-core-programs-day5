package com.bridgelabz.demo;

import java.util.Scanner;

public class Coin_Flip {

	public static void main(String[] args) {
		System.out.println("Enter The number of times to Flip Coin. ");
		Scanner sc = new Scanner(System.in);
		int coin_flip_chance = sc.nextInt();
		int chance = 1;
		double heads = 0;
		double tails = 0;
		int i = 0;

		for (i = 0; i < coin_flip_chance; i++) {
			int flip = (int) ((Math.random() * 10) % 2);
			System.out.println("Flip : " + flip);
			if (flip == chance) {
				System.out.println("Coin shows Heads");
				heads++;

			} else {
				System.out.println("Coin shows Tails");
				tails++;

			}

		}
		System.out.println("Number of Heads : " + heads);
		System.out.println("Number of Tails : " + tails);
		double percentage_of_heads = (heads / coin_flip_chance) * 100;
		double percentage_of_tails = (tails / coin_flip_chance) * 100;
		System.out.println("Percentage of Heads : " + percentage_of_heads);
		System.out.println("Percentage of tails : " + percentage_of_tails);
	}

}
