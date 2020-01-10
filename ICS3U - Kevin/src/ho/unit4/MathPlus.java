package ho.unit4;

/**MathPlus.java
 * Compilation of method practice.
 * @author Kevin Ho
 *
 */

import java.util.Scanner;

public class MathPlus {

	public static void main(String[] args) {

		int[] mainArray = {15,2,7,4,1,2,6};
		double[] mainArray2 = {15,2,7,4,1,2,6};

		//min 
		System.out.println("Index of the first smallest number: " + min(mainArray));

		//max
		System.out.println("Index of the first biggest number: " + max(mainArray));

		//sum
		System.out.println("The sum of the integers is: " + sum(mainArray));

		//average
		System.out.println("The average of the integers is: " + average(mainArray));

		//min2
		System.out.println("Index of the first smallest number: " + min2(mainArray2));

		//max2
		System.out.println("Index of the first biggest number: " + max2(mainArray2));

		//sum2
		System.out.println("The sum of the integers is: " + sum2(mainArray2));

		//average
		System.out.println("The average of the integers is: " + average2(mainArray2));

		//median
		System.out.println("The median of the integers is: " + median(mainArray2));

		//mode
		System.out.println("The mode of the integers is: " + mode(mainArray2));

		//prime
		System.out.println("The number is prime: " + prime(mainArray));

		//factorial
		System.out.println("The factorial of the number is: " + factorial(mainArray));
		
		//numOfFactors
		System.out.println("The number of factors is: " + numOfFactors(mainArray));
	}

	/**
	 * This method takes integers from the mainArray and determines the first occurrance of the smallest number of the array.
	 * @param mainArray - the integer array
	 * @return The index or position of the first occurrance of the smallest number of the array.
	 */
	public static int min(int[] mainArray) {
		int min1 = 0;
		for(int lessThan = 1; lessThan < mainArray.length; lessThan ++) {

			if(mainArray[lessThan]<mainArray[min1]) {
				min1 = lessThan;
			}
		}
		return min1;
	}

	/**
	 * This method takes integers from the mainArray and determines the first occurrance of the biggest number of the array.
	 * @param mainArray - the integer array
	 * @return The index or position of the first occurrance of the biggest number of the array.
	 */
	public static int max(int[] mainArray) {
		int max1 = 0;
		for(int greaterThan = 1; greaterThan < mainArray.length; greaterThan ++) {

			if(mainArray[greaterThan]>mainArray[max1]) {
				max1 = greaterThan;
			}
		}
		return max1;
	}

	/**
	 * This method takes integers from the mainArray and determines the total sum of all the integers.
	 * @param mainArray - the integer array
	 * @return The total sum of the integers.
	 */
	public static int sum(int[] mainArray) {
		int sum = 0;
		for (int counter = 0; counter < mainArray.length; counter ++) {
			sum += mainArray[counter];
		}
		return sum;
	}

	/**
	 * This method takes integers from the mainArray and determines the average of the integers.
	 * @param mainArray - the integer array
	 * @return The double value of the average.
	 */
	public static double average(int[] mainArray) {
		double average = 0;
		for (int counter = 0; counter < mainArray.length; counter ++) {
			average += mainArray[counter];
		}
		return (average / mainArray.length);
	}

	/**
	 * This method takes double values from mainArray2 and determines the first occurrance of the smallest number of the array.
	 * @param mainArray2 - the double array
	 * @return The index or position of the first occurrance of the smallest number of the array.
	 */
	public static int min2(double[] mainArray2) {
		int min2 = 0;
		for(int lessThan = 1; lessThan < mainArray2.length; lessThan ++) {

			if(mainArray2[lessThan]<mainArray2[min2]) {
				min2 = lessThan;
			}
		}
		return (int) min2;
	}

	/**
	 * This method takes double values from mainArray2 and determines the first occurrance of the biggest number of the array.
	 * @param mainArray2 - the double array
	 * @return The index or position of the first occurrance of the biggest number of the array.
	 */
	public static int max2(double[] mainArray2) {
		int max2 = 0;
		for(int greaterThan = 1; greaterThan < mainArray2.length; greaterThan ++) {

			if(mainArray2[greaterThan]>mainArray2[max2]) {
				max2 = greaterThan;
			}
		}
		return max2;
	}

	/**
	 * This method takes doubles from the mainArray2 and determines the total sum of all the double values.
	 * @param mainArray2 - the double array
	 * @return The total sum of the doubles.
	 */
	public static double sum2(double[] mainArray2) {
		int sum2 = 0;
		for (int counter = 0; counter < mainArray2.length; counter ++) {
			sum2 += mainArray2[counter];
		}
		return sum2;
	}

