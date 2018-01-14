package database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utility.Database;
import utility.Department;
import utility.Employee;

public class GroupEntry_DA {
		  public static List<Department> GetDepartments () {
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
						System.out.println(" - Creating Departments - ");
						Department department = new Department();
						department.setName(results.getString("department_Name"));
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
		  public static List<Employee> GetEmployees () {
				List<Employee> employees = new ArrayList<Employee>();
				try {
					ResultSet results;
					System.out.println("Creating connection...");
					Connection con = Database.startConnection();
					String query = "SELECT employee_FirstName, employee_LastName FROM employee";
					System.out.println("Creating statement...");
					Statement statement = con.createStatement();
					System.out.println("Running query...");
					results = statement.executeQuery(query);		
					
					while (results.next()) {
						System.out.println(" - Creating Employee - ");
						Employee employee = new Employee();
						employee.setName(results.getString("employee_Firstname") + " " + results.getString("employee_Lastname"));
						employees.add(employee);
					}
				} catch (Exception e) {
					System.out.println("Error!");
					System.out.println(e);
					return null;
					
				}
				System.out.println("Returning " + employees.size() + " employees");
				return employees;
			}
	
}