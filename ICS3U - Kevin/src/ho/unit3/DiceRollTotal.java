package ho.unit3;

/**DiceRollTotal.java
 * 
 * @author Kevin Ho
 *
 */

public class DiceRollTotal {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {


		int[][] numberArray = new int [11][2];

		int counter = 0;
		int diceCounter1 = 0;
		int diceCounterRow = 0;


		while (diceCounter1 < 10000) {

			int dice1 = (int)(Math.random() * 6) +1; //generates a random number for dice1
			int dice2 = (int)(Math.random() *6) +1; //generates a random number for dice2
			int total = dice1 + dice2;
			
			numberArray[diceCounterRow][1] = total;
			
			diceCounter1 ++;

		}
		
		System.out.println(numberArray[diceCounterRow][0] + numberArray[diceCounterRow][1]);
	}

}