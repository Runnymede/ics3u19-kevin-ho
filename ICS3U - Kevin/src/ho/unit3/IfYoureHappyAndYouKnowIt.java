package ho.unit3;

/**IfYoureHappyAndYouKnowIt.java
 * IfYoureHappyAndYouKnowIt.java is a  program that prints out the lyrics to “if you’re happy and you know it” with 10 verses.
 * @author Kevin Ho
 *
 */

public class IfYoureHappyAndYouKnowIt {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		String[] lyrics = {" clap your hands.", " stomp your feet.", " pat your head.", " tap your nose.", " jump on one foot.", " jump with two feet.", " raise your right arm.", " raise your left arm.", " snap your fingers.", " tap your foot.", " and you really want to show it."};

		int counter2 = 0; //second counter to change the "action" part of the lyrics

		for (int counter = 1; counter <= 30; counter++) {

			System.out.println("If you're happy and you know it" + lyrics [0 + counter2] );

			if (counter == 2 || counter == 5 || counter == 8 || counter == 11 || counter == 14 || counter == 17 || counter == 20 || counter == 23 || counter == 26 || counter == 29)
				System.out.println("If you're happy and you know it" + lyrics [10]);

			if (counter == 3 || counter == 6 || counter == 9 || counter == 12 || counter == 15 || counter == 18 || counter == 21 || counter == 24 || counter == 27 || counter == 30) {
				counter2 ++;
				System.out.println(" ");
			}


		}

	}

}