<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="utility.Database" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Report</title>
</head>
<body>
<h3 align="left">Quick Filter</h3>

<select name="reportTemps" id="Templ">

<% Connection con = Database.startConnection();
ResultSet rs = null;
Statement statement = null;
String query = "SELECT template_name FROM REPORT_TEMPLATE";
String reportTemp_Name = request.getParameter("reportTemp_Name");
System.out.println(reportTemp_Name);
statement = con.createStatement();
rs = statement.executeQuery(query);	
%>
</head>

<body>


<div>

<%
while (rs.next()) {
%>


<option value = '<%=rs.getString("template_name")%>' > <%=rs.getString("template_name")%></option>


<% }
con.close();
statement.close();
rs.close();
%>
</select>


<select name="Select Department">
  <option value="1">1</option>

</select>

<select name="Select Report Title">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>

<input type="button" value="View" onclick="View()"> 

<input type="button" value="Cancel" onclick="Cancel()">

<div id="viewReport">

<p> View Report Here</p>

<table>

<c:forEach items="${report}" var="report">
			<tr>
				<td><c:out value="${report.name}" /></td>
				<td><c:out value="${report.date}" /></td>
					<td><c:out value="${report.section1}" /></td>
			</tr>
		</c:forEach>
</table>

</div>

</body>
</html>