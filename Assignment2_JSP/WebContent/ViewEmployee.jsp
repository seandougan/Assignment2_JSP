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

<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employees</title>
</head>
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />

<select name="departments" id="depomans">

<% Connection con = Database.startConnection();

ResultSet rs = null;
Statement statement = null;
String query = "SELECT department_Name FROM department";

statement = con.createStatement();
rs = statement.executeQuery(query);	
%>

<%
while (rs.next()) {
%>

<option value = '<%=rs.getString("department_Name")%>'><%=rs.getString("department_Name")%></option>

<% } %>
</select>

</body>
</html>