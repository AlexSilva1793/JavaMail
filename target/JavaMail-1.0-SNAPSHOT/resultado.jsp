<%-- 
    Document   : resultado
    Created on : 3/12/2019, 09:08:40 PM
    Author     : master
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensaje Resultado</title>
    </head>
    <body>
        <h1><%= request.getAttribute("Mensaje")%></h1>
    </body>
</html>
