<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <form action ="NewServlet" method="post">
            User name : <input type ="text" name="user"></br>
            Password : <input type="password" name="pass"></br>
            Phone : <input type="text" name="phone"></br>
            <input type="submit" value="Login">
            
        </form>
    </body>
</html>
