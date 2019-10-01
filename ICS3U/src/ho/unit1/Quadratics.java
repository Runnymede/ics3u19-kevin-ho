package ho.unit1;

/**
 * Quadratics is a program that prints out the two roots of a quadratic function given a, b and c.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class Quadratics {
	/**
	 * Beginning of the program.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a value for a:");
		double valueA=sc.nextDouble();

		System.out.println("Please enter a value for b:");
		double valueB=sc.nextDouble();

		System.out.println("Please enter a value for c:");
		double valueC=sc.nextDouble();

		double xPositive= (-valueB + Math.sqrt(Math.pow(valueB, 2)-4 *valueA*valueC))/(2*valueA);
		double xNegative= (-valueB - Math.sqrt(Math.pow(valueB, 2)-4 *valueA*valueC))/(2*valueA);

		System.out.println("The two roots are: "+ xPositive +" and "+ + xNegative);
		sc.close();
	}

}
