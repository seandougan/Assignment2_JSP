/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for Homepage.jsp
 */
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomepageServlet
 */
@WebServlet("/HomepageServlet")
public class HomepageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public HomepageServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonCheck = request.getParameter("pageSelect");
		System.out.println("buttonCheck = " + buttonCheck);
		
		if (buttonCheck.equals("Departments")) {
			System.out.println("Entering Departments.jsp");
			request.getRequestDispatcher("/WEB-INF/Departments.jsp").forward(request, response);
		}
		else if (buttonCheck.equals("Attendance")) {
			System.out.println("Entering Attendance.jsp");
			request.getRequestDispatcher("/WEB-INF/Attendance.jsp").forward(request, response);
		}
		else if (buttonCheck.equals("Groups")) {
			System.out.println("/WEB-INF/GroupPage.jsp");
			request.getRequestDispatcher("/WEB-INF/GroupPage.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
