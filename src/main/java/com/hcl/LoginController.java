package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.users.UserLoginDao;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		RequestDispatcher dispatcher = null;
		if (UserLoginDao.validate(uname,pwd)) {
			dispatcher = request.getRequestDispatcher("login-success.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("login-failure.jsp");
			dispatcher.forward(request, response);                          
		}
		
		} catch (Exception ex) {
			throw ex;
		}
		
	}

}
