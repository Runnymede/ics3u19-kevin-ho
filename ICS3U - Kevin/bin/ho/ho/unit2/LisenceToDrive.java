package ho.unit2;

/**LisenceToDrive.java
 * 
 * @author Kevin Ho
 *November 14, 2019
 */

public class LisenceToDrive {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
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
			
			if (total >= 34)
				System.out.println(lisence); //prints the license number
			
		}
		
	}

}
