<%@page isErrorPage="true" %>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exception page</title>
    </head>
    <body>
        <%= exception %>
        <% 
            Date date = new Date();
        %>
        <%= date %>
    </body>
</html>
