package michael;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Statement;

import database.ReportTemplDA;
import utility.Database;

/**
 * Servlet implementation class CreateReportTemplateServlet
 */
@WebServlet("/CreateReportTemplateServlet")
public class CreateReportTemplateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CreateReportTemplateServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/CreateReportTemplate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GRAB SESSION
				HttpSession ss = request.getSession();
				
				String name = request.getParameter("rTemplate");
				 String department = request.getParameter("departments");
				String date = request.getParameter("templ_Date");
				// Section is the template name
				 String section1 = request.getParameter("sect1");
				
				
				String crit11 = request.getParameter("crit11");
				 int max11 = Integer.parseInt(request.getParameter("max11").toString());
				 String crit12 = request.getParameter("crit12");
				 int max12= Integer.parseInt(request.getParameter("max12").toString());
				 String crit13 = request.getParameter("crit13");
				 int max13 = Integer.parseInt(request.getParameter("max13").toString());
				 String crit14 = request.getParameter("crit14");
				 int max14 = Integer.parseInt(request.getParameter("max14").toString());
				 String crit15 = request.getParameter("crit15");
				 int max15 = Integer.parseInt(request.getParameter("max15").toString());
				
				 String section2 = request.getParameter("sect2");
				 String crit21 = request.getParameter("crit21");
				int max21 = Integer.parseInt(request.getParameter("max21").toString());
				 String crit22 = request.getParameter("crit22");
				 int max22 = Integer.parseInt(request.getParameter("max22").toString());
				 String crit23 = request.getParameter("crit23");
				 int max23 = Integer.parseInt(request.getParameter("max23").toString());
				
				 String section3 = request.getParameter("sect3");
				 String crit31 = request.getParameter("crit31");
				 int max31 = Integer.parseInt(request.getParameter("max31").toString());
				 String crit32 = request.getParameter("crit32");
				 int max32 = Integer.parseInt(request.getParameter("max32").toString());
				 String crit33 = request.getParameter("crit33");
				 int max33 = Integer.parseInt(request.getParameter("max33").toString());
				
				 
					
					ReportTemplDA.TemplateEntry(name, department, date, section1, section2, section3, crit11, max11, crit12, max12, crit13, max13, crit14, max14, crit15, max15, crit21, max21, crit22, max22, crit23, max23, crit31, max31, crit32, max32, crit33, max33);
					
					System.out.println("Data inserted");
				 
		doGet(request, response);
	}

}
