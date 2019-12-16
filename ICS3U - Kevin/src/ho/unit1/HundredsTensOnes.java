package ho.unit1;

/**
 * HundredsTensOnes.java
 * The HundredsTensOnes program  prints out each digit of a number between 0 and 999 inclusive. 
 * @author Kevin Ho
 */

import java.util.Scanner;

public class HundredsTensOnes {
	/**
	 * Beginning of the program.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a three-digit number:");
		int first = sc.nextInt();
		int hundreds = first / 100;

		System.out.println("Hundreds: " + hundreds);
		int tens = first /10 %10;

		System.out.println("Tens: " + tens);
		int ones = first %10;
		
		System.out.println("Ones: " + ones);
		sc.close();
	}

}
