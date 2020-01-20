package DesignDoc;

/**KevinFinalProject.java
 * 
 * KevinFinalProject.java is a robust program that uses a console and pictures to present the traditional hand game
 * of 007. Players can choose if they want to play against the computer or another play. They can also choose
 * how many rounds they want the game to go up to.
 * 
 * @author Kevin Ho
 * Janurary 13, 2020
 */

import java.util.Scanner;	
import java.awt.*;	
import hsa_new.Console;	//console import

public class KevinFinalProject {

	static Console c = new Console(); //static so all methods run in the same console
	static Image[] images= new Image[5]; //static array for the 5 images being used

	static Toolkit toolkit = Toolkit.getDefaultToolkit();

	//player points
	static int playerOnePoints; //player points and bullets carry over through all methods so they are global variables
	static int playerTwoPoints;

	//player bullets
	static int playerOneBullets;
	static int playerTwoBullets;

	static int rounds; //stores the number of points the player(s) want to go up to
	
	
	//----------------------------------------------------//
	
	
	/**
	 * Main method is responsible for asking if the player wishes to play against the computer or another person,
	 * how many points they wish to go up to, and if they want to play again. It also calls either playerVsAI if
	 * the user wants to verse the computer and playerVsPlayer if the user wants to verse another player. 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean playAgain; //stores string which asks if the player wishes to play again
		boolean playAgain2 = true; //used to loop the game if the player wishes to play again
		boolean win = false; //stores the information about the game winner
							 //false = player 2/computer wins
							 //true = player 1 wins
		
		images[0] = toolkit.getImage("src/DesignDoc/FirstScreen.png");
		images[1] = toolkit.getImage("src/DesignDoc/MoveScreen.png");
		images[2] = toolkit.getImage("src/DesignDoc/ShootScreen.png");
		images[3] = toolkit.getImage("src/DesignDoc/ReloadScreen.png");
		images[4] = toolkit.getImage("src/DesignDoc/BlockScreen.png");

		do {
			//resets all the player points, bullets, and point threshold each time the user wants to play again
			c.clear();
			playerOnePoints = 0;
			playerTwoPoints = 0;
			playerOneBullets = 1; //each player starts off with 1 bullet pre-loaded in their firearm
			playerTwoBullets = 1;
			rounds = 0;

			c.drawImage(images[0], 0, +100, c.getWidth(), 300, null); //prints FirstScreen.png

			//input
			c.println("Would you like to play against the computer or another player?");
			String answer = c.readString();

			c.println("How many points do you want to go up to?");
			rounds = c.readInt(); //holds point threshold

			c.clear();

			//PlayerVsComputer
			if(answer.equalsIgnoreCase("computer"))
				win = playerVsAI(win);
			else if(answer.equalsIgnoreCase("the computer"))
				win = playerVsAI(win);

			//PlayerVsPlayer
			else if(answer.equalsIgnoreCase("another player"))
				win = playerVsPlayer(win);
			else if(answer.equalsIgnoreCase("player"))
				win = playerVsPlayer(win);

			//displays who wins 
			if (playerOnePoints == playerTwoPoints) //if both players have the same amount of points, a tie is displayed
				c.println("Player 1 and Player 2 have tied!");
			else {
				if(win == true) //playerVsAI and playerVsPlayer decide if win = false or win = true
					c.println("Player 1 wins!");
				else
					c.println("Player 2 wins!");
			}
			
			c.println("Would you like to play again?");
			String playAgain1 = c.readString(); //stores user's answers

			if(playAgain1.equalsIgnoreCase("yes"))
				playAgain2 = true; //puts user's answer into a boolean value
			else 
				c.close();

		} while (playAgain2 == true); //loops the entire game if the user wishes to play again
	}

	
	//----------------------------------------------------//
	
	
	/**
	 * This method gets initialized when the user verses the computer. Calls in one of the six combinations of moves. playerVsAI also counts the number of points each player has
	 * to determine a winner.
	 * @param win - boolean which determines if player 1 or player 2 wins
	 * @return - win = true or win = false 
	 */
	public static boolean playerVsAI(boolean win) {

		//variables
		String playerOneMove;
		String playerTwoMove = null;

		do {
			c.drawImage(images[1], 0, +100, c.getWidth(), 250, null); //displays MoveScreen.png

			//input(player 1 move selection)
			do {

				c.println("Player 1, what is your move? Shoot, reload, or  block?");
				playerOneMove = c.readString();
				if(playerOneMove.equalsIgnoreCase("shoot") && playerOneBullets == 0) 
					c.println("Player 1 you are out of bullets!");

			} while (playerOneMove.equalsIgnoreCase("shoot") && playerOneBullets == 0);
			
			/*A do while loop is used to ensure that player 1 and player 2/computer don't pick "shoot" when he/she has 0 bullets in their
			  firearm.*/

			//input computer(player 2)  move selection
			do {
				
				playerTwoMove = random(playerTwoMove);

			} while (playerTwoMove.equalsIgnoreCase("shoot") && playerTwoBullets == 0);

			c.clear();

			/*The below if statements are responsible for calling in the six combination methods: Shoot + shoot, shoot + block, shoot
			 * 
			 */
			
			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootShoot(); //calls method shootShoot if both players choose "shoot" as their move

			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("block") || playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootBlock(playerOneMove, playerTwoMove); //calls method shootBlock if either player chooses "shoot" and "block" at the same round

			if (playerOneMove.equalsIgnoreCase("shoot") && playerTwoMove.equalsIgnoreCase("reload") || playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("shoot")) 
				shootReload(playerOneMove, playerTwoMove); //calls method shootReload if either player chooses "shoot" and "reload" at the same round

			if (playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("reload"))
				reloadReload();

			if (playerOneMove.equalsIgnoreCase("reload") && playerTwoMove.equalsIgnoreCase("block") || playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("reload"))
				reloadBlock(playerOneMove, playerTwoMove);

			if (playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("block")) 
				blockBlock();

		} while (playerOnePoints < rounds && playerTwoPoints < rounds);

		if(playerOnePoints > playerTwoPoints) 
			win = true;
		if(playerOnePoints < playerTwoPoints)
			win = false;
		
		return win;
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

				c.println("Player 2, what is your move? Shoot, reload, or block?");
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

			if (playerOneMove.equalsIgnoreCase("block") && playerTwoMove.equalsIgnoreCase("block")) 
				blockBlock();

		} while (playerOnePoints < rounds && playerTwoPoints < rounds);

