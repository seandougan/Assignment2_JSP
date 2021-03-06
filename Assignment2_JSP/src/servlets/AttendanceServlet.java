/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for Attendance.jsp
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

@WebServlet("/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AttendanceServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonCheck = request.getParameter("pageSelect");
		System.out.println("buttonCheck = " + buttonCheck);
		
		if (buttonCheck.equals("View Attendance")) {

			//Generate the list of departments then pass it to jsp
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();
			request.setAttribute("departments", departments);
			
			//Select the first row in the department table to populate the table originally
			String departmentSelect = DepartmentsDA.getFirstDepartment();
			List<Attendance> attendances = new ArrayList<>();
			attendances = AttendanceDA.getDptAttendance(departmentSelect);
			request.setAttribute("attendances", attendances);
			System.out.println("Entering ViewAttendance.jsp");
			request.getRequestDispatcher("/WEB-INF/ViewAttendance.jsp").forward(request, response);
		}
		else if (buttonCheck.equals("Enter Attendance")) {
			System.out.println("Entering EnterAttendance.jsp");
			//Generate the list of departments then pass it to jsp
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();

			request.setAttribute("departments", departments);
			request.getRequestDispatcher("/WEB-INF/EnterAttendance.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
