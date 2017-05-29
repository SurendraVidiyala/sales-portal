package com.test.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.dao.UserDAO;
import com.test.dto.AnnouncementDTO;
import com.test.dto.UserDTO;


@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserLoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("psw");
		int userType=1;
		
		UserDAO dao = new UserDAO();
		boolean flag = dao.login(username, password, userType);
		if(flag)
		{
			HttpSession session = request.getSession();
			UserDTO dto = dao.getName(username);
			String name=dto.getName();
			int userId=dto.getUserId();
			session.setAttribute("name", name);
			session.setAttribute("userId", userId);
			
			ArrayList<AnnouncementDTO> msgs = dao.getUserMessages(userId);
			session.setAttribute("messages", msgs);
			
			response.sendRedirect("ClientsSearchController");
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("invalid", "Username or password are incorrect");
			rd.forward(request, response);
		}
		
		
		
		
	}

}
