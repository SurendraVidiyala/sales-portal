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
import com.test.dto.OpportunityDTO;

@WebServlet("/OpportunitiesController")
public class OpportunitiesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OpportunitiesController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		OpportunityDTO opprunity=new OpportunityDTO();
		
	opprunity.setOpporName(request.getParameter("oname"));
	opprunity.setAddedBy(request.getParameter("addedby"));
	opprunity.setAddedDate(request.getParameter("addDate"));
	opprunity.setChanceToClose(request.getParameter("close"));
	opprunity.setEstimatedBudget(Double.parseDouble(request.getParameter("budget")));
	opprunity.setOpporDuraration(request.getParameter("duration"));
	opprunity.setOpporType(request.getParameter("otype"));
	opprunity.setContactName(request.getParameter("cname"));
	opprunity.setContactTel(request.getParameter("ctel"));
	//opprunity.setWebsite(request.getParameter("website"));
	opprunity.setOpporDesc(request.getParameter("odesc"));
	opprunity.setOpporNotes(request.getParameter("onotes"));
	
	
	int i =(int)session.getAttribute("createClientId");
	
	int j=(int)session.getAttribute("userId");
	opprunity.setClientId(i);
	opprunity.setUserId(j);
	
	UserDAO dao = new UserDAO();
	dao.addOpportunity(opprunity);
	
	RequestDispatcher rd = request.getRequestDispatcher("Proposals.jsp");
	rd.forward(request, response);
	}

}
