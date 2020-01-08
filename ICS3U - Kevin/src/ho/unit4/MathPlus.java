package ho.unit4;

/**MathPlus.java
 * Compilation of method practice.
 * @author Kevin Ho
 *
 */

public class MathPlus {

	public static void main(String[] args) {

		int[] mainArray = {15,2,7,4,1};
		double[] mainArray2 = {15,2,7,4,1};

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


	public static double median(double[] mainArray2) {
		int min2 = 0;
		for(int lessThan = 1; lessThan < mainArray2.length; lessThan ++) {

			if(mainArray2[lessThan]<mainArray2[min2]) {
				min2 = lessThan;
			}
		}
		double replacement = mainArray2[0];
		mainArray2[0] = mainArray2[min2];
		mainArray2[min2] = replacement;

		int max2 = 0;
		for(int greaterThan = 1; greaterThan < mainArray2.length; greaterThan ++) {

			if(mainArray2[greaterThan]>mainArray2[max2]) {
				max2 = greaterThan;
			}
		}
		double replacement2 = mainArray2.length -1;
		mainArray2[mainArray2.length -1] = mainArray2[max2];
		mainArray2[max2] = replacement;
		
		if (mainArray2[2] > mainArray2[1] && mainArray2[3] > mainArray2[2]) {
			
		}
	}

}