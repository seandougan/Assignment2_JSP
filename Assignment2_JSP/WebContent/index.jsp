<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- ################################### METADATA #################################################### -->
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="author" content="Sean Dougan">
	<meta name="keywords" content="employee, entry">
	<meta name="description" content="This page is responsible for entering employees into the database">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<title>Employee Directory Login</title>
</head>

<!-- ###################################### CONTENT ################################################## -->
<body>

<h1 class="text-center">Login</h1>

<div class="container-fluid text-center">
	<form class="form-horizontal" action="SystemEntry" method="post">
		<label>User Name</label>
		<div class="form-group">
			<input type="text" name="username">
		</div>
	
		<label>Password: </label>
		<div class="form-group">
		<input type="password" name="password">
		</div>
		
	<button type="submit" name="login" class="btn-primary">Login</button>
	</form>
</div>

<!-- BOOTSTRAP 337 JS DEPENDENCIES -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</body>
</html>