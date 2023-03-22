package com.bridgelabz.snakeandladderstimulator;

public class SnakeAndLadder {

	public static void main(String[] args) {
		int winningposition = 100;
		int player1position = 0;
		int player2position = 00;
		int rollcount = 0;
		boolean player1turn = true;

		while (player1position < winningposition && player2position < winningposition) {
			// Roll the dice to get a number between 1 to 6
			int diceRoll = (int) Math.floor(Math.random() * 6) + 1;
			rollcount++;
			// Check for option using random number between 0 to 2
			int option = (int) Math.floor(Math.random() * 3);

			int newposition = player1turn ? player1position : player2position;
			switch (option) {
			case 0:
				// No play,player stays in the same position
				break;
			case 1:
				// player ahead by the number of positions received on the die
				newposition = newposition + diceRoll;
				break;
			case 2:
				// Player behind by the number of positions received on the die
				newposition = newposition - diceRoll;
				break;
			}
			// Ensure that the player does not move beyond the winning position
			if (newposition > winningposition) {
				newposition = player1turn ? player1position : player2position;
			} else if (newposition < 0) {
				newposition = 0;
			}
			if (player1turn) {
				player1position = newposition;
				System.out.println("After roll: " + rollcount + ", Player 1 is now at position: " + player1position);
				if (option == 1 && player1position != winningposition) {
					System.out.println("Player 1 gets another turn!");
					continue;
				}
			} else {
				player2position = newposition;
				System.out.println("After roll: " + rollcount + ", Player 2 is now at position: " + player2position);
				if (option == 1 && player2position != winningposition) {
					System.out.println("Player 2 gets another turn!");
					continue;
				}
			}
			player1turn = !player1turn;
		}
		if (player1position >= winningposition) {
			System.out.println("Player 1 has won the game!");
		} else {
			System.out.println("Player 2 has won the game!");
		}
	}
}
