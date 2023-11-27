<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 10-Aug-23
  Time: 04:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
    <jsp:useBean id="user" scope="request" class="com.example.requestdispatcherdemo.beans.User"/>
    <h2>${user.name}</h2>
    <h2>${user.age}</h2>
</body>
</html>
