/*
 * Date: January 4th, 2018,
 * Group Members: Sean Dougan - 101029633, Matthew McCarthy - 101009842, Michael Van Dyke - 101008864
 * Gregory Uchitel - 100322200, James Massle - 101025072
 * Class Description: This class invokes a servlet whos purpose is to enter or deny the user into the system
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.LoginDAO;
import validation.beans.LoginValidator;


@WebServlet("/SystemEntry")
public class SystemEntry extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private LoginValidator validator = new LoginValidator();
	private LoginDAO data = new LoginDAO();

    public SystemEntry() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//CHECK FOR NULL
		if(request.getParameter("username") != null 
				&& request.getParameter("password") != null) {
			
			//VALIDATE CONTROL
			if(validator.loginUNamePassword(request.getParameter("password"))) {
				
				//EXECUTE LOGIN DATA OPERATION FROM DAO
				if(data.Login(request.getParameter("username"), request.getParameter("password"))) {
					

					//SESSION
					HttpSession ss = request.getSession();
					ss.setAttribute("verified", "loggedIn");
					
					//COOKIE
					Cookie preAuthUser = new Cookie("comp3095UserName", request.getParameter("username"));
					preAuthUser.setMaxAge(60*60*24*7);
					response.addCookie(preAuthUser);
					System.out.println("Cookie added...");

					
					//REDIRECT INTO SITE
					response.sendRedirect("Homepage.jsp");
				}
				
				//NO USER MATCH
				else {
					
					System.out.println("No user found");
					PrintWriter pw = response.getWriter();
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
					pw.write("<p class='alert alert-danger text-center'>The login credentials are not found in our system, access is denied, re-enter username/password</p>");
					
				}
			}
			
			//NOT VALID
			else {

				System.out.println("Control not valid");
				PrintWriter pw = response.getWriter();
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.include(request, response);
				pw.write("<p class='alert alert-danger text-center'>Only Letters are accepted, your Username is your firstname and last name is your password</p>");
				
			}		
		}
		
		//PARAMS ARE NULL
		else {
			
			System.out.println("Parameters are null");
			PrintWriter pw = response.getWriter();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			pw.write("<p class='alert alert-danger text-center'>Values cannot be left intentionally blank</p>");
		}
	}

}
