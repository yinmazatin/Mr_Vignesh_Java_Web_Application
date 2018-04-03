<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:useBean class="com.example.NewClass" id="obj" />
         <jsp:setProperty name="obj" property="name" />
         <jsp:getProperty name="obj" property="name" />
    </body>
</html>