	/**
	 * This method takes doubles from the mainArray2 and determines the average of the double values.
	 * @param mainArray2 - the double array
	 * @return The double value for the average.
	 */
	public static double average2(double[] mainArray2) {
		double average2 = 0;
		for (int counter = 0; counter < mainArray2.length; counter ++) {
			average2 += mainArray2[counter];
		}
		return (average2 / mainArray2.length);
	}

	/**
	 * This method finds the median of the array by first finding the smallest and biggest number and arranging them in their appropriate spot before arranging the rest of the numbers in the array and finding the median.
	 * @param mainArray2 - the double array
	 * @return The mode.
	 */
	public static double median(double[] mainArray2) {
		//finds the smallest number and moves it to the end of the array
		int min2 = 0;
		for(int lessThan = 1; lessThan < mainArray2.length; lessThan ++) {

			if(mainArray2[lessThan]<mainArray2[min2]) {
				min2 = lessThan;
			}
		}
		double replacement = mainArray2[0];
		mainArray2[0] = mainArray2[min2];
		mainArray2[min2] = replacement;

		//finds the biggest number and moves it to the end of the array
		int max2 = 0;
		for(int greaterThan = 1; greaterThan < mainArray2.length; greaterThan ++) {

			if(mainArray2[greaterThan]>mainArray2[max2]) {
				max2 = greaterThan;
			}
		}
		double replacement2 = mainArray2.length -1;
		mainArray2[mainArray2.length -1] = mainArray2[max2];
		mainArray2[max2] = replacement;

		//arranges the values from smallest to largest
		for(int counter = 1; counter < mainArray2.length -1; counter++) {
			if (mainArray2[counter + 1] < mainArray2[counter]) {
				double mover = mainArray2[counter +1];
				mainArray2[counter + 1] = mainArray2[counter];
				mainArray2[counter] = mover;
			} 
		}

		//determines the median of the array
		if (mainArray2.length%2 == 0) {
			double median = (mainArray2[mainArray2.length /2 - 1] + mainArray2[mainArray2.length /2]) / 2;
			return median;
		}
		else {
			double median = mainArray2[mainArray2.length % 2 + 1];
			return median;
		}
	}

	/**
	 * This method determines the mode of the array and returns it in a double value.
	 * @param mainArray2 - the double array
	 * @return The mode.
	 */
	public static double mode(double[] mainArray2) {

		double[] data = new double[mainArray2.length]; //creates a new array for storage of how many times each number appears in the mainArray2

		for(int counter1 = 0; counter1 < mainArray2.length -1; counter1++) { //this code from 230-233 counts how many times each number appears
			for(int counter2 = 0; counter2 < mainArray2.length -1; counter2++) {
				if (mainArray2[counter1] == mainArray2[counter2] && counter2 != counter1) {
					data [counter1] += 1;
				}
			}
		}

		//determines the largest tally of the integers in the data array
		int max3 = 0;
		for(int greaterThan = 1; greaterThan < data.length; greaterThan ++) {

			if(data[greaterThan]>data[max3]) {
				max3 = greaterThan;
			}
		}
		return mainArray2[max3];
	}

	/**
	 * This method uses a boolean value and checks if the integer the user inputs is prime.
	 * @param mainArray - Integer array.
	 * @return - A boolean value.
	 */
	public static boolean prime(int[] mainArray) {

		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter one positive integer: ");
		int input1 = sc.nextInt();

		//variables
		int div = 2;
		int result1;
		boolean prime;

		//calculates if the number is a prime number
		do {

			result1 = input1 % div;
			div ++; //counter for the divider

			if (result1 == 0 && div != input1 + 1)
				break;

			else
				result1 = 1;

		} while (div < input1);

		if (result1 == 0) 
			prime = false;

		else
			prime = true;

		return prime;
	}

	/**
	 * This method finds the factorial of the number the user inputs.
	 * @param mainArray - Integer array.
	 * @return - A long value of the factorial.
	 */
	public static long factorial(int[] mainArray) {

		Scanner sc = new Scanner(System.in);

		//input
		System.out.println("Enter an integer: ");
		int integer = sc.nextInt();

		//variables
		long factorialData = integer * (integer - 1);

		//loop to determine the factorial
		for(int counter = integer - 2; counter != 1; counter--) {
			factorialData = factorialData * counter;
		}
		return factorialData;
	}
	
	/**
	 * This method finds the total number of factors the given number has.
	 * @param mainArray - The integer array.
	 * @return - An int value of the total factor amount.
	 */
	public static int numOfFactors(int[] mainArray) {
		
		Scanner sc = new Scanner(System.in);
		
		//input
		System.out.println("Enter a positive integer: ");
		int integer = sc.nextInt();
		
		//variables
		int tally = 0;
		
		for (int counter = 1; counter < integer / 2; counter ++) {
			if(integer % counter == 0) 
				tally ++;
		}
		return tally + 2;
	}
}