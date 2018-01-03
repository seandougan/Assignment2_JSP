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
		String buttonCheck = request.getParameter("nextPage");
		System.out.println("buttonCheck = " + buttonCheck);
		
		if (buttonCheck.equals("ViewDepartments")) {
			request.getRequestDispatcher("/WEB-INF/ViewDepartments.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
