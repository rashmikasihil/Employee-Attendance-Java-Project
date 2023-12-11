<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="cssfile.css">
<title>Attendance View</title>
</head>
<body>
	<div>
	
	<h1>This is the employee's attendance</h1></br></br>
	
	<table class="table">
	
	<c:forEach var="att" items="${attDetails}">
	
	<c:set var="id" value="${att.getEmpID()}"/>
	<c:set var="date" value="${att.getDate()}"/>
	<c:set var="firsthalf" value="${att.getFirstHalf()}"/>
	<c:set var="secondhalf" value="${att.getSecondHalf()}"/>
	
	<tr>
		<td>Employee ID </td>
		<td>${att.getEmpID()}</td>
	</tr>
	<tr>
		<td>Date </td>
		<td>${att.getDate()}</td>
	</tr>
	<tr>
		<td>First Half </td>
		<td>${att.getFirstHalf()}</td>
	</tr>
	<tr>
		<td>Second Half </td>
		<td>${att.getSecondHalf()}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="updateAttendance.jsp" var="attupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="date" value="${date}"/>
		<c:param name="firsthalf" value="${firsthalf}"/>
		<c:param name="secondhalf" value="${secondhalf}"/>

	</c:url>
	
	<br>

	<a href="${attupdate}">
	<input type="button" name="update" Value="Update employee's attendance" class="button">
	</a>
		
	</div>
</body>
</html>