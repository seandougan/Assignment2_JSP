<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="utility.CookieFinder" %>
    <% CookieFinder ckF = new CookieFinder(); 
 
//INSTANTIATE SITE COOKIES INTO OBJECT
	Cookie[] cookies = request.getCookies();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <div class="navbar-brand" href="#">Company Employee Directory</div >
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Homepage.jsp">Home</a></li>
      <li>    
      <div class="btn-group">
  <button type="button" class="btn btn-lg btn-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Departments
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="EnterDepartments.jsp">Enter Department</a>
     <div class="dropdown-divider">
    <a class="dropdown-item" href="ViewDepartments.jsp">View Department</a>
    </div>

  </div>
	</div>  
  </li>
    <li>    
      <div class="btn-group">
  <button type="button" class="btn btn-lg btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Employees
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="EnterEmployee.jsp">Enter Employee</a>
     <div class="dropdown-divider">
    <a class="dropdown-item" href="ViewEmployee.jsp">View Employee</a>
    </div>
  </div>
	</div>  
  </li>
   <li>    
      <div class="btn-group">
  <button type="button" class="btn btn-lg btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Groups
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Enter Group</a>
    <div class="dropdown-divider">
      <a class="dropdown-item" href="#">View Group</a>
      </div>
  </div>
  </div>
	</div>  
  </li>
  <!-- Attendance -->
     <li>    
      <div class="btn-group">
  <button type="button" class="btn btn-lg btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Groups
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Enter Attendance</a>
    <div class="dropdown-divider">
      <a class="dropdown-item" href="#">View Attendance</a>
      </div>
  </div>
  </div>
	</div>  
  </li>
  <!-- MICHAELS PART -->
     <li>    
      <div class="btn-group">
  <button type="button" class="btn btn-lg btn-warning dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    Groups
  </button>
  <div class="dropdown-menu">
    <a class="dropdown-item" href="#">Enter Report</a>
    <div class="dropdown-divider">
      <a class="dropdown-item" href="#">View Report</a>
      </div>
  </div>
  </div>
	</div>  
  </li>
  <li class="pull-right">
  Logged in as <%= ckF.findCookie(cookies) %> | <a href="DestroySession">Logout</a>
  </li>
    </ul>
  </div>
</nav>

<!-- JQUERY 3.1 MIN BEFORE BOOTSTAP MIN.JS -->
<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="crossorigin="anonymous"></script>
<!-- BOOTSTRAP 337 JS DEPENDENCIES -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>