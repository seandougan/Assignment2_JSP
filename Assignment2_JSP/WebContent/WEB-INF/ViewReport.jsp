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
</head>
<body>
<h3 align="left">Quick Filter</h3>



</head>

<body>


<div>

<form method="post">
<select name="reports" id="rep" value="View">

<% Connection con = Database.startConnection();
ResultSet rs = null;

Statement statement = null;
String query1 = "SELECT * FROM REPORT";

String report_Name = request.getParameter("rep_Name");
System.out.println(report_Name);
statement = con.createStatement();
rs = statement.executeQuery(query1);


%>
<%
while (rs.next()) {
%>


<option value = '<%=rs.getString("templ_ID_FK")%>'  > <%=rs.getString("rep_Name")%></option>



<% } %>


</select>
<input type = "submit" value="View" name="button" />
</form>


<% 
con.close();
statement.close();
rs.close();


%>



</div>
<div id="viewReport">

<p> View Report Here</p>



	

<c:forEach items="${Report}" var="Repo">

<ol>
<li value="1">Details
<table style="border: 1px solid black;">
	 
  <tr>
    <td>Report: </td>
    <td><c:out value="${Repo.getName()}" /></td> 

  </tr>
  <tr>
    <td>Report Title:</td>
    <c:forEach items="${ReportTempl}" var="Templ">
    <td><c:out value="${Templ.getName()}" /></td> 
    
  </tr>
   <tr>
    <td>Date Credited: </td>
    <td><c:out value="${Templ.getDate()}" /></td> 
   
  </tr>
    <tr>
    <td>Department: </td>
    <td><c:out value="${Templ.getDepartment()}" /></td> 
  </tr>
</c:forEach>
</li>


</table>

<br> 
<c:forEach items="${ReportTempl}" var="Templ">


<li  value="2"><c:out value="${Templ.getSection1()}" />

<div id="section">

<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit11" value="<c:out value="${Templ.getCrit11()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva11">
	

   <option>    <c:out value="${Repo.getEva11()}" /> </option>
      
	
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit12" value="<c:out value="${Templ.getCrit12()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva12">

   <option>     <c:out value="${Repo.getEva12()}" /> </option>
     
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit13" value="<c:out value="${Templ.getCrit13()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva13">

    <option>   <c:out value="${Repo.getEva13()}" /> </option>
  
</select>														<br> 
	<span>Criteria 4</span> <input type="text" name="crit14" value="<c:out value="${Templ.getCrit14()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva14">
 
       <option>  <c:out value="${Repo.getEva14()}" /> </option>
    
</select>													<br> 
	<span>Criteria 5</span> <input type="text" name="crit15" value="<c:out value="${Templ.getCrit15()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva15">

       <option>  <c:out value="${Repo.getEva15()}" /> </option>
   
</select>
	</td>
</tr>
<tr><td><input type="text" id="text" name="comment1" style="width: 200px; height: 100px; align:right" value="${Repo.getComment1() }" /></td><td></td></tr>
</table>

</div>


 </li>


<li  value="3"><c:out value="${Templ.getSection2()}" />

<div id="section">

<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit21" value="<c:out value="${Templ.getCrit21()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva21">
	

   <option>    <c:out value="${Repo.getEva21()}" /> </option>
      
	
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit22" value="<c:out value="${Templ.getCrit22()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva22">

   <option>     <c:out value="${Repo.getEva22()}" /> </option>
     
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit23" value="<c:out value="${Templ.getCrit23()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva23">

    <option>   <c:out value="${Repo.getEva23()}" /> </option>
  
	</td>
</tr>	
<tr><td><input type="text" id="text" name="comment2" style="width: 200px; height: 100px; align:right" value="${Repo.getComment2() }" /></td><td></td></tr>
</table>	

</div>



 </li>
 
 <li value="4"><c:out value="${Templ.getSection3()}" />
 <div id="section">

<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit31" value="<c:out value="${Templ.getCrit31()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva31">
	

   <option>    <c:out value="${Repo.getEva31()}" /> </option>
      
	
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit32" value="<c:out value="${Templ.getCrit32()}"/>" readonly></input>
	<label><span>Evaluation  </span></label><select name="eva32">

   <option>     <c:out value="${Repo.getEva32()}" /> </option>
     
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit33" value="<c:out value="${Templ.getCrit33()}"/>" readonly></input>
	<label><span>Evaluation </span></label><select name="eva33">

    <option>   <c:out value="${Repo.getEva33()}" /> </option>
  
	</td>
</tr>
<tr><td><input type="text" id="text" name="comment3" style="width: 200px; height: 100px; align:right" value="${Repo.getComment3() }" />	</td><td></td></tr>
</table>

</div>
 
 </li>

</c:forEach>
 </c:forEach>
 
 
 
 
</ol>
</div>

</body>
</html>