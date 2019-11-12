package ho.unit2;

/**BlasOff.java
 * Blast off is an application that counts down from 10 then prints "Blast Off"
 * @author Kevin Ho
 *November 11, 2019
 */

public class BlastOff {

	/**
	 * Beginning of the program.
	 * @param args
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {

		for (int counter = 10; counter >=1; counter--) //loops until counter reaches 1
		{
			System.out.println(counter);
			Thread.sleep(1000); //creates a 1 second gap between print statements

			if (counter == 1)
			{
				System.out.println("Blast off!");
			}
		}

	}

}
