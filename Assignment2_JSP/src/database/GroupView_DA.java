package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utility.Database;
import utility.Group;

public class GroupView_DA {
	public static List<Group> getGroups () {
		List<Group> groups = new ArrayList<Group>();
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from groups";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			
			while (results.next()) {
				System.out.println(" - Creating Groups - ");
				Group group = new Group();
				group.setGroupName(results.getString("group_Name"));
				group.setGroupDepartment(results.getString("group_Department"));
				//group.setGroupEmployeeNum(results.getString("group_Employee_Num1"), results.getString("group_Employee_Num2"), results.getString("group_Employee_Num3"), results.getString("group_Employee_Num4"), results.getString("group_Employee_Num5"));
				groups.add(group);
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;	
		}
		System.out.println("Returning " + groups.size() + " groups");
		return groups;
	}
	public static List<Group> getGroupsFromDepartment(String groupsDepartment) {
		List<Group> groupsFromDept = new ArrayList<Group>();
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from groups";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			while (results.next()) {
				Group groupFromDepartment = new Group();
				groupFromDepartment.setGroupDepartment(results.getString("group_Department"));
				groupFromDepartment.setGroupName(results.getString("group_Name"));
				if (groupFromDepartment.getGroupDepartment() != null  && groupFromDepartment.getGroupDepartment().equals(groupsDepartment)){
					System.out.println(" - Creating Groups from  " + groupFromDepartment.getGroupName());
					groupsFromDept.add(groupFromDepartment);
				}		
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;	
		}
		System.out.println("Returning " + groupsFromDept.size() + " groupsFromDept");
		return groupsFromDept;
	}
	public static List<Group> getGroupsFromGroups(String groupsGroups) {
		List<Group> groupsFromGroups = new ArrayList<Group>();
		try {
			ResultSet results;
			System.out.println("Creating connection...");
			Connection con = Database.startConnection();
			String query = "SELECT * from groups";
			System.out.println("Creating statement...");
			Statement statement = con.createStatement();
			System.out.println("Running query...");
			results = statement.executeQuery(query);		
			while (results.next()) {
				Group groupFromGroups = new Group();
				groupFromGroups.setGroupDepartment(results.getString("group_Department"));
				groupFromGroups.setGroupName(results.getString("group_Name"));
				groupFromGroups.setGroupEmployee(results.getString("group_Employee1"), results.getString("group_Employee2"),results.getString("group_Employee3"),results.getString("group_Employee4"),results.getString("group_Employee5"),results.getString("group_Employee6"));
				
				if (groupFromGroups.getGroupName() != null  && groupFromGroups.getGroupName().equals(groupsGroups)){
					System.out.println(" - Creating Groups from " + groupFromGroups.getGroupName());
					groupsFromGroups.add(groupFromGroups);
				}		
			}
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
			return null;	
		}
		System.out.println("Returning " + groupsFromGroups.size() + " groupsInfo");
		return groupsFromGroups;
	}
}
