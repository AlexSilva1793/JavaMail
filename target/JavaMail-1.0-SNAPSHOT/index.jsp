<%-- 
    Document   : index
    Created on : 3/12/2019, 09:02:15 PM
    Author     : master
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi JavaMail</title>
    </head>
    <body>
        <h1>Enviar Correo</h1>
        <form method="post" action="EnvioCorreo">
            <table>
                <tr>
                    <td>Destino:</td>
                    <td><input type="email" name="textDestino"></td>
                </tr>
                <tr>
                    <td>Asunto:</td>
                    <td><input type="text" name="textAsunto"></td>
                </tr>
                <tr>
                    <td>Mensaje:</td>
                    <td><textarea name="textMensaje"></textarea></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Enviar"></td>
                </tr>

            </table>
        </form>
    </body>
</html>
