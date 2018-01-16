package servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.GroupView_DA;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import utility.Group;
 

@WebServlet("/GroupViewServlet")
public class GroupViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GroupViewServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 String InfoSubmitted = request.getParameter("ViewGroupButton");
			 List<Group> groups = new ArrayList<Group>();
			 groups = GroupView_DA.getGroups();
			
			if (InfoSubmitted == null || InfoSubmitted.equals("Cancel")){
				request.setAttribute("groups", groups);
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/ViewGroup.jsp");
				view.forward(request, response);
			}
			else if(InfoSubmitted.equals("Search")){
				String groupDepartment = request.getParameter("selectedDepartment");
				String groupGroup = request.getParameter("selectedGroup");
				List<Group> departmentSelectedGroups = new ArrayList<Group>();	
				List<Group> groupSelectedGroups = new ArrayList<Group>();
				groupSelectedGroups = GroupView_DA.getGroupsFromGroups(groupGroup);
				departmentSelectedGroups = GroupView_DA.getGroupsFromDepartment(groupDepartment);
				request.setAttribute("groups", groups);
				request.setAttribute("groupName", groupGroup);
				request.setAttribute("groupsFromDepartments", departmentSelectedGroups);
				request.setAttribute("groupDepartment", groupDepartment);
				request.setAttribute("groupGroups", groupSelectedGroups);
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/ViewGroup.jsp");
				view.forward(request, response);
			}
			else if (InfoSubmitted.equals("Home")) {
				 request.getRequestDispatcher("Homepage.jsp").forward(request, response);
			}else {
				request.setAttribute("groups", groups);
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/ViewGroup.jsp");
				
				view.forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}