/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for Departments.jsp
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

@WebServlet("/DepartmentsServlet")
public class DepartmentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DepartmentsServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageSelect = request.getParameter("pageSelect");
		if (pageSelect.equals("Enter Department")) {
			request.getRequestDispatcher("/WEB-INF/EnterDepartment.jsp").forward(request, response);
		}
		else {
			//Generate the list of departments then pass it to jsp
			List<Department> departments = new ArrayList<>();
			departments = DepartmentsDA.getDepartments();
			request.setAttribute("departments", departments);
			request.getRequestDispatcher("/WEB-INF/ViewDepartments.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
