package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import michael.ReportTemplBean;
import utility.Department;

public class ReportDA {
	
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
				//.setFloor("Floor: " + results.getInt("department_floor"));
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

	

}
