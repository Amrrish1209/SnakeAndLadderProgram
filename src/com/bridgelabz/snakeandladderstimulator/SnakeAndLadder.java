package com.bridgelabz.snakeandladderstimulator;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		Random random = new Random();
		// Generate a random number between 1 and 6
		int dieRoll = random.nextInt(6) + 1;
		// Generate a random number between 0 to 2
		int option = random.nextInt(3);
		int currentposition = 0;
		int newposition = currentposition;
		switch (option) {
		case 0:
			// No play the player stays in the same position
			break;
		case 1:
			// player moves ahead by the number of position received in the die
			newposition = currentposition + dieRoll;
			break;
		case 2:
			// player moves behind by the number of position received in the die
			newposition = currentposition - dieRoll;

		}
		if (newposition < 0) {
			newposition = currentposition;
		}
		// print the result
		System.out.println("The die rolled and landed on: " + dieRoll);
		switch (option) {
		case 0:
			System.out.println("The player stays in the same position: " + currentposition);
			break;
		case 1:
			System.out.println("The player climbed a ladder and moved to position: " + newposition);
			break;
		case 2:
			System.out.println("The player encountered a snake and moved back to position: " + newposition);
			break;
		}
	}
}
