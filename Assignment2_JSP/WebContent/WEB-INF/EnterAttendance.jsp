<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Attendance</title>
	<style>
		h1{
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
	<jsp:include page="/WEB-INF/Banner.jsp" />
	<h1>Enter Attendance</h1>
	<form action="EnterAttendanceServlet">
		<select name="deptId" >
			<c:forEach items="${departments}" var="department">
				<option value="${department.departmentId}"><c:out value="${department.name}"/></option>
			</c:forEach>
		</select>
		<input type="submit" name="action" value="Get Attendance">
	</form> 
	
	<form action="EnterAttendanceServlet">
		<table>
			<tr>
				<th>Employee Num.</th>
				<th>Last Name</th>
				<th>First Name</th>
				<th>December 1, 2017</th>
				<th>December 3, 2017</th>
				<th>December 4, 2017</th>
			</tr>
			<c:forEach items="${attendances}" var="attendance">
				<tr>
					<td><c:out value="${attendance.employeeId}"/></td>
					<td><c:out value="${attendance.lastName}"/></td>
					<td><c:out value="${attendance.firstName}"/></td>
					<td><input type="checkbox" value="${attendance.present1}"></td>
					<td><input type="checkbox" value="${attendance.present2}"></td>
					<td><input type="checkbox" value="${attendance.present3}"></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" name="action" value="Submit">
	</form>
</body>
</html>