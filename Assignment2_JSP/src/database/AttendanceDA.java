/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Data access class for attendance pages
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import utility.Attendance;

public class AttendanceDA {
	
	public static List<Attendance> getAttendances() {
		//Returns all rows in the ATTENDANCE table as a list of Attendance objects
		List<Attendance> attendances = new ArrayList<Attendance>();
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from ATTENDANCE";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			
			//Create the list of employees
			while (results.next()) {
				System.out.println(" - Creating Attendance - ");
				Attendance attendance = new Attendance();
				attendance.setAttendId(results.getInt("attendance_ID"));
				attendance.setEmpId(results.getInt("employee_ID_FK"));
				attendance.setPresent1(convertToBool(results.getInt("present1")));
				attendance.setPresent2(convertToBool(results.getInt("present2")));
				attendance.setPresent3(convertToBool(results.getInt("present3")));
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;
		}
		
	System.out.println("Returning " + attendances.size() + " attendances");
	return attendances;
	}
	
	public static boolean convertToBool(Integer num) {
		//Converts null, 0, or 1s to their boolean equivalent
		System.out.println("Converting " + num + " to a boolean");
		boolean present;
		
		if (num == null || num == 0) {
			System.out.println("present  = false");
			present = false;
		}
		else {
			System.out.println("present = true");
			present = true;
		}
		return present;
	}
}



