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
import com.test.dto.ProposalDTO;

@WebServlet("/ProposalsController")
public class ProposalsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProposalsController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		ProposalDTO proposal=new ProposalDTO();
		proposal.setAccountMgr(request.getParameter("pmngr"));
		proposal.setAddedDate(request.getParameter("padd"));
		proposal.setChanceToClose(request.getParameter("close"));
		proposal.setContactName(request.getParameter("cname"));
		proposal.setContactTel(request.getParameter("ctel"));
		proposal.setEstimatedBudget(Double.parseDouble(request.getParameter("budget")));
		proposal.setProposalAmount(Double.parseDouble(request.getParameter("pamnt")));
		proposal.setProposalDesc(request.getParameter("pdesc"));
		proposal.setProposalDuration(request.getParameter("pdur"));
		proposal.setProposalName(request.getParameter("pname"));
		proposal.setProposalNotes(request.getParameter("pnote"));
		proposal.setProposalStatus(request.getParameter("pstatus"));
		proposal.setRejectionReason(request.getParameter("preason"));
		proposal.setTotalRevenue(Double.parseDouble(request.getParameter("total")));
		
		int i =(int)session.getAttribute("createClientId");
		
		UserDAO dao = new UserDAO();
		dao.addProposal(proposal);
		
		RequestDispatcher rd = request.getRequestDispatcher("Projects.jsp");
		rd.forward(request, response);
		
	}

}
