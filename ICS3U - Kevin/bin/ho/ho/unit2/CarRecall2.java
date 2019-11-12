
package ho.unit2;

/**
 * CarRecall is an application that prompts a customer for the model number of their car to find out if it is defective and then displays "Your car is not defective." when the user typed a model number without a defect. Otherwise, the message "Your car is defective. It must be repaired."
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class CarRecall2 {

	/**
	 * Beginning of the program.
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//variables
		int defects; //stores the car defect number
		do {
		String condition = null; //stores whether the car is defective or not

		//input
			System.out.println("Enter the car's model number: ");
			defects = sc.nextInt();

			//determine if the car is defective

			if (defects == 199) 
				condition = "defective";

			else if (defects == 179) 
				condition = "defective";

			else if (defects == 189) 
				condition = "defective";

			else if (defects == 190) 
				condition = "defective";

			else if (defects == 191) 
				condition = "defective";

			else if (defects ==192) 
				condition = "defective";

			else if (defects ==193) 
				condition = "defective";

			else if (defects == 194) 
				condition = "defective";

			else if (defects == 195) 
				condition = "defective";



			if (condition == "defective") {
				System.out.println("Your car is " + condition + " . It must be repaired."); //presents if the car is defective
			}
			else 
				System.out.println("Your car is not defective.");

		} while(defects !=0);

		sc.close();


	}

}
