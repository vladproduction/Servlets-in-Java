<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1>Hello World!</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a><br/>

<h2><% out.print(LocalDateTime.now());%></h2>

<a href="hello2-servlet">Hello2 Servlet</a><br/>


<form action="user-servlet" method="post">

  <label for="username">Name:</label>
  <input id="username" type="text" name="username">
  <label for="userage">Age: </label>
  <input id="userage" type="number" name="userage">
  <input type="submit" value="buttonOk">

</form>


</body>
</html>