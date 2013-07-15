package br.org.eduqiservice.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import br.org.eduqiservice.control.InvestmentController;

/**
 * Servlet implementation class QuestServlet
 */
public class QuestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(QuestServlet.class);
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-cache");
		
		 int id = Integer.parseInt(request.getParameter("idEscola"));
		
		 log.info("Pesquisando escola: id="+ id+" .");
		
		String jsonCallbackParam = request.getParameter("callback");
		String result = InvestmentController.giveSchoolStatistics(id);
		
		if(jsonCallbackParam != null){
			result =jsonCallbackParam+"(" + result+")";
		}
		if(result != null){
			response.getWriter().write(result);
			response.flushBuffer();
			
		}

	}

}
