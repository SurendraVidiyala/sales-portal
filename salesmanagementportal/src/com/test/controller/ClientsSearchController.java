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
import com.test.dto.ClientDTO;

@WebServlet("/ClientsSearchController")
public class ClientsSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ClientsSearchController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companyName = request.getParameter("companyName");
		String clientType = "";
		
		String addClientCheck = request.getParameter("addClient");
		
		UserDAO dao = new UserDAO();
		
		HttpSession session = request.getSession(false);
		ArrayList<AnnouncementDTO> aa=(ArrayList<AnnouncementDTO>)session.getAttribute("messages");
		
		System.out.println("AAAAAA SIZE:::"+aa.size());
		
		
		String clientChk = request.getParameter("clientChk");
		String prospectChk = request.getParameter("prospectChk");
		
		if(clientChk==null && prospectChk==null)
		{
			clientType = "";
		}
		else if(clientChk!=null && prospectChk!=null)
		{
			clientType = "";
		}
		else if(clientChk!=null)
		{
			clientType = "1";
		}
		else
		{
			clientType = "2";
		}
		
		ArrayList<ClientDTO> aal=dao.searchClients(companyName, clientType);
		
		System.out.println("START");
		for(ClientDTO aaa:aal)
		{
			System.out.println(aaa.getClientId()+"\t"+aaa.getCompanyName());
		}
		System.out.println("END");
		
		String username = "";
		
		request.setAttribute("aaa", aa);
		session.setAttribute("clientsSearch", aal);
		
		
		System.out.println("Search input data: "+companyName+"\t"+clientChk+"\t"+prospectChk);
		String target = "main.jsp";
		if(addClientCheck!=null)
		{
			target = "addclient.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
