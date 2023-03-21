package com.bridgelabz.snakeandladderstimulator;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		int startposition = 0;
		System.out.println("Starting Position " + startposition);
		
		Random random = new Random();
		
		// Generate a random number between 1 and 6
		int dieRoll = random.nextInt(6) + 1;
		System.out.println("The die rolled and landed on: " + dieRoll);
	}
}
