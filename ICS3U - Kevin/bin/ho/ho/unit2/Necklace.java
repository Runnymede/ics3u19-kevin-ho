package ho.unit2;

/**Necklace.java
 * Necklace is an application that prompts the user for two single-digit integers and then displays the sequence and the number of steps taken. 
 * @author Kevin Ho
 *November 6, 2019
 */

import java.util.Scanner;

public class Necklace {

	/**
	 * Beginning of the program.
	 * This problem begins with two single-digit numbers. The next number is obtained by adding the first two numbers together and saving only the ones digit. This process is repeated until the "neckalce" closes by returning to the original two numbers.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter 2 positive integers from 0 to 9: ");
		int original1 = sc.nextInt();
		int original2 = sc.nextInt();
		
		//variables
		int num1 = original1; //stores data for the processing
		int num2 = original2;
		
		//calculations
		do {
			
			int num3 = (num1 + num2) % 10;
			System.out.println(num3); //prints the ones of the sum of num1 and num2)
			
			num1 = num2; //shifts the first number to the second
			num2 = num3; //shifts the second number to the third to prepare for the next loop
		
		} while (!(num1 == original1 && num2 == original2));
		
		sc.close();
	}

}
