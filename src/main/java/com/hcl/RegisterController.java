package com.hcl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.users.UserLoginDao;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String fname = request.getParameter("firstname");
			String lname = request.getParameter("lastname");
			String uname = request.getParameter("username");
			String pwd = request.getParameter("password");
			RequestDispatcher dispatcher = null;
			
			
			if (UserLoginDao.register(fname,lname,uname,pwd)) {
				dispatcher = request.getRequestDispatcher("register-success.jsp");
				dispatcher.forward(request, response);
			} else {
				dispatcher = request.getRequestDispatcher("register-failure.jsp");
				dispatcher.forward(request, response);                          
			}
			
		} 
			catch (Exception ex) {
				throw ex;
			}
	}

}
