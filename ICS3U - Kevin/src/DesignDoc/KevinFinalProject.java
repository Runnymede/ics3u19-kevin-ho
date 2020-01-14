package DesignDoc;

/**KevinFinalProject.java
 * KevinFinalProject.java is 
 * @author Kevin Ho
 * Janurary 13, 2020
 */

import java.util.Scanner;

public class KevinFinalProject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean playAgain;
		boolean playAgain2;

		do {
			//input
			System.out.println("Would you like to play against the computer or another player?");
			String answer = sc.next();

			System.out.println("How many rounds do you want to go up to?");
			int rounds = sc.nextInt();

			//variables
			boolean win = true;

			if(answer.equalsIgnoreCase("computer"))
				playerVsAI(win);
			else if(answer.equalsIgnoreCase("the computer"))
				playerVsAI(win);

			else if(answer.equalsIgnoreCase("another player"))
				playerVsPlayer(win);
			else if(answer.equalsIgnoreCase("player"))
				playerVsPlayer(win);

			else
				System.out.println("Invalid input.");

			if(win == true)
				System.out.println("Player 1 wins!");
			else
				System.out.println("Player 2 wins!");

			System.out.println("Would you like to play again?");
			String playAgain1 = sc.next();

			if(playAgain1.equalsIgnoreCase("yes"))
				playAgain2 = true;
			else 
				break;

		} while (playAgain2 == true);
	}
}


