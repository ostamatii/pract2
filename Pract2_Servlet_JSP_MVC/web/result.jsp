<%-- 
    Document   : result
    Created on : 06.03.2015, 21:13:03
    Author     : Katja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Знаки зодіаку </title>
    </head>
    <body>
        <h1> Знаки зодіаку</h1>
        <h2> Ваш знак зодіаку :
        <%= request.getAttribute("sign")%>
        </h2>
        <p>
            місяць: <%= request.getParameter("month")%> день:
            <%= request.getParameter("day")%>
        <p>
    </body>
</html>
