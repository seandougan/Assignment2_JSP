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
import utility.Attendance;

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
			List<Attendance> attendances = new ArrayList<>();
			
			attendances = AttendanceDA.getAttendances();
			request.setAttribute("attendances", attendances);
			
			System.out.println("Entering ViewAttendance.jsp");
			request.getRequestDispatcher("/WEB-INF/ViewAttendance.jsp").forward(request, response);
		}
		else if (buttonCheck.equals("Enter Attendance")) {
			System.out.println("Entering EnterAttendance.jsp");
			request.getRequestDispatcher("/WEB-INF/EnterAttendance.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
