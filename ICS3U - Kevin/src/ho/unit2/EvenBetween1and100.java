package ho.unit2;

/**EvenBetween1and100.java
 * This program prints all the even numbers between 1 and 100.
 * @author Kevin Ho
 *November 11, 2019
 */

public class EvenBetween1and100 {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		for (int number = 1; number <= 100; number++) //loops until number reaches 100
		{
			int modulus = number % 2; //checks to see if the number is even

			if (modulus == 0)
				System.out.println(number); //prints the even number
		}

	}

}
