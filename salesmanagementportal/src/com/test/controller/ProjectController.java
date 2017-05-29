package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.dao.UserDAO;
import com.test.dto.Project;

@WebServlet("/ProjectController")
public class ProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public ProjectController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Project project=new Project();
		HttpSession session = request.getSession(false);
		project.setAddedDate(request.getParameter("dateadded"));
		project.setContactName(request.getParameter("cname"));
		project.setContactTel(request.getParameter("ctel"));
		project.setLaunchDate(request.getParameter("ldate"));
		project.setProjectAmount(Double.parseDouble(request.getParameter("pamount")));
		project.setProjectDesc(request.getParameter("pdesc"));
		project.setProjectDuration(request.getParameter("pdur"));
		project.setProjectMgr(request.getParameter("pmanager"));
		project.setProjectName(request.getParameter("pname"));
		project.setProjectStatus(request.getParameter("pstatus"));
		project.setProjectNotes(request.getParameter("pnotes"));
		project.setTotalRevenue(Double.parseDouble(request.getParameter("total")));
		
		int i =(int)session.getAttribute("createClientId");
		project.setClientId(i);
		
		UserDAO dao = new UserDAO();
		dao.addProjects(project);
		
		response.sendRedirect("success.jsp");
		
	}

}
