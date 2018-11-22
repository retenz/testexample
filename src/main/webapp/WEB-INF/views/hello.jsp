<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Главная страница</title>
    </head>
    <body>
        <h1>Выберите одно из действий</h1>
        
         <div>
                <button onclick="location.href='/testexample/add.form'">добавить</button>
                <form action="list.form" method="post">
                <button type="submit">Показать список</button>
                </form>
            </div>
        
    </body>
</html>
