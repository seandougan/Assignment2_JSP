<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
</head>

<body>


<div>
<span>Report Template: <select name="reports"></select> </span>

<span id="title">Report Title: <input type="text" name="title"></input> </span>

<span id="date">Date: <input type="text" name="date"></input> </span>

<p>Department:<select name="departments"></select> </p>

<p>Report Type:<input type="radio" name="type" value="group"> Group</input></p>

<input type="radio" name="type" value="employee"> Employee</input>


</div>

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
</select>
	</td>
</tr>

</table>
<input type="text" id="text" name="com1" style="width: 100px; height: 100px; align:right" />
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
</select>														

</table>

</div>




<div id="section">
<span>Section II<input type="text" name="sect2"></input></span>
<table align="center">

<tr id="sect2">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit1"></input>
<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit2"></input>
	<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit3"></input>
			<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>														<br> 
	<span>Criteria 4</span> <input type="text" name="crit4"></input>
				<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>													<br> 
	<span>Criteria 5</span> <input type="text" name="crit5"></input>
	<select name="max">
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
<span>Section III<input type="text" name="sect3"></input></span>
<table align="center">

<tr id="sect3">
	
	<td>
	
	<span>Criteria 1</span> <input type="text" name="crit1"></input>
<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 2</span> <input type="text" name="crit2"></input>
	<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>															<br> 
	<span>Criteria 3</span> <input type="text" name="crit3"></input>
			<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>														<br> 
	<span>Criteria 4</span> <input type="text" name="crit4"></input>
				<select name="max">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
</select>													<br> 
	<span>Criteria 5</span> <input type="text" name="crit5"></input>
	<select name="max">
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

</body>
</html>