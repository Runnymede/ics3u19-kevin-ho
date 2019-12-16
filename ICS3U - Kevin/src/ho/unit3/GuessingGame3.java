package ho.unit3;

/**GuessingGame3.java
 * GuessingGame3.java is a program that plays a guessing game with the user. It has an array with at least 20 different items, and then should start randomly guessing from the list until it gets it right.
 * @author 348735036
 *
 */

import java.util.Scanner;

public class GuessingGame3 {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Think of a fruit and press a key when you're ready.");
		String start = sc.next();
		
		//variables
		int arrayCounter = 0;
		//array
		String[] guessArray = {"apple", "apricot", "cherry", "cranberry", "durian", "grape", "lime", "lychee", "mango", "watermelon", "melon", "olive", "orange", "papaya", "passion fruit", "pear", "peach", "pineapple", "plum", "pomegranate"};
		
		for (int counter = 0; counter < guessArray.length; counter++) { //runs until the maximum number of choices are reached
			
			System.out.println("Is it a " + guessArray[arrayCounter] + "?");
			String answer = sc.next();
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("I win!");
				break;
			}
			
			arrayCounter = (int)(Math.random() *20 ); //picks a random number for the array
		}
		sc.close();
	}

}
