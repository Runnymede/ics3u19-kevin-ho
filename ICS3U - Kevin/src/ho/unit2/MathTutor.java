package ho.unit2;

/**
 * MathTutor.java<br>
 * MathTutor is an application that displays math problems by randomly generating two numbers, 1 through 10, and randomly generating an operator (+, -, *, /), and then prompts the user for an answer. <br>
 * October 24, 2019
 * @author Kevin Ho
 */

import java.util.Scanner;

public class MathTutor {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//random number generation
		double firstNumber = (int) (Math.random() * 10) + 1; //first number generation
		double secondNumber = (int) (Math.random() * 10) + 1; //second number generation
		
		
		double operator = Math.random() *10; //operator generation
		
		if (operator >= 10) {
			System.out.println("What is " + firstNumber + "+" + secondNumber + "?");
			double answer = sc.nextDouble(); //prompts the user for their answer
			
			if (firstNumber + secondNumber == answer)
				System.out.println("Correct!");
			else
				System.out.println("That is incorrect. Try again.");
		}
		else if (operator >= 7.5) {
			System.out.println("What is " + firstNumber + "-" + secondNumber + "?");
			double answer = sc.nextDouble();
			
			if (firstNumber - secondNumber == answer)
				System.out.println("Correct!");
			else
				System.out.println("That is incorrect. Try again.");
		}
		else if (operator >= 5.0) {
			System.out.println("What is " + firstNumber + "*" + secondNumber + "?");
			double answer = sc.nextDouble();
			
			if (firstNumber * secondNumber == answer)
				System.out.println("Correct!");
			else
				System.out.println("That is incorrect. Try again.");
		}
		else if (operator >= 2.5) {
			System.out.println("What is " + firstNumber + "/" + secondNumber + "?");
			double answer = sc.nextDouble();
			
		if (firstNumber / secondNumber == answer)
			System.out.println("Correct!");
		else
			System.out.println("That is incorrect. Try again.");
		}
		sc.close();
	}

}
