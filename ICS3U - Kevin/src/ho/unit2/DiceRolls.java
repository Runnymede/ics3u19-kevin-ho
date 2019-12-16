package ho.unit2;

/**DiceRolls.java
 * DiceRolls application that displays five random rolls of two dice where each die is numbered from 1 to 6 and displays the total.
 * @author Kevin Ho
 *November 12, 2019
 */

public class DiceRolls {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		for (int rolls = 0; rolls <= 4 ; rolls++) //runs until the total number rolls reaches 10
		{
			for (int results = 0; results == 0; results++) //rolls dice1 5 times
			{

				int dice1 = (int)(Math.random() * 6) +1; //generates a random number for dice1
				System.out.printf("%5s", dice1);


				for(int results2 = 0; results == 0; results++) //rolls dice2 5 times
				{

					int dice2 = (int)(Math.random() *6) +1; //generates a random number for dice2
					System.out.printf("%5s", dice2);

					System.out.printf("%5s", dice1 + dice2); //adds dice1 and dice2 after displaying dice2
				}


				System.out.println(" "); //creates a new line after each set of rolls

			}
		}

	}

}
