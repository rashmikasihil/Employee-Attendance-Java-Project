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

	<% 
		String id = request.getParameter("id");
		String date = request.getParameter("date");
		String firsthalf = request.getParameter("firsthalf");
		String secondhalf = request.getParameter("secondhalf");
	%>

	<div>
	
	<h1>Update attendance details</h1></br></br>
	<form action="update" method="post">
		Employee ID <input type="text" name="id" placeholder="Employee ID" value="<%= id%>" readonly></br></br>
		
		Select the date <input type="date" name="date" value="<%= date%>" readonly></br></br>
		
		First Half <select id="att1" name="fh" value="<%= firsthalf%>">
						<option value="present">Present</option>
						<option value="absent">Absent</option>
					</select>
					
					</br></br>
				
		Second Half<select id="att2" name="sh" value="<%= secondhalf%>"></br></br>
						<option value="present">Present</option>
						<option value="absent">Absent</option>
					</select>
					
					</br></br></br></br>
		<input class="button" type="submit" value="Update attendance" name="submit">
						
	</form>
	</div>

</body>
</html>