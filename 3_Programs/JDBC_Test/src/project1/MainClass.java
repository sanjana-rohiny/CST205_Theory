package project1;

import java.util.Scanner;

public class MainClass {


	
	private static void  displayMenu() {
				
		System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Create Database.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 2 to Search a Book [Book Id] ");
        System.out.println("Press 3 to Search a Book [Book Name] ");
        System.out.println("Press 4 to Search a Book [Author name] ");
        System.out.println("Press 5 to Show All Books.");
        System.out.println("Press 6 to Show All Registered Users.");
        System.out.println("Press 7 to Issue  Book. ");
        System.out.println("Press 8 to Return Book");
        System.out.println("Press 9 to Renew Book");

        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
	
	private static void  displayBanner() {
		 
        // Displaying menu
        System.out.println(
            "----------------------------------------------------------------------------------------------------------");
        // Displaying menu
        System.out.println(
            "********************Welcome to the Library!************************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
            "**********************************************************************");

        System.out.println(
            "-------------------------------------------------------------------------------------------------------");
    }
	
	private static void displayLine() {
		Scanner sc = new Scanner(System.in);
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Enter to return main menu: ");
        sc.nextLine();
	}
	
	public static void main(String[] args) {
		int choice;
		Library library = Library.getDefaultInstance();

		do {

			displayBanner();
			displayMenu();

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your Choice : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				// Create database
				library.createTables();
				library.insertDataIntoBook_table();
				library.insertDataIntoMember_table();
				break;
			case 2:
				// search a book with id
				library.searchBookUsing_book_id();
				break;
			case 3:
				// search a book with book name
				library.searchBookUsing_book_name();
				break;
			case 4:
				// search a book with author name
				// do it yourselves...!
				Utils.TBD();
				break;
			case 5:
				// Show All Books
				library.listAllBooks();
				break;
			case 6:
				// List all users
				Utils.TBD();
				break;
			case 7:
				// Issue Book
				library.issueBook();
				break;
			case 8:
				// Return Book
				Utils.TBD();
				break;
			case 9:
				// Renew Book
				Utils.TBD();
				break;
			case 10:
				Utils.TBD();
				break;
			case 0:
				// Exit Book
				System.out.print("Exit...! ");
				System.exit(0);
				return;
			}
			displayLine();
		} while (choice != 0);
		
		

		
	}
}
