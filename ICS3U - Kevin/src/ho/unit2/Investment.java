package ho.unit2;

/**
 * Investment.java
 *  Investment is an application that calculates how many years it will take for a $2,500 investment to be worth at least $5,000 if compounded annually at 7.5%.
 * @author Kevin Ho
 *October 29, 2019
 */

public class Investment {

	/**
	 * Beginning of the program.
	 * @param args
	 */
	
	public static void main(String[] args) {

		//variables
		double investment = 2500;
		int years = 0;
		
		//calculations of interest
		while (investment < 5000)
		{
			investment = investment * 1.075;
			years = years + 1;
		}
		System.out.println("It takes " + years + " for $2,500 to be worth " + investment + " or at least $5,000.");
	}

}
