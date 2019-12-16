package ho.unit2;

/**
 * PrimeNumber application that prompts the user for two numbers and then displays a message indicating whether one or both of the numbers are prime or not. 
 * @author Kevin Ho
 *November 4, 2019
 */

import java.util.Scanner;

public class PrimeNumbers {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter two positive integers: ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		//variables
		int div = 2;
		int adder = 1;
		int result1;
		int result2;

		//calculates if the number is a prime number
		do {

			result1 = input1 % div;
			div ++; //counter for the divider

			if (result1 == 0 && div != input1 + 1)
				break;
			
			else
				result1 = 1;
				
		} while (div < input1);
		
		//Part B
		do {
			
			result2 = input1 + adder % div;
			div ++;
			adder ++;
			
			if (result2 == 0 && div != adder)
				System.out.println(result2);
			
		} while (div < input2);

		//displays if the numbers are prime or not
		if (result1 == 0) 
			System.out.println(input1 + " is not a prime number!");

		else
			System.out.println(input1 + " is a prime number.");

		sc.close(); //closes the scanner
	}

}
