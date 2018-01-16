package michael;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ReportDA;
import database.ReportTemplDA;
 

@WebServlet("/ViewReportServlet")
public class ViewReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int primaryKey;
   
    public ViewReportServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/WEB-INF/ViewReport.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String button = request.getParameter("button");
		
		if (button.equals("View")) {
			primaryKey = Integer.parseInt(request.getParameter("reports").toString());
			List<ReportBean> ReportBean = new ArrayList<ReportBean>();
				List<ReportTemplBean> ReportTemplBean = new ArrayList<ReportTemplBean>();
				
				ReportTemplBean = ReportTemplDA.getReportTempl(primaryKey);
				ReportBean = ReportDA.getReport(primaryKey);
				
				
				request.setAttribute("Report", ReportBean);
				request.setAttribute("ReportTempl", ReportTemplBean);
		
		doGet(request, response);
	}

	}
}
