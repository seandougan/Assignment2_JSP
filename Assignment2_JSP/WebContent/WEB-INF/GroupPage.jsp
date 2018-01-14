<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Groups</title>
<style>
	h1 {
		text-align: center;
	}

</style>
</head>
<body>
	<h1>Groups</h1>
	<h3>Group Entry</h3>
	<form action="EnterGroupServlet">
		<input type="submit" value="Group Entry">
	</form>
	<h3>View Groups</h3>
	<form action="GroupViewServlet">
		<input type="submit" value="View Groups">
	</form>
</body>
</html>