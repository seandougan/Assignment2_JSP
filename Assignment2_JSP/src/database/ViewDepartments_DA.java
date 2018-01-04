/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: 
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import utility.Department;

public class ViewDepartments_DA {
	
	
	public static List<Department> getDepartments () {
		//Returns a list of all departments in the database
		List<Department> departments = new ArrayList<Department>();
		
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from department";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			
			while (results.next()) {
				System.out.println(" - Creating DEPARTMENT - ");
				Department department = new Department ();
				department.setName(results.getString("department_Name"));
				department.setFloor("Floor: " + results.getInt("department_floor"));
				System.out.println("Name: + " + department.getName());
				System.out.println(department.getFloor());
				departments.add(department);
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;
		}
		System.out.println("Returning " + departments.size() + " departments");
		return departments;
	}
	
}
