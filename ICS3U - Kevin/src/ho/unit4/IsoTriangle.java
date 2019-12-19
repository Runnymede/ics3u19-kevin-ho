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

		int starTotal = stars * stars;
		int starCounter = 0;
		while (starCounter < starTotal) {
			System.out.print("*");
			starCounter ++;
			if (starCounter == 1)
				System.out.println(" ");
			drawSpaces(starCounter);
		}
	}
	public static void drawSpaces(int spaces) {
		
		int starCounter3 = spaces;
		
		if (starCounter3 %2 != 0)
			System.out.println(" ");			
		}
		
	}


