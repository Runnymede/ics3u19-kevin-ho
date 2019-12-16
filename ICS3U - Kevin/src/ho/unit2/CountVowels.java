package ho.unit2;

/**CountVowels.java
 * CountVowels is an application that prompts the user for a string and then displays a count of the number of vowel in the string. 
 * @author Kevin Ho
 *November 12, 2019
 */

import java.util.Scanner;

public class CountVowels {

	/**
	 * Beginning of the program. 
	 * @param args
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//variables
		int vowelCount = 0; //stores the data for the amount of values
		
		//input
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		
		for (int character = 0; character < text.length(); character++) {
			
			char vowel = text.charAt(character); //converts each of the characters into char values
			
			if (vowel == 65 || vowel == 69 || vowel == 73 || vowel == 79 || vowel == 85 || vowel == 97 || vowel == 101 || vowel == 105 || vowel == 111 || vowel == 117) {
				//checks whether the character is a vowel in lower case or upper case form
				
				vowelCount += 1; //increases the vowel count by one if the character is a vowel
			}
		}
		
		System.out.print("The number of vowels in " + text + " is " + vowelCount + ".");
		
		sc.close();
	}

}
