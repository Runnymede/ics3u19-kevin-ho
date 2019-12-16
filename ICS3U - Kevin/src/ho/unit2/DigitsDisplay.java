package ho.unit2;

/**
 * DigitsDisplay.java
 * The DigitsDisplay application prompts the user for a non-negative integer and then displays each digit on a separate line. 
 * @author Kevin Ho
 * October 29, 2019
 */

import java.util.Scanner;

public class DigitsDisplay {

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

		do {

			digits = integer%mod/division;
			System.out.println(digits);
			division = division /10;
			mod = mod /10;

		} while (mod >= 10);
		sc.close();
	}

}