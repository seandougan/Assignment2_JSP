/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massel - 101025072
 * Class Description: This class is meant access the Database for Report
 * the connection
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import michael.ReportBean;
import michael.ReportTemplBean;
import utility.Database;

public class ReportDA {
	
	
	public static void ReportEntry(String name, String date, String comment1, String comment2, String comment3, String type, String target, int eva11, int eva12, int eva13, int eva14, int eva15, int eva21, int eva22, int eva23, int eva31, int eva32, int eva33, int templ_ID_FK) {
		
		
		// Request Parameters
		   
		 System.out.println("Entering in Report");
	  
	  try {

		  Connection con = Database.startConnection();
			
			String sql = "INSERT INTO REPORT" 
			+ "(rep_Name,  rep_Date, Comment1, Comment2, Comment3,rep_Type,rep_Target,Eva11,Eva12,Eva13,Eva14,Eva15,Eva21,Eva22,Eva23,Eva31,Eva32,Eva33,templ_ID_FK) "
			+ "VALUES "+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			
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
			preparedStatement.setInt(19,templ_ID_FK);		
			
			// execute insert SQL statement
			preparedStatement.executeUpdate();
			System.out.println("Database insert successful!");
			con.close(); 
			
} catch (Exception e) {

e.printStackTrace();
}

 }
		
	public static List<ReportBean> getReport (int PK) {
		//Returns all rows in the Report template table as a list of objects
		List<ReportBean> reportArr = new ArrayList<ReportBean>();
		
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * FROM REPORT WHERE templ_ID_FK ="+PK;
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			
			//Create the Template
			while (results.next()) {
				System.out.println(" - Creating Report - ");
				ReportBean report = new ReportBean ();
				report.setName(results.getString("rep_Name"));
				report.setTempl_ID_FK(results.getString("templ_ID_FK"));
				report.setDate(results.getString("rep_Date"));
				
				report.setComment1(results.getString("Comment1"));
				report.setComment2(results.getString("Comment2"));
				report.setComment3(results.getString("Comment3"));
				
				
		
				report.setEva11(results.getInt("eva11"));

				report.setEva12(results.getInt("eva12"));

				report.setEva13(results.getInt("eva13"));
			
				report.setEva14(results.getInt("eva14"));
	
				report.setEva15(results.getInt("eva15"));
				
				
				report.setEva21(results.getInt("eva21"));
	
				report.setEva22(results.getInt("eva22"));
		
				report.setEva23(results.getInt("eva23"));
				
	
				report.setEva31(results.getInt("eva31"));

				report.setEva32(results.getInt("eva32"));

				report.setEva33(results.getInt("eva33"));
				
			
				
				
				//System.out.println(department.getFloor());
				reportArr.add(report);
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;
		}
		
		return reportArr;
	}
	
		
	}
	
	
	
	
	


