<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Departments</title>
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
	<jsp:include page="/WEB-INF/Banner.jsp" />
	<table align="center">
		<tr>
			<th>  Department Name  </th>
			<th>  Department Location/Floor  </th>
		</tr>
			<c:forEach items="${departments}" var="department">
				<tr>
					<td><c:out value="${department.name}"/></td>
					<td><c:out value="${department.floor}"/></td>
				</tr>
			</c:forEach>
	</table>
	<br>
	<br>
	
	<form action="ViewDepartmentsServlet"><input type="submit" value="Home"></form>
	

</body>
</html>