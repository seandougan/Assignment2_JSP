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
 
    public EnterReportServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			System.out.println("Data inserted");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/EnterReport.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ReportTemplBean> ReportTemplBean = new ArrayList<ReportTemplBean>();
		ReportTemplBean = ReportTemplDA.getReportTempl();
		request.setAttribute("ReportTempl", ReportTemplBean);
		
		HttpSession ss = request.getSession();
		
		String name = request.getParameter("rep_Name");
		String date = request.getParameter("rep_Date");
	
		 String comment1 = request.getParameter("comment1");
		 String comment2 = request.getParameter("comment2");
		 String comment3 = request.getParameter("comment3");
		 
		 String type = request.getParameter("type");
		 String target = request.getParameter("target");
		
		
		
		 int eva11 = Integer.parseInt(request.getParameter("eva11").toString());
		 
		 int eva12= Integer.parseInt(request.getParameter("eva12").toString());
		 
		 int eva13 = Integer.parseInt(request.getParameter("eva13").toString());
		 
		 int eva14 = Integer.parseInt(request.getParameter("eva14").toString());
		 
		 int eva15 = Integer.parseInt(request.getParameter("eva15").toString());
		
		 
		 
		 int eva21 = Integer.parseInt(request.getParameter("eva21").toString());
		 
		 int eva22 = Integer.parseInt(request.getParameter("eva22").toString());
		 
		 int eva23 = Integer.parseInt(request.getParameter("eva23").toString());
		
		 
		 
		 int eva31 = Integer.parseInt(request.getParameter("eva31").toString());
		 
		 int eva32 = Integer.parseInt(request.getParameter("eva32").toString());
		 
		 int eva33 = Integer.parseInt(request.getParameter("eva33").toString());
		
		 
			
			ReportDA.ReportEntry(name, date, comment1, comment2, comment3, type, target, eva11, eva12, eva13, eva14, eva15, eva21, eva22, eva23, eva31, eva32, eva33);
			
		doGet(request, response);
	}

}
