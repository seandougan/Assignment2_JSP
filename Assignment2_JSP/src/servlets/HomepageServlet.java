/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: 
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

import database.ViewDepartments_DA;
import utility.Department;

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
		String buttonCheck = request.getParameter("nextPage");
		System.out.println("buttonCheck = " + buttonCheck);
		
		if (buttonCheck.equals("ViewDepartments")) {
			List<Department> departments = new ArrayList<>();
			
			departments = ViewDepartments_DA.getDepartments();
			
			// Works for testing
			Department department1 = new Department();
			department1.setName("Test Floor");
			department1.setFloor("Floor 1");
			Department department2 = new Department();
			department2.setName("Testing Floor");
			department2.setFloor("Floor 3");
			Department department3 = new Department();
			department3.setName("Tester Floor");
			department3.setFloor("floor 3");
			departments.add(department1);
			departments.add(department2);
			departments.add(department3);
			request.setAttribute("departments", departments);
			request.getRequestDispatcher("/WEB-INF/ViewDepartments.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
