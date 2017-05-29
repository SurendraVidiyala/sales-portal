<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">

  
  </head>
  <body>
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
				  <a class="navbar-brand" href="#">
					<img src="images/logo.jpg" alt=" " />
				  </a>
				  <h1 href="#" class="title"><b>Sales Management Portal</b></h1>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-righ col-md-1 col-sm-1 col-xs-0" id="bs-example-navbar-collapse-1">
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav>
		
	</div>
	<form action="ManagerLoginController" method="post">
	
		<div class="row">
	<div class="container" color='red'>
		<%  
		if(request.getAttribute("invalid")!=null){
		%>
		<label ><b><%= request.getAttribute("invalid") %></b></label>  
		<% }%>
  </div>

	</div>
	
	
	
		<div class="row">
	<div class="container">
    <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required><br>

    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required><br>

    <button type="submit">Login</button>
    
  </div>

	</div>
		
	</form>
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>