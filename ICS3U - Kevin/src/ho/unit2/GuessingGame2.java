package ho.unit2;

/**
 * GuessingGame.java
 * The GuessingGame is a number guessing game played between the computer and one player. 
 * @author Kevin Ho
 */

import java.util.Scanner;

public class GuessingGame2 {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//variables
		int secret = (int)(Math.random() *20) +1;
		int loop = 1;
		
		//input
		System.out.println("Enter a number between 1 and 20: ");
		
		while (loop != 0) {

			int user = sc.nextInt(); //scans user's number

			//output


			if (secret == user) 
				System.out.println("You won!");
			else
				System.out.println("Try again.");

			
		}
		sc.close();
	}
	
}
