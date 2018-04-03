<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="FirstServlet">
            User name : <input type="text" name="name">
            Password  : <input type="password" name="pass">
            <input type="submit" value="Click">
            
        </form>
        
        </br>
        <form action="SecondServlet">
            User name: <input type="text" name="name">
            <input type="submit" value="Click">
        </form>
    </body>
</html>
