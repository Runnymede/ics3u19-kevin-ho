package ho.unit1;
/**
 * AboutMe.java <br?
 * This is a small program displays my first name and last name initial, my teacher's name, and school name on three separate lines.
 * Below the personal information is a phrase related to my school team. <br>
 * September 18, 2019
 * @author Kevin Ho
 */
public class AboutMe {
	/**
	 * Beginning of the application.
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Kevin H.");
		System.out.println("Ms. Kemp");
		System.out.println("Runnymede Collegiate Institute");
		System.out.println("\"Go Ravens Go!\"");

		System.out.format("%-15s %8s %30s", "Printed :", "2019 AUG 30  08:05", "Student TimeTable\n");
		System.out.format("%70s", "Runnymede Collegiate Institute\n");
		System.out.format("%-30s %10s %5s %20s %10s %10s", "Name", "Student No", "OEN", "Homeroom", "Grade", "Track\n");
		System.out.format("%-30s %10s %-15s %5s %12s %14s", "HO, KEVIN BAO-LONG", "348-735-036", "380-723-627", "11C", "11", "Regular\n");	
		System.out.format("%94s", "Locker No\n");

		System.out.println(" ");

		System.out.format("%50s %15s %20s", "School Year 20192020", "Semester 1", "Term 1\n" );

		System.out.format("%-15s %10s %20s", "Period", "Day 1", "Day 2\n");
		System.out.format("%-20s %-9s %19s", "1", "SPH3UI1-01", "SPH3UI-01\n");
		System.out.format("%-16s %10s %20s", "08:45", "Enns,M", "Enns,M\n");
		System.out.format("%-15s %8s %20s", "10:02", "226", "226\n");

		System.out.println(" ");

		System.out.format("%-19s %10s %20s", "2", "TGJ3M1-01", "TGJ3M1-01\n");
		System.out.format("%-20s %-8s %19s",  "10:07", "Yasui,R", "Yasui,R\n");
		System.out.format("%-13s %10s %20s",  "11:24", "027", "027\n");

		System.out.println(" ");

		System.out.println("Lunch");
		System.out.println("11:24");
		System.out.println("12:26");

		System.out.println(" ");

		System.out.format("%-19s %10s %20s", "3", "ICS3U3-02", "ICS3U3-02\n");
		System.out.format("%-20s %-7s %19s",  "12:26", "Kemp,C", "Kemp,C\n");
		System.out.format("%-13s %10s %20s",  "13:43", "024", "024\n");

		System.out.println(" ");

		System.out.format("%-19s %10s %20s", "4", "ENG3UI-03", "ENG3UI-03\n");
		System.out.format("%-20s %-9s %19s",  "13:48", "Lovell,C", "Lovell,C\n");
		System.out.format("%-13s %10s %20s",  "15:05", "214", "214\n");

		System.out.println(" ");

		System.out.println("5");
		System.out.println("15:05");
		System.out.println("16:22");
	}

}
