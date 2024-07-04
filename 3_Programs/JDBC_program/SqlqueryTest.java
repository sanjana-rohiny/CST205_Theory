import java.sql.*;

public class SqlqueryTest {
	
	public static void main(String[] args) {
		final String USER = "root";
		final String PASSWORD = "Test@123";
		final String DATABASE_URL = "jdbc:mysql://localhost:3306/S4A_Java";

		Connection connection;
		Statement statement;

		try {
			/*__Step-1:__*/ 
			// load jdbc driver for mysql - argument is the class name of driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			/*__Step-2:__*/ 
			// create connection to databse - 
			// jdbc:mysql: - database
			// localhost: - host name, its the ip address :
			// default port for MySQL is 3306
			// databse name: S4A_Java, and user anme and password provided
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/S4A_Java", "root", "Test@123");  

			// Step 3: 
			// create statement object
			// Statement object that executes a query to retrieve data from the table
			// Simple Statement: Created using createStatement(), 
			//           as shown above. Suitable for simple queries
			// Prepared Statement: Created using connection.prepareStatement(sql). 
			//           This is more efficient for executing repeated 
			//           queries with different parameters.
			statement = connection.createStatement();
			
			/*__Step-4:__*/ 
			// Execute the SQL Statements
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
			
			// insert values  ( step 4)
			String strQuery1 = "INSERT INTO Member_table VALUES(1, 'Alice', 'Cochin', 0)";
			String strQuery2 = "INSERT INTO Member_table VALUES(2, 'Bob', 'Cochin', 0)";
			String strQuery3 = "INSERT INTO Member_table VALUES(3, 'Cindy', 'Cochin', 0)"; 
			try {
				statement.execute(strQuery1);
				statement.execute(strQuery2);
				statement.execute(strQuery3);
				System.out.println("insertDataIntoMember_table(): Success");
			} catch (SQLException e) {
				System.out.println("insertDataIntoMember_table(): Exception " + e.getMessage());
			}
			
			/*__Step-5:__*/ 
			// Process the result
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
			
			// delete record
			String QUERY_delete = "DELETE FROM Member_table WHERE member_id= 3";
			statement.execute(QUERY_delete);

			
			/*__Step-6:__ */ 
			// Close the connection and Statement
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}  

	}

}

