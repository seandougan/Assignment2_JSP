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
		h1, b {
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
	<b>Department Name</b><input type="text" name="deptName">
	<b>Department Floor</b><input type="text" name="floor">
	<input type="submit" value="Submit">
</form>
</body>
</html>