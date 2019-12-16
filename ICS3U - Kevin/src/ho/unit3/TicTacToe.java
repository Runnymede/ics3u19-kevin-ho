package ho.unit3;

/**TicTacToe.java
 * TicTacToe.java is a tictactoe game using two-dimensional arrays.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Tic-Tac-Toe! Let's play.");

		char[][] tttboard = new char[3][3];

		//variables
		int rows = 0;
		int col = 0;
		int gameCounter = 0;

		//loop until maximum number of turns reached
		while (gameCounter < 9) {

			//input for player 1
			System.out.println("Player 1, what row?");
			rows = sc.nextInt() -1; //-1 is used so it is easier for the player
			System.out.println("Now what column?");
			col = sc.nextInt() -1;

			
			/**
			 * The below loop is used so that Player 1 does not enter a row and number in the place of Player 2.
			 * It repeats until a valid spot is used by Player 1.
			 */
			while (tttboard[rows][col] == 'O') {
				System.out.println("Player 1, please enter a different row: ");
				rows = sc.nextInt() -1; 
				System.out.println("Now what column?");
				col = sc.nextInt() -1;
			}
			
			tttboard[rows][col] = 'X';
			
			gameCounter ++; //counts the number of turns
			if (gameCounter == 9) { //checks if the maximum turns have been reached then prints the board before breaking out of the loop and printing the end message
				for (int row = 0; row < tttboard.length; row++) {
					for (int col2 = 0; col2 < tttboard[0].length; col2++) {		//this code prints the board after both the players have entered their moves
						System.out.print("| " + tttboard[row][col2] + " |");
					}
					System.out.println("\n -------------");
					break;
				}
			}
		
			//input for player 2
			System.out.println("Player 2, what row?");
			rows = sc.nextInt() -1;
			System.out.println("Now what column?");
			col = sc.nextInt() -1;

			/**
			 * The below loop is used so that Player 2 does not enter a row and number in the place of Player 1.
			 * It repeats until a valid spot is used by Player 2.
			 */
			while (tttboard[rows][col] == 'X') {
				System.out.println("Player 2, please enter a different row: ");
				rows = sc.nextInt() -1; 
				System.out.println("Now what column?");
				col = sc.nextInt() -1;
			}
			
			tttboard[rows][col] = 'O';
			
			gameCounter ++; //counts the number of turns
			for (int row = 0; row < tttboard.length; row++) {
				for (int col2 = 0; col2 < tttboard[0].length; col2++) {		//this code prints the board after both the players have entered their moves
					System.out.print("| " + tttboard[row][col2] + " |");
				}
				System.out.println("\n -------------");
			}

			//checks if player 1 has won and breaks if one player won
			if (tttboard[0][0] == 'X' && tttboard[1][0] == 'X' && tttboard[2][0] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[0][0] == 'X' && tttboard[0][1] == 'X' && tttboard[0][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[0][0] == 'X' && tttboard[1][1] == 'X' && tttboard[2][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[0][1] == 'X' && tttboard[1][1] == 'X' && tttboard[2][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[0][2] == 'X' && tttboard[1][2] == 'X' && tttboard[2][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[0][2] == 'X' && tttboard[1][1] == 'X' && tttboard[2][0] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[1][0] == 'X' && tttboard[1][1] == 'X' && tttboard[1][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			if (tttboard[2][0] == 'X' && tttboard[2][1] == 'X' && tttboard[2][2] == 'X') {
				System.out.println("Player 1 wins!");
				break;
			}
			
			//checks if player 2 has won and breaks when a player has won
			if (tttboard[0][0] == 'O' && tttboard[1][0] == 'O' && tttboard[2][0] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[0][0] == 'O' && tttboard[0][1] == 'O' && tttboard[0][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[0][0] == 'O' && tttboard[1][1] == 'O' && tttboard[2][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[0][1] == 'O' && tttboard[1][1] == 'O' && tttboard[2][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[0][2] == 'O' && tttboard[1][2] == 'O' && tttboard[2][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[0][2] == 'O' && tttboard[1][1] == 'O' && tttboard[2][0] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[1][0] == 'O' && tttboard[1][1] == 'O' && tttboard[1][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			if (tttboard[2][0] == 'O' && tttboard[2][1] == 'O' && tttboard[2][2] == 'O') {
				System.out.println("Player 2 wins!");
				break;
			}
			
		}
		System.out.println("The game is over!");
		sc.close();

	}

}