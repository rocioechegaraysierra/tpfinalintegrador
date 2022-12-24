package com.mycompany.web.servlets;

import java.io.IOException;

import com.mycompany.web.models.AccionesCliente;
import com.mycompany.web.models.Cliente;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/vercliente")
public class VerServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = (req.getParameter("correo"));

        Cliente registro = AccionesCliente.verCliente(s);

        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("/infocliente.jsp");
        respuesta.forward(req,resp);
    }
}
