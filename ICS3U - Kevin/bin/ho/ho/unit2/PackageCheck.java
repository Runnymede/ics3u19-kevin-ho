package ho.unit2;

/**
 * PackageCheck is an application that prompts the user for the weight of a package and its dimensions (length, width, and height), and then displays an appropriate message if the package does not meet the requirements.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class PackageCheck {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//variables
		double packageWeight;
		double packageLength;
		double packageWidth;
		double packageHeight;

		//input
		System.out.println("Enter the package weight in kilograms: ");
		packageWeight = sc.nextDouble(); //assigns weight to variable

		System.out.println("Enter the package length in centimetres: ");
		packageLength = sc.nextDouble(); //assigns length to variable

		System.out.println("Enter the package width in centimetres: ");
		packageWidth = sc.nextDouble(); //assigns width to variable

		System.out.println("Enter the package height in centimetres: ");
		packageHeight = sc.nextDouble(); //assigns height to variable

		//volume calculation
		double volume = packageLength * packageWidth * packageHeight; //volume variable

		//determine if the package is accepted, too heavy & large, too large, or too heavy
		if (packageWeight >= 27) {
			packageWeight = 28;
		}
		if (volume >= 100000) {
			volume = 150000;
		}
		if (packageWeight < 27 && volume < 100000) {
			System.out.println("Accepted");
		}
		if (packageWeight > 27 && volume > 100000) {
			System.out.println("Too heavy and too large.");
		}
		if (packageWeight > 27 && volume < 100000) {
			System.out.println("Too heavy.");
		}
		if (packageWeight <27 && volume > 100000) {
			System.out.println("Too large.");
		}
		sc.close();
	}
}
