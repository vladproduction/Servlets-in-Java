<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation Result:</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:useBean id="mb" class="com.vladproduction.multiplication.MultiplicationBean" scope="request"/>
<h1> Result for Multiple = ${mb.multiple()} </h1>
<h1> Result for Divide = ${mb.divide()} </h1>
<h1> Result for Sum = ${mb.sum()} </h1>
<h1> Result for Subtract = ${mb.subtract()} </h1>
</body>
</html>
