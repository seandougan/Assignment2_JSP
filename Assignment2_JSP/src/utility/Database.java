/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: This class is meant to manage a singleton connection to the database, opening and closing
 * the connection
 */

package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

	//DATABASE CONNECTION STRINGS
	private final static String username = "admin";
	private final static String password = "admin";
	private final static String database = "comp3095";
	private static Connection connect;
	
	
	public static Connection startConnection() {
		
		try {
		      // This will load the MySQL driver, each DB has its own driver
			System.out.println("Initializing MYSql Driver JAR...");
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      // Setup the connection with the DB
		      System.out.println("Driver found! Establishing Connection ...");
		      connect = DriverManager
			          .getConnection("jdbc:mysql://localhost:3306/"+database+"?"
			              + "user="+username+"&password="+password);
		      
		      System.out.println("Connection Established");
		      return connect;
		    } 
		catch (Exception e) {
		      
		    	System.out.println("There is a problem connecting to the MYSql database");
		    	return null;
		    } 
	}
	
}
