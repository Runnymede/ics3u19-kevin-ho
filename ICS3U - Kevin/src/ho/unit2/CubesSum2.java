package ho.unit2;

/**
 * CubesSum2
 * CubesSum2 is an application that prompts the user for a non-negative integer and then displays  what integers of two, three, and four digits are equal to the sum of the cubes of their digits.
 * November 01, 2019
 */

import java.util.Scanner;

public class CubesSum2 {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int loop = 1; //this variable is only used for the while portion of the do-while loop

		do {
		//input
		System.out.println("Enter a positive three-digit integer:");
		int first = sc.nextInt();
		
		//thousands calculation
		int thousands = first %10000 /1000;
		
		//hundreds calculation
		int hundreds = first / 100;

		//tens calculation
		int tens = first /10 %10;

		//ones calculation
		int ones = first %10;
		
		if ((int) (thousands + hundreds + tens) == thousands + hundreds + tens + ones)
		System.out.println("The sum of the digits is: " + (hundreds + tens + ones));

		} while (loop > 0);

		sc.close();
	}

}