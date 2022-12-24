package com.mycompany.web.servlets;

import com.mycompany.web.models.Cliente;

import java.io.IOException;

import com.mycompany.web.models.AccionesCliente ;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevocliente")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String  co, ca;
        double costo;

        co = req.getParameter("correo");

        ca = req.getParameter("categoria");

        costo = Double.parseDouble(req.getParameter("costo"));
     
        Cliente nuevoCliente = new Cliente();


        nuevoCliente.setCorreo(co);
        nuevoCliente.setCategoria(ca);
        nuevoCliente.setCosto(costo);

        int estado = AccionesCliente.registrarCliente(nuevoCliente);

        if (estado == 1){
            resp.sendRedirect("exito.jsp");
            System.out.println("Nuevo descuento realizado");
        } else {
            resp.sendRedirect("error.jsp");
            System.out.println("No se pudo realizar el descuento");
        }



    }
}
