<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- BOOTSTRAP 337 CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Employees</title>
</head>
<body>
<jsp:include page="/WEB-INF/Banner.jsp" />
	<h1 class="text-center">Employee Entry</h1>
	<div class="container-fluid col-xs-4 well col-xs-push-4">
	<!-- ########################################################## -->
	
	                <!-- employee entry form  -->
		<form action = 'EmployeeEntry' method = 'post'>
			First Name: <input type = 'text' name = 'firstName' id = 'firstName' value = ''  class='form-control'> <br><br>
			Last Name: <input type = 'text' name = 'lastName' id = 'lastName' value = '' class='form-control'> <br><br>
			Employee #: <input type = 'text' name = 'employeeNum' id = 'employeeNum' value = '' class='form-control'> <br><br>
			Email: <input type = 'text' name = 'email' id = 'email' value = '' class='form-control'> <br><br>
			
			
			<select name = 'yearHired' id = 'yearHired'>
				<option value = 'default'>Hire Year</option>
				<option value = '2017'>2017</option>
				<option value = '2016'>2016</option>
				<option value = '2015'>2015</option>
				<option value = '2014'>2014</option>
				<option value = '2013'>2013</option>
				<option value = '2012'>2012</option>
				<option value = '2011'>2011</option>
				<option value = '2010'>2010</option>
				<option value = '2009'>2009</option>
				<option value = '2008'>2008</option>
				<option value = '2007'>2007</option>
			</select>
			<br><br>
			<select name = 'jobPosition' id = 'jobPosition'>
				<option value = 'default'>Job Position</option>
				<option value = 'juniorDeveloper'>Junior Developer</option>
				<option value = 'developerIntern'>Developer Intern</option>
				<option value = 'intermediateDeveloper'>Intermediate Developer</option>
				<option value = 'seniorDeveloper'>Senior Developer</option>
				<option value = 'projectManager'>Project Manager</option>
				<option value = 'databaseDeveloper'>Database Developer</option>
				<option value = applicationTester>Application Tester</option>
			</select>
			<br><br><br>
			
			<input type = 'submit' name = 'submitButton' id = 'submitButton' value = 'Submit'>
			<input type = 'submit' name = 'cancelButton' id = 'cancelButton' value = 'Cancel'>
		</form>
    </div>
</body>
</html>