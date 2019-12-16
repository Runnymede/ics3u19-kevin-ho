package ho.unit2;

/**
 * String Things is a program that will do various tasks.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class StringThings {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//variables
		String input;
		int index;

		//input
		System.out.println("Please enter a word that is at least 7 characters long: ");
		input = sc.next();


		//output part.1
		System.out.println("Your string is: " + input);
		System.out.println("Your string in uppercase is: " + input.toUpperCase());
		System.out.println("Your string in lowercase is: " + input.toLowerCase());
		System.out.println("Your string length is: " + input.length());

		//input of index
		System.out.println("Please enter which index to print the character: ");
		index = sc.nextInt();

		//output part.2
		System.out.println("The character at index 6 is: " + input.charAt(index));


		//PART B
		System.out.println(" ");
		System.out.println(" ");

		//variables
		String first;
		String second;

		//input
		System.out.println("Please enter one word: ");
		first = sc.next();

		System.out.println("Please enter another word: ");
		second = sc.next();

		//determine if the two strings are the same
		if (first.contentEquals(second)) {
			System.out.print("Your two words are the same!");
		}
		else {
			System.out.print("Your two words are not the same."); 
		}

		//determine which word comes after the other
		System.out.println(" ");
		System.out.println("If the number is positive, then the first word comes after the second word. If the number is negative, the first word comes before the second. If the number is 0 then they are the same. Number: " + first.compareTo(second));


		//PART C
		System.out.println(" ");
		System.out.println(" ");

		//variables
		String name;
		String username;
		String password;

		String correctUser = "Kevin246";
		String correctPass = "12345";

		String value;

		//input
		System.out.println("Hello, please enter your name: ");
		name = sc.next();

		System.out.println("Hello, " + name + ", please enter your username: ");
		username = sc.next();

		System.out.println("Now please enter your password: ");
		password = sc.next();

		//determine if the username and password are correct
		if (username.contentEquals(correctUser)) {
			value = "true";
			if (password.contentEquals(correctPass)) {
				value = "true";
			}
			else {
				value = "false";
			}

			//display results
			if (value == "true") {
				System.out.println("Welcome, " + name + ".");
			}
			else {
				System.out.println("You have entered the incorrect username and password. Please try again.");
			}

			sc.close();
		}
	}
}