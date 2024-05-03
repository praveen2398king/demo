<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
	<h1>My name is Praveen</h1>
	<h1>This is help page</h1>

	<%
	String name = (String) request.getAttribute("name");
	String prep = (String) request.getAttribute("prep");
	Integer months = (Integer) request.getAttribute("months");
	%>

	<%=name%>
	<h1>
		I have to crack
		<%=prep%></h1>
	<%=months%>
	<hr>
	<c:forEach var="item" items="${hours }">
		<h1>${item }</h1>
	</c:forEach>

</body>
</html>