<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Attendance</title>
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
	<h1>Attendance Page</h1>
	
	<h2>Choose a page to go to</h2>
	 <form action="AttendanceServlet">
	 	<input type="submit" name="pageSelect" value="Enter Attendance"> 
	 	<input type="submit" name="pageSelect" value="View Attendance">
	 </form>
</body>
</html>