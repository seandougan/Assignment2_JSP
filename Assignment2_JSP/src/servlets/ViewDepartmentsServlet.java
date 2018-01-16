/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for ViewDepartments.jsp
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

import database.DepartmentsDA;
import utility.Department;

@WebServlet("/ViewDepartmentsServlet")
public class ViewDepartmentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViewDepartmentsServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("EnterDepartmentsServlet() called");
		String action = request.getParameter("action");
		System.out.println("action = " + action);
		if (action == null) {
			response.setContentType("text/html");
			request.setAttribute("action", "viewDepartmentsLoad");
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();
			request.setAttribute("departments", departments);
			request.getRequestDispatcher("/WEB-INF/ViewDepartments.jsp").forward(request, response);
		}
		System.out.println("End of doGet()");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}