
<%@page import="com.test.dto.ClientDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

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
  <form action="ClientController" method="post">
  	<input type='hidden' name='addClient' value='addClient'>
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
      
       
    </div>
	
	<div class="clearfix"></div>
	<ul class="clientlsit">
	
	<ul >
	
	</ul>
	</li>
	</ul>
	</div>
	<div class="listdata">
	<h2><a href="add.jsp"><b>Add Client</b></a></h2>
	<ul>
	
	
	
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
<h4>Client Information - Indian Arts & Culture</h4>
	</div>
	<ul class="nav navbar-nav navigator infonav">
	<li class="active"><a href="">Genral Info</a></li>
	<li><a href="contacts.html">Contacts</a></li>
	<li><a href="">Notes</a></li>
	<li><a href="">Opportunities</a></li>
	<li><a href="">Proposal</a></li>
	<li><a href="">Projects</a></li>	
	</ul>
	<div class="col-md-12 form1">
	
	<div class="form-horizontal" role="form">
	
	<div class="col-md-6">
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Company Name</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="cname" name="cname">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Telephone</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="telphne">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Fax</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="fax">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Address</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="address">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">City</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text"  name="city">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">State</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="state">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Zip Code</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="zip">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Country</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="country">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Divison</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="division">
									</div>
								</div>
						
							
	</div>
	<div class="col-md-6">
	<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Type</label>
									</div>
									<div class="col-lg-10">
										<select name="client_type">
											<option value="1">Client</option>
											<option value="2">Prospect</option>
										</select>
									</div>
								</div>
	<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Industry</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="industry">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Web Site</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="website">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-2">
									<label for="inputEmail1" class="control-label pull-right">Source</label>
									</div>
									<div class="col-lg-10">
										<input class="form-control" id="inputEmail1" type="text" name="source">
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-offset-1 col-lg-10">
									<label for="inputEmail1" class="control-label ">Company Description</label>
									</div>
									<div class="col-lg-offset-1 col-lg-11 text-center">
										<textarea cols="100" rows="9" name="companyDesc"></textarea>
									</div>
								</div>
								
								<div class="form-group">
									<div class="col-lg-offset-1 col-lg-11 text-center">
										<input type="submit" value="Next"/>
									</div>
								</div>
	</div>
	</div>
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