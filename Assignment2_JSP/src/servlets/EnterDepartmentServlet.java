/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for EnterDepartment.jsp
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DepartmentsDA;

@WebServlet("/EnterDepartmentServlet")
public class EnterDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EnterDepartmentServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("Submit")) {
			String deptName = request.getParameter("deptName");
			String floor = request.getParameter("floor");
			int floorNum = Integer.parseInt(floor);
			Boolean successCheck = DepartmentsDA.enterDepartment(deptName, floorNum);
			System.out.println(successCheck);
			if (successCheck) {
				//Success page
				request.setAttribute("successCheck", successCheck);
			}
			else {
				//Failure message
				request.setAttribute("successCheck", successCheck);
			}
			request.getRequestDispatcher("/WEB-INF/EnterDepartment.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/WEB-INF/Homepage.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
