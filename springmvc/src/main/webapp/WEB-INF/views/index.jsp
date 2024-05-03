<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>called by home controller</h1>
	<h3>by url</h3>

	<%
	String name = (String) request.getAttribute("Name");
	int id = Integer.valueOf((String) request.getAttribute("id"));
	List<String> friends = (List<String>) request.getAttribute("f");
	%>
	<h1>
		Name is
		<%=name%></h1>
	<h1>
		Id is
		<%=id%></h1>
	<h1>
		List is
		<%=friends%></h1>
	<%
	for (String s : friends) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>

</body>
</html>