		if(playerOnePoints > playerTwoPoints) 
			win = true;
		if(playerOnePoints < playerTwoPoints)
			win = false;
		
		return win;
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

	public static String random(String playerTwoMove) {

		int randomInteger =  (int) (Math.random() * 3) + 1;

		if(randomInteger == 1) 
			playerTwoMove = "shoot";
		else if(randomInteger == 2)
			playerTwoMove = "reload";
		else if(randomInteger == 3)
			playerTwoMove = "block";

		return playerTwoMove;
	}

	public static void shootShoot() {

		//display image for first player
		c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);

		c.println("Player 1 and Player 2 both fire their weapons!");
		c.println("Player 1 and Player 2 have died.");

		//player points
		playerOnePoints++;
		playerTwoPoints++;
		c.println("Player 1 now has " + playerOnePoints + " point(s) and Player 2 now has " + playerTwoPoints + " point(s).");

		//bullets 
		playerOneBullets--;
		playerTwoBullets--;
		c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
		c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
		f();
	}

	public static void shootBlock(String playerOneMove, String playerTwoMove) {

		//display image for first player (display shoot first)
		c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);

		if(playerOneMove.equalsIgnoreCase("shoot")) {
			c.println("Player 1 fires their weapon!");
			playerOneBullets--;
			c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
			c.println("Player 2 has blocked Player 1's shot!");
			f();
		}
		if(playerTwoMove.equalsIgnoreCase("shoot")) {
			c.println("Player 2 fires their weapon!");
			playerTwoBullets--;
			c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
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
			c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);
			c.println("Player 2 fires his weapon!");
			c.println("Player 1 has died.");
			playerTwoBullets--;
			c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
			playerTwoPoints++;
			c.println("Player 2 now has " + playerTwoPoints + " point(s) and Player 1 has " + playerOnePoints + ".");
			f();
		}
		if(playerTwoMove.equalsIgnoreCase("reload")) {
			c.println("Player 2 reloaded their weapon!");
			playerTwoBullets++;
			c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[2], 0, +100, c.getWidth(), 250, null);
			c.println("Player 1 fires his weapon!");
			c.println("Player 2 has died.");
			playerOneBullets--;
			c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
			playerOnePoints++;
			c.println("Player 1 now has " + playerOnePoints + " point(s) and Player 2 has " + playerTwoPoints + ".");
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
		c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
		c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
		f();
	}

	public static void reloadBlock(String playerOneMove, String playerTwoMove) {
		//display image for first player
		c.drawImage(images[3], 0, +50, c.getWidth(), 450, null);

		if(playerOneMove.equalsIgnoreCase("reload")) {
			c.println("Player 1 reloaded their weapon!");
			playerOneBullets++;
			c.println("Player 1 now has " + playerOneBullets + " bullet(s) left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
			c.println("Player 2 blocked. No shot was blocked.");
			f();
		}
		if(playerTwoMove.equalsIgnoreCase("reload")) {
			c.println("Player 2 reloaded their weapon!");
			playerTwoBullets++;
			c.println("Player 2 now has " + playerTwoBullets + " bullet(s) left in their gun.");
			f();

			//display image for second player
			c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
			c.println("Player 1 blocked. No shot was blocked.");
			f();
		}
	}

	public static void blockBlock() {
		//display image for first player
		c.drawImage(images[4], 0, +10, c.getWidth(), 450, null);
		c.println("Player 1 and Player 2 both blocked!");
		f();
	}
}