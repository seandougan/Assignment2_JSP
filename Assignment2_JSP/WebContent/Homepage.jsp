<!--  LANDING PAGE -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
<!--  ################################### META ######################################################## -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<!-- ################################################################################################## -->
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />

<h1 class="text-center">Welcome Back
<%= ckF.findCookie(cookies) %>!
</h1>		

</body>
</html>