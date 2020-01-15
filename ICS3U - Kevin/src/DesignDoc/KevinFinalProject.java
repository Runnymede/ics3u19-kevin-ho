package DesignDoc;

/**KevinFinalProject.java
 * KevinFinalProject.java is 
 * @author Kevin Ho
 * Janurary 13, 2020
 */

import java.util.Scanner;
import java.awt.*;
import hsa_new.Console;

public class KevinFinalProject {

	static Console c = new Console();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		boolean playAgain;
		boolean playAgain2 = true;
		boolean win = true;

		do {
			//input
			c.println("Would you like to play against the computer or another player?");
			String answer = c.readString();

			c.println("How many rounds do you want to go up to?");
			int rounds = c.readInt();


			if(answer.equalsIgnoreCase("computer"))
				playerVsAI(win);
			else if(answer.equalsIgnoreCase("the computer"))
				playerVsAI(win);

			else if(answer.equalsIgnoreCase("another player"))
				playerVsPlayer(win);
			else if(answer.equalsIgnoreCase("player"))
				playerVsPlayer(win);

			if(win == true)
				c.println("Player 1 wins!");
			else
				c.println("Player 2 wins!");

			c.println("Would you like to play again?");
			String playAgain1 = c.readString();

			if(playAgain1.equalsIgnoreCase("yes"))
				playAgain2 = true;
			else 
				c.close();

		} while (playAgain2 == true);	
	}

	public static boolean playerVsAI(boolean win) {

		//variables
		String playerOneMove;
		String computerMove = "random";
		int playerOnePoints;
		int computerPoints;

		//input(player move selection)
		c.println("Player 1, what is your move? Shoot, reload, or block?");
		playerOneMove = c.readString();

		//input(computer move selection)
		random(computerMove);

		c.clear();


		return false;
	}

	public static boolean playerVsPlayer(boolean win) {

		//variables
		String playerOneMove;
		String playerTwoMove;
		int playerOnePoints = 0;
		int playerTwoPoints = 0;

		//input(player 1 move selection)
		c.println("Player 1, what is your move? Shoot, reload, or block?");
		playerOneMove = c.readString();

		//input(player 2  move selection)
		c.println("Player 2, what is your move? Shoot, reload, or block?");
		playerTwoMove = c.readString();

		c.clear();

		if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("shoot")) {
			shootShoot(playerOneMove, playerTwoMove);
			playerOnePoints = 
		}
		return false;
	}

	public static String random(String computerMove) {

		int randomInteger =  (int) (Math.random() * 3) + 1;

		if(randomInteger == 1) 
			computerMove = "shoot";
		else if(randomInteger == 2)
			computerMove = "reload";
		else if(randomInteger == 3)
			computerMove = "block";

		return computerMove;
	}

	public static int shootShoot(String playerOneMove, String playerTwoMove) {

		//display image for first player


		//display image for second player
		return 4;
	}

	public static void shootBlock() {
		//display image for first player


		//display image for second player
	}

	public static void shootReload() {
		//display image for first player


		//display image for second player
	}

	public static void reloadReload() {
		//display image for first player


		//display image for second player
	}

	public static void reloadBlock() {
		//display image for first player


		//display image for second player
	}

	public static void blockBlock() {
		//display image for first player


		//display image for second player
	}
}


