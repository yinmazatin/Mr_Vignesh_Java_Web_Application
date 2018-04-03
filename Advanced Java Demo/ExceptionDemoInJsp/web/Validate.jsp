<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            
            Integer n1 = Integer.parseInt(num1);
            Integer n2 = Integer.parseInt(num2);
            
            int res = n1/n2;
        %>
        
        <%= res %>
        
    </body>
</html>
