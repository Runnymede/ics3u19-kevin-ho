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
	static Image[] images= new Image[5];

	static Toolkit toolkit = Toolkit.getDefaultToolkit();

	//player points
	static int playerOnePoints;
	static int playerTwoPoints;

	static int playerOneBullets;
	static int playerTwoBullets;

	static int rounds;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean playAgain;
		boolean playAgain2 = true;
		boolean win = true;
		images[0] = toolkit.getImage("src/DesignDoc/FirstScreen.png");
		images[1] = toolkit.getImage("src/DesignDoc/MoveScreen.png");
		images[2] = toolkit.getImage("src/DesignDoc/ShootScreen.png");
		images[3] = toolkit.getImage("src/DesignDoc/ReloadScreen.png");
		images[4] = toolkit.getImage("src/DesignDoc/BlockScreen.png");

		do {
			//resets
			playerOnePoints = 0;
			playerTwoPoints = 0;
			playerOneBullets = 1;
			playerTwoBullets = 1;
			int rounds = 0;

			c.drawImage(images[0], 0, +100, c.getWidth(), 300, null);

			//input
			c.println("Would you like to play against the computer or another player?");
			String answer = c.readString();

			c.println("How many points do you want to go up to?");
			rounds = c.readInt();

			c.clear();

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

		//input(player move selection)
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
		do {
			c.drawImage(images[1], 0, +100, c.getWidth(), 250, null);

			//input(player 1 move selection)
			do {

				c.println("Player 1, what is your move? Shoot, reload, or  block?");
				playerOneMove = c.readString();
				if(playerOneMove.equalsIgnoreCase("shoot") && playerOneBullets == 0) 
					c.println("Player 1 you are out of bullets!");
			} while (playerOneMove.equalsIgnoreCase("shoot") && playerOneBullets == 0);

			//ensure other play can't see each other's moves
			c.clear();
			c.drawImage(images[1], 0, +100, c.getWidth(), 250, null);

			//input(player 2  move selection)
			do {
				c.println("Player 2, what is your move? Shoot reload, or block?");
				playerTwoMove = c.readString();
				if(playerTwoMove.equalsIgnoreCase("shoot") && playerTwoBullets == 0) 
					c.println("Player 2 you are out of bullets!");
			} while (playerTwoMove.equalsIgnoreCase("shoot") && playerTwoBullets == 0);

			c.clear();

			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootShoot();
			
			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("block") || playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootBlock(playerOneMove, playerTwoMove);

			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("reload") || playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootReload(playerOneMove, playerTwoMove);

			if (playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("reload"))
				reloadReload();
			
			if (playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("block") || playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("reload"))
				reloadBlock(playerOneMove, playerTwoMove);
		} while (playerOnePoints != rounds && playerTwoPoints != rounds);

		return false;

	}

	public static void f() {
		//loop
		String next = "a";
		do {
			c.println("Press f to continue.");
			next = c.readString();
		} while (next == "f" || next == "F");

		c.clear();
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

	public static void shootShoot() {

		//display image for first player
		c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);

		c.println("Player 1 and Player 2 both fire their weapons!");
		c.println("Player 1 and Player 2 have died.");

		//player points
		playerOnePoints++;
		playerTwoPoints++;
		c.println("Player 1 now has " + playerOnePoints + " points and Player 2 now has " + playerTwoPoints + " points.");

		//bullets 
		playerOneBullets--;
		playerTwoBullets--;
		c.println("Player 1 now has " + playerOneBullets + " bullets left in their gun.");
		c.println("Player 2 now has " + playerTwoBullets + " bullets left in their gun.");

		f();
	}

	public static void shootBlock(String playerOneMove, String playerTwoMove) {

		//display image for first player (display shoot first)
		c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);

		if(playerOneMove.equalsIgnoreCase("shoot")) {
			c.println("Player 1 fires their weapon!");
			playerOneBullets--;
			c.println("Player 1 now has " + playerOneBullets + " bullets left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
			c.println("Player 2 has blocked Player 1's shot!");
			f();
		}
		if(playerTwoMove.equalsIgnoreCase("shoot")) {
			c.println("Player 2 fires their weapon!");
			playerTwoBullets--;
			c.println("Player 2 now has " + playerTwoBullets + " bullets left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
			c.println("Player 1 has blocked Player 2's shoot!");
			f();
		}
	}

	public static void shootReload(String playerOneMove, String playerTwoMove) {
		//display image for first player
		c.drawImage(images[3], 0, +50, c.getWidth(), 450, null);

		if(playerOneMove.equalsIgnoreCase("reload")) {
			c.println("Player 1 reloaded their weapon!");
			playerOneBullets++;
			c.println("Player 1 now has " + playerOneBullets + " bullets left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);
			c.println("Player 2 fires his weapon!");
			c.println("Player 1 has died.");
			playerTwoBullets--;
			c.println("Player 2 now has " + playerTwoBullets + " bullets left in their gun.");
			playerTwoPoints++;
			c.println("Player 2 now has " + playerTwoPoints + " points and Player 1 has " + playerOnePoints + ".");
			f();
		}
		if(playerTwoMove.equalsIgnoreCase("reload")) {
			c.println("Player 2 reloaded their weapon!");
			playerTwoBullets++;
			c.println("Player 2 now has " + playerTwoBullets + " bullets left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);
			c.println("Player 1 fires his weapon!");
			c.println("Player 2 has died.");
			playerOneBullets--;
			c.println("Player 1 now has " + playerOneBullets + " bullets left in their gun.");
			playerOnePoints++;
			c.println("Player 1 now has " + playerOnePoints + " points and Player 2 has " + playerTwoPoints + ".");
			f();
		}
	}

	public static void reloadReload() {
		//display image for first player
		c.drawImage(images[3], 0, +50, c.getWidth(), 450, null);

		c.println("Player 1 and Player 2 both reloaded their weapons!");

		//bullets 
		playerOneBullets++;
		playerTwoBullets++;
		c.println("Player 1 now has " + playerOneBullets + " bullets left in their gun.");
		c.println("Player 2 now has " + playerTwoBullets + " bullets left in their gun.");

		f();
	}

	public static void reloadBlock(String playerOneMove, String playerTwoMove) {
		//display image for first player
		

		//display image for second player
	}

	public static void blockBlock() {
		//display image for first player


		//display image for second player
	}
}


