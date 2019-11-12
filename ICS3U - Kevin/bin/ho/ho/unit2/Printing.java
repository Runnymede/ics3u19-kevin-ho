package ho.unit2;

/**
 * Printing is a program that prompts the user for the number of copies to print and then displays the price per copy and the total price for the job.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class Printing {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//variables
		int copies; //stores number of copies 
		double perCopy; //stores price per copy
		
		//input
		System.out.println("Enter the number of copies to be printed: ");
		copies = sc.nextInt();
		
		//determine the price
		if (copies > 1000) {
			perCopy = 0.25;
		}
		else if (copies >= 750) {
			perCopy = 0.26;
		}
		else if (copies >= 500) {
			perCopy = 0.28;
		}
		else {
			perCopy = 0.30;
		}
		
		//presents total cost and price per copy
		System.out.println("Price per copy is: $" + perCopy);
		System.out.println("Total Cost is: $" + perCopy * copies);
		
		sc.close();
	}

}
