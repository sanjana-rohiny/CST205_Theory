package project1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Utils {
	/**
	 * Generic function to get integer value from console
	 * @return the value after type checking
	 */
	public static  int getIntegerValue() {

		boolean isValid = false;
		Scanner scanner = new Scanner(System.in);
		int numItems = 0;
		String input = "";
		while (!isValid) {
			input = scanner.next(); 


			try {
				numItems = Integer.parseInt(input);
				isValid = true;
				//if we made it here, we have valid input
			} catch (NumberFormatException e) {
				System.out.print("You didn't enter a valid integer... Enter again");
			}
		}
		return numItems;
	}

	/**
	 * Generic function to get string value from console
	 * @return the value after type checking
	 */
	public static  String getStringValue() {

		Scanner scanner = new Scanner(System.in);
		boolean isValid = false;
		String input = null;
		while (!isValid) {
			input = scanner.nextLine();
			if((!input.equals(null)) /* && input.matches("^[a-zA-Z]*$")*/) {
				isValid =  true;
			} else {
				System.out.print("You didn't enter a valid string...Enter Again");
			}
		}
		return input;
	}

	public static void  displayBanner() {
		// Displaying menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		// Displaying menu
		System.out.println(
				"********************Welcome Library MSanagement ystem************************");
		System.out.println(
				"                    Select From The Following Options:               ");
		System.out.println(
				"**********************************************************************");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public static void  displayBanner(String Msg) {

		// Displaying menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		// Displaying menu
		System.out.println(
				"********************" + Msg +"************************");        
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public static void displayLine() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
	}

	public static String getCurrentDate() {
	    LocalDate date = LocalDate.now();
		System.out.println("Issue date " + date.toString());

		return date.toString();
	}

	public static String getReturnDate() {
		LocalDate futureDate = LocalDate.now().plusMonths(1);
		System.out.println("Return date " + futureDate.toString());

		return futureDate.toString();
	}
	
	public static void TBD() {
		System.out.println("Implement yourself...!");
		System.out.println("   /|");
		System.out.println("  / |");
		System.out.println(" /  |");
		System.out.println("/___|");
	}
}
