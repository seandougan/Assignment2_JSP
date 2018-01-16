<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="utility.Database" %>
<%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateReportTemplate</title>
<style>

body{

 background-color: #E0EEEE;
}

#header {


}

#section{
margin-bottom: 0.5em;
border-bottom: 1px solid #aaa;
padding: 0.5em 0 1em 0;
border: "solid";
align: "right";

}

</style>

<script type="text/javascript">
function date(){

  document.getElementById('date').value = Date();
}
</script>
</head>
<body>
	<div id="header"><h1>Create Report Template</h1></div>
	
	
	
	
<form method="post">

<label>Report Template:</label><input type="text" name="rTemplate"></input>

 <%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>

 <label>Date:</label><input type="text" name="templ_Date" id="date" value="<%= df.format(new java.util.Date()) %>" readonly></input> <br>



<label>Department:</label>
<!-- Sean's Combobox-to-Database code -->
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


<option value = '<%=rs.getString("department_Name")%>' > <%=rs.getString("department_Name")%></option>


<% }
con.close();
statement.close();
rs.close();
%>

</select>


	<div id="section">
<span>Section I<input type="text" name="sect1"></input></span>
<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit11"></input>
	<label><span>Maximum </span></label><select name="max11">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit12"></input>
	<label><span>Maximum </span></label><select name="max12">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit13"></input>
	<label><span>Maximum </span></label><select name="max13">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>														<br> 
	<span>Criteria 4</span> <input type="text" name="crit14"></input>
	<label><span>Maximum </span></label><select name="max14">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>													<br> 
	<span>Criteria 5</span> <input type="text" name="crit15"></input>
	<label><span>Maximum </span></label><select name="max15">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>	<br>
	</td>
</tr>

</table>
</div>

<div id="section">
<span>Section II<input type="text" name="sect2"></input></span>
<table align="center">

<tr id="sect1">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit21"></input>
<label><span>Maximum </span></label><select name="max21">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit22"></input>
	<label><span>Maximum </span></label><select name="max22">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit23"></input>
		<label><span>Maximum </span></label><select name="max23">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>														<br> 

</table>
</div>

<div id="section">
<span>Section III<input type="text" name="sect3"></input></span>

<table align="center">

<tr id="sect3">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit31"></input>
<label><span>Maximum </span></label><select name="max31">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit32"></input>
	<label><span>Maximum </span></label><select name="max32">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit33"></input>
			<label><span>Maximum </span></label><select name="max33">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>														<br> 

</table>
<input type = "submit" value = "Create" />
<input type = "button" value = "Cancel" />

</div>
</form>

</body>
</html>