package project1;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class JDBCDemo {
	private static final String USER = "root";
	private static final String PASSWORD = "Test@123";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/S3AIDatabase";

	// singleton object
	private Connection connection;
	private Statement statement;

	public JDBCDemo() {
		try {
			/*
			 * The basic idea behind using Class.forName() 
			 * is to load a JDBC driver implementation.
			 * driver class is `com.mysql.cj.jdbc.Driver'
			 */
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");  

			/*
			 * DriverManager.getConnection(url, user, password) - 
			 * 	this api is connecting to mysql using user name and password.
			 * 
			 *	The standard syntax for JDBC URLs is:
			 *	jdbc:<subprotocol>:<subname>
			 *
			 *	A JDBC URL has three parts, which are separated by colons:
			 *	– jdbc is the protocol.
			 *	– <subprotocol> is usually the driver or 
			 *					the database connectivity mechanism, 
			 *					which may be supported by one or more drivers.
			 *	– <subname> is the database.
			 *	– For example, to access a MySQL database through 
			 *			a JDBC-ODBC bridge, one might use a URL such as the following:
			 *			"jdbc:mysql://localhost:3306/S3AIDatabase", "root", "Test@123"
			 *					
			 *	In this <subprotocol> = jdbc:mysql://localhost:3306
			 *			<subname> = S3AIDatabase 
			 *			This is created by below mysql command  
			 *			mysql> create database S3AIDatabase;
			 *			 				
			 *			"root"; This is the user name
			 *			"Test@123"; This is my password
			 */
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/S3AIDatabase", "root", "Test@123");  

			statement = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);

			/*
			 * This block is just to print driver details..!
			 */
			if (connection != null) {
				DatabaseMetaData dm = (DatabaseMetaData) connection.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
			} else {
				System.out.println("Connection Object is null");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			statement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void createBookTable() {

		/*
		 * 1. create Book_Table
		 * CREATE TABLE Book_table(book_id int primary key, 
		 * 						   book_name  varchar(20), 
		 * 						   book_author varchar(30), 
		 * 						   book_type varchar(10), 
		 * 						   book_price int, 
		 * 						   noofcopies int);
		 * 
		 */
		String sqlQuery = "CREATE TABLE Book_table(book_id int primary key, book_name varchar(50), book_author varchar(50), book_type varchar(20), book_price int, noofcopies int)";		try {
			statement.execute(sqlQuery);
			System.out.println("Table created : Book_table");
		} catch (SQLException e) {
			System.out.println("Book_Table : error code = " + e.getErrorCode());
			System.out.println("Book_Table : error msg = " + e.getMessage());
		}
	}

	public void createMemberTable() {
		/*
		 * 1. create Member_Table
		 * CREATE TABLE Member_table(member_id int primary key, 
		 * 						   member_name  varchar(20), 
		 * 						   member_address varchar(30)); 
		 * 						   
		 */
		String sqlQuery = 
				"CREATE TABLE Member_table(member_id int primary key, member_name  varchar(20), member_address varchar(30), fine int)";
		try {
			statement.execute(sqlQuery);
			System.out.println("Table created : Member_table");
		} catch (SQLException e) {
			System.out.println("Member_table : error code = " + e.getErrorCode());
			System.out.println("Member_table : error msg = " + e.getMessage());
		}
	}

	public void createIssueTable() {
		/*
		 * 1. create Issue_Table
		 * CREATE TABLE Issue_table(membe_rid int, 
		 * 						   book_id  int, 
		 * 						   issue_date varchar(20), 
		 * 						   return_date varchar(20),
		 * 						   fine int,
		 * 						   primary key(member_id, book_id)); 
		 * 						   demoTest
		 */
		String sqlQuery = "CREATE TABLE Issue_table(member_id int, book_id  int, issue_date varchar(20), return_date varchar(20), primary key(member_id, book_id))";try {
			statement.execute(sqlQuery);
			System.out.println("Table created : Issue_table");
		} catch (SQLException e) {
			System.out.println("Issue_table : error code = " + e.getErrorCode());
			System.out.println("Issue_table : error msg = " + e.getMessage());
		}
	}

	public void insertDataIntoBook_table(String sqlQuery) {
		PreparedStatement ps = null;
		boolean retval = false;

		try {
			ps = connection.prepareStatement(sqlQuery);	
			ps.execute();
			System.out.println("insertDataIntoBook_table(): Success");
		} catch (SQLException e) {
			System.out.println("insertDataIntoBook_table(): Exception " + e.getMessage());
		}
	}

	public void insertDataIntoMember_table(String sqlQuery) {
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(sqlQuery);
			ps.execute();
			System.out.println("insertDataIntoMember_table(): Success");
		} catch (SQLException e) {
			System.out.println("insertDataIntoMember_table(): Exception " + e.getMessage());
		}
	}

	public boolean insertDataIntoIssue_table(int userId, int bookId) {
		try {
			
			PreparedStatement ps = connection.prepareStatement(
					"INSERT INTO Issue_table ( member_id, book_id, issue_date, return_date ) "
							+ " values (?, ?, ?, ? )");

			ps.setInt(1, userId );
			ps.setInt(2, bookId); 

			LocalDate date1 = LocalDate.now();
			java.sql.Date issueDate = java.sql.Date.valueOf(date1);
			ps.setDate(3, issueDate);

			LocalDate date2 = LocalDate.now().plusMonths(1);
			java.sql.Date returnDate = java.sql.Date.valueOf(date2);
			ps.setDate(4, returnDate);

			ps.execute();
			System.out.println("insertDataIntoIssue_table(): Success");
			return true;
		} catch (SQLException e) {
			System.out.println("insertDataIntoIssue_table(): Exception " + e.getMessage());
		}
		return false;
	}

	public boolean update_no_of_copies_in_book_table(int bookId, int copies) {
		try {

			String QUERY = "UPDATE Book_table SET noofcopies=? where book_id=? ";
			PreparedStatement ps = connection.prepareStatement(QUERY);

			ps.setInt(1, copies );
			ps.setInt(2, bookId); 

			ps.executeUpdate();
			System.out.println("update_no_of_copies_in_book_table(): Success");
			return true;
		} catch (SQLException e) {
			System.out.println("update_no_of_copies_in_book_table(): Exception " + e.getMessage());
		}
		return false;
	}

	public boolean search_member_from_member_table(String sqlQuery) {
		/*
		mysql> SELECT * FROM Member_table WHERE member_id = 1;
		+-----------+-------------+----------------+------+
		| member_id | member_name | member_address | fine |
		+-----------+-------------+----------------+------+
		|         1 | Alice       | Cochin         |    0 |
		+-----------+-------------+----------------+------+
		1 row in set (0.01 sec)	
		 */
		int recordCount = 0;
		int memberId, fine;
		String memberName, memberAddress; 
		System.out.println("User Information"); 

		try {
			ResultSet resultSet = statement.executeQuery(sqlQuery);

			while(resultSet.next()) {
				memberId = resultSet.getInt("member_id");
				memberName = resultSet.getString("member_name");
				memberAddress = resultSet.getString("member_address");
				fine = resultSet.getInt("fine");

				Utils.displayLine();
				System.out.println("Member id = " + memberId); 
				System.out.println("Member Name = " + memberName); 
				System.out.println("Member Address = " + memberAddress); 
				System.out.println("Fine= " + fine);
				recordCount += 1;
			}

		} catch (SQLException e) {
			System.out.println("search_member_from_member_table(): Exception " + e.getMessage());
		}

		return  (recordCount > 0 ? true : false);
	}


	public boolean search_book_from_book_table_ex(String sqlQuery) {
		/*
mysql> SELECT * FROM Book_table WHERE book_id = 1;
+---------+--------------+-------------+-----------+------------+------------+
| book_id | book_name    | book_author | book_type | book_price | noofcopies |
+---------+--------------+-------------+-----------+------------+------------+
|       1 | Harry Potter | J K Rowking | fantasy   |       1000 |         10 |
+---------+--------------+-------------+-----------+------------+------------+
1 row in set (0.03 sec)
		 */
		int recordCount = 0;
		int bookId, bookPrice, bookNoOfCopies;
		String bookName, bookAuthor, bookType;

		try {
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			System.out.println("Book Information"); 

			while(resultSet.next()) {
				bookId = resultSet.getInt("book_id");
				bookName = resultSet.getString("book_name");
				bookAuthor = resultSet.getString("book_author");
				bookType = resultSet.getString("book_type");
				bookPrice = resultSet.getInt("book_price");
				bookNoOfCopies = resultSet.getInt("noofcopies");

				Utils.displayLine();
				System.out.println("Book id = " + bookId); 
				System.out.println("Book Name = " + bookName); 
				System.out.println("Book Category = " + bookType); 
				System.out.println("Book Author = " + bookAuthor); 
				System.out.println("Book Price = " + bookPrice);
				System.out.println("Book Copies left = " + bookNoOfCopies);

				recordCount += 1;
			}
			Utils.displayLine();
			System.out.println("No of records = " + recordCount); 

		} catch (SQLException e) {
			System.out.println("search_book_from_book_table(): Exception " + e.getMessage());
		}
		return  (recordCount > 0 ? true : false);

	}

	public ArrayList<Book> search_book_from_book_table(String sqlQuery) {
		/*
mysql> SELECT * FROM Book_table WHERE book_id = 1;
+---------+--------------+-------------+-----------+------------+------------+
| book_id | book_name    | book_author | book_type | book_price | noofcopies |
+---------+--------------+-------------+-----------+------------+------------+
|       1 | Harry Potter | J K Rowking | fantasy   |       1000 |         10 |
+---------+--------------+-------------+-----------+------------+------------+
1 row in set (0.03 sec)
		 */
		int recordCount = 0;
		int bookId, bookPrice, bookNoOfCopies;
		String bookName, bookAuthor, bookType;
		ArrayList<Book> avilableBooks = new ArrayList<Book>();

		try {
			ResultSet resultSet = statement.executeQuery(sqlQuery);
			System.out.println("Book Information"); 

			while(resultSet.next()) {
				bookId = resultSet.getInt("book_id");
				bookName = resultSet.getString("book_name");
				bookAuthor = resultSet.getString("book_author");
				bookType = resultSet.getString("book_type");
				bookPrice = resultSet.getInt("book_price");
				bookNoOfCopies = resultSet.getInt("noofcopies");

				Utils.displayLine();
				System.out.println("Book id = " + bookId); 
				System.out.println("Book Name = " + bookName); 
				System.out.println("Book Category = " + bookType); 
				System.out.println("Book Author = " + bookAuthor); 
				System.out.println("Book Price = " + bookPrice);
				System.out.println("Book Copies left = " + bookNoOfCopies);

				Book book = new Book(bookId, bookName, bookPrice, bookType, bookAuthor, bookNoOfCopies); 
				avilableBooks.add(book);
				recordCount += 1;
			}
			Utils.displayLine();
			System.out.println("No of records = " + recordCount); 

		} catch (SQLException e) {
			System.out.println("search_book_from_book_table(): Exception " + e.getMessage());
		}
		return  avilableBooks;

	}

}
