package br.org.eduqiservice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.org.eduqiservice.control.CepControl;

/**
 * Servlet implementation class CepProvider
 */
public class CepProvider extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CepProvider() {
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
		
		 
		
		String jsonCallbackParam = request.getParameter("callback");
		Gson gson = new Gson();
		String result = gson.toJson(CepControl.getCEP(id));
		
		if(jsonCallbackParam != null){
			result =jsonCallbackParam+"(" + result+")";
		}
		if(result != null){
			response.getWriter().write(result);
			response.flushBuffer();
			
		}

	}

}
