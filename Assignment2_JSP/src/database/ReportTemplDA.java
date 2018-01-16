package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import michael.ReportTemplBean;
import utility.Department;

public class ReportTemplDA {
	
	// SELECT * FROM score
	//WHERE event_id IN (SELECT event_id FROM grade_event WHERE category = 'T');
	
	///Multi Table Query
	
	public static List<ReportTemplBean> getReportTempl () {
		//Returns all rows in the Report template table as a list of objects
		List<ReportTemplBean> reportTemplArr = new ArrayList<ReportTemplBean>();
		
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from REPORT_TEMPLATE";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			
			//Create the Template
			while (results.next()) {
				System.out.println(" - Creating Template - ");
				ReportTemplBean reportTempl = new ReportTemplBean ();
				reportTempl.setName(results.getString("reportTempl_Name"));
				reportTempl.setDepartment(results.getString("department_name"));
				reportTempl.setDate(results.getString("templ_Date"));
				reportTempl.setSection1(results.getString("Section1"));
				reportTempl.setSection2(results.getString("Section2"));
				reportTempl.setSection3(results.getString("Section3"));
				
				
				reportTempl.setCrit11(results.getString("crit11"));
				reportTempl.setMax11(results.getInt("max11"));
				reportTempl.setCrit12(results.getString("crit12"));
				reportTempl.setMax12(results.getInt("max12"));
				reportTempl.setCrit13(results.getString("crit13"));
				reportTempl.setMax13(results.getInt("max13"));
				reportTempl.setCrit14(results.getString("crit14"));
				reportTempl.setMax14(results.getInt("max14"));
				reportTempl.setCrit15(results.getString("crit15"));
				reportTempl.setMax15(results.getInt("max15"));
				
				reportTempl.setCrit21(results.getString("crit21"));
				reportTempl.setMax21(results.getInt("max21"));
				reportTempl.setCrit22(results.getString("crit22"));
				reportTempl.setMax22(results.getInt("max22"));
				reportTempl.setCrit23(results.getString("crit23"));
				reportTempl.setMax23(results.getInt("max23"));
				
				reportTempl.setCrit31(results.getString("crit31"));
				reportTempl.setMax31(results.getInt("max31"));
				reportTempl.setCrit32(results.getString("crit32"));
				reportTempl.setMax32(results.getInt("max32"));
				reportTempl.setCrit33(results.getString("crit33"));
				reportTempl.setMax33(results.getInt("max33"));
				
				System.out.println("Name: + " + reportTempl.getName());
				//System.out.println(department.getFloor());
				reportTemplArr.add(reportTempl);
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;
		}
		System.out.println("Returning " + reportTemplArr.size() + "Report Templates");
		return reportTemplArr;
	}
	
	 public static void TemplateEntry(String name, String department, String date, String section1, String section2, String section3, String crit11, int max11, String crit12, int max12, String crit13, int max13, String crit14, int max14, String crit15, int max15, String crit21, int max21, String crit22, int max22, String crit23, int max23, String crit31, int max31, String crit32, int max32, String crit33, int max33) {
					  
		 
		  
			// Request Parameters
			   
				 System.out.println("Entering in Template");
			  
			  try {

				  Connection con = Database.startConnection();
					
					String sql = "INSERT INTO REPORT_TEMPLATE" 
					+ "(department_name, template_name, template_date, Section1, Section2, Section3,Criteria11,Maximum11,Criteria12,Maximum12,Criteria13,Maximum13,Criteria14,Maximum14,Criteria15,Maximum15,Criteria21,Maximum21,Criteria22,Maximum22,Criteria23,Maximum23,Criteria31,Maximum31,Criteria32,Maximum32,Criteria33,Maximum33) "
					+ "VALUES "+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					
					
					System.out.println("Connecting SQL String to statement");
					PreparedStatement preparedStatement = con.prepareStatement(sql);
					
					//Set the SQL variables
					preparedStatement.setString(1, department);
					preparedStatement.setString(2, name);
					preparedStatement.setString(3, date);
					
					preparedStatement.setString(4, section1);
					preparedStatement.setString(5, section2);
					preparedStatement.setString(6, section3);
				
					preparedStatement.setString(7, crit11);			
					preparedStatement.setInt(8,max11);
					preparedStatement.setString(9, crit12);
					preparedStatement.setInt(10, max12);
					preparedStatement.setString(11, crit13);
					preparedStatement.setInt(12, max13);
					preparedStatement.setString(13, crit14);
					preparedStatement.setInt(14, max14);
					preparedStatement.setString(15, crit15);
					preparedStatement.setInt(16, max15);

					preparedStatement.setString(17, crit21);
					preparedStatement.setInt(18,max21);
					preparedStatement.setString(19, crit22);
					preparedStatement.setInt(20, max22);
					preparedStatement.setString(21, crit23);
					preparedStatement.setInt(22, max23);

					preparedStatement.setString(23,crit31);
					preparedStatement.setInt(24,max31);
					preparedStatement.setString(25, crit32);
					preparedStatement.setInt(26, max32);
					preparedStatement.setString(27, crit33);
					preparedStatement.setInt(28, max33);

					
					// execute insert SQL statement
					preparedStatement.executeUpdate();
					System.out.println("Database insert successful!");
					con.close(); 
					
	} catch (Exception e) {
		
		e.printStackTrace();
	}
		
		  }

	

}
