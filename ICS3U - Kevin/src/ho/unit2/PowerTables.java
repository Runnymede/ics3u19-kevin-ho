package ho.unit2;

/**PowerTables.java
 * PowerTables displays the powers of numbers in a chart up to the power of 5.
 * @author Kevin Ho
 *November 11, 2019
 */

import java.util.Scanner;

public class PowerTables {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//user Input
		System.out.println("Please enter a value for the highest base: "); 
		int highestBase = sc.nextInt(); //stores value for the highest base
		
		System.out.println("Please enter a value for the highest power: ");
		int highestPower = sc.nextInt(); //stores value for the highest power
		
		for (int base = 1; base <= highestBase; base++) //counts the base up to 6
		{
			for (int power = 1; power <= highestPower; power++) //counts the power up to 5
			{
				int result = (int)Math.pow(base,power); //stores the value
				System.out.printf("%10s", result + " "); //prints the value into a table
				
				if (power == highestPower) //prints a new line when the power for the base is done
					System.out.println(" ");
			}
		}
		
		sc.close();

	}

}
