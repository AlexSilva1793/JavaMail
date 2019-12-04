/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.javamail;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author master
 */
@WebServlet(name = "EnvioCorreo", urlPatterns = {"/EnvioCorreo"})
public class EnvioCorreo extends HttpServlet {

    private String host, puerto, usuario, clave;

    public void init() {
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        puerto = context.getInitParameter("puerto");
        usuario = context.getInitParameter("usuario");
        clave = context.getInitParameter("clave");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino = request.getParameter("textDestino");
        String asunto = request.getParameter("textAsunto");
        String mensaje = request.getParameter("textMensaje");

        String resultadoEnvio = "";
        try {
            PropiedadesCorreo.envioCorreo(host, puerto, usuario, clave, destino, asunto, mensaje);
            resultadoEnvio = "El mensaje se envio correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            resultadoEnvio = "Error al enviar el correo " + e.getMessage();
            System.out.println("Error" + e.toString());
        } finally {
            request.setAttribute("Mensaje", resultadoEnvio);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        }
    }

}
