<%@page import="com.test.dto.ClientDTO"%>
<%@page import="com.test.dto.AnnouncementDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Welcome to our website</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">

<script>
	function hi()
	{
		document.forms[0].method="get";
		document.forms[0].action="ClientsSearchController";
		document.forms[0].submit();
	}
</script>
  
  </head>
  <body>
  <form action="">
  
  <div class="wizardCont">
	
		<nav class="navbar navbar-default gsuNav">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header col-md-9 col-sm-8 col-xs-0">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				  <a class="navbar-brand" href="main.html">
					<img src="images/logo.jpg" alt=" " />
				  </a>
				  <h1 href="#" class="title"><b>Sales Management Portal</b></h1>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-righ col-md-1 col-sm-1 col-xs-0" id="bs-example-navbar-collapse-1">
				  <ul class="nav navbar-nav">
					<li><a href="#"><%= session.getAttribute("name") %></a></li>
					<li class="flagWizard"><a href="#"><img src="images/usa.png" alt="" class="flag" /></a></li>
				  <li><a href="index.html">Logout</a></li>
				  </ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav>
		
	</div>
	<div class="row">
	<div class="mainwrap">
	<div class="col-md-3">
	<div class="leftwrap">
	<div class="row searchbox">
	
	    <div class="form-group">
        <input type="search" class="col-md-10 col-sm-10 col-xs-6" id="search" placeholder="companyName" name="companyName">
        <label for="search" class="col-md-2 col-sm-2 col-xs-6"  onclick="hi();">Search</label>
    </div>
	
	<div class="clearfix"></div>
	<ul class="clientlsit">
	
	<li><a href="#">Filter by </a>
	<ul >
	<li><input type="checkbox" name="clientChk"> Client</li>
	<li><input type="checkbox" name="prospectChk"> Prospect</li>
	</ul>
	</li>
	</ul>
	</div>
	<div class="listdata">
	<ul>
	<%
	ArrayList<ClientDTO> aal =(ArrayList<ClientDTO>) session.getAttribute("clientsSearch");
		for(ClientDTO a: aal)
		{
			out.println("<li><a> "+a.getCompanyName()+"</a></li>");
		}
	%>
	<!-- <li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li> -->
	</ul>
	</div>
	</div>
	</div>
	<div class="col-md-9">
	<div class="rightwrap">
	<div class="col-md-12 rightdata">
	<h3>Available Job Positions</h3>
	<!-- <div class="rightdata">
	<p>8/18/2016</p>
	<p>Big Configuration to out mobile team for winning a 3,000,000 contract with China Telecom.</p>
	</div>
	<div class="rightdata">
	<p>8/15/2016</p>
	<p>Semi-annual sales meeting is on 9/15/2016.</p>
	</div> -->
	
	<% 
	ArrayList<AnnouncementDTO> al = (ArrayList<AnnouncementDTO>)request.getAttribute("aaa");
	for(AnnouncementDTO dto:al)
	{
		out.println("<div class='rightdata'>");
		out.println("<p>"+dto.getMessage()+"</p>");
		//out.println("<p>"+dto.getDate()+"</p>");
		out.println("</div>");
	}
	%>
	</div>
	<div>
	<ul>
	<li><h3><a href="contacts.html">Contact HR for Job Reference</a></h3></li>
	<li><h3><a href="form.html">Fill the Job Application</a></h3></li>
	</ul>
	</div>
	</div>
	</div>
	<div class="clearfix"></div>
	</div>
	</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </form>
  </body>
</html>