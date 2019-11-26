package ho.unit2;

/**NamesFromKeyboard.java
 * NamesFromKeyboard.java reads in a list of names from the keyboard, and then outputs the list twice, first in the order that it was input, and then in reverse order. 
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class NamesFromKeyboard {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//input of number of names by user and data for the array
		System.out.println("Enter the number of names: ");
		int n = sc.nextInt();
		
		String[] nameArray = new String[n];
		
		System.out.println("Enter the " + n + " names one by one: ");
		for (int data = 0; data < n; data++) {
			nameArray[data] = sc.next();
		}
		
		//output of the names
		for (int counter = 0; counter < n; counter++) { //normal order
			System.out.print(nameArray[counter] + " ");
		}
		
		System.out.println(" ");
		
		for (int reverse = n - 1; reverse >= 0; reverse--) { //reverse order
			System.out.print(nameArray[reverse] + " ");
		}
		
		sc.close();
		
	}

}
