package ho.unit2;

/**
 * CubesSum
 * CubesSum is an application that prompts the user for a non-negative integer and then displays the sum of the cubes of the digits. 
 * November 01, 2019
 */

import java.util.Scanner;

public class CubesSum {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a positive 3-digit number: ");

		int integer = sc.nextInt();
		int division = 100;
		int mod = 1000;
		int digits = integer%mod/division;
		int total = 0;

		do {

			digits = integer%mod/division;
			total = digits + total;
			division = division /10;
			mod = mod /10;

		} while (mod >= 10);

		System.out.println("The sum of the cubes of the digits is: " + total);

		sc.close();
	}

}