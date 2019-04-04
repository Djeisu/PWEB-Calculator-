package app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.model.Equation;
import app.services.EquationService;

/**
 * Servlet implementation class EquationServlet
 */
@WebServlet(
		name = "EquationServlet",
		urlPatterns = "/result"
		)
public class EquationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EquationService equationService = new EquationService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EquationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String type = request.getParameter("type");
    	
    	if(type != null){
    		double value1 = Double.parseDouble(request.getParameter("value1"));
        	double value2 = Double.parseDouble(request.getParameter("value2"));
        	equationService.getResult(new Equation(type, value1, value2))
        		.ifPresent(r -> request.setAttribute("equationResult", r));
        }
 
        RequestDispatcher dispatcher = request.getRequestDispatcher(
          "/WEB-INF/equation-result.jsp");
        
        dispatcher.forward(request, response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	processRequest(request, response);
	}

}
