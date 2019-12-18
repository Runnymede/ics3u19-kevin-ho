package ho.unit4;

/**TemperatureConverter.java
 * TemperatureConverter converts temperatures between Fahrenheit and Celsius.
 * @author 348735036
 *
 */

import java.util.Scanner;

public class TemperatureConverter {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//input from user
		System.out.println("Would you like to convert from Celcius to Fahrenheit (press 1) or Fahrenheit to Celcius (press 2)?");
		int answer = sc.nextInt();

		if(answer == 1) {
			System.out.println("Enter the Celcius value: ");
			double celInput = sc.nextInt();

			double finalAnswer = celciusToFahrenheit(celInput);

			System.out.println(celInput + " degrees Celcius is " + finalAnswer + " degrees Fahrenheit.");
		}

		if(answer == 2) {
			System.out.println("Enter the Fahrenheit value: ");
			double fInput = sc.nextInt();

			double finalAnswer = FahrenheitToCelcius(fInput);

			System.out.println(fInput + " degrees Fahrenheit is " + finalAnswer + " degrees Celcius.");
		}

	}

	public static double celciusToFahrenheit (double inputC) {

		double resultC = (inputC * 9 / 5) + 32;

		return resultC;
	}
	
	public static double FahrenheitToCelcius (double inputF) {
		
		double resultF = (inputF - 32) * 5 / 9;
		
		return resultF;
	}
}
