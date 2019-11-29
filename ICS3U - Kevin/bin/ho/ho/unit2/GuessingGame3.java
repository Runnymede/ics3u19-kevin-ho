package ho.unit2;

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
		
		System.out.println("Think of a fruit.");
		
		//variables
		int arrayCounter = 0;
		//array
		String[] guessArray = {"apple", "apricot", "cherry", "cranberry", "durian", "grape", "lime", "lychee", "mango", "watermelon", "melon", "olive", "orange", "papaya", "passion fruit", "pear", "peach", "pineapple", "plum", "pomegranate"};
		
		for (int counter = 0; counter < guessArray.length; counter++) {
			
			System.out.println("Is it a " + guessArray[arrayCounter] + "?");
			String answer = sc.next();
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("I win!");
				break;
			}
			
			arrayCounter = (int)(Math.random() *20 );
		}
		sc.close();
	}

}
