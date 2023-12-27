<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabulation Result:</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<jsp:useBean id="tb" class="com.vladproduction.tabulation.TabulationBean" scope="request"/>
<h1>Max = ${tb.maxPoint.y} with x = ${tb.maxPoint.x}</h1>
<table>
    <thead>
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tb.points}" var="p">
        <tr>
            <td>${p.x}</td>
            <td>${p.y}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
