package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.dao.UserDAO;
import com.test.dto.ContactsDTO;

@WebServlet("/ContactsController")
public class ContactsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ContactsController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ContactsDTO contacts=new ContactsDTO();
		contacts.setFirstName(request.getParameter("fname"));
		contacts.setLastName(request.getParameter("lname"));
		contacts.setTitle(request.getParameter("title"));
		contacts.setWorkPhone(request.getParameter("wphn"));
		contacts.setMobilePhone(request.getParameter("mphn"));
		contacts.setFax(request.getParameter("fax"));
		contacts.seteNews(request.getParameter("enews"));
		contacts.setEmail(request.getParameter("email"));
		
		int i =(int)session.getAttribute("createClientId");
		contacts.setClientId(i+"");
		
		UserDAO dao = new UserDAO();
		dao.addClientContactDetails(contacts);
		
		RequestDispatcher rd = request.getRequestDispatcher("Opportunities.jsp");
		rd.forward(request, response);
		
	}

}
