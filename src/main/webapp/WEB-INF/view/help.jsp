<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
<%
String name=(String) request.getAttribute("name");
Integer rollnumber=(Integer) request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime) request.getAttribute("time");

%>
<h1>Hello my name is <%= name %></h1>  

<h1>this is help page</h1>
<h1>Hello my rollnumber is <%= rollnumber %></h1>
<h1>Date and time is <%= time %></h1>

</body>
</html>