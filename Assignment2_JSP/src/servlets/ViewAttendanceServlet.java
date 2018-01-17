/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for ViewAttendance.jsp
 */
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.AttendanceDA;
import database.DepartmentsDA;
import utility.Attendance;
import utility.Department;

@WebServlet("/ViewAttendanceServlet")
public class ViewAttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewAttendanceServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ViewAttendanceServlet() called");

		String action = request.getParameter("action");
		System.out.println("action = " + action);
		if (action == null) {
			response.setContentType("text/html");
			request.setAttribute("action", "viewAttendanceLoad");

			//Generate the list of departments then pass it to jsp
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();
			request.setAttribute("departments", departments);
			
			//Select the first row in the department table to populate the table on first load
			int departmentSelect = DepartmentsDA.getFirstDepartment();
			List<Attendance> attendances = new ArrayList<>();
			//Generate a list of a specified apartments attendance
			attendances = AttendanceDA.getDptAttendance(departmentSelect);
			System.out.println("Adding attendances list of size " + attendances.size() + " to the request");
			request.setAttribute("attendances", attendances);
			System.out.println("Entering ViewAttendance.jsp");
			request.getRequestDispatcher("/WEB-INF/ViewAttendance.jsp").forward(request, response);
		}
		else if (action.equals("Get Attendance")) {
			response.setContentType("text/html");
			//Generate the list of departments then pass it to jsp
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();
			request.setAttribute("departments", departments);
			String deptIdStr = request.getParameter("deptId");
			int deptId = Integer.parseInt(deptIdStr);
			List<Attendance> attendances = new ArrayList<>();
			//Generate a list of a specified apartments attendance
			attendances = AttendanceDA.getDptAttendance(deptId);
			System.out.println("Adding attendances list of size " + attendances.size() + " to the request");
			request.setAttribute("attendances", attendances);
			System.out.println("Entering ViewAttendance.jsp");
			request.getRequestDispatcher("/WEB-INF/ViewAttendance.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}