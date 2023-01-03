<!DOCTYPE html>
<%@page import="java.util.List"%>
<html>
<body>
<h2>Hello World! Home page</h2>
<h1> Spring MVC Web App  Siddharth Singh</h1>
<hr>
<a href="showForm">Hello World form</a>
<a href="about">About page</a>
<a href="help">help page</a>
<%
  String name= (String) request.getAttribute("name");
Integer id= (Integer) request.getAttribute("id");
List<String> friends=(List<String>) request.getAttribute("f");
%>
<h1>
   Name is <%= name %>
   <br>
Id is <%= id %>
</h1>

 <%
 for(String s:friends){
 %>
	<h1><%= s %></h1>
<% 
 }
 %>

</body>
</html>
