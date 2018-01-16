<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import="java.sql.*" %>

<%@ page import="utility.Database" %>


    <!--  SCRIPTLET TO PRE-PROCESS BEFORE RENDER -->
    <%@ page import="utility.SessionAuthentication" %>
<% 
//GRAB SESSION
HttpSession ss = request.getSession();
//CHECK SESSION
if(SessionAuthentication.authenticateSession(ss)){
	System.out.println("User is not logged in or session expired, relog please");
	response.sendRedirect("index.jsp");
}
%>
<!-- AFTER PAGE VALIDATION LOAD DEPENDENCIES -->
 <%@ page import="utility.CookieFinder" %>
 <% CookieFinder ckF = new CookieFinder(); 
 
//INSTANTIATE SITE COOKIES INTO OBJECT
	Cookie[] cookies = request.getCookies();
 %>
 



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group Entry</title>
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
</style>


</head>
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />

<h1>View Groups</h1><br><br>
<h5>Select Department</h5>

	<form action="GroupViewServlet">
	 	<select id="selectedDepartment" name="selectedDepartment">
			<c:forEach items="${groups}" var="Groups">
				<option value="${Groups.getGroupDepartment()}" ${Groups.getGroupDepartment() == groupDepartment ? 'selected' : ''}> ${Groups.getGroupDepartment()}</option>
			</c:forEach>
		</select>
		<br>
		
		<c:if test="${groupDepartment != null}">
		<h5>Select Group</h5>
		<select id="selectedGroup" name="selectedGroup">
			<c:forEach items="${groupsFromDepartments}" var="GroupsFromDepartments">
		        <option value="${GroupsFromDepartments.getGroupName()}" ${GroupsFromDepartments.getGroupName() == groupName ? 'selected' : ''}>${GroupsFromDepartments.getGroupName()}</option>
			</c:forEach>
		</select>
		</c:if>
		
		
		<br>
		<input type="submit" name="ViewGroupButton" value="Search">
		<input type="submit" name="ViewGroupButton" value="Cancel">
	</form>
	<br>

	
<c:if test="${groupGroups != null && !groupGroups.isEmpty()}">
<table>
	<tr>
		<th> Department  </th>
		<th>  Group Name  </th>
		<th>  Employee Name  </th>
	</tr>
		<c:forEach items="${groupGroups}" var="GroupGroups">
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee1()}"/></td>
			</tr>
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee2()}"/></td>
			</tr>
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee3()}"/></td>
			</tr>
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee4()}"/></td>
			</tr>
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee5()}"/></td>
			</tr>
			<tr>
				<td><c:out value="${GroupGroups.getGroupDepartment()}"/></td>
				<td><c:out value="${GroupGroups.getGroupName()}"/></td>
				<td><c:out value="${GroupGroups.getGroupEmployee6()}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<br>
<br>
<form action="GroupViewServlet">
<input type="submit" name="ViewGroupButton" value="Home">
</form>

</body>
</html>