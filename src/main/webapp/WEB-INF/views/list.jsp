<%@page import="org.springframework.ui.Model"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="com.example.testexample.model.Person"%>
<%@page import="com.example.testexample.model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список данных</title>
    </head>
    <body>
        <table>
            <th>Id</th>
            <th>Name</th>
        <c:forEach  var="pr" items="${persons}">
            <tr>
                <td>${pr.id}</td>
                <td>${pr.name}</td>
            </tr>
        </c:forEach>
        </table>
        
        
        <div>
            <button onclick="location.href='/testexample'">Вернуться в главное меню</button>
        </div>
        
        
        

    </body>
</html>
