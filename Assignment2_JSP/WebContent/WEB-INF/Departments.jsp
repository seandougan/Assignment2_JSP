<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Departments</title>
<style>
input {
	margin: auto;
	display: block;
}

h1, h2 {
	text-align: center;
}
</style>
</head>
<body>
	<h1>Departments Page</h1>

	<h2>Choose a page to go to</h2>
	<form action="DepartmentsServlet">
		<input type="submit" name="pageSelect" value="Enter Department">
		<input type="submit" name="pageSelect" value="View Departments">
	</form>
</body>
</html>