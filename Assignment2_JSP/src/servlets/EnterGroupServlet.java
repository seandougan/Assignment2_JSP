package servlets;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import database.GroupEntry_DA;
import utility.Database;
import utility.Department;
import utility.Employee;

@WebServlet("/EnterGroupServlet")
public class EnterGroupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String groupName;
	String department;
	String e1;
	String e2;
	String e3;
	String e4;
	String e5;
	String e6;

    public EnterGroupServlet() {
        super();

    }
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Department> departments = new ArrayList<Department>();
		 List<Employee> employees = new ArrayList<Employee>();
		 departments = GroupEntry_DA.GetDepartments();
		 employees = GroupEntry_DA.GetEmployees();
		 String message;
		 String InfoSubmitted = request.getParameter("GroupEnterButton");
	
		 if (InfoSubmitted == null){
			 request.setAttribute("departments", departments);
			 request.setAttribute("employees", employees);
		     RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/EnterGroup.jsp");
		     view.forward(request, response);
		 }     
		  else if (InfoSubmitted.equals("Submit") && request.getParameter("groupName") != null && !request.getParameter("groupName").isEmpty()) {
			  
			    groupName = request.getParameter("groupName");
			    department = request.getParameter("selectedDepartment");
			    e1 = request.getParameter("selectedEmployee1");
				e2 = request.getParameter("selectedEmployee2");
				e3 = request.getParameter("selectedEmployee3");
				e4 = request.getParameter("selectedEmployee4");
				e5 = request.getParameter("selectedEmployee5");
				e6 = request.getParameter("selectedEmployee6");
				try {
					InsertIntoDB();
				} catch (Exception e) {
					System.out.println("Error!");
					System.out.println(e);
					request.setAttribute("departments", departments);
				    request.setAttribute("employees", employees);
				    message = "Creating group " + groupName + " has failed!";
				    request.setAttribute("message", message);
				    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/EnterGroup.jsp");
				    view.forward(request, response);
				}
				request.setAttribute("departments", departments);
				request.setAttribute("employees", employees);
				message = "Group " + groupName + " has been created!";
				request.setAttribute("message", message);
			    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/EnterGroup.jsp");
			    view.forward(request, response);
			  		 
		  }else if (InfoSubmitted.equals("Cancel")){
			  request.setAttribute("departments", departments);
			    request.setAttribute("employees", employees);
			    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/EnterGroup.jsp");
			    view.forward(request, response);
		  }
		  request.setAttribute("departments", departments);
		    request.setAttribute("employees", employees);
		    message = "Creating group has failed! Enter Group Name!";
		    request.setAttribute("message", message);
		    RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/EnterGroup.jsp");
		    view.forward(request, response);
	}     
	   
	private void InsertIntoDB() throws Exception{
		try{
			Connection connect = null;
			connect = Database.startConnection();
			//Database.startConnection();
			String sql = "INSERT INTO GROUPS (group_Name, group_Department, group_Employee1,  group_Employee2,  group_Employee3,  group_Employee4,  group_Employee5,  group_Employee6) VALUES "+"(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connect.prepareStatement(sql);
			//Set the SQL variables
		    preparedStatement.setString(1, groupName);
			preparedStatement.setString(2, department);
			preparedStatement.setString(3, e1);
			preparedStatement.setString(4, e2);
			preparedStatement.setString(5, e3);
			preparedStatement.setString(6, e4);
			preparedStatement.setString(7, e5);
			preparedStatement.setString(8, e6);
			preparedStatement.executeUpdate();
		  
		} catch (Exception e) {
			System.out.println("Error!");
			System.out.println(e);
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
