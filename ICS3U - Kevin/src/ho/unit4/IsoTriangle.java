package ho.unit4;

/**IsoTriangle.java
 * IsoTriangle prompts the user for the size of an isosceles triangle and then displays the triangle with that many lines.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class IsoTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//user input
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		drawStars(size);

	}

	public static void drawStars(int stars) {

		int counter2 = 0;

		for (int counter = 1; counter <= stars; counter++) {
			if (counter <= stars) {
				System.out.print("*");
				counter2 +=2;
			}
		}

	}

	public static void drawSpaces(int spaces) {


	}

}
