<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table {
	    border-collapse: collapse;
	    text-align: center;
	}
	
	td, th {
	    border: 1px solid black;
	    text-align: left;
	    padding: 1px;
	}
	h1 {
		text-align: center;
	}
	input {
		margin: auto;
		display: block;
	}
</style>
</head>
<body>

<h1>View Departments</h1>

<table align="center">
	<tr>
		<th>  Department Name  </th>
		<th>  Department Location/Floor  </th>
	</tr>
</table>
<br>
<br>

<form action="ViewDepartmentsServlet"><input type="submit" value="Home"></form>


</body>
</html>