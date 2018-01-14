/*
  ** Project: < Comp3095 Assignment1 … >
* Assignment: < 1>
* Author(s): < Sean Dougan, Gregory Uchitel, Michael Van Dyke, James Massel, Matthew McCarthy>
* Student Number: RESPECTIVELY: 101029633, 100322200, 101008864, 101025072, 101009842 >
* Date: Friday December 8th, 7:13PM COMPLETION TIME
* Description: <Comments are dispursed all over the project, I apologize but have to move on with other assignments
* It is sloppy but functional, thank you for the extra time learned a lot> 
 */
package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class EmployeeDAO {
	  
		  public static void EmployeeEntry(String fName, String lName, String email, String pNumber, String yH, String role, int fk){		  
			// Request Parameters
			   
				 System.out.println("Entering in Employees");
			  
			  try {

				  Connection con = Database.startConnection();
					
					String sql = "INSERT INTO EMPLOYEE" 
					+ "(employee_FirstName, employee_LastName ,Employee_Role, Employee_Email, employee_PhoneNumber,Employee_YearHired, department_ID_FK) "
					+ "VALUES "+ "(?,?,?,?,?,?,?)";
					
					System.out.println("Connecting SQL String to statement");
					PreparedStatement preparedStatement = con.prepareStatement(sql);
					
					//Set the SQL variables
					preparedStatement.setString(1, fName);
					preparedStatement.setString(2, lName);
					preparedStatement.setString(3, role);
					preparedStatement.setString(4, email);
				
					preparedStatement.setString(5, pNumber);
				
					preparedStatement.setString(6,yH);
					preparedStatement.setInt(7, fk);
					// execute insert SQL statement
					preparedStatement.executeUpdate();
					System.out.println("Database insert successful!");
					con.close(); 
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
		  }
		  
}



	  
	  // employee_FirstName, employee_LastName ,Employee_Role, Employee_Email, employee_PhoneNumber, Department_ID
			  
			  
			 
			  
			
			
			