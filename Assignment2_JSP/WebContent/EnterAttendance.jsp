<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="utility.SessionAuthentication" %>
<%@ page import="utility.Database" %>
<%@ page import="java.sql.*" %>
<% 
//GRAB SESSION
HttpSession ss = request.getSession();
//CHECK SESSION
if(SessionAuthentication.authenticateSession(ss)){
	System.out.println("User is not logged in or session expired, relog please");
	response.sendRedirect("index.jsp");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
span {
    border-top: 1px solid #333;
    width: 100%;
    height: 1px;
    display: block;
}

table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employees</title>
</head>
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />

<h1 class="text-center">Enter Attendance</h1>
<h4 class="text-center">Search by Department</h4>

<form method="post" action="EnterAttendance.jsp" class="text-center">
<select name="departments" id="depomans">

<% Connection con = Database.startConnection();

ResultSet rs = null;
Statement statement = null;
String query = "SELECT department_Name FROM department";
String departmentName = request.getParameter("departments");
System.out.println(departmentName);

statement = con.createStatement();
rs = statement.executeQuery(query);	
%>

<%
while (rs.next()) {
%>

<option value = '<%=rs.getString("department_Name")%>'><%=rs.getString("department_Name")%></option>


<% }

con.close();
statement.close();
rs.close();
%>
</select>
		<input type="submit" name="subView" value="Search">	
		</form>	
</select>
<span></span>
<table>
  <tr>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Number</th>
<th>present</th>
  </tr>

<%

	Connection con2 = Database.startConnection();

	ResultSet rs2 = null;
	Statement st2 = null;
	String query2 = "SELECT * FROM employee WHERE department_ID_FK = " +
			"(SELECT department_ID FROM department WHERE department_Name = '" +
			departmentName + "')";
	st2 = con2.createStatement();
	rs2 = st2.executeQuery(query2);	
	// NEED TO USE int NUMBER NOT NAME READD SUBU
	int x=1;
	
	int[] numOfX = {x};
while (rs2.next()) {
%>
  <form action="AttendanceServlet" method="post">
<tr>
	<td><input type="text" value="<%= rs2.getString("employee_FirstName") %>" readonly></td>
	<td><input type="text" value="<%= rs2.getString("employee_LastName") %>" readonly></td>
	<td><input type="text" value="<%= rs2.getString("employee_PhoneNumber") %>" readonly></td>
	<td><input id="checkBox<%= x %>" type="checkbox"></td>
</tr>

<% x++;} 

%>

</table>
<input type="submit" class="text-center" value="Add Attendence">
</form>
<%

%>
</body>
</html>