<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>MVC_pattern-servlet_jsp</title>
</head>
<body>
<h1>MVC_pattern-servlet_jsp</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br/>
<a href="date">Date Servlet</a><br/>
<a href="page">Page Servlet</a><br/>
<h2><%out.print(LocalDateTime.now());%></h2>
</body>
</html>