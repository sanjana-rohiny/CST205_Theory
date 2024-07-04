package tiny_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlqueryTest {
	
	public static void main(String[] args) {
		final String USER = "root";
		final String PASSWORD = "Test@123";
		final String DATABASE_URL = "jdbc:mysql://localhost:3306/S3AIDatabase";

		Connection connection;
		Statement statement;
		
		
		try {
			// load jdbc driver for mysql - argument is the class name of driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection to databse - 
			//	databse name: S3AIDatabase, and user anme and password provided
			//connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/S3AIDatabase", "root", "Test@123");  
			
			String url = "jdbc:mysql://localhost:3306/S3AIDatabase";
			String user = "root";
			String password = "Test@123";
			System.out.println(DriverManager.getDriver(url));
			

			connection = DriverManager.getConnection(url, user, password);

			// create statement object
			statement = connection.createStatement();
			
			// create table
			String sqlQuery = 
					"CREATE TABLE Member_table(member_id int primary key, member_name  varchar(20), member_address varchar(30), fine int)";
			try {
				statement.execute(sqlQuery);
				System.out.println("Table created : Member_table");
			} catch (SQLException e) {
				System.out.println("Member_table : error code = " + e.getErrorCode());
				System.out.println("Member_table : error msg = " + e.getMessage());
			}
			
			// insert values 
			String strQuery1 = "INSERT INTO Member_table VALUES(1, 'Alice', 'Cochin', 0)";
			String strQuery2 = "INSERT INTO Member_table VALUES(2, 'Bob', 'Cochin', 0)";
			String strQuery3 = "INSERT INTO Member_table VALUES(3, 'Cindy', 'Cochin', 0)"; 
			PreparedStatement ps = null;
			try {
				ps = connection.prepareStatement(strQuery1);
				ps.execute();
				
				ps = connection.prepareStatement(strQuery2);
				ps.execute();
				
				ps = connection.prepareStatement(strQuery3);
				ps.execute();
				System.out.println("insertDataIntoMember_table(): Success");
			} catch (SQLException e) {
				System.out.println("insertDataIntoMember_table(): Exception " + e.getMessage());
			}
			
			// query table
			String QUERY = "SELECT * FROM Member_table";
			ResultSet resultSet = statement.executeQuery(QUERY);
			System.out.println("Member Information");
			while(resultSet.next()) {
				int memberId = resultSet.getInt("member_id");
				String memberName = resultSet.getString("member_name");
				String memberAddress = resultSet.getString("member_address");
				int fine = resultSet.getInt("fine");
				
				System.out.println("Member id = " + memberId); 
				System.out.println("Member Name = " + memberName); 
				System.out.println("Member Address = " + memberAddress); 
				System.out.println("Fine= " + fine);
			}
			
			// Update record
			String QUERY_update = "UPDATE Member_table SET member_address=? where member_id=? ";
			PreparedStatement ps1 = connection.prepareStatement(QUERY_update);
			ps1.setString(1, "Kalady City");
			ps1.setInt(2, 3); 
			ps1.executeUpdate();
			
	/*
	String update = "UPDATE Member_table SET member_address= 'New Delhi' where member_id=1";
	Statement stmt = connection.createStatement();
	int rowsAffected = stmt.executeUpdate(update);
	System.out.println("Rows affected: " + rowsAffected);
	*/
			
			// delete record
			String QUERY_delete = "DELETE FROM Member_table WHERE member_id= 3";
			statement.execute(QUERY_delete);

		} catch (Exception e) {
			e.printStackTrace();
		}  

	}

}
