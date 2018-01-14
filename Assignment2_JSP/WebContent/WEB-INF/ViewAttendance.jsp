<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Enter Attendance</title>
	<style>
		input {
			margin: auto;
			display: block;
		}
		h1 {
			text-align: center;
		}
		
		table {
		    border-collapse: collapse;
		    text-align: center;
		}
		
		td, th {
		    border: 1px solid black;
		    text-align: left;
		    padding: 1px;
		}
	</style>
</head>
<body>
	<h1>View Attendance</h1>
	<select>
		<c:forEach items="${departments}" var="department">
			<option><c:out value="${department.name}"/></option>
		</c:forEach>
	</select>
	
	<table>
		<tr>
			<th>Last Name</th>
			<th>First Name</th>
			<th>Employee Num.</th>
			<th>December 1, 2017</th>
			<th>December 3, 2017</th>
			<th>December 4, 2017</th>
		</tr>
	</table>
</body>
</html>