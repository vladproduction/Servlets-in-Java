<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 26-Dec-23
  Time: 12:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello User</title>
</head>
<body>
<jsp:useBean id="userBeanFirstParam" scope="request" class="com.vladproduction.servletstarter.UserBean"/>

<h1>userBeanFirstParam:</h1>

<label for="hashCode">HashCode:</label>
<h2 id="hashCode">${userBeanFirstParam.hashCode()}</h2>

<label for="name">Name:</label>
<h1 id="name">${userBeanFirstParam.name}</h1>

<label for="age">Age:</label>
<h3 id="age">${userBeanFirstParam.age}</h3>
</body>
</html>
