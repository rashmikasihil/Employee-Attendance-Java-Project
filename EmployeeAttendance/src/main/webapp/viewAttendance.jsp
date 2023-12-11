<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="cssfile.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<div>
	<h1> View Employee attendance </h1> </br></br>

	<form action="view" method="post">
	
	Enter employee ID <input type="text" name="id"> </br></br>
	Select the date <input type="date" name="date"> </br></br>
	
	<input type="submit" value="View attendance" name="submit" class="button">

	</form>
	</div>
</body>
</html>