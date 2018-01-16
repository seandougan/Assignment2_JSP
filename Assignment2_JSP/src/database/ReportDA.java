package database;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.Database;

public class ReportDA {
	
	
	public static void ReportEntry(String name, String date, String comment1, String comment2, String comment3, String type, String target, int eva11, int eva12, int eva13, int eva14, int eva15, int eva21, int eva22, int eva23, int eva31, int eva32, int eva33) {
		
		
		// Request Parameters
		   
		 System.out.println("Entering in Report");
	  
	  try {

		  Connection con = Database.startConnection();
			
			String sql = "INSERT INTO REPORT" 
			+ "(rep_Name, rep_Date, Comment1, Comment2, Comment3,rep_Type,rep_Target,Eva11,Eva12,Eva13,Eva14,Eva15,Eva21,Eva22,Eva23,Eva31,Eva32,Eva33) "
			+ "VALUES "+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			
			System.out.println("Connecting SQL String to statement");
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			
			//Set the SQL variables
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, date);
			preparedStatement.setString(3,comment1);
			preparedStatement.setString(4,comment2);
			preparedStatement.setString(5,comment3);
			
			preparedStatement.setString(6,type);
		
			preparedStatement.setString(7, target);			
			
			preparedStatement.setInt(8,eva11);
			preparedStatement.setInt(9, eva12);
			preparedStatement.setInt(10, eva13);
			preparedStatement.setInt(11, eva14);
			preparedStatement.setInt(12, eva15);
			
			preparedStatement.setInt(13, eva21);
			preparedStatement.setInt(14, eva22);
			preparedStatement.setInt(15, eva23);
			
			preparedStatement.setInt(16, eva31);
			preparedStatement.setInt(17, eva32);
			preparedStatement.setInt(18, eva33);

			
			// execute insert SQL statement
			preparedStatement.executeUpdate();
			System.out.println("Database insert successful!");
			con.close(); 
			
} catch (Exception e) {

e.printStackTrace();
}

 }
		
		
	}
	
	
	
	
	


