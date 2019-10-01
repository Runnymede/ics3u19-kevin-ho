package ho.unit1;

/**
 * ObjectHeight is an application that prompts the user for a time less than 4.5 seconds and then displays the height of the object at that time.
 * September 24, 2019
 * @author Kevin Ho
 */

import java.util.Scanner;

public class ObjectHeight {
	
	/**
	 * This is the entry point to the program.
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a time less than 4.5 seconds:");
		double seconds=sc.nextDouble();
		double height=100-2.9*seconds*seconds;
		System.out.println("The height of the object is: " + height + ("m"));
		
		sc.close();
	}

}
