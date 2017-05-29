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
import com.test.dto.ClientDTO;

@WebServlet("/ClientController")
public class ClientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClientController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ClientDTO client = new ClientDTO();
		client.setCompanyName(request.getParameter("cname"));
		client.setTelephone(request.getParameter("telphne"));
		client.setFax(request.getParameter("fax"));
		client.setAddress(request.getParameter("address"));
		client.setCity(request.getParameter("city"));
		client.setState(request.getParameter("state"));
		client.setZip(request.getParameter("zip"));
		client.setCountry(request.getParameter("country"));
		client.setDivision(request.getParameter("division"));
		client.setClient_type_id(Integer.parseInt(request.getParameter("client_type")));
		client.setIndustry(request.getParameter("industry"));
		client.setWebsite(request.getParameter("website"));
		client.setSource(request.getParameter("source"));
		client.setCompanyDesc(request.getParameter("companyDesc"));
		
		
		
		UserDAO dao = new UserDAO();
		int result = dao.createClient(client);
		
		session.setAttribute("createClientId", result);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("contacts.jsp");
		rd.forward(request, response);
		
	}

}
