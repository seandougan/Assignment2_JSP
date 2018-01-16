/*
 /*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Data access class for department pages
 */
package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import utility.Department;

public class DepartmentsDA {
	
	
	public static List<Department> getDepartments () {
		System.out.println("getDepartments() called");
		//Returns all rows in the DEPARTMENT table as a list of Department objects
		List<Department> departments = new ArrayList<Department>();
		
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from DEPARTMENT";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query - " + query);
			results = statement.executeQuery(query);		
			
			//Create the list of departments
			while (results.next()) {
				System.out.println(" - Creating DEPARTMENT - ");
				Department department = new Department ();
				department.setDepartmentId(results.getInt("department_Id"));
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
		System.out.println("End of getDepartments()");
		return departments;
	}

	public static boolean enterDepartment(String deptName, int floor) {
		boolean successCheck = false;
		try {
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "INSERT INTO department(department_Name, department_Floor)"
					+ " VALUES('" + deptName + "', " + floor + ");";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query - " + query);
			statement.executeUpdate(query);		
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return successCheck;
		}
		successCheck = true;
		return successCheck;
	}
	
	public static int getFirstDepartment() {
		System.out.println("getFirstDepartment() called");
		int departmentId = 0;
		try {
		ResultSet results;
		System.out.println("Creating connection...");
		Connection con = Database.startConnection();
		String query = "SELECT * from DEPARTMENT";
		System.out.println("Creating statement...");
		Statement statement = con.createStatement();
		System.out.println("Running query - " + query);
		results = statement.executeQuery(query);
		results.next();
		String departmentName = results.getString("department_Name");
		departmentId = results.getInt("department_ID");
		System.out.println("Returning department: " + departmentName + " - ID = " + departmentId);
		} catch (SQLException e) {
			System.out.println("Error!");
			System.out.println(e);
			e.printStackTrace();
			return departmentId;
		}
		System.out.println("End of getFirstDepartment()");
		return departmentId;
	}
}
	
