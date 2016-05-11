<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>${u.name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${u.email}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${u.address}</td>
		</tr>
		<tr>
			<td>Phone</td>
			<td>${u.phone}</td>
		</tr>
	</table>
</body>
</html>