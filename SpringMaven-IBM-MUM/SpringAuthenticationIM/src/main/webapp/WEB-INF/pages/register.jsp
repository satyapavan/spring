<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to User Registration page</h1>
	<hr>
	<form:form modelAttribute="userCommand" method="post">
	Enter Email:<form:input path="email" />
		<form:errors path="email" cssStyle="color:red" />
		<br />
	Enter Name:<form:input path="name" />
		<form:errors path="name" cssStyle="color:red" />
		<br />
	Enter Address:<form:input path="address" />
		<br />
	Enter Phone:<form:input path="phone" />
		<br />
		<input type="submit" value="">
	</form:form>

</body>
</html>