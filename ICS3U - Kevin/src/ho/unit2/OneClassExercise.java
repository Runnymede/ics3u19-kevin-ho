package ho.unit2;

/**
 * OneClassExercise is a small program that takes an integer as input then tests to see if it is positive or negative and tests to see if it is divisible by 7.
 * @Kevin Ho
 *
 */

import java.util.Scanner;

public class OneClassExercise {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//variables
		int input; //stores integer as input
		
		//input
		System.out.println("Enter your integer: ");
		input = sc.nextInt();
		
		//determine if the integer is positive or negative
		if (input >=0)
		{
			System.out.println("Your integer is positive!");
		}
		else
		{
			System.out.println("Your integer is negative!");
		}
			
		//determine if the integer is divisible by 7
		if (input %7==0)
		{
			System.out.println("Your integer is divisible by 7!");
		}
		else
		{
			System.out.println("Your integer is not divisible by 7!");
		}
		sc.close();
	}
}

