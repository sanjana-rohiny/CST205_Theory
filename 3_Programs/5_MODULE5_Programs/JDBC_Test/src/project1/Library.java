package project1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class Library {
	private JDBCDemo jdbcDemo;

	// singleton object
	private static Library libObject;

	public Library() {
		super();

		jdbcDemo = new JDBCDemo();
	}

	public void disconnect() {
		try {
			jdbcDemo.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Library getDefaultInstance() {
		libObject = new Library();
		return libObject;
	}

	private  int getBookId() {
		System.out.print("Enter Book Id (int value)  : ");
		return Utils.getIntegerValue();  
	}	

	private  int getMemberId() {
		System.out.print("Enter Member Id (int value)  : ");
		return Utils.getIntegerValue();  
	}

	private  String getBookName() {
		System.out.print("Enter Book Name : ");
		return Utils.getStringValue();  
	}

	public void createTables() {
		jdbcDemo.createBookTable();
		jdbcDemo.createMemberTable();
		jdbcDemo.createIssueTable();
	}

	public void insertDataIntoBook_table() {
		String strQuery1 = "INSERT INTO Book_table VALUES("
				+"1,"
				+"'Harry Potter',"
				+"'J K Rowking', "
				+"'fantasy',"
				+"1000,"
				+"10)";

		String strQuery2 = "INSERT INTO Book_table VALUES("
				+"2,"
				+"'100 Years of Solitude',"
				+"'Gabriel Garcia Marques',"
				+"'Novel',"
				+"1000,"
				+"10)";
		String strQuery3 = "INSERT INTO Book_table VALUES(3, 'Alchemist', 'Paulo Coelho', 'Novel', 1000, 10)";

		jdbcDemo.insertDataIntoBook_table(strQuery1);
		jdbcDemo.insertDataIntoBook_table(strQuery2);
		jdbcDemo.insertDataIntoBook_table(strQuery3);
	}

	public void insertDataIntoMember_table() {
		String strQuery1 = "INSERT INTO Member_table VALUES(1, 'Alice', 'Cochin', 0)";
		String strQuery2 = "INSERT INTO Member_table VALUES(2, 'Bob', 'Cochin', 0)";
		String strQuery3 = "INSERT INTO Member_table VALUES(3, 'Cindy', 'Cochin', 0)"; 

		jdbcDemo.insertDataIntoMember_table(strQuery1);
		jdbcDemo.insertDataIntoMember_table(strQuery2);
		jdbcDemo.insertDataIntoMember_table(strQuery3);
	}

	public boolean insertDataIntoIssue_table(int memberId,	int bookId) {
		
		
				
				
		String strQuery = "INSERT INTO Issue_table VALUES("
				+ memberId +","
				+ bookId +","
				+ Utils.getCurrentDate() + ","
				+ Utils.getReturnDate()+ ")";
		return jdbcDemo.insertDataIntoIssue_table(memberId, bookId);
	}
	/**
	 * Member function search book information from bookId
	 * @return void
	 */
	public  ArrayList<Book> searchBookUsing_book_id() {
		Utils.displayBanner("SEARCH BOOK");

		int bookId = getBookId();
		String QUERY = "SELECT * FROM Book_table where book_id = '" +bookId+"'";
		return jdbcDemo.search_book_from_book_table(QUERY); 
	}

	public  ArrayList<Book> searchBookUsing_book_name() {
		Utils.displayBanner("SEARCH BOOK");

		String bookName = getBookName();
		String QUERY = "SELECT * FROM Book_table where book_name = '" +bookName+"'";
		return jdbcDemo.search_book_from_book_table(QUERY); 
	}

	public void listAllBooks() {

		Utils.displayLine();
		String QUERY = "SELECT * FROM Book_table";
		jdbcDemo.search_book_from_book_table(QUERY);
	}

	public boolean validateMember(int userId) {
		String QUERY = "SELECT * FROM Member_table where member_id = '" +userId+"'";
		return jdbcDemo.search_member_from_member_table(QUERY);
	}

	public ArrayList<Book> validateBook(String  bookName) {
		String QUERY = "SELECT * FROM Book_table where book_name = '" +bookName+"'";
		return jdbcDemo.search_book_from_book_table(QUERY);
	}

	public boolean updateBookAvailablility(int bookId, int copies) {
		return jdbcDemo.update_no_of_copies_in_book_table(bookId, copies);
	}

	public void issueBook() {
		Utils.displayBanner("ISSUE BOOK");
		System.out.println("Enter User id :");

		int userId = getMemberId();		

		// check if, id is of valid member
		if (false == validateMember(userId)) {
			System.out.println("INVALID User id :" + userId );
			System.out.println("Return main menu...");
			return;
		}

		String bookName = getBookName();

		// check if book is available
		Book book = null;
		ArrayList<Book> books = validateBook(bookName);
		if (null != books && books.size() > 0) {

			for(Book b: books) {
				if (b.getCopies() >= 0 ) {
					book = b;
					break;
				} 
			}
		} 

		if (book == null) {
			System.out.println("BOOK Not in Library:" + userId );
			System.out.println("Return main menu...");
			return;
		}

		// issue book 
		// 1. insert record into Issue_table
		// 2. update Book_table with noOfCopies -= 1
		boolean retVal = insertDataIntoIssue_table(userId, book.getId());
		if (retVal == true) {
			updateBookAvailablility(book.getId(), (book.getCopies()-1));
		}
	}
}
