<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process</title>
    </head>
    <body>
        <jsp:useBean class="com.example.StudentModel" id="sm1" />
        
        <jsp:setProperty name="sm1" property="id"/>
        <jsp:setProperty name="sm1" property="age"/>
        <jsp:setProperty name="sm1" property="name"/>
        
        <jsp:getProperty name="sm1" property="id" />
        <jsp:getProperty name="sm1" property="age" />
        <jsp:getProperty name="sm1" property="name" />
    </body>
</html>
