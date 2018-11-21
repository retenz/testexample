<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Введите данные</h1>
        <form method="post">
                <label>ID:
                    <input type="text" name="id"><br />
                </label>
                <label>Name:
                    <input type="text" name="name"><br />
                </label>
                <button type="submit">Добавить</button>
        </form>
        
    </body>
</html>
