<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


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
 
<html>
<head> 
<title>Groups</title>
</head>
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />


<form action = "EnterGroupServlet" method = "post">
	<h1>Group Entry</h1>
	<p><c:out value = "${message}"/><p>

	Department: 
	 <select id="selectedDepartment" name="selectedDepartment">
		<c:forEach items="${departments}" var="Departments">
			<option value="${Departments.getName()}"> ${Departments.getName()}</option>
		</c:forEach>
	</select>
				<br><br>
		Group Name: <input type = "text" name = "groupName" value = "" > <br><br><br>
		
		Employee 1: 
		<select id="selectedEmployee1" name="selectedEmployee1">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
				
		Employee 2: 
		<select id="selectedEmployee2" name="selectedEmployee2">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
		Employee 3: 
		<select id="selectedEmployee3" name="selectedEmployee3">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
		<br>
		Employee 4: 
		<select id="selectedEmployee4" name="selectedEmployee4">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
		Employee 5: 
		<select id="selectedEmployee5" name="selectedEmployee5">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
		Employee 6: 
		<select id="selectedEmployee6" name="selectedEmployee6">
			<c:forEach items="${employees}" var="Employees">
				<option value="${Employees.getName()}"> ${Employees.getName()}</option>
			</c:forEach>
		</select>
				<br><br><br>
				
			<input type = "Submit" name = "GroupEnterButton" value = "Submit">
			<input type = "Submit" name = "GroupEnterButton" value = "Cancel">
	</form>
	<form action="GroupViewServlet">
 <input type="submit" name="ViewGroupButton" value="Home">
</form>
		
</body>
</html>