<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="cssfile.css">
<title>Insert title here</title>
</head>
<body>

<div>

<h1>Add the employee attendance from here</h1> </br></br>

<form action="insert" method="post">
	Enter employee ID <input type="text" name="id" placeholder="Employee ID"> </br></br>
	Select Date <input type="date" name="date"> </br></br>
	First Half   <select id="attendance1" name="fh">
    				<option value="present">Present</option>
    				<option value="absent">Absent</option>
  				</select>
  				
  				</br></br>
  				
 	Second Half   <select id="attendance2" name="sh">
    				<option value="present">Present</option>
    				<option value="absent">Absent</option>
  				</select>
  				
  				</br></br>
  				
  	<input type="submit" value="Add attendance" class="button">
  				
 </form>
</div>

</body>
</html>