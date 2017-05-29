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
				  <a class="navbar-brand" href="main.html">
					<img src="images/logo.jpg" alt=" " />
				  </a>
				  <h1 href="#" class="title"><b>Sales Management Portal</b></h1>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse navbar-righ col-md-1 col-sm-1 col-xs-0" id="bs-example-navbar-collapse-1">
				  <ul class="nav navbar-nav">
					<li><a href="#">HI Charlie</a></li>
					<li class="flagWizard"><a href="#"><img src="images/usa.png" alt="" class="flag" /></a></li>
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
	<form>
	    <div class="form-group">
        <input type="search" class="col-md-10 col-sm-10 col-xs-6" id="search" placeholder="">
        <label for="search" class="col-md-2 col-sm-2 col-xs-6">Search</label>
    </div>
	</form>
	<div class="clearfix"></div>
	<ul class="clientlsit">
	<li><a href="addclient.html"><b>Add Client</b></a></li>
	<li><a href="#">Filter by </a>
	<ul >
	<li><input type="checkbox"> Client</li>
	<li><input type="checkbox"> Prospect</li>
	</ul>
	</li>
	</ul>
	</div>
	<div class="listdata">
	<ul>
	<li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li>
	<li><a href="">Angek Cibstruction LLC</a></li>
	<li><a href="">All-In-One Electronics co., Ltd.</a></li>
	<li><a href="">Aaron Insurance Inc.</a></li>
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
	<li ><a href="addclient.html">Genral Info</a></li>
	<li class="active"><a href="">Contacts</a></li>
	<li><a href="">Notes</a></li>
	<li><a href="">Opportunities</a></li>
	<li><a href="">Proposal</a></li>
	<li><a href="">Projects</a></li>	
	</ul>
	<div class="col-md-12 form1">

	<table class="table table-bordered">
	 <thead class="thead-default">
	<tr><th>First Name</th><th>Last Name</th><th>Title</th><th>Work Phone</th><th>Mobile Phone</th><th>Fax</th><th>eNews</th><th>Email</th></tr></thead>
	<tbody>
	<tr><td>Joe</td><td>Smith</td><td>VP</td><td>7091234567</td><td>6307654321</td><td>7087654321</td><td>Yes</td><td>jsmith@indianartsculture.org</td></tr>
	</tbody>
	
	</table>
	
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
  </body>
</html>