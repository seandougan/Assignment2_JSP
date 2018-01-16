<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="utility.Database" %>
<%@ page import="java.sql.*" %>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Report</title>
<style>

body{

 background-color: #E0EEEE;
}


#section{
margin-bottom: 0.5em;
border-bottom: 1px solid #aaa;
padding: 0.5em 0 1em 0;
border: "solid";
}

</style>




<script>



</script>

</head>

<body>

<form method="post">


<select name="reportTemps" id="rTempl" value="View">

<% Connection con = Database.startConnection();
ResultSet rs = null;
ResultSet rs2 = null;
ResultSet rs3 = null;
ResultSet rs4 = null;
Statement statement = null;
String query1 = "SELECT * FROM REPORT_TEMPLATE";
String query2 = "SELECT * FROM DEPARTMENT";
String query3 = "SELECT * FROM EMPLOYEE";
String query4 = "SELECT * FROM GROUPS";
String reportTemp_Name = request.getParameter("reportTemp_Name");
System.out.println(reportTemp_Name);
statement = con.createStatement();
rs = statement.executeQuery(query1);


%>
<%
while (rs.next()) {
%>


<option value = '<%=rs.getInt("template_ID")%>'  > <%=rs.getString("template_name")%></option>



<% } %>


</select>
<input type = "submit" value = "View" name="button" />
</form>


<form method="post">
<span id="title">Report Title: <input type="text" name="rep_Name"></input> </span>




<%
rs2 = statement.executeQuery(query2);
%>

<p>Department:

<select name="departments">
<%
while (rs2.next()) {
%>
<option value = '<%=rs2.getString("department_Name")%>'  > <%=rs2.getString("department_Name")%></option>
<%} %>

</select> </p>





<p>Report Type:<input type="radio" name="type" value="group"> Group</input></p></li>

<p><input type="radio" name="type" value="employee"  >Employee </input></p>


<select name="employees">




<%
rs3 = statement.executeQuery(query3);
while (rs3.next()) {
%>
<option id="Employee" value = '<%=rs3.getString("employee_ID")%>' > <%=rs3.getString("employee_FirstName")%></option>


<%} %>



</select>

<select  name="groups">

<%
rs4 = statement.executeQuery(query4);
while (rs4.next()) {
%>


<option value = '<%=rs4.getString("group_Name")%>' > <%=rs4.getString("group_Name")%></option>





<%} %>
</select>



<%
con.close();
statement.close();
rs.close();
%>



<c:forEach items="${ReportTempl}" var="Templ">

<br> <span id="date">Date: <input type="text" name="rep_Date" value="<c:out value="${Templ.getDate()}"/>"></input> </span>


<div id="section">
<span>Section I<input type="text" name="sect1" value="<c:out value="${Templ.getSection1()}"/>" readonly></input></span>
<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit11" value="<c:out value="${Templ.getCrit11()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva11">
	
	<c:forEach var = "i" begin = "1" end = "${Templ.getMax11()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
	
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit12" value="<c:out value="${Templ.getCrit12()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva12">
 <c:forEach var = "i" begin = "1" end = "${Templ.getMax12()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit13" value="<c:out value="${Templ.getCrit13()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva13">
 <c:forEach var = "i" begin = "1" end = "${Templ.getMax13()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>														<br> 
	<span>Criteria 4</span> <input type="text" name="crit14" value="<c:out value="${Templ.getCrit14()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva14">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax14()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>													<br> 
	<span>Criteria 5</span> <input type="text" name="crit15" value="<c:out value="${Templ.getCrit15()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva15">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax15()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>
	</td>
</tr>

</table>
<input type="text" id="text" name="comment1" style="width: 100px; height: 100px; align:right" />
</div>


<div id="section">
<span>Section II<input type="text" name="sect2" value="<c:out value="${Templ.getSection2()}"/>" readonly></input></span>
<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit21" value="<c:out value="${Templ.getCrit21()}"/>" readonly></input>
<label><span>Evaluation </span></label><select name="eva21">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax21()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit22" value="<c:out value="${Templ.getCrit22()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva22">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax22()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit23" value="<c:out value="${Templ.getCrit23()}"/>" readonly></input>
		<label><span>Evaluation </span></label><select name="eva23">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax23()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>														

</table>
<input type="text" id="text" name="comment2" style="width: 100px; height: 100px; align:right" />
</div>


<div id="section">
<span>Section III<input type="text" name="sect3" value="<c:out value="${Templ.getSection3()}"/>" readonly></input></span>
<table align="center">

<tr id="sect3">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit31" value="<c:out value="${Templ.getCrit31()}"/>" readonly></input>
<label><span>Evaluation </span></label><select name="eva31">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax31()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit32" value="<c:out value="${Templ.getCrit32()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva32">
  <c:forEach var = "i" begin = "1" end = "${Templ.getMax32()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit33" value="<c:out value="${Templ.getCrit33()}"/>" readonly></input>
			<label><span>Evaluation </span></label><select name="eva33">
 <c:forEach var = "i" begin = "1" end = "${Templ.getMax33()}">
        <option value= "<c:out value ="${i}"/>">${i}</option>
      </c:forEach>
</select>														<br> 

</table>
<input type="text" id="text" name="comment3" style="width: 100px; height: 100px; align:right" />
</div>
</c:forEach>
<input type = "submit" value="Enter" name="button" />
</form>


</body>
</html>