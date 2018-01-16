package michael;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.ReportDA;
import database.ReportTemplDA;


@WebServlet("/EnterReportServlet")
public class EnterReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int primaryKey;
	
    public EnterReportServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			System.out.println("Data inserted");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/EnterReport.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession ss = request.getSession();
		
		String button = request.getParameter("button");

		String target = "";
		
		
		if (button.equals("View")) {
		  primaryKey = Integer.parseInt(request.getParameter("reportTemps"));
			List<ReportTemplBean> ReportTemplBean = new ArrayList<ReportTemplBean>();
			ReportTemplBean = ReportTemplDA.getReportTempl(primaryKey);
			System.out.println( );
			request.setAttribute("ReportTempl", ReportTemplBean);
		}
		
		
		if (button.equals("Enter")) {
			int templ_ID_FK =  primaryKey;

		String name = request.getParameter("rep_Name");
		String date = request.getParameter("rep_Date");
	
		 String comment1 = request.getParameter("comment1");
		 String comment2 = request.getParameter("comment2");
		 String comment3 = request.getParameter("comment3");
		 
		 String type = request.getParameter("type");
		 
		
		 //condition ? inCaseOfTrue : elseCase;
		 
		
		int eva11 = (request.getParameter("eva11") != null) ? Integer.parseInt(request.getParameter("eva11").toString()) : 0;
		 
		int eva12 = (request.getParameter("eva12") != null) ? Integer.parseInt(request.getParameter("eva12").toString()) : 0;
		 
		int eva13 = (request.getParameter("eva13") != null) ? Integer.parseInt(request.getParameter("eva13").toString()) : 0;
		 
		int eva14 = (request.getParameter("eva14") != null) ? Integer.parseInt(request.getParameter("eva14").toString()) : 0;
		 
		int eva15 = (request.getParameter("eva15") != null) ? Integer.parseInt(request.getParameter("eva15").toString()) : 0;
		 
		
		if (type.equals("employee")){
			 target = request.getParameter("employees");
			
		}else if(type.equals("group")) {
			
			 target = request.getParameter("groups");
		}

		 
		int eva21 = (request.getParameter("eva21") != null) ? Integer.parseInt(request.getParameter("eva21").toString()) : 0;
		 
		int eva22 = (request.getParameter("eva22") != null) ? Integer.parseInt(request.getParameter("eva22").toString()) : 0;
		
		int eva23 = (request.getParameter("eva23") != null) ? Integer.parseInt(request.getParameter("eva23").toString()) : 0;
		  
		 
		 
		int eva31 = (request.getParameter("eva31") != null) ? Integer.parseInt(request.getParameter("eva31").toString()) : 0;
		 
		int eva32 = (request.getParameter("eva32") != null) ? Integer.parseInt(request.getParameter("eva32").toString()) : 0;
		 
		int eva33 = (request.getParameter("eva33") != null) ? Integer.parseInt(request.getParameter("eva33").toString()) : 0;

		
			
	
			ReportDA.ReportEntry(name, date, comment1, comment2, comment3, type, target, eva11, eva12, eva13, eva14, eva15, eva21, eva22, eva23, eva31, eva32, eva33,templ_ID_FK);
			System.out.println("Data inserted");

		}
		
		doGet(request, response);
	}

}
