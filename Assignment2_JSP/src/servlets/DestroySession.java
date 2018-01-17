/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: Servlet responsible for destroying sessions
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.SessionAuthentication;

/**
 * Servlet implementation class DestroySession
 */
@WebServlet("/DestroySession")
public class DestroySession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestroySession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//GRAB SESSION
		HttpSession sr = request.getSession();
		//CHECK SESSION
		if(SessionAuthentication.authenticateSession(sr)){
			System.out.println("User is not logged in or session expired, relog please");
			response.sendRedirect("index.jsp");
		}
		
		HttpSession ss = request.getSession();
		ss.invalidate();
		
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
