package ho.unit2;

/**LisenceToDrive.java
 * LisenceToDrive is a program that tests all the combinations from 0 to 9999 if the sum is 34 or greater.
 * @author Kevin Ho
 *November 14, 2019
 */

public class LisenceToDrive {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		//variables
		int probability = 0; //stores the total number of combinations that add up to 34 or greater

		for (int lisence = 9999; lisence >= 0; lisence--) {

			int division = 1000; //same code as DigitsSum.java but with an extra 0 in division and mod to compensate for the 4th digit
			int mod = 10000;
			int digits = lisence%mod/division;
			int total = 0;

			do {

				digits = lisence%mod/division;
				total = digits + total;
				division = division /10;
				mod = mod /10;

			} while (mod >= 10);

			if (total >= 34) {

				probability++;
				System.out.print(lisence + " "); //prints the license number
				
			}
		}

		System.out.println(" ");
		System.out.println("The probability of the sum being 34 or greater is " + probability + "/10 000."); //prints the total probability

	}

}
