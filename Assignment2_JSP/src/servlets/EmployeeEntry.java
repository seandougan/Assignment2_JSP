package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utility.EmployeeDAO;
import validation.beans.EmployeeValidation;

/**
 * Servlet implementation class EmployeeEntry
 */
@WebServlet("/EmployeeEntry")
public class EmployeeEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeEntry() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String employeeNum = request.getParameter("employeeNum");
		String yearHired = request.getParameter("yearHired");
		String jobPosition = request.getParameter("jobPosition");
		//jobPosition
		
		//add check for null on this form
		EmployeeValidation employeeInformation = new EmployeeValidation();
		
		if(employeeInformation.ValidateName(firstName) && employeeInformation.ValidateName(lastName) && employeeInformation.ValidateEmail(email) && employeeInformation.ValidateNumber(employeeNum))  
		{
			// This is calling the Entry method that will insert the fields.
			EmployeeDAO.EmployeeEntry(firstName, lastName, email, employeeNum, yearHired, jobPosition);
			System.out.println("Data inserted, redirecting to employee entry");
			
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			RequestDispatcher rd = request.getRequestDispatcher("EnterEmployee.jsp");
			pw.println("<h1 id='success' class='text-center'>Employee Succesfully added!</h1>");
			rd.include(request, response);
			
}
		else {
			System.out.println("Authentication failed, retry");
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			
			RequestDispatcher rd = request.getRequestDispatcher("EnterEmployee.jsp");
			pw.println("<h1 id='error' height='400px' class='text-center'>You have entered invalid information, please enter the proper information</h1>");

			rd.include(request, response);
			
		}
	}
	}

