<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Report</title>
</head>
<body>
<h3 align="left">Quick Filter</h3>

<select name="Select Report Template">
  <option value="1">1</option>

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

</div>

</body>
</html>