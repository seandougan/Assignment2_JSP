<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department Entry</title>
<style>
		input {
			margin: auto;
			display: block;
		}
		h1, p {
			text-align: center;
		}
</style>
</head>
<body>
<h1>Department Entry</h1>


	<% Boolean successCheck = (Boolean) request.getAttribute("successCheck");
		if (successCheck != null) {
			if (successCheck) {
			out.println("<b>Department entered successfully!</b>");
		}
			else {
				out.println("<b><i>Department entry failed.</i></b>");
			}
		}
	%>

<form action="EnterDepartmentServlet">
	<p><b>Department Name</b></p>
	<input type="text" name="deptName">
	<p><b>Department Floor</b></p><input type="text" name="floor">
	<input type="submit" value="Submit" name="action">
	<input type="submit" value="Home" name="action">
</form>
</body>
</html>