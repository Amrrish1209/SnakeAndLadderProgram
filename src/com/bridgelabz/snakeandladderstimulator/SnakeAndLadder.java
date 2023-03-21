package com.bridgelabz.snakeandladderstimulator;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int winningposition = 100;
        int currentposition = 0;
        int rollcount=0;

        while (currentposition < winningposition) {
            // Roll the dice to get a number between 1 to 6
            int diceRoll = (int) Math.floor(Math.random() * 6) + 1;
            rollcount++;
            // Check for option using random number between 0 to 2
            int option = (int) Math.floor(Math.random() * 3);

            int newposition=currentposition;
            switch (option) {
                case 0:
                	// No play,player stays in the same position 
                    break;
                case 1:
                	//player ahead by the number of positions received on the die
                    newposition = newposition + diceRoll;
                    break;
                case 2:
                	//Player behind by the number of positions received on the die
                    newposition = newposition - diceRoll;
                    break;
            }
         // Ensure that the player does not move beyond the winning position
            if (newposition > winningposition) {
                newposition = currentposition;
            }
            else if(newposition<0) {
            	newposition=0;
            }
            // Update the current position
            currentposition=newposition;
            System.out.println("After roll: "+rollcount+", Player is now at position: "+currentposition);
        }

        System.out.println("The player has won the game!");
    }
}


