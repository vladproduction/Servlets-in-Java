<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "RequestDispatcherDemo" %></h1>
<br/>
<a href="start">MyServlet</a>
<form action="start" method="post">
  <label>Name:
    <input type="text" name="userName">
  </label>
  <label>Age:
    <input type="number" name="userAge">
  </label>
  <input type="submit" value="Tab">
</form>
</body>
</